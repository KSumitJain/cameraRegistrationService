package com.cuelogic.cameraRegistrationService.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="camera_details")
public class CameraDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "camera_registration_id")
    private Integer id;

    @Column(name="camera_serial_number")
    private String  cameraSerialNumber;

    @Column(name="owner_type")
    private String  ownerType;

    @Column(name="phone_number")
    private String  phoneNumber;

    @Column(name="video_location")
    private String  videoLocation;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "address_id")
    private Address  address;

}
