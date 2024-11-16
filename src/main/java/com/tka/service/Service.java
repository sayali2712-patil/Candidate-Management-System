package com.tka.service;

import java.util.ArrayList;
import java.util.List;

import com.tka.dao.Dao;
import com.tka.entity.Candidate;

public class Service {


	Dao  dao =  null;
	 public List<Candidate> getAllcandidates(){
		 System.out.println("We are in Service Layer");
		 dao = new Dao();
		 List<Candidate> allcandidate = dao.getAllcandidates();
		return  allcandidate; 
	 }
	 public void updateCandidates(){
		 dao = new Dao();
		 dao.updateCandidates();
	 }
	 
	 public void deleteRecord() {
		 dao = new Dao();
		 dao.deleteRecord(); 
	 }
	public List<Candidate> getAllNcpCandidate() {
		 dao = new Dao();
		 List<Candidate> allcandidate = dao.getAllcandidates();
		 List<Candidate> allncpcandidate = new ArrayList<Candidate>();
		 
		 for(Candidate c :allcandidate ) {
			 if(c.getParty().equals("NCP")) {
			 allncpcandidate.add(c);
			 }
	}
		return allncpcandidate;
	}
	
	public List<Candidate> getAllBJPCandidate() {
		 dao = new Dao();
		 List<Candidate> allcandidate = dao.getAllcandidates();
		 List<Candidate> allbjpcandidate = new ArrayList<Candidate>();
		 
		 for(Candidate c :allcandidate ) {
			 if(c.getParty().equals("BJP")) {
			 allbjpcandidate.add(c);
			 }
	}
		return allbjpcandidate;
	}
	
	public List<Candidate> getAllIndCandidate() {
		 dao = new Dao();
		 List<Candidate> allcandidate = dao.getAllcandidates();
		 List<Candidate> allindcandidate = new ArrayList<Candidate>();
		 
		 for(Candidate c :allcandidate ) {
			 if(c.getParty().equals("Independent")) {
			 allindcandidate.add(c);
			 }
	}
		return allindcandidate;
	}
	
	public List<Candidate> getAllPuneCandidate(){
		 dao = new Dao();
		 List<Candidate> allcandidate = dao.getAllcandidates();
		 List<Candidate> candbypune  = new ArrayList<Candidate>();
		 
		 for(Candidate c :allcandidate ) {
			 if(c.getParty().equals("Pune")) {
				 candbypune.add(c);
			 }
	}
		return candbypune;	
	}
}