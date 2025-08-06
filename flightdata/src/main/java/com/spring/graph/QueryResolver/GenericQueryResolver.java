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
		
			public airlinesResponseTemplate  findairlinesByQuery(String query, String start,  String rows, String filterField,  String filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance) {	
				
			HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity <String> entity = new HttpEntity<String>(headers);
		    
			String url="http://rest-service-c46e27ea-e228-41c8-a1e2-f51e957ae3e8:80/"+toPascalCase("airlines")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<airlinesResponseTemplate> responseType =
	                new ParameterizedTypeReference<airlinesResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (airlinesResponseTemplate) response2;
		}
			public airportsResponseTemplate  findairportsByQuery(String query, String start,  String rows, String filterField,  String filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance) {	
				
			HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity <String> entity = new HttpEntity<String>(headers);
		    
			String url="http://rest-service-c46e27ea-e228-41c8-a1e2-f51e957ae3e8:80/"+toPascalCase("airports")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<airportsResponseTemplate> responseType =
	                new ParameterizedTypeReference<airportsResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (airportsResponseTemplate) response2;
		}
			public aircraftsResponseTemplate  findaircraftsByQuery(String query, String start,  String rows, String filterField,  String filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance) {	
				
			HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity <String> entity = new HttpEntity<String>(headers);
		    
			String url="http://rest-service-c46e27ea-e228-41c8-a1e2-f51e957ae3e8:80/"+toPascalCase("aircrafts")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<aircraftsResponseTemplate> responseType =
	                new ParameterizedTypeReference<aircraftsResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (aircraftsResponseTemplate) response2;
		}
			public flightsResponseTemplate  findflightsByQuery(String query, String start,  String rows, String filterField,  String filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance) {	
				
			HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity <String> entity = new HttpEntity<String>(headers);
		    
			String url="http://rest-service-c46e27ea-e228-41c8-a1e2-f51e957ae3e8:80/"+toPascalCase("flights")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<flightsResponseTemplate> responseType =
	                new ParameterizedTypeReference<flightsResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (flightsResponseTemplate) response2;
		}
			public passengersResponseTemplate  findpassengersByQuery(String query, String start,  String rows, String filterField,  String filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance) {	
				
			HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity <String> entity = new HttpEntity<String>(headers);
		    
			String url="http://rest-service-c46e27ea-e228-41c8-a1e2-f51e957ae3e8:80/"+toPascalCase("passengers")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<passengersResponseTemplate> responseType =
	                new ParameterizedTypeReference<passengersResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (passengersResponseTemplate) response2;
		}
			public bookingsResponseTemplate  findbookingsByQuery(String query, String start,  String rows, String filterField,  String filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance) {	
				
			HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity <String> entity = new HttpEntity<String>(headers);
		    
			String url="http://rest-service-c46e27ea-e228-41c8-a1e2-f51e957ae3e8:80/"+toPascalCase("bookings")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<bookingsResponseTemplate> responseType =
	                new ParameterizedTypeReference<bookingsResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (bookingsResponseTemplate) response2;
		}
			public ticketsResponseTemplate  findticketsByQuery(String query, String start,  String rows, String filterField,  String filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance) {	
				
			HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity <String> entity = new HttpEntity<String>(headers);
		    
			String url="http://rest-service-c46e27ea-e228-41c8-a1e2-f51e957ae3e8:80/"+toPascalCase("tickets")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<ticketsResponseTemplate> responseType =
	                new ParameterizedTypeReference<ticketsResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (ticketsResponseTemplate) response2;
		}
			public crew_membersResponseTemplate  findcrew_membersByQuery(String query, String start,  String rows, String filterField,  String filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance) {	
				
			HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity <String> entity = new HttpEntity<String>(headers);
		    
			String url="http://rest-service-c46e27ea-e228-41c8-a1e2-f51e957ae3e8:80/"+toPascalCase("crew_members")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<crew_membersResponseTemplate> responseType =
	                new ParameterizedTypeReference<crew_membersResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (crew_membersResponseTemplate) response2;
		}
			public flight_crewResponseTemplate  findflight_crewByQuery(String query, String start,  String rows, String filterField,  String filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance) {	
				
			HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity <String> entity = new HttpEntity<String>(headers);
		    
			String url="http://rest-service-c46e27ea-e228-41c8-a1e2-f51e957ae3e8:80/"+toPascalCase("flight_crew")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<flight_crewResponseTemplate> responseType =
	                new ParameterizedTypeReference<flight_crewResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (flight_crewResponseTemplate) response2;
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
