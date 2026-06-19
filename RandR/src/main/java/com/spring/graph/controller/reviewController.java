package com.spring.graph.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import graphql.schema.DataFetchingEnvironment;

import com.spring.graph.utils.QueryUtils;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import com.spring.graph.QueryResolver.reviewResponseTemplate;
import com.spring.graph.QueryResolver.GenericQueryResolver;
import com.spring.graph.Model.Recordsreview;
  import com.spring.graph.QueryResolver.contentResponseTemplate;
  import com.spring.graph.QueryResolver.userResponseTemplate;
  import com.spring.graph.QueryResolver.likeResponseTemplate;
  import com.spring.graph.QueryResolver.helpfullResponseTemplate;
  import com.spring.graph.QueryResolver.dislikeResponseTemplate;
  import com.spring.graph.QueryResolver.replyResponseTemplate;


@Controller
public class reviewController {

	@Autowired
	GenericQueryResolver genericQueryResolver;
	
	@QueryMapping
    public reviewResponseTemplate findreviewByQuery(@Argument String query, @Argument String start,@Argument String rows, @Argument String filterField, @Argument List<String> filterQuery,
    							  @Argument String sort,@Argument String advanceField,@Argument String advanceQuery,@Argument String advance ,DataFetchingEnvironment env) {
		String token = env.getGraphQlContext().get("token");	
    return  genericQueryResolver.findreviewByQuery(query, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance, token);	
    }
	  
  @SchemaMapping
  public contentResponseTemplate findcontentByQuery(
    Recordsreview content,
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
    Recordsreview content,
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
  public likeResponseTemplate findlikeByQuery(
    Recordsreview content,
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
    return genericQueryResolver.findlikeByQuery(query2, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance, token);
  }
  @SchemaMapping
  public helpfullResponseTemplate findhelpfullByQuery(
    Recordsreview content,
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
    return genericQueryResolver.findhelpfullByQuery(query2, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance, token);
  }
  @SchemaMapping
  public dislikeResponseTemplate finddislikeByQuery(
    Recordsreview content,
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
    return genericQueryResolver.finddislikeByQuery(query2, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance, token);
  }
  @SchemaMapping
  public replyResponseTemplate findreplyByQuery(
    Recordsreview content,
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
    return genericQueryResolver.findreplyByQuery(query2, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance, token);
  }

}