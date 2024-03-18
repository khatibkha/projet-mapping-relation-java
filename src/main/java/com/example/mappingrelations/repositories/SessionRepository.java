package com.example.mappingrelations.repositories;

import com.example.mappingrelations.entities.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session,Integer> {
}
