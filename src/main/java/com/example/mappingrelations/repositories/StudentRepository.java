package com.example.mappingrelations.repositories;

import com.example.mappingrelations.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {


}
