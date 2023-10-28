package com.cuelogic.cameraRegistrationService.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Integer id;

    @Column(name="country")
    private String  country;

    @Column(name="state")
    private String  state;

    @Column(name="city")
    private String  city;

    @Column(name="area")
    private String  area;

    @Column(name="address_line_1")
    private String  addressLine1;

    @Column(name="pincode")
    private Integer  pincode;

   @OneToOne(mappedBy = "address")
    private CameraDetails cameraDetails;
}
