package com.cuelogic.cameraRegistrationService.service;

import com.cuelogic.cameraRegistrationService.dto.CameraRegistrationRequestDto;
import org.springframework.stereotype.Service;

@Service
public interface CameraRegistrationService {
    public Boolean saveCameraDetails(CameraRegistrationRequestDto cameraRegistrationRequestDto);
}