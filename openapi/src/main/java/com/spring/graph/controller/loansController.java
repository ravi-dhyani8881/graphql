package com.spring.graph.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import graphql.schema.DataFetchingEnvironment;

import com.spring.graph.utils.QueryUtils;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import com.spring.graph.QueryResolver.loansResponseTemplate;
import com.spring.graph.QueryResolver.GenericQueryResolver;
import com.spring.graph.Model.Recordsloans;
  import com.spring.graph.QueryResolver.usersResponseTemplate;
  import com.spring.graph.QueryResolver.booksResponseTemplate;


@Controller
public class loansController {

	@Autowired
	GenericQueryResolver genericQueryResolver;
	
	@QueryMapping
    public loansResponseTemplate findloansByQuery(@Argument String query, @Argument String start,@Argument String rows, @Argument String filterField, @Argument List<String> filterQuery,
    							  @Argument String sort,@Argument String advanceField,@Argument String advanceQuery,@Argument String advance ,DataFetchingEnvironment env) {
		String token = env.getGraphQlContext().get("token");	
    return  genericQueryResolver.findloansByQuery(query, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance, token);	
    }
	  
  @SchemaMapping
  public usersResponseTemplate findusersByQuery(
    Recordsloans content,
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
    return genericQueryResolver.findusersByQuery(query2, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance, token);
  }
  @SchemaMapping
  public booksResponseTemplate findbooksByQuery(
    Recordsloans content,
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
    return genericQueryResolver.findbooksByQuery(query2, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance, token);
  }

}