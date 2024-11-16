package com.tka.client;

import java.util.List;

import com.tka.controller.Controller;
import com.tka.entity.Candidate;

public class Client {

	public static void main(String[] args) {
		Controller controller = new Controller();
		System.out.println("We are in Client Layer");
		
		List<Candidate> allcandidates = controller.getAllcandidates();
//		System.out.println( allcandidates);
		
//		controller.updateCandidates();
		
//		controller.deleteRecord();
		
//		List<Candidate> allNcpCandidate = controller.getAllNcpCandidate();
//		System.out.println(allNcpCandidate);
		
//		List<Candidate> allbjpCandidate = controller.getAllBJPCandidate();
//		System.out.println(allbjpCandidate);
		
		List<Candidate> allindCandidate = controller.getAllIndCandidate();
		System.out.println(allindCandidate);
		
//		List<Candidate> candbypune = controller. getAllPuneCandidate();
//		System.out.println(candbypune);
	}
}


	

