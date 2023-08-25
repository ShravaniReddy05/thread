package com.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Certificate_Request Table")
public class CertificateRequest {

	@Id
	private int requestId;
	private int userId;
	private int request_date;
	private String Status;
	
	
	public CertificateRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRequestId() {
		return requestId;
	}
public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getRequest_date() {
		return request_date;
	}
	public void setRequest_date(int request_date) {
		this.request_date = request_date;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
@Override
	public String toString() {
		return "CertificateRequest [requestId=" + requestId + ", userId=" + userId + ", request_date=" + request_date
				+ ", Status=" + Status + "]";
	}
	
	public CertificateRequest(int requestId, int userId, int request_date, String status) {
		super();
		this.requestId = requestId;
		this.userId = userId;
		this.request_date = request_date;
		Status = status;
	}
}