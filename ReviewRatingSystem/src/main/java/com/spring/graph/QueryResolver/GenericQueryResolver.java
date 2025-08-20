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
		
			public transcriptionsResponseTemplate  findtranscriptionsByQuery(String query, String start,  String rows, String filterField,  String filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance) {	
				
			HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity <String> entity = new HttpEntity<String>(headers);
		    
			String url="http://rest-service-6dbc7ebc-f3a3-4044-8dd3-4a5f5291a1a6:80/"+toPascalCase("transcriptions")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<transcriptionsResponseTemplate> responseType =
	                new ParameterizedTypeReference<transcriptionsResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (transcriptionsResponseTemplate) response2;
		}
			public summariesResponseTemplate  findsummariesByQuery(String query, String start,  String rows, String filterField,  String filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance) {	
				
			HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity <String> entity = new HttpEntity<String>(headers);
		    
			String url="http://rest-service-6dbc7ebc-f3a3-4044-8dd3-4a5f5291a1a6:80/"+toPascalCase("summaries")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<summariesResponseTemplate> responseType =
	                new ParameterizedTypeReference<summariesResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (summariesResponseTemplate) response2;
		}
			public action_itemsResponseTemplate  findaction_itemsByQuery(String query, String start,  String rows, String filterField,  String filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance) {	
				
			HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity <String> entity = new HttpEntity<String>(headers);
		    
			String url="http://rest-service-6dbc7ebc-f3a3-4044-8dd3-4a5f5291a1a6:80/"+toPascalCase("action_items")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<action_itemsResponseTemplate> responseType =
	                new ParameterizedTypeReference<action_itemsResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (action_itemsResponseTemplate) response2;
		}
			public summarryResponseTemplate  findsummarryByQuery(String query, String start,  String rows, String filterField,  String filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance) {	
				
			HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity <String> entity = new HttpEntity<String>(headers);
		    
			String url="http://rest-service-6dbc7ebc-f3a3-4044-8dd3-4a5f5291a1a6:80/"+toPascalCase("summarry")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<summarryResponseTemplate> responseType =
	                new ParameterizedTypeReference<summarryResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (summarryResponseTemplate) response2;
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
