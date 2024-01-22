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
@Table(name = "tbl_characteristics")
public class Characteristics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String eyeColor;
    String hairColor;
    String skinColor;
    String height;
    String weight;
    @OneToOne
    Vowels vowels;
}
