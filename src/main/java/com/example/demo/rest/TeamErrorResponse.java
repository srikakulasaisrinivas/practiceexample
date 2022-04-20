package com.example.demo.rest;

public class TeamErrorResponse {
	
	private int status;
	
	private String message;
	
	private long timestamp;
	
	public TeamErrorResponse() {
		
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public TeamErrorResponse(int status, String message, long timestamp) {
		this.status = status;
		this.message = message;
		this.timestamp = timestamp;
	}
	
	

}
