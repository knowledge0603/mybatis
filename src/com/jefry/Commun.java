package com.jefry;

import java.util.HashSet;
import java.util.Set;

//  三大通信运营商
public class Commun {
	
	private int id;
	public String getCommunNoid() {
		return communNoid;
	}
	public void setCommunNoid(String communNoid) {
		this.communNoid = communNoid;
	}
	public String getCommunName() {
		return communName;
	}
	public void setCommunName(String communName) {
		this.communName = communName;
	}
	private String communNoid;
	private String communName;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
