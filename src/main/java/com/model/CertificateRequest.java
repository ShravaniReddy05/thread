package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="certificate_request")
public class CertificateRequest {
	
	@Id
	private int userId;
	private String requestDate;
	private String Status;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(String requestDate) {
		this.requestDate = requestDate;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	@Override
	public String toString() {
		return "CertificateRequest [userId=" + userId + ", requestDate=" + requestDate + ", Status=" + Status + "]";
	}
	public CertificateRequest(int userId, String requestDate, String status) {
		super();
		this.userId = userId;
		this.requestDate = requestDate;
		Status = status;
	}
	public CertificateRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
