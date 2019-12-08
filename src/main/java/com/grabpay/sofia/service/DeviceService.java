package com.grabpay.sofia.service;

import com.grabpay.sofia.dto.DeviceUpdateDto;

public interface DeviceService {
    void getStatus(String deviceId);

    void updatePrimary(DeviceUpdateDto deviceUpdateDto);
}
