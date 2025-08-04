package com.spring.graph.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.spring.graph.utils.QueryUtils;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import com.spring.graph.QueryResolver.localResponseTemplate;
import com.spring.graph.QueryResolver.GenericQueryResolver;
import com.spring.graph.Model.Recordslocal;
  import com.spring.graph.QueryResolver.schoolResponseTemplate;
  import com.spring.graph.QueryResolver.doorResponseTemplate;


@Controller
public class localController {

	@Autowired
	GenericQueryResolver genericQueryResolver;
	
	@QueryMapping
    public localResponseTemplate findlocalByQuery(@Argument String query, @Argument String start,@Argument String rows, @Argument String filterField, @Argument String filterQuery,
    							  @Argument String sort,@Argument String advanceField,@Argument String advanceQuery,@Argument String advance) {
		return  genericQueryResolver.findlocalByQuery(query, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance);	
    }
	  
  @SchemaMapping
  public schoolResponseTemplate findschoolByQuery(
    Recordslocal content,
    @Argument String query,
    @Argument String start,
    @Argument String rows,
    @Argument String filterField,
    @Argument String filterQuery,
    @Argument String sort,
    @Argument String advanceField,
    @Argument String advanceQuery,
    @Argument String advance
    
  ) throws Exception {
    String query2 = QueryUtils.replaceTokens(query, content);  
    return genericQueryResolver.findschoolByQuery(query2, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance);
  }
  @SchemaMapping
  public doorResponseTemplate finddoorByQuery(
    Recordslocal content,
    @Argument String query,
    @Argument String start,
    @Argument String rows,
    @Argument String filterField,
    @Argument String filterQuery,
    @Argument String sort,
    @Argument String advanceField,
    @Argument String advanceQuery,
    @Argument String advance
    
  ) throws Exception {
    String query2 = QueryUtils.replaceTokens(query, content);  
    return genericQueryResolver.finddoorByQuery(query2, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance);
  }


	
}