package com.spring.graph.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.spring.graph.utils.QueryUtils;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import com.spring.graph.QueryResolver.projectResponseTemplate;
import com.spring.graph.QueryResolver.GenericQueryResolver;
import com.spring.graph.Model.Recordsproject;
  import com.spring.graph.QueryResolver.versionResponseTemplate;
  import com.spring.graph.QueryResolver.deploymentResponseTemplate;
  import com.spring.graph.QueryResolver.organizationResponseTemplate;
  import com.spring.graph.QueryResolver.subOrganizationResponseTemplate;
  import com.spring.graph.QueryResolver.environmentResponseTemplate;
  import com.spring.graph.QueryResolver.apiKeyResponseTemplate;


@Controller
public class projectController {

	@Autowired
	GenericQueryResolver genericQueryResolver;
	
	@QueryMapping
    public projectResponseTemplate findprojectByQuery(@Argument String query, @Argument String start,@Argument String rows, @Argument String filterField, @Argument List<String> filterQuery,
    							  @Argument String sort,@Argument String advanceField,@Argument String advanceQuery,@Argument String advance ,@Argument String token) {
		return  genericQueryResolver.findprojectByQuery(query, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance, token);	
    }
	  
  @SchemaMapping
  public versionResponseTemplate findversionByQuery(
    Recordsproject content,
    @Argument String query,
    @Argument String start,
    @Argument String rows,
    @Argument String filterField,
    @Argument List<String> filterQuery,
    @Argument String sort,
    @Argument String advanceField,
    @Argument String advanceQuery,
    @Argument String advance,
    @Argument String token
    
  ) throws Exception {
    String query2 = QueryUtils.replaceTokens(query, content);  
    return genericQueryResolver.findversionByQuery(query2, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance, token);
  }
  @SchemaMapping
  public deploymentResponseTemplate finddeploymentByQuery(
    Recordsproject content,
    @Argument String query,
    @Argument String start,
    @Argument String rows,
    @Argument String filterField,
    @Argument List<String> filterQuery,
    @Argument String sort,
    @Argument String advanceField,
    @Argument String advanceQuery,
    @Argument String advance,
    @Argument String token
    
  ) throws Exception {
    String query2 = QueryUtils.replaceTokens(query, content);  
    return genericQueryResolver.finddeploymentByQuery(query2, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance, token);
  }
  @SchemaMapping
  public organizationResponseTemplate findorganizationByQuery(
    Recordsproject content,
    @Argument String query,
    @Argument String start,
    @Argument String rows,
    @Argument String filterField,
    @Argument List<String> filterQuery,
    @Argument String sort,
    @Argument String advanceField,
    @Argument String advanceQuery,
    @Argument String advance,
    @Argument String token
    
  ) throws Exception {
    String query2 = QueryUtils.replaceTokens(query, content);  
    return genericQueryResolver.findorganizationByQuery(query2, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance, token);
  }
  @SchemaMapping
  public subOrganizationResponseTemplate findsubOrganizationByQuery(
    Recordsproject content,
    @Argument String query,
    @Argument String start,
    @Argument String rows,
    @Argument String filterField,
    @Argument List<String> filterQuery,
    @Argument String sort,
    @Argument String advanceField,
    @Argument String advanceQuery,
    @Argument String advance,
    @Argument String token
    
  ) throws Exception {
    String query2 = QueryUtils.replaceTokens(query, content);  
    return genericQueryResolver.findsubOrganizationByQuery(query2, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance, token);
  }
  @SchemaMapping
  public environmentResponseTemplate findenvironmentByQuery(
    Recordsproject content,
    @Argument String query,
    @Argument String start,
    @Argument String rows,
    @Argument String filterField,
    @Argument List<String> filterQuery,
    @Argument String sort,
    @Argument String advanceField,
    @Argument String advanceQuery,
    @Argument String advance,
    @Argument String token
    
  ) throws Exception {
    String query2 = QueryUtils.replaceTokens(query, content);  
    return genericQueryResolver.findenvironmentByQuery(query2, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance, token);
  }
  @SchemaMapping
  public apiKeyResponseTemplate findapiKeyByQuery(
    Recordsproject content,
    @Argument String query,
    @Argument String start,
    @Argument String rows,
    @Argument String filterField,
    @Argument List<String> filterQuery,
    @Argument String sort,
    @Argument String advanceField,
    @Argument String advanceQuery,
    @Argument String advance,
    @Argument String token
    
  ) throws Exception {
    String query2 = QueryUtils.replaceTokens(query, content);  
    return genericQueryResolver.findapiKeyByQuery(query2, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance, token);
  }

}