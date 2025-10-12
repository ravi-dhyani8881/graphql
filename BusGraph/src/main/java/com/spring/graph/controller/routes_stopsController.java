package com.spring.graph.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.spring.graph.utils.QueryUtils;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import com.spring.graph.QueryResolver.routes_stopsResponseTemplate;
import com.spring.graph.QueryResolver.GenericQueryResolver;
import com.spring.graph.Model.Recordsroutes_stops;
  import com.spring.graph.QueryResolver.bus_routesResponseTemplate;
  import com.spring.graph.QueryResolver.stopsResponseTemplate;


@Controller
public class routes_stopsController {

	@Autowired
	GenericQueryResolver genericQueryResolver;
	
	@QueryMapping
    public routes_stopsResponseTemplate findroutes_stopsByQuery(@Argument String query, @Argument String start,@Argument String rows, @Argument String filterField, @Argument List<String> filterQuery,
    							  @Argument String sort,@Argument String advanceField,@Argument String advanceQuery,@Argument String advance) {
		return  genericQueryResolver.findroutes_stopsByQuery(query, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance);	
    }
	  
  @SchemaMapping
  public bus_routesResponseTemplate findbus_routesByQuery(
    Recordsroutes_stops content,
    @Argument String query,
    @Argument String start,
    @Argument String rows,
    @Argument String filterField,
    @Argument List<String> filterQuery,
    @Argument String sort,
    @Argument String advanceField,
    @Argument String advanceQuery,
    @Argument String advance
    
  ) throws Exception {
    String query2 = QueryUtils.replaceTokens(query, content);  
    return genericQueryResolver.findbus_routesByQuery(query2, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance);
  }
  @SchemaMapping
  public stopsResponseTemplate findstopsByQuery(
    Recordsroutes_stops content,
    @Argument String query,
    @Argument String start,
    @Argument String rows,
    @Argument String filterField,
    @Argument List<String> filterQuery,
    @Argument String sort,
    @Argument String advanceField,
    @Argument String advanceQuery,
    @Argument String advance
    
  ) throws Exception {
    String query2 = QueryUtils.replaceTokens(query, content);  
    return genericQueryResolver.findstopsByQuery(query2, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance);
  }


	
}