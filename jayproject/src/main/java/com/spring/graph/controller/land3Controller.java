package com.spring.graph.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.spring.graph.utils.QueryUtils;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import com.spring.graph.QueryResolver.land3ResponseTemplate;
import com.spring.graph.QueryResolver.GenericQueryResolver;
import com.spring.graph.Model.Recordsland3;
import com.spring.graph.QueryResolver.ravime2ResponseTemplate;

@Controller
public class land3Controller {

	@Autowired
	GenericQueryResolver genericQueryResolver;
	
	@QueryMapping
    public land3ResponseTemplate findland3ByQuery(@Argument String query, @Argument String start,@Argument String rows, @Argument String filterField, @Argument String filterQuery,
    							  @Argument String sort,@Argument String advanceField,@Argument String advanceQuery,@Argument String advance,@Argument String field ) {
		return  genericQueryResolver.findland3ByQuery(query, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance, field);	
    }
	  
			@SchemaMapping
			public ravime2ResponseTemplate findravime2ByQuery(Recordsland3 content, @Argument String query, @Argument String start,@Argument String rows,
    												@Argument String filterField, @Argument String filterQuery,
    							  @Argument String sort,@Argument String advanceField,@Argument String advanceQuery,@Argument String advance,@Argument String field) throws Exception {
		String query2=QueryUtils.replaceTokens(query, content);	
		return genericQueryResolver.findravime2ByQuery(query2, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance, field);
    }

	
}