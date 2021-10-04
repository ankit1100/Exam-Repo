package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.CandidateEntity;
import com.example.demo.Entity.ResponseEntity;
import com.example.demo.Entity.RoleEntity;
import com.example.demo.Repository.CandidateRepo;
import com.example.demo.Repository.RoleRepo;

@RestController
public class SessionController {
	
	@Autowired
	CandidateRepo crepo;
	
	@Autowired
	RoleRepo roleRepo;
	
	@PostMapping("/addCandidate")
	public ResponseEntity<CandidateEntity> addCandidate(CandidateEntity candidate) {
		
		ResponseEntity<CandidateEntity> res = new ResponseEntity<>();
		
		candidate.setFlag(true);
		
		String rName = "User";
		RoleEntity role1 = roleRepo.findByRoleName(rName);
		List<CandidateEntity> candiList = new ArrayList<>();
		candidate.setRole(role1);
		candiList.add(candidate);
		role1.setCandidate(candiList);
		crepo.save(candidate);
		
		res.setStatus(200);
		res.setMessage("The candidate has added successfully.");
		res.setData(candidate);
		
		return res;
	}
	@PostMapping("/addRole")
	public ResponseEntity<RoleEntity> addRole(RoleEntity role) {
		
		ResponseEntity<RoleEntity> res = new ResponseEntity<>();
		
		roleRepo.save(role);
		
		res.setStatus(200);
		res.setMessage("The role has added successfully.");
		res.setData(role);
		
		return res;
	}

}
