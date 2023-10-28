package com.cuelogic.cameraRegistrationService.Mapper;

import com.cuelogic.cameraRegistrationService.dto.Address;
import com.cuelogic.cameraRegistrationService.dto.CameraRegistrationRequestDto;
import org.mapstruct.Mapper;


@Mapper(componentModel ="spring")
public interface AddressMapper {

    Address toEntity(CameraRegistrationRequestDto cameraRegistrationRequestDto);
}
