package com.spring.graph.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.spring.graph.utils.QueryUtils;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import com.spring.graph.QueryResolver.userSettingResponseTemplate;
import com.spring.graph.QueryResolver.GenericQueryResolver;
import com.spring.graph.Model.RecordsuserSetting;
  import com.spring.graph.QueryResolver.userResponseTemplate;
  import com.spring.graph.QueryResolver.organizationResponseTemplate;
  import com.spring.graph.QueryResolver.subOrganizationResponseTemplate;
  import com.spring.graph.QueryResolver.environmentResponseTemplate;


@Controller
public class userSettingController {

	@Autowired
	GenericQueryResolver genericQueryResolver;
	
	@QueryMapping
    public userSettingResponseTemplate finduserSettingByQuery(@Argument String query, @Argument String start,@Argument String rows, @Argument String filterField, @Argument List<String> filterQuery,
    							  @Argument String sort,@Argument String advanceField,@Argument String advanceQuery,@Argument String advance) {
		return  genericQueryResolver.finduserSettingByQuery(query, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance);	
    }
	  
  @SchemaMapping
  public userResponseTemplate finduserByQuery(
    RecordsuserSetting content,
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
    return genericQueryResolver.finduserByQuery(query2, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance);
  }
  @SchemaMapping
  public organizationResponseTemplate findorganizationByQuery(
    RecordsuserSetting content,
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
    return genericQueryResolver.findorganizationByQuery(query2, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance);
  }
  @SchemaMapping
  public subOrganizationResponseTemplate findsubOrganizationByQuery(
    RecordsuserSetting content,
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
    return genericQueryResolver.findsubOrganizationByQuery(query2, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance);
  }
  @SchemaMapping
  public environmentResponseTemplate findenvironmentByQuery(
    RecordsuserSetting content,
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
    return genericQueryResolver.findenvironmentByQuery(query2, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance);
  }


	
}