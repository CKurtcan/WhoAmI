package com.CK.entity;

import com.CK.utility.enums.Gender;
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
@Table(name = "tbl_competitors")
public class Competitors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false)
    String name;
    @Column(nullable = false)
    String surname;
    @Enumerated(EnumType.STRING)
    Gender gender;
    @Embedded
    BaseEntity baseEntity;
    @OneToOne(mappedBy = "competitors", cascade = CascadeType.ALL)
    Address address;
    int point;

}
