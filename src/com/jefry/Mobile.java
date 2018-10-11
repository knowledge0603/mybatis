package com.jefry;

import java.util.HashSet;
import java.util.Set;

public class Mobile {
	
	private int id;
	private String mobileNoid;
	private String telnumber;
	
	private Commun commun;
	private User user;	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	private  Set<Callrecord> callrecordSet = new HashSet<Callrecord>();
	
	
	
	public Commun getCommun() {
		return commun;
	}
	public void setCommun(Commun commun) {
		this.commun = commun;
	}


	public Set<Callrecord> getCallrecordSet() {
		return callrecordSet;
	}
	public void setCallrecordSet(Set<Callrecord> callrecordSet) {
		this.callrecordSet = callrecordSet;
	}	
	public String getMobileNoid() {
		return mobileNoid;
	}

	public void setMobileNoid(String mobileNoid) {
		this.mobileNoid = mobileNoid;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTelnumber() {
		return telnumber;
	}

	public void setTelnumber(String telnumber) {
		this.telnumber = telnumber;
	}


}
