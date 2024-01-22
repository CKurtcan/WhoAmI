package com.CK.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_competition")
public class Questions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    @JoinColumn(name = "characteristics_id") // Adjust the column name based on your schema
    Characteristics characteristics;
    @ElementCollection
    @CollectionTable(name = "competitor_answers", joinColumns = @JoinColumn(name = "question_id"))
    @MapKeyColumn(name = "competitor_id")
    @Column(name = "answer")
    Map<Long,String> competitorAnswers;

}
