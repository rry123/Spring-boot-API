package com.thinkconstructive.rest_demo.service;

import com.thinkconstructive.rest_demo.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {
    public String CreateCloudVendor(CloudVendor cloudVendor);
    public String UpdateCloudVendor(CloudVendor cloudVendor);
    public String DeleteCloudVendor(String cloudVendorId);
    public CloudVendor getCloudVendorDetails(String cloudVendorId);
    public List<CloudVendor> getAllCloudVendors();
}
