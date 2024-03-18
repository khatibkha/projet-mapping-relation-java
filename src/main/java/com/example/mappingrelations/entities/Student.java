package com.example.mappingrelations.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Etudiant")

public class Student {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String name;
    private String registrationNumber;
    @ManyToMany
    private Collection<Session> sessions ;
}
