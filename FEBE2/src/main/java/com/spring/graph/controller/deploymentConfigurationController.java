package com.spring.graph.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.spring.graph.utils.QueryUtils;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import com.spring.graph.QueryResolver.deploymentConfigurationResponseTemplate;
import com.spring.graph.QueryResolver.GenericQueryResolver;
import com.spring.graph.Model.RecordsdeploymentConfiguration;
  import com.spring.graph.QueryResolver.ConfigurationResponseTemplate;
  import com.spring.graph.QueryResolver.graphDeploymentsResponseTemplate;


@Controller
public class deploymentConfigurationController {

	@Autowired
	GenericQueryResolver genericQueryResolver;
	
	@QueryMapping
    public deploymentConfigurationResponseTemplate finddeploymentConfigurationByQuery(@Argument String query, @Argument String start,@Argument String rows, @Argument String filterField, @Argument String filterQuery,
    							  @Argument String sort,@Argument String advanceField,@Argument String advanceQuery,@Argument String advance,@Argument String field ) {
		return  genericQueryResolver.finddeploymentConfigurationByQuery(query, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance, field);	
    }
	  
  @SchemaMapping
  public ConfigurationResponseTemplate findConfigurationByQuery(
    RecordsdeploymentConfiguration content,
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
    return genericQueryResolver.findConfigurationByQuery(query2, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance, field);
  }
  @SchemaMapping
  public graphDeploymentsResponseTemplate findgraphDeploymentsByQuery(
    RecordsdeploymentConfiguration content,
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
    return genericQueryResolver.findgraphDeploymentsByQuery(query2, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance, field);
  }


	
}