package com.example.mappingrelations.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Professeur")
public class Professor {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String name;
    private Date d_affectation;
    @OneToOne(mappedBy = "professor")
    private Course course;

}
