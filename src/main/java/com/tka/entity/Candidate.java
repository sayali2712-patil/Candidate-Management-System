package com.tka.entity;

public class Candidate {
private int cid;
private String name;
private String party;
private String assembly;
private String state;
private String gender;
private int age;
public Candidate() {
	super();
}
public Candidate(int cid, String name, String party, String assembly, String state, String gender, int age) {
	super();
	this.cid = cid;
	this.name = name;
	this.party = party;
	this.assembly = assembly;
	this.state = state;
	this.gender = gender;
	this.age = age;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getParty() {
	return party;
}
public void setParty(String party) {
	this.party = party;
}
public String getAssembly() {
	return assembly;
}
public void setAssembly(String assembly) {
	this.assembly = assembly;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Candidate [cid=" + cid + ", name=" + name + ", party=" + party + ", assembly=" + assembly + ", state="
			+ state + "]";
}


}
