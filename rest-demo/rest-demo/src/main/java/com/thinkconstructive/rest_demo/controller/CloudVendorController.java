package com.thinkconstructive.rest_demo.controller;

import com.thinkconstructive.rest_demo.model.CloudVendor;
import com.thinkconstructive.rest_demo.response.ResponseHandler;
import com.thinkconstructive.rest_demo.service.CloudVendorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {



    CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping("/{vendorId}")
    public ResponseEntity<Object> getCloudVendorDetails(@PathVariable("vendorId") String VendorId){
        return ResponseHandler.responseBuilder("Requested Vendor Details are Given Here", HttpStatus.OK, cloudVendorService.getCloudVendorDetails(VendorId));
    }

    @GetMapping("/")
    public List<CloudVendor> getAllCloudVendorDetails(){

        return cloudVendorService.getAllCloudVendors();
    }

    @PostMapping
    public String CloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.CreateCloudVendor(cloudVendor);
        return "Cloud Vendor Created Successfully";
    }

    @PutMapping
    public String UpdateVendorDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.UpdateCloudVendor(cloudVendor);
        return "Vendor Details Updated Successfully";
    }

    @DeleteMapping("{vendorId}")
    public String DeleteVendorDetails(@RequestBody String vendorId){
        cloudVendorService.DeleteCloudVendor(vendorId);
        return "Vendor Details Deleted Successfully";
    }
}
