package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.RoleEntity;

@Repository
public interface RoleRepo extends JpaRepository<RoleEntity, Integer> {

	RoleEntity findByRoleName(String rName);
	
}
