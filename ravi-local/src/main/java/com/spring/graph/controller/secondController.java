package com.spring.graph.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.spring.graph.utils.QueryUtils;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import com.spring.graph.QueryResolver.secondResponseTemplate;
import com.spring.graph.QueryResolver.GenericQueryResolver;
import com.spring.graph.Model.Recordssecond;
import com.spring.graph.QueryResolver.raviResponseTemplate;

@Controller
public class secondController {

	@Autowired
	GenericQueryResolver genericQueryResolver;
	
	@QueryMapping
    public secondResponseTemplate findsecondByQuery(@Argument String query, @Argument String start,@Argument String rows, @Argument String filterField, @Argument String filterQuery,
    							  @Argument String sort,@Argument String advanceField,@Argument String advanceQuery,@Argument String advance,@Argument String field ) {
		return  genericQueryResolver.findsecondByQuery(query, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance, field);	
    }
	  
			@SchemaMapping
			public raviResponseTemplate findraviByQuery(Recordssecond content, @Argument String query, @Argument String start,@Argument String rows,
    												@Argument String filterField, @Argument String filterQuery,
    							  @Argument String sort,@Argument String advanceField,@Argument String advanceQuery,@Argument String advance,@Argument String field) throws Exception {
		String query2=QueryUtils.replaceTokens(query, content);	
		return genericQueryResolver.findraviByQuery(query2, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance, field);
    }

	
}