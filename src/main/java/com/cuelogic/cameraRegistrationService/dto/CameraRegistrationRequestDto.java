package com.cuelogic.cameraRegistrationService.dto;


import lombok.*;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CameraRegistrationRequestDto {

    private String cameraSerialNumber;

    private String  ownerType;

    private String  phoneNumber;

    private String addressLine1;

    private String  country;

    private String  state;

    private String  city;

    private String  area;

    private Integer  pincode;

    private String  videoLocation;
}
