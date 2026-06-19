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
		
			public contentResponseTemplate  findcontentByQuery(String query, String start,  String rows, String filterField,  List<String>	 filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance, String token) {	
				
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

			String url = "http://localhost:8080/api/content?"
		            + "query=" + query
		            + "&start=" + start
		            + "&rows=" + rows
		            + "&filterField=" + filterField
		            + (fqParams.isEmpty() ? "" : "&" + fqParams)   // ✅ only append fqParams
		            + "&sort=" + sort
		            + "&advanceField=" + advanceField
		            + "&advanceQuery=" + advanceQuery
		            + "&advance=" + advance;				
  
		//	String url="http://rest-service-306bbf55-4579-44a3-8c31-d7b296a25bc9:80/"+toPascalCase("content")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<contentResponseTemplate> responseType =
	                new ParameterizedTypeReference<contentResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (contentResponseTemplate) response2;
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
  
		//	String url="http://rest-service-306bbf55-4579-44a3-8c31-d7b296a25bc9:80/"+toPascalCase("user")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<userResponseTemplate> responseType =
	                new ParameterizedTypeReference<userResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (userResponseTemplate) response2;
		}
			public reviewResponseTemplate  findreviewByQuery(String query, String start,  String rows, String filterField,  List<String>	 filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance, String token) {	
				
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

			String url = "http://localhost:8080/api/review?"
		            + "query=" + query
		            + "&start=" + start
		            + "&rows=" + rows
		            + "&filterField=" + filterField
		            + (fqParams.isEmpty() ? "" : "&" + fqParams)   // ✅ only append fqParams
		            + "&sort=" + sort
		            + "&advanceField=" + advanceField
		            + "&advanceQuery=" + advanceQuery
		            + "&advance=" + advance;				
  
		//	String url="http://rest-service-306bbf55-4579-44a3-8c31-d7b296a25bc9:80/"+toPascalCase("review")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<reviewResponseTemplate> responseType =
	                new ParameterizedTypeReference<reviewResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (reviewResponseTemplate) response2;
		}
			public likeResponseTemplate  findlikeByQuery(String query, String start,  String rows, String filterField,  List<String>	 filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance, String token) {	
				
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

			String url = "http://localhost:8080/api/like?"
		            + "query=" + query
		            + "&start=" + start
		            + "&rows=" + rows
		            + "&filterField=" + filterField
		            + (fqParams.isEmpty() ? "" : "&" + fqParams)   // ✅ only append fqParams
		            + "&sort=" + sort
		            + "&advanceField=" + advanceField
		            + "&advanceQuery=" + advanceQuery
		            + "&advance=" + advance;				
  
		//	String url="http://rest-service-306bbf55-4579-44a3-8c31-d7b296a25bc9:80/"+toPascalCase("like")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<likeResponseTemplate> responseType =
	                new ParameterizedTypeReference<likeResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (likeResponseTemplate) response2;
		}
			public helpfullResponseTemplate  findhelpfullByQuery(String query, String start,  String rows, String filterField,  List<String>	 filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance, String token) {	
				
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

			String url = "http://localhost:8080/api/helpfull?"
		            + "query=" + query
		            + "&start=" + start
		            + "&rows=" + rows
		            + "&filterField=" + filterField
		            + (fqParams.isEmpty() ? "" : "&" + fqParams)   // ✅ only append fqParams
		            + "&sort=" + sort
		            + "&advanceField=" + advanceField
		            + "&advanceQuery=" + advanceQuery
		            + "&advance=" + advance;				
  
		//	String url="http://rest-service-306bbf55-4579-44a3-8c31-d7b296a25bc9:80/"+toPascalCase("helpfull")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<helpfullResponseTemplate> responseType =
	                new ParameterizedTypeReference<helpfullResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (helpfullResponseTemplate) response2;
		}
			public dislikeResponseTemplate  finddislikeByQuery(String query, String start,  String rows, String filterField,  List<String>	 filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance, String token) {	
				
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

			String url = "http://localhost:8080/api/dislike?"
		            + "query=" + query
		            + "&start=" + start
		            + "&rows=" + rows
		            + "&filterField=" + filterField
		            + (fqParams.isEmpty() ? "" : "&" + fqParams)   // ✅ only append fqParams
		            + "&sort=" + sort
		            + "&advanceField=" + advanceField
		            + "&advanceQuery=" + advanceQuery
		            + "&advance=" + advance;				
  
		//	String url="http://rest-service-306bbf55-4579-44a3-8c31-d7b296a25bc9:80/"+toPascalCase("dislike")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<dislikeResponseTemplate> responseType =
	                new ParameterizedTypeReference<dislikeResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (dislikeResponseTemplate) response2;
		}
			public replyResponseTemplate  findreplyByQuery(String query, String start,  String rows, String filterField,  List<String>	 filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance, String token) {	
				
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

			String url = "http://localhost:8080/api/reply?"
		            + "query=" + query
		            + "&start=" + start
		            + "&rows=" + rows
		            + "&filterField=" + filterField
		            + (fqParams.isEmpty() ? "" : "&" + fqParams)   // ✅ only append fqParams
		            + "&sort=" + sort
		            + "&advanceField=" + advanceField
		            + "&advanceQuery=" + advanceQuery
		            + "&advance=" + advance;				
  
		//	String url="http://rest-service-306bbf55-4579-44a3-8c31-d7b296a25bc9:80/"+toPascalCase("reply")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<replyResponseTemplate> responseType =
	                new ParameterizedTypeReference<replyResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (replyResponseTemplate) response2;
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
