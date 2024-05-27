package com.thinkconstructive.rest_demo.controller;

import com.thinkconstructive.rest_demo.model.CloudVendor;
import com.thinkconstructive.rest_demo.repository.CloudVendorRepository;
import com.thinkconstructive.rest_demo.service.CloudVendorService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;


@WebMvcTest(CloudVendorController.class)
class CloudVendorControllerTest {
    @Autowired
    private MockMvc mockMvc;


    @MockBean
    private CloudVendorService cloudVendorService;
    CloudVendor cloudVendorOne;
    CloudVendor cloudVendorTwo;
    List<CloudVendor> cloudVendorList = new ArrayList();




    @BeforeEach
    void setUp() {
        cloudVendorOne = new CloudVendor("1", "Amazon", "USA", "XXXXX");
        cloudVendorTwo = new CloudVendor("2", "GCP", "UK", "YYYYYY");
        cloudVendorList.add(cloudVendorOne);
        cloudVendorList.add(cloudVendorTwo);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testGetCloudVendorDetails() throws Exception{
        when(cloudVendorService.getCloudVendorDetails("1")).thenReturn(cloudVendorOne);
        this.mockMvc.perform(get("/cloudvendor/1")).andDo(print()).andExpect(status.isOk());
    }

    @Test
    void getAllCloudVendorDetails() {
    }

    @Test
    void cloudVendorDetails() {
    }

    @Test
    void updateVendorDetails() {
    }

    @Test
    void deleteVendorDetails() {
    }
}