package com.cuelogic.cameraRegistrationService.Mapper;


import com.cuelogic.cameraRegistrationService.dto.CameraDetails;
import com.cuelogic.cameraRegistrationService.dto.CameraRegistrationRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;


@Mapper(componentModel ="spring")
public interface CameraDetailsMapper {
    CameraDetails toEntity(CameraRegistrationRequestDto cameraRegistrationRequestDto);

}
