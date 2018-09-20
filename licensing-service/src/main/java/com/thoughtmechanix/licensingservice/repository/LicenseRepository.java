package com.thoughtmechanix.licensingservice.repository;

import com.thoughtmechanix.licensingservice.model.License;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by dylan on 2018/9/20.
 */

@Repository
public interface LicenseRepository extends CrudRepository<License, String> {

    public List<License> findByOrganizationId(String organizationId);
    public  License findByOrganizationIdAndLicenseId(String organizationId, String licenseId);
}
