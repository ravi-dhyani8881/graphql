package com.spring.graph.QueryResolver;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spring.graph.Model.Recordsenvironment;


public class environmentResponseTemplate {

	
	
	@JsonProperty("pagination")
	private Pagination pagination;

	@JsonProperty("data")
    private List<Recordsenvironment> data;
    
	@JsonProperty("advanced")
    public ArrayList<Advanced> advanced;

	
	public Pagination getPagination() {
		return pagination;
	}

	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}

	public List<Recordsenvironment> getData() {
		return data;
	}

	public void setData(List<Recordsenvironment> data) {
		this.data = data;
	}

	public ArrayList<Advanced> getAdvanced() {
		return advanced;
	}

	public void setAdvanced(ArrayList<Advanced> advanced) {
		this.advanced = advanced;
	}
}