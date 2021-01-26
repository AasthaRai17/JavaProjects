package com.transaction;

import java.time.LocalDate;

public class TransactionDetails {

	private int id;
	private double amount;
	private String source;
	private String dest;
	private String type;
	private LocalDate lDate;
	private String Date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public LocalDate getlDate() {
		return lDate;
	}
	public void setlDate(LocalDate lDate) {
		this.lDate = lDate;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	
	public TransactionDetails(int id, double amount, String source, String dest, String type, LocalDate lDate,
			String date) {
		super();
		this.id = id;
		this.amount = amount;
		this.source = source;
		this.dest = dest;
		this.type = type;
		this.lDate = lDate;
		Date = date;
	}
	
}
