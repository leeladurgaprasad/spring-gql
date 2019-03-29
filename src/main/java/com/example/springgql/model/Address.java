package com.example.springgql.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Address {
    @Id @GeneratedValue
    private Long id;
    private String address1;
    private String address2;
    private String address3;
    private Integer zipCode;
    private String city;
    private String state;
}
