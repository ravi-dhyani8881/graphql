package com.spring.graph.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.spring.graph.utils.QueryUtils;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import com.spring.graph.QueryResolver.apiKeyResponseTemplate;
import com.spring.graph.QueryResolver.GenericQueryResolver;
import com.spring.graph.Model.RecordsapiKey;


@Controller
public class apiKeyController {

	@Autowired
	GenericQueryResolver genericQueryResolver;
	
	@QueryMapping
    public apiKeyResponseTemplate findapiKeyByQuery(@Argument String query, @Argument String start,@Argument String rows, @Argument String filterField, @Argument List<String> filterQuery,
    							  @Argument String sort,@Argument String advanceField,@Argument String advanceQuery,@Argument String advance) {
		return  genericQueryResolver.findapiKeyByQuery(query, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance);	
    }
	  


	
}