package com.tharindu.itemservice.exceptions;

public class ErrorMassage {

	private String massage;
	private String body;
	
	public ErrorMassage(String massage , String body) {
		super();
		this.massage = massage;
		this.body = body;
		// TODO Auto-generated constructor stub
	}
	public String getMassage() {
		return massage;
	}
	public void setMassage(String massage) {
		this.massage = massage;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
}
