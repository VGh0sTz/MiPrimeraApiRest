package com.miprimeraapirest.service;

import com.miprimeraapirest.model.Driver;

import java.util.List;
import java.util.Optional;

public interface DriverService {
    List<Driver> getAllDrivers();

    Optional<Driver> getDriverByCode(String code);

    public void saveDriver(Driver driver);

    public void deleteDriverByCode(String code);

}
