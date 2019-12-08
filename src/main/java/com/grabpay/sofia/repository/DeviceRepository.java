package com.grabpay.sofia.repository;

import com.grabpay.sofia.entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceRepository extends JpaRepository<Long, Device> {
}
