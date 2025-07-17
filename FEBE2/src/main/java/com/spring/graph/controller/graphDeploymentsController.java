package com.spring.graph.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.spring.graph.utils.QueryUtils;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import com.spring.graph.QueryResolver.graphDeploymentsResponseTemplate;
import com.spring.graph.QueryResolver.GenericQueryResolver;
import com.spring.graph.Model.RecordsgraphDeployments;
  import com.spring.graph.QueryResolver.graphVersionsResponseTemplate;
  import com.spring.graph.QueryResolver.graphResponseTemplate;
  import com.spring.graph.QueryResolver.deploymentConfigurationResponseTemplate;


@Controller
public class graphDeploymentsController {

	@Autowired
	GenericQueryResolver genericQueryResolver;
	
	@QueryMapping
    public graphDeploymentsResponseTemplate findgraphDeploymentsByQuery(@Argument String query, @Argument String start,@Argument String rows, @Argument String filterField, @Argument String filterQuery,
    							  @Argument String sort,@Argument String advanceField,@Argument String advanceQuery,@Argument String advance,@Argument String field ) {
		return  genericQueryResolver.findgraphDeploymentsByQuery(query, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance, field);	
    }
	  
  @SchemaMapping
  public graphVersionsResponseTemplate findgraphVersionsByQuery(
    RecordsgraphDeployments content,
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
    return genericQueryResolver.findgraphVersionsByQuery(query2, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance, field);
  }
  @SchemaMapping
  public graphResponseTemplate findgraphByQuery(
    RecordsgraphDeployments content,
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
    return genericQueryResolver.findgraphByQuery(query2, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance, field);
  }
  @SchemaMapping
  public deploymentConfigurationResponseTemplate finddeploymentConfigurationByQuery(
    RecordsgraphDeployments content,
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
    return genericQueryResolver.finddeploymentConfigurationByQuery(query2, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance, field);
  }


	
}