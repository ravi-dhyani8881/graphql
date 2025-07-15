package com.spring.graph.QueryResolver;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class GenericQueryResolver {

	@Autowired
	RestTemplate restTemplate;
		
			public usersResponseTemplate  findusersByQuery(String query, String start,  String rows, String filterField,  String filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance, String field) {	
				
			HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity <String> entity = new HttpEntity<String>(headers);
		    
			String url="http://rest-service-c5f298c6-06cb-40c3-a751-c5f652137c18:80/"+toPascalCase(field)+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort"+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<usersResponseTemplate> responseType =
	                new ParameterizedTypeReference<usersResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (usersResponseTemplate) response2;
		}
			public profilesResponseTemplate  findprofilesByQuery(String query, String start,  String rows, String filterField,  String filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance, String field) {	
				
			HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity <String> entity = new HttpEntity<String>(headers);
		    
			String url="http://rest-service-c5f298c6-06cb-40c3-a751-c5f652137c18:80/"+toPascalCase(field)+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort"+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<profilesResponseTemplate> responseType =
	                new ParameterizedTypeReference<profilesResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (profilesResponseTemplate) response2;
		}
			public productResponseTemplate  findproductByQuery(String query, String start,  String rows, String filterField,  String filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance, String field) {	
				
			HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity <String> entity = new HttpEntity<String>(headers);
		    
			String url="http://rest-service-c5f298c6-06cb-40c3-a751-c5f652137c18:80/"+toPascalCase(field)+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort"+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<productResponseTemplate> responseType =
	                new ParameterizedTypeReference<productResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (productResponseTemplate) response2;
		}
			public ordersResponseTemplate  findordersByQuery(String query, String start,  String rows, String filterField,  String filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance, String field) {	
				
			HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity <String> entity = new HttpEntity<String>(headers);
		    
			String url="http://rest-service-c5f298c6-06cb-40c3-a751-c5f652137c18:80/"+toPascalCase(field)+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort"+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<ordersResponseTemplate> responseType =
	                new ParameterizedTypeReference<ordersResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (ordersResponseTemplate) response2;
		}

		public static String toPascalCase(String input) {
			    String[] parts = input.split("_");
			    StringBuilder pascalCase = new StringBuilder();

			    for (String part : parts) {
			        if (part.isEmpty()) continue;
			        pascalCase.append(Character.toUpperCase(part.charAt(0)));
			        if (part.length() > 1) {
			            pascalCase.append(part.substring(1).toLowerCase());
			        }
			    }

			    return pascalCase.toString();
			}
}
