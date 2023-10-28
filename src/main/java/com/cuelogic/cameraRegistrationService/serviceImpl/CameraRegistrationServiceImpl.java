package com.cuelogic.cameraRegistrationService.serviceImpl;

import com.cuelogic.cameraRegistrationService.Mapper.AddressMapper;
import com.cuelogic.cameraRegistrationService.Mapper.CameraDetailsMapper;
import com.cuelogic.cameraRegistrationService.Repository.CameraDetailsRepository;
import com.cuelogic.cameraRegistrationService.dto.Address;
import com.cuelogic.cameraRegistrationService.dto.CameraDetails;
import com.cuelogic.cameraRegistrationService.dto.CameraRegistrationRequestDto;
import com.cuelogic.cameraRegistrationService.service.CameraRegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CameraRegistrationServiceImpl implements CameraRegistrationService {

    @Autowired
    private CameraDetailsRepository cameraDetailsRepository;

    @Autowired
    private CameraDetailsMapper cameraDetailsMapper;

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public Boolean saveCameraDetails(CameraRegistrationRequestDto cameraRegistrationRequestDto) {
        CameraDetails cameraDetails = cameraDetailsMapper.toEntity(cameraRegistrationRequestDto);
        Address address=addressMapper.toEntity(cameraRegistrationRequestDto);
        cameraDetails.setAddress(address);
        return cameraDetailsRepository.save(cameraDetails).getId() != null;
    }
}
