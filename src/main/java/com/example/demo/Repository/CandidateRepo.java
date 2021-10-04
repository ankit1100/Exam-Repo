package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.CandidateEntity;

@Repository
public interface CandidateRepo extends JpaRepository<CandidateEntity, Integer> {

}
