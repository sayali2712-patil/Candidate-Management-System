package com.tka.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tka.entity.Candidate;

public class Dao {
	List<Candidate> allcandidate = null;

	String url = "jdbc:mysql://localhost:3306/advjava193";
	String uname = "root";
	String pwd = "root";

	Connection connection = null;
	Statement st = null;
	String sql = "Select * from advjava193.candidate1";
//	String sqlinsert = "INSERT INTO advjava193.candidate Values(1,'test','test','test','test','test',55)"; // 1st insert
	String sqlinsert2 = "INSERT INTO advjava193.candidate Values(?,?,?,?,?,?,?)";
	ResultSet rs = null;

	public List<Candidate> getAllcandidates() {
		System.out.println("We are in Dao Layer");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(1);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			connection = DriverManager.getConnection(url, uname, pwd);
			System.out.println(2);
			st = connection.createStatement();

//			int id = 2;
//			String cname = "Shiv";
//			String pname = "Independent";
//			String stname = "MH";
//			String aname = "Pune";
//			String gen = "Male";
//			int age = 35;
//			PreparedStatement pst = connection.prepareStatement(sqlinsert2);
//			pst.setInt(1, id);
//			pst.setString(2, cname);
//			pst.setString(3, pname);
//			pst.setString(4, stname);
//			pst.setString(5, aname);
//			pst.setString(6, gen);
//			pst.setInt(7, age);
//
//			int ps = pst.executeUpdate();
//			if (ps > 0) {
//				System.out.println("Data inserted succesfully");
//			} else {
//				System.out.println("Something went wrong");
//			}
			System.out.println(3);

//			int id = 1001;
//			String cname = "Jay";
//			String pname = "Independent";
//			String stname = "MH";
//			String aname = "Pune";
//			String gen = "Male";
//			int age = 35;

//			String sqlinsert = "INSERT INTO advjava193.candidate Values("+id+",'" + cname +"','" + pname+"','"+stname+"','"+aname+"','"+gen+"',"+age+")";  //using data like id cname
//			int rows = st.executeUpdate(sqlinsert);
//			if (rows > 0) {
//				System.out.println("Data inserted succesfully");
//			} else {
//				System.out.println("Something went wrong");
//			}
			   rs = st.executeQuery(sql);
			System.out.println(4);
			   
			   allcandidate = new ArrayList<Candidate>();
			   while(rs.next()) {
				   int id = rs.getInt("cid");
				   String cname = rs.getString("name");
				   String pname = rs.getString("partyname");
				   String stname = rs.getString("state");
				   String aname = rs.getString("assembly");
				   String gen = rs.getString("gender"); 
				   int age = rs.getInt("age");
				  
				   Candidate obj = new Candidate(id,cname,pname,stname,aname,gen,age);
				   allcandidate.add(obj);
				   
			   }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return allcandidate;
	}
	
	public void updateCandidates() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			connection = DriverManager.getConnection(url, uname, pwd);

			Statement st = connection.createStatement();

			int ack = st.executeUpdate("update candidate set assembly='Mumbai' where cid = 3");
			if (ack > 0) {
				System.out.println("One Record Inserted Succesfully");
			} else {
				System.out.println("Something Gone Wrong");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteRecord() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			connection = DriverManager.getConnection(url, uname, pwd);
			
			 PreparedStatement pstt = connection.prepareStatement("delete from candidate where cid = (?)");
			 pstt.setInt(1, 101);
			 System.out.println("Record Deleted");
			pstt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
		}
