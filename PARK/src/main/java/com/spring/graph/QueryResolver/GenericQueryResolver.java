package com.spring.graph.QueryResolver;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
		
			public ordersResponseTemplate  findordersByQuery(String query, String start,  String rows, String filterField,  List<String>	 filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance, String token) {	
				
			HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity <String> entity = new HttpEntity<String>(headers);

			headers.set("Authorization", 
            "Bearer "+token
        	);
			
			String fqParams = "";
						if (filterQuery != null && !filterQuery.isEmpty()) {
							fqParams = filterQuery.stream()
									.map(fq -> "filterQuery=" + fq)
									.collect(Collectors.joining("&"));
						}

			String url = "http://localhost:8080/api/orders?"
		            + "query=" + query
		            + "&start=" + start
		            + "&rows=" + rows
		            + "&filterField=" + filterField
		            + (fqParams.isEmpty() ? "" : "&" + fqParams)   // ✅ only append fqParams
		            + "&sort=" + sort
		            + "&advanceField=" + advanceField
		            + "&advanceQuery=" + advanceQuery
		            + "&advance=" + advance;				
  
		//	String url="http://rest-service-9317dd5e-4641-4ed6-ac0c-54f3f7636e6d:80/"+toPascalCase("orders")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<ordersResponseTemplate> responseType =
	                new ParameterizedTypeReference<ordersResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (ordersResponseTemplate) response2;
		}
			public userResponseTemplate  finduserByQuery(String query, String start,  String rows, String filterField,  List<String>	 filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance, String token) {	
				
			HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity <String> entity = new HttpEntity<String>(headers);

			headers.set("Authorization", 
            "Bearer "+token
        	);
			
			String fqParams = "";
						if (filterQuery != null && !filterQuery.isEmpty()) {
							fqParams = filterQuery.stream()
									.map(fq -> "filterQuery=" + fq)
									.collect(Collectors.joining("&"));
						}

			String url = "http://localhost:8080/api/user?"
		            + "query=" + query
		            + "&start=" + start
		            + "&rows=" + rows
		            + "&filterField=" + filterField
		            + (fqParams.isEmpty() ? "" : "&" + fqParams)   // ✅ only append fqParams
		            + "&sort=" + sort
		            + "&advanceField=" + advanceField
		            + "&advanceQuery=" + advanceQuery
		            + "&advance=" + advance;				
  
		//	String url="http://rest-service-9317dd5e-4641-4ed6-ac0c-54f3f7636e6d:80/"+toPascalCase("user")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<userResponseTemplate> responseType =
	                new ParameterizedTypeReference<userResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (userResponseTemplate) response2;
		}
			public supplyResponseTemplate  findsupplyByQuery(String query, String start,  String rows, String filterField,  List<String>	 filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance, String token) {	
				
			HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity <String> entity = new HttpEntity<String>(headers);

			headers.set("Authorization", 
            "Bearer "+token
        	);
			
			String fqParams = "";
						if (filterQuery != null && !filterQuery.isEmpty()) {
							fqParams = filterQuery.stream()
									.map(fq -> "filterQuery=" + fq)
									.collect(Collectors.joining("&"));
						}

			String url = "http://localhost:8080/api/supply?"
		            + "query=" + query
		            + "&start=" + start
		            + "&rows=" + rows
		            + "&filterField=" + filterField
		            + (fqParams.isEmpty() ? "" : "&" + fqParams)   // ✅ only append fqParams
		            + "&sort=" + sort
		            + "&advanceField=" + advanceField
		            + "&advanceQuery=" + advanceQuery
		            + "&advance=" + advance;				
  
		//	String url="http://rest-service-9317dd5e-4641-4ed6-ac0c-54f3f7636e6d:80/"+toPascalCase("supply")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<supplyResponseTemplate> responseType =
	                new ParameterizedTypeReference<supplyResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (supplyResponseTemplate) response2;
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
