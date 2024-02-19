package com.miprimeraapirest.repository;

import com.miprimeraapirest.model.Driver;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.beans.Transient;
import java.util.Optional;

@Repository
public interface DriverRepository extends JpaRepository<Driver,Long> {
    Optional<Driver> findByCodeIgnoreCase(String code);

    @Transactional
    Optional<Driver> deleteByCode(String code);
}
