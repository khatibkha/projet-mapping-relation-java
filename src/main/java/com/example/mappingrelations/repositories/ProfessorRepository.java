package com.example.mappingrelations.repositories;

import com.example.mappingrelations.entities.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor,Integer> {

}
