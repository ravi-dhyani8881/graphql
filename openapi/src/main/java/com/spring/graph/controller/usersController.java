package com.spring.graph.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import graphql.schema.DataFetchingEnvironment;

import com.spring.graph.utils.QueryUtils;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import com.spring.graph.QueryResolver.usersResponseTemplate;
import com.spring.graph.QueryResolver.GenericQueryResolver;
import com.spring.graph.Model.Recordsusers;
  import com.spring.graph.QueryResolver.teachersResponseTemplate;
  import com.spring.graph.QueryResolver.loansResponseTemplate;


@Controller
public class usersController {

	@Autowired
	GenericQueryResolver genericQueryResolver;
	
	@QueryMapping
    public usersResponseTemplate findusersByQuery(@Argument String query, @Argument String start,@Argument String rows, @Argument String filterField, @Argument List<String> filterQuery,
    							  @Argument String sort,@Argument String advanceField,@Argument String advanceQuery,@Argument String advance ,DataFetchingEnvironment env) {
		String token = env.getGraphQlContext().get("token");	
    return  genericQueryResolver.findusersByQuery(query, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance, token);	
    }
	  
  @SchemaMapping
  public teachersResponseTemplate findteachersByQuery(
    Recordsusers content,
    @Argument String query,
    @Argument String start,
    @Argument String rows,
    @Argument String filterField,
    @Argument List<String> filterQuery,
    @Argument String sort,
    @Argument String advanceField,
    @Argument String advanceQuery,
    @Argument String advance,
    DataFetchingEnvironment env
    
  ) throws Exception {
    String query2 = QueryUtils.replaceTokens(query, content);  
    String token = env.getGraphQlContext().get("token");	
    return genericQueryResolver.findteachersByQuery(query2, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance, token);
  }
  @SchemaMapping
  public loansResponseTemplate findloansByQuery(
    Recordsusers content,
    @Argument String query,
    @Argument String start,
    @Argument String rows,
    @Argument String filterField,
    @Argument List<String> filterQuery,
    @Argument String sort,
    @Argument String advanceField,
    @Argument String advanceQuery,
    @Argument String advance,
    DataFetchingEnvironment env
    
  ) throws Exception {
    String query2 = QueryUtils.replaceTokens(query, content);  
    String token = env.getGraphQlContext().get("token");	
    return genericQueryResolver.findloansByQuery(query2, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance, token);
  }

}