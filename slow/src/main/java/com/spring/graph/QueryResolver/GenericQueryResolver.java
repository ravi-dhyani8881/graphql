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
		
			public productsResponseTemplate  findproductsByQuery(String query, String start,  String rows, String filterField,  String filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance) {	
				
			HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity <String> entity = new HttpEntity<String>(headers);
		    
			String url="http://rest-service-630af869-856a-4261-9a9a-4066c9c15d85:80/"+toPascalCase("products")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<productsResponseTemplate> responseType =
	                new ParameterizedTypeReference<productsResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (productsResponseTemplate) response2;
		}
			public reviewsResponseTemplate  findreviewsByQuery(String query, String start,  String rows, String filterField,  String filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance) {	
				
			HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity <String> entity = new HttpEntity<String>(headers);
		    
			String url="http://rest-service-630af869-856a-4261-9a9a-4066c9c15d85:80/"+toPascalCase("reviews")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<reviewsResponseTemplate> responseType =
	                new ParameterizedTypeReference<reviewsResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (reviewsResponseTemplate) response2;
		}
			public productRatingsResponseTemplate  findproductRatingsByQuery(String query, String start,  String rows, String filterField,  String filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance) {	
				
			HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity <String> entity = new HttpEntity<String>(headers);
		    
			String url="http://rest-service-630af869-856a-4261-9a9a-4066c9c15d85:80/"+toPascalCase("productRatings")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<productRatingsResponseTemplate> responseType =
	                new ParameterizedTypeReference<productRatingsResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (productRatingsResponseTemplate) response2;
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
