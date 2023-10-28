package com.cuelogic.cameraRegistrationService.Repository;

import com.cuelogic.cameraRegistrationService.dto.CameraDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CameraDetailsRepository extends JpaRepository<CameraDetails,Integer> {

}
