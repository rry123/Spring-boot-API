package com.thinkconstructive.demo.controller;

import com.thinkconstructive.demo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
    CloudVendor cloudVendor;
    @GetMapping("{VendorId}")
    public CloudVendor getCloudVendorDetails(String VendorId){
        return cloudVendor;
    }

    @PostMapping
    public String CreateVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Created Succesfully";
    }

    @PutMapping
    public String UpdateVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Update Successfully";
    }

    @DeleteMapping("{vendorId}")

    public String DeleteVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = null;
        return "Cloud Vendor Deleted Successfully";
    }
}
