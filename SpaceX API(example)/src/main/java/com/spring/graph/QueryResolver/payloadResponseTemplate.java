package com.spring.graph.QueryResolver;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spring.graph.Model.Recordspayload;


public class payloadResponseTemplate {

	
	String start;
    String row;
    String statusCode;
    String totalRecords;

	@JsonProperty("records")
    private List<Recordspayload> records;
    
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
	public List<Recordspayload> getRecords() {
		return records;
	}

	public void setRecords(List<Recordspayload> records) {
		this.records = records;
	}
	public ArrayList<Advanced> getAdvanced() {
		return advanced;
	}

	public void setAdvanced(ArrayList<Advanced> advanced) {
		this.advanced = advanced;
	}
}