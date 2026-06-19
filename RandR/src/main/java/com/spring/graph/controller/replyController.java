package com.spring.graph.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import graphql.schema.DataFetchingEnvironment;

import com.spring.graph.utils.QueryUtils;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import com.spring.graph.QueryResolver.replyResponseTemplate;
import com.spring.graph.QueryResolver.GenericQueryResolver;
import com.spring.graph.Model.Recordsreply;
  import com.spring.graph.QueryResolver.contentResponseTemplate;
  import com.spring.graph.QueryResolver.userResponseTemplate;
  import com.spring.graph.QueryResolver.reviewResponseTemplate;


@Controller
public class replyController {

	@Autowired
	GenericQueryResolver genericQueryResolver;
	
	@QueryMapping
    public replyResponseTemplate findreplyByQuery(@Argument String query, @Argument String start,@Argument String rows, @Argument String filterField, @Argument List<String> filterQuery,
    							  @Argument String sort,@Argument String advanceField,@Argument String advanceQuery,@Argument String advance ,DataFetchingEnvironment env) {
		String token = env.getGraphQlContext().get("token");	
    return  genericQueryResolver.findreplyByQuery(query, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance, token);	
    }
	  
  @SchemaMapping
  public contentResponseTemplate findcontentByQuery(
    Recordsreply content,
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
    return genericQueryResolver.findcontentByQuery(query2, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance, token);
  }
  @SchemaMapping
  public userResponseTemplate finduserByQuery(
    Recordsreply content,
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
    return genericQueryResolver.finduserByQuery(query2, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance, token);
  }
  @SchemaMapping
  public reviewResponseTemplate findreviewByQuery(
    Recordsreply content,
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
    return genericQueryResolver.findreviewByQuery(query2, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance, token);
  }

}