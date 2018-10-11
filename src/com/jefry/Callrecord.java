package com.jefry;

public class Callrecord {
	
	
	private int id;
	private String callNoid;
	private String callPasstive;   // 被叫号码
	private int callDuration;     // 通话时长

	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCallNoid() {
		return callNoid;
	}
	public void setCallNoid(String callNoid) {
		this.callNoid = callNoid;
	}
	public String getCallPasstive() {
		return callPasstive;
	}
	public void setCallPasstive(String callPasstive) {
		this.callPasstive = callPasstive;
	}
	public int getCallDuration() {
		return callDuration;
	}
	public void setCallDuration(int callDuration) {
		this.callDuration = callDuration;
	}
	
	
}
