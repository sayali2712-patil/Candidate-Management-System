package com.tka.controller;

import java.util.List;

import com.tka.entity.Candidate;
import com.tka.service.Service;



public class Controller {
	Service service = null;
	 public List<Candidate> getAllcandidates(){
		 System.out.println("We are in Controller Layer");
		service = new Service();
		List<Candidate> allcandidates = service.getAllcandidates();
		return allcandidates;
	 }

	 public void updateCandidates(){
		 service = new Service();
		service.updateCandidates();
	 }
	 
	 public void deleteRecord() {
		 service = new Service();
		service. deleteRecord();
	 }
	 
	 public List<Candidate> getAllNcpCandidate(){
		 service = new Service();
		 List<Candidate> allNcpCandidate = service.getAllNcpCandidate();
		 return allNcpCandidate; 
			 }
	 
	 public List<Candidate> getAllBJPCandidate(){
		 service = new Service();
		 List<Candidate> allbjpCandidate = service.getAllBJPCandidate();
		 return allbjpCandidate; 
			 }
	 
	 public List<Candidate> getAllIndCandidate(){
		 service = new Service();
		 List<Candidate> allindCandidate = service.getAllIndCandidate();
		 return allindCandidate; 
			 }
	 
	 public List<Candidate> getAllPuneCandidate(){
		 service = new Service();
		 List<Candidate> candbypune = service .getAllPuneCandidate();
		 return candbypune; 
			 }
			
	}
