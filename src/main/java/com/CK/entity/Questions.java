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
@Table(name = "tbl_questions")
public class Questions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    int sure; // dogru cevaplayan kişi ne kadar sürede cevapladı
    @ManyToOne
    @JoinColumn(name = "characteristics_id") // soruyu dogru cevaplayan kişi
    Characteristics characteristics;
    @ElementCollection
    @CollectionTable(name = "competitor_answers", joinColumns = @JoinColumn(name = "question_id"))
    @MapKeyColumn(name = "competitor_id")
    @Column(name = "answer")
    Map<Long,String> competitorAnswers;

}
