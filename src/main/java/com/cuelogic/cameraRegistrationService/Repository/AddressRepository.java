package com.cuelogic.cameraRegistrationService.Repository;


import com.cuelogic.cameraRegistrationService.dto.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address,Integer> {
}
