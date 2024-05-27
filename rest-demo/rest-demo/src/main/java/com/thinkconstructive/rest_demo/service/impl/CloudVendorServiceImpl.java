package com.thinkconstructive.rest_demo.service.impl;

import com.thinkconstructive.rest_demo.exception.CloudVendorNotFoundException;
import com.thinkconstructive.rest_demo.model.CloudVendor;
import com.thinkconstructive.rest_demo.repository.CloudVendorRepository;
import com.thinkconstructive.rest_demo.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {


    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    CloudVendorRepository cloudVendorRepository;

    @Override
    public String CreateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String UpdateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String DeleteCloudVendor(String cloudVendorId) {
        cloudVendorRepository.deleteById(cloudVendorId);
        return "Deleted";
    }

    @Override
    public CloudVendor getCloudVendorDetails(String cloudVendorId) {
        if(cloudVendorRepository.findById(cloudVendorId).isEmpty()){
            throw new CloudVendorNotFoundException("Requested Cloud Vendor Does Not Exist");
        }
        return cloudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepository.findAll();
    }
}
