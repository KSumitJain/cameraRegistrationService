package com.cuelogic.cameraRegistrationService.controller;

import com.cuelogic.cameraRegistrationService.dto.CameraRegistrationRequestDto;
import com.cuelogic.cameraRegistrationService.service.CameraRegistrationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/cameraRegistration")
public class CameraRegistrationController {

    @Autowired
    private CameraRegistrationService cameraRegistrationService;

    @PostMapping
    public ResponseEntity<Boolean> saveCameraDetails(@RequestBody CameraRegistrationRequestDto cameraRegistrationRequestDto) {
        return ResponseEntity.ok(cameraRegistrationService.saveCameraDetails(cameraRegistrationRequestDto));
    }
}
