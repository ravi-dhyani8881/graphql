package com.spring.graph.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.spring.graph.utils.QueryUtils;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import com.spring.graph.QueryResolver.subOrganizationResponseTemplate;
import com.spring.graph.QueryResolver.GenericQueryResolver;
import com.spring.graph.Model.RecordssubOrganization;
  import com.spring.graph.QueryResolver.organizationResponseTemplate;
  import com.spring.graph.QueryResolver.environmentResponseTemplate;
  import com.spring.graph.QueryResolver.projectResponseTemplate;
  import com.spring.graph.QueryResolver.publishLogResponseTemplate;


@Controller
public class subOrganizationController {

	@Autowired
	GenericQueryResolver genericQueryResolver;
	
	@QueryMapping
    public subOrganizationResponseTemplate findsubOrganizationByQuery(@Argument String query, @Argument String start,@Argument String rows, @Argument String filterField, @Argument List<String> filterQuery,
    							  @Argument String sort,@Argument String advanceField,@Argument String advanceQuery,@Argument String advance ,@Argument String token) {
		return  genericQueryResolver.findsubOrganizationByQuery(query, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance, token);	
    }
	  
  @SchemaMapping
  public organizationResponseTemplate findorganizationByQuery(
    RecordssubOrganization content,
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
  public environmentResponseTemplate findenvironmentByQuery(
    RecordssubOrganization content,
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
  public projectResponseTemplate findprojectByQuery(
    RecordssubOrganization content,
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
    return genericQueryResolver.findprojectByQuery(query2, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance, token);
  }
  @SchemaMapping
  public publishLogResponseTemplate findpublishLogByQuery(
    RecordssubOrganization content,
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
    return genericQueryResolver.findpublishLogByQuery(query2, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance, token);
  }

}