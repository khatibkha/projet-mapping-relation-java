package com.example.mappingrelations.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Seance")
public class Session {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private Date date;
    private Date h_begin;
    private Date h_end;
    @ManyToMany(mappedBy = "sessions")
    private Collection<Student> students ;
    @ManyToOne
    private Course course;

}
