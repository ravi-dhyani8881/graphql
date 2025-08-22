package com.spring.graph.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.spring.graph.utils.QueryUtils;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import com.spring.graph.QueryResolver.productRatingsResponseTemplate;
import com.spring.graph.QueryResolver.GenericQueryResolver;
import com.spring.graph.Model.RecordsproductRatings;
  import com.spring.graph.QueryResolver.reviewsResponseTemplate;


@Controller
public class productRatingsController {

	@Autowired
	GenericQueryResolver genericQueryResolver;
	
	@QueryMapping
    public productRatingsResponseTemplate findproductRatingsByQuery(@Argument String query, @Argument String start,@Argument String rows, @Argument String filterField, @Argument String filterQuery,
    							  @Argument String sort,@Argument String advanceField,@Argument String advanceQuery,@Argument String advance) {
		return  genericQueryResolver.findproductRatingsByQuery(query, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance);	
    }
	  
  @SchemaMapping
  public reviewsResponseTemplate findreviewsByQuery(
    RecordsproductRatings content,
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
    return genericQueryResolver.findreviewsByQuery(query2, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance);
  }


	
}