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
@Table(name = "tbl_vowels")
public class Vowels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "full_name", nullable = false)
    String fullName;
    @Column(name = "image_url", nullable = false)
    String imageUrl;
    @Embedded
    BaseEntity baseEntity;
    @OneToOne(mappedBy = "vowels", cascade = CascadeType.ALL)
    Characteristics characteristics;
}
