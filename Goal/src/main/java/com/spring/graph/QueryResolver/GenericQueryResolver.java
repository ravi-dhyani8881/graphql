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
		
			public reviewsResponseTemplate  findreviewsByQuery(String query, String start,  String rows, String filterField,  List<String>	 filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance) {	
				
			HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity <String> entity = new HttpEntity<String>(headers);

			String fqParams = "";
						if (filterQuery != null && !filterQuery.isEmpty()) {
							fqParams = filterQuery.stream()
									.map(fq -> "filterQuery=" + fq)
									.collect(Collectors.joining("&"));
						}

			String url = "http://localhost:8080/"+toPascalCase("reviews")+"graph/findByQuery?"
		            + "query=" + query
		            + "&start=" + start
		            + "&rows=" + rows
		            + "&filterField=" + filterField
		            + (fqParams.isEmpty() ? "" : "&" + fqParams)   // ✅ only append fqParams
		            + "&sort=" + sort
		            + "&advanceField=" + advanceField
		            + "&advanceQuery=" + advanceQuery
		            + "&advance=" + advance;				
  
		//	String url="http://rest-service-aa7098b5-0f03-4f41-bb10-db9a919a52eb:80/"+toPascalCase("reviews")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<reviewsResponseTemplate> responseType =
	                new ParameterizedTypeReference<reviewsResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (reviewsResponseTemplate) response2;
		}
			public productsResponseTemplate  findproductsByQuery(String query, String start,  String rows, String filterField,  List<String>	 filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance) {	
				
			HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity <String> entity = new HttpEntity<String>(headers);

			String fqParams = "";
						if (filterQuery != null && !filterQuery.isEmpty()) {
							fqParams = filterQuery.stream()
									.map(fq -> "filterQuery=" + fq)
									.collect(Collectors.joining("&"));
						}

			String url = "http://localhost:8080/"+toPascalCase("products")+"graph/findByQuery?"
		            + "query=" + query
		            + "&start=" + start
		            + "&rows=" + rows
		            + "&filterField=" + filterField
		            + (fqParams.isEmpty() ? "" : "&" + fqParams)   // ✅ only append fqParams
		            + "&sort=" + sort
		            + "&advanceField=" + advanceField
		            + "&advanceQuery=" + advanceQuery
		            + "&advance=" + advance;				
  
		//	String url="http://rest-service-aa7098b5-0f03-4f41-bb10-db9a919a52eb:80/"+toPascalCase("products")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<productsResponseTemplate> responseType =
	                new ParameterizedTypeReference<productsResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (productsResponseTemplate) response2;
		}
			public ratingsResponseTemplate  findratingsByQuery(String query, String start,  String rows, String filterField,  List<String>	 filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance) {	
				
			HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity <String> entity = new HttpEntity<String>(headers);

			String fqParams = "";
						if (filterQuery != null && !filterQuery.isEmpty()) {
							fqParams = filterQuery.stream()
									.map(fq -> "filterQuery=" + fq)
									.collect(Collectors.joining("&"));
						}

			String url = "http://localhost:8080/"+toPascalCase("ratings")+"graph/findByQuery?"
		            + "query=" + query
		            + "&start=" + start
		            + "&rows=" + rows
		            + "&filterField=" + filterField
		            + (fqParams.isEmpty() ? "" : "&" + fqParams)   // ✅ only append fqParams
		            + "&sort=" + sort
		            + "&advanceField=" + advanceField
		            + "&advanceQuery=" + advanceQuery
		            + "&advance=" + advance;				
  
		//	String url="http://rest-service-aa7098b5-0f03-4f41-bb10-db9a919a52eb:80/"+toPascalCase("ratings")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<ratingsResponseTemplate> responseType =
	                new ParameterizedTypeReference<ratingsResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (ratingsResponseTemplate) response2;
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
