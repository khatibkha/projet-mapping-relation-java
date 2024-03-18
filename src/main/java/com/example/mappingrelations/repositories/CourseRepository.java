package com.example.mappingrelations.repositories;

import com.example.mappingrelations.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Integer> {
}
