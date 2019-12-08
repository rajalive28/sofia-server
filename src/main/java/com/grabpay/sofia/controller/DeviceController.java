package com.grabpay.sofia.controller;

import com.grabpay.sofia.dto.DeviceUpdateDto;
import com.grabpay.sofia.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeviceController {
    @Autowired
    private DeviceService deviceService;

    @GetMapping("{device-id}/status")
    public void getStatus(@PathVariable("device-id") String deviceId){
        deviceService.getStatus(deviceId);
    }

    @PostMapping("{device-id}/update-primary")
    public void updatePrimary(DeviceUpdateDto deviceUpdateDto){
        deviceService.updatePrimary(deviceUpdateDto);
    }
}
