package com.CK.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false)
    String city;
    @Column(nullable = false)
    String town;
    @Column(nullable = false, length = 12)
    String phone;
    String mail;
    @Column(nullable = false)
    String country;
    @OneToOne
    Competitors competitors;
}
