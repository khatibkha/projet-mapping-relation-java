package com.example.mappingrelations.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.sql.ast.tree.expression.Collation;

import java.util.Collection;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Cours")

public class Course {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String title;
    private String description;
    @OneToMany(mappedBy = "course", fetch = FetchType.LAZY)
    private Collection<Session> sessions;
    @OneToOne
    private Professor professor;
}
