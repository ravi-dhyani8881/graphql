package com.spring.graph.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.spring.graph.utils.QueryUtils;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import com.spring.graph.QueryResolver.productResponseTemplate;
import com.spring.graph.QueryResolver.GenericQueryResolver;
import com.spring.graph.Model.Recordsproduct;
  import com.spring.graph.QueryResolver.profilesResponseTemplate;
  import com.spring.graph.QueryResolver.ordersResponseTemplate;


@Controller
public class productController {

	@Autowired
	GenericQueryResolver genericQueryResolver;
	
	@QueryMapping
    public productResponseTemplate findproductByQuery(@Argument String query, @Argument String start,@Argument String rows, @Argument String filterField, @Argument String filterQuery,
    							  @Argument String sort,@Argument String advanceField,@Argument String advanceQuery,@Argument String advance,@Argument String field ) {
		return  genericQueryResolver.findproductByQuery(query, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance, field);	
    }
	  
  @SchemaMapping
  public profilesResponseTemplate findprofilesByQuery(
    Recordsproduct content,
    @Argument String query,
    @Argument String start,
    @Argument String rows,
    @Argument String filterField,
    @Argument String filterQuery,
    @Argument String sort,
    @Argument String advanceField,
    @Argument String advanceQuery,
    @Argument String advance,
    @Argument String field
  ) throws Exception {
    String query2 = QueryUtils.replaceTokens(query, content);  
    return genericQueryResolver.findprofilesByQuery(query2, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance, field);
  }
  @SchemaMapping
  public ordersResponseTemplate findordersByQuery(
    Recordsproduct content,
    @Argument String query,
    @Argument String start,
    @Argument String rows,
    @Argument String filterField,
    @Argument String filterQuery,
    @Argument String sort,
    @Argument String advanceField,
    @Argument String advanceQuery,
    @Argument String advance,
    @Argument String field
  ) throws Exception {
    String query2 = QueryUtils.replaceTokens(query, content);  
    return genericQueryResolver.findordersByQuery(query2, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance, field);
  }


	
}