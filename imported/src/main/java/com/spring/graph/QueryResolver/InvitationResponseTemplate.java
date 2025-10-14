package com.spring.graph.QueryResolver;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spring.graph.Model.RecordsInvitation;


public class InvitationResponseTemplate {

	
	String start;
    String row;
    String statusCode;
    String totalRecords;

	@JsonProperty("records")
    private List<RecordsInvitation> records;
    
    public ArrayList<Advanced> advanced;

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getRow() {
		return row;
	}

	public void setRow(String row) {
		this.row = row;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(String totalRecords) {
		this.totalRecords = totalRecords;
	}
	public List<RecordsInvitation> getRecords() {
		return records;
	}

	public void setRecords(List<RecordsInvitation> records) {
		this.records = records;
	}
	public ArrayList<Advanced> getAdvanced() {
		return advanced;
	}

	public void setAdvanced(ArrayList<Advanced> advanced) {
		this.advanced = advanced;
	}
}
