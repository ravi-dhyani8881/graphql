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
  
		//	String url="http://rest-service-a53fa300-7190-4851-8bc1-e156470b59db:80/"+toPascalCase("user")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<userResponseTemplate> responseType =
	                new ParameterizedTypeReference<userResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (userResponseTemplate) response2;
		}
			public organizationResponseTemplate  findorganizationByQuery(String query, String start,  String rows, String filterField,  List<String>	 filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance, String token) {	
				
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

			String url = "http://localhost:8080/api/organization?"
		            + "query=" + query
		            + "&start=" + start
		            + "&rows=" + rows
		            + "&filterField=" + filterField
		            + (fqParams.isEmpty() ? "" : "&" + fqParams)   // ✅ only append fqParams
		            + "&sort=" + sort
		            + "&advanceField=" + advanceField
		            + "&advanceQuery=" + advanceQuery
		            + "&advance=" + advance;				
  
		//	String url="http://rest-service-a53fa300-7190-4851-8bc1-e156470b59db:80/"+toPascalCase("organization")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<organizationResponseTemplate> responseType =
	                new ParameterizedTypeReference<organizationResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (organizationResponseTemplate) response2;
		}
			public subOrganizationResponseTemplate  findsubOrganizationByQuery(String query, String start,  String rows, String filterField,  List<String>	 filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance, String token) {	
				
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

			String url = "http://localhost:8080/api/subOrganization?"
		            + "query=" + query
		            + "&start=" + start
		            + "&rows=" + rows
		            + "&filterField=" + filterField
		            + (fqParams.isEmpty() ? "" : "&" + fqParams)   // ✅ only append fqParams
		            + "&sort=" + sort
		            + "&advanceField=" + advanceField
		            + "&advanceQuery=" + advanceQuery
		            + "&advance=" + advance;				
  
		//	String url="http://rest-service-a53fa300-7190-4851-8bc1-e156470b59db:80/"+toPascalCase("subOrganization")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<subOrganizationResponseTemplate> responseType =
	                new ParameterizedTypeReference<subOrganizationResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (subOrganizationResponseTemplate) response2;
		}
			public userOrgResponseTemplate  finduserOrgByQuery(String query, String start,  String rows, String filterField,  List<String>	 filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance, String token) {	
				
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

			String url = "http://localhost:8080/api/userOrg?"
		            + "query=" + query
		            + "&start=" + start
		            + "&rows=" + rows
		            + "&filterField=" + filterField
		            + (fqParams.isEmpty() ? "" : "&" + fqParams)   // ✅ only append fqParams
		            + "&sort=" + sort
		            + "&advanceField=" + advanceField
		            + "&advanceQuery=" + advanceQuery
		            + "&advance=" + advance;				
  
		//	String url="http://rest-service-a53fa300-7190-4851-8bc1-e156470b59db:80/"+toPascalCase("userOrg")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<userOrgResponseTemplate> responseType =
	                new ParameterizedTypeReference<userOrgResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (userOrgResponseTemplate) response2;
		}
			public invitationResponseTemplate  findinvitationByQuery(String query, String start,  String rows, String filterField,  List<String>	 filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance, String token) {	
				
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

			String url = "http://localhost:8080/api/invitation?"
		            + "query=" + query
		            + "&start=" + start
		            + "&rows=" + rows
		            + "&filterField=" + filterField
		            + (fqParams.isEmpty() ? "" : "&" + fqParams)   // ✅ only append fqParams
		            + "&sort=" + sort
		            + "&advanceField=" + advanceField
		            + "&advanceQuery=" + advanceQuery
		            + "&advance=" + advance;				
  
		//	String url="http://rest-service-a53fa300-7190-4851-8bc1-e156470b59db:80/"+toPascalCase("invitation")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<invitationResponseTemplate> responseType =
	                new ParameterizedTypeReference<invitationResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (invitationResponseTemplate) response2;
		}
			public environmentResponseTemplate  findenvironmentByQuery(String query, String start,  String rows, String filterField,  List<String>	 filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance, String token) {	
				
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

			String url = "http://localhost:8080/api/environment?"
		            + "query=" + query
		            + "&start=" + start
		            + "&rows=" + rows
		            + "&filterField=" + filterField
		            + (fqParams.isEmpty() ? "" : "&" + fqParams)   // ✅ only append fqParams
		            + "&sort=" + sort
		            + "&advanceField=" + advanceField
		            + "&advanceQuery=" + advanceQuery
		            + "&advance=" + advance;				
  
		//	String url="http://rest-service-a53fa300-7190-4851-8bc1-e156470b59db:80/"+toPascalCase("environment")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<environmentResponseTemplate> responseType =
	                new ParameterizedTypeReference<environmentResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (environmentResponseTemplate) response2;
		}
			public projectResponseTemplate  findprojectByQuery(String query, String start,  String rows, String filterField,  List<String>	 filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance, String token) {	
				
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

			String url = "http://localhost:8080/api/project?"
		            + "query=" + query
		            + "&start=" + start
		            + "&rows=" + rows
		            + "&filterField=" + filterField
		            + (fqParams.isEmpty() ? "" : "&" + fqParams)   // ✅ only append fqParams
		            + "&sort=" + sort
		            + "&advanceField=" + advanceField
		            + "&advanceQuery=" + advanceQuery
		            + "&advance=" + advance;				
  
		//	String url="http://rest-service-a53fa300-7190-4851-8bc1-e156470b59db:80/"+toPascalCase("project")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<projectResponseTemplate> responseType =
	                new ParameterizedTypeReference<projectResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (projectResponseTemplate) response2;
		}
			public versionResponseTemplate  findversionByQuery(String query, String start,  String rows, String filterField,  List<String>	 filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance, String token) {	
				
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

			String url = "http://localhost:8080/api/version?"
		            + "query=" + query
		            + "&start=" + start
		            + "&rows=" + rows
		            + "&filterField=" + filterField
		            + (fqParams.isEmpty() ? "" : "&" + fqParams)   // ✅ only append fqParams
		            + "&sort=" + sort
		            + "&advanceField=" + advanceField
		            + "&advanceQuery=" + advanceQuery
		            + "&advance=" + advance;				
  
		//	String url="http://rest-service-a53fa300-7190-4851-8bc1-e156470b59db:80/"+toPascalCase("version")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<versionResponseTemplate> responseType =
	                new ParameterizedTypeReference<versionResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (versionResponseTemplate) response2;
		}
			public configurationResponseTemplate  findconfigurationByQuery(String query, String start,  String rows, String filterField,  List<String>	 filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance, String token) {	
				
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

			String url = "http://localhost:8080/api/configuration?"
		            + "query=" + query
		            + "&start=" + start
		            + "&rows=" + rows
		            + "&filterField=" + filterField
		            + (fqParams.isEmpty() ? "" : "&" + fqParams)   // ✅ only append fqParams
		            + "&sort=" + sort
		            + "&advanceField=" + advanceField
		            + "&advanceQuery=" + advanceQuery
		            + "&advance=" + advance;				
  
		//	String url="http://rest-service-a53fa300-7190-4851-8bc1-e156470b59db:80/"+toPascalCase("configuration")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<configurationResponseTemplate> responseType =
	                new ParameterizedTypeReference<configurationResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (configurationResponseTemplate) response2;
		}
			public deploymentConfigurationResponseTemplate  finddeploymentConfigurationByQuery(String query, String start,  String rows, String filterField,  List<String>	 filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance, String token) {	
				
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

			String url = "http://localhost:8080/api/deploymentConfiguration?"
		            + "query=" + query
		            + "&start=" + start
		            + "&rows=" + rows
		            + "&filterField=" + filterField
		            + (fqParams.isEmpty() ? "" : "&" + fqParams)   // ✅ only append fqParams
		            + "&sort=" + sort
		            + "&advanceField=" + advanceField
		            + "&advanceQuery=" + advanceQuery
		            + "&advance=" + advance;				
  
		//	String url="http://rest-service-a53fa300-7190-4851-8bc1-e156470b59db:80/"+toPascalCase("deploymentConfiguration")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<deploymentConfigurationResponseTemplate> responseType =
	                new ParameterizedTypeReference<deploymentConfigurationResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (deploymentConfigurationResponseTemplate) response2;
		}
			public deploymentResponseTemplate  finddeploymentByQuery(String query, String start,  String rows, String filterField,  List<String>	 filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance, String token) {	
				
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

			String url = "http://localhost:8080/api/deployment?"
		            + "query=" + query
		            + "&start=" + start
		            + "&rows=" + rows
		            + "&filterField=" + filterField
		            + (fqParams.isEmpty() ? "" : "&" + fqParams)   // ✅ only append fqParams
		            + "&sort=" + sort
		            + "&advanceField=" + advanceField
		            + "&advanceQuery=" + advanceQuery
		            + "&advance=" + advance;				
  
		//	String url="http://rest-service-a53fa300-7190-4851-8bc1-e156470b59db:80/"+toPascalCase("deployment")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<deploymentResponseTemplate> responseType =
	                new ParameterizedTypeReference<deploymentResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (deploymentResponseTemplate) response2;
		}
			public publishLogResponseTemplate  findpublishLogByQuery(String query, String start,  String rows, String filterField,  List<String>	 filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance, String token) {	
				
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

			String url = "http://localhost:8080/api/publishLog?"
		            + "query=" + query
		            + "&start=" + start
		            + "&rows=" + rows
		            + "&filterField=" + filterField
		            + (fqParams.isEmpty() ? "" : "&" + fqParams)   // ✅ only append fqParams
		            + "&sort=" + sort
		            + "&advanceField=" + advanceField
		            + "&advanceQuery=" + advanceQuery
		            + "&advance=" + advance;				
  
		//	String url="http://rest-service-a53fa300-7190-4851-8bc1-e156470b59db:80/"+toPascalCase("publishLog")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<publishLogResponseTemplate> responseType =
	                new ParameterizedTypeReference<publishLogResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (publishLogResponseTemplate) response2;
		}
			public apiKeyResponseTemplate  findapiKeyByQuery(String query, String start,  String rows, String filterField,  List<String>	 filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance, String token) {	
				
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

			String url = "http://localhost:8080/api/apiKey?"
		            + "query=" + query
		            + "&start=" + start
		            + "&rows=" + rows
		            + "&filterField=" + filterField
		            + (fqParams.isEmpty() ? "" : "&" + fqParams)   // ✅ only append fqParams
		            + "&sort=" + sort
		            + "&advanceField=" + advanceField
		            + "&advanceQuery=" + advanceQuery
		            + "&advance=" + advance;				
  
		//	String url="http://rest-service-a53fa300-7190-4851-8bc1-e156470b59db:80/"+toPascalCase("apiKey")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<apiKeyResponseTemplate> responseType =
	                new ParameterizedTypeReference<apiKeyResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (apiKeyResponseTemplate) response2;
		}
			public userSettingResponseTemplate  finduserSettingByQuery(String query, String start,  String rows, String filterField,  List<String>	 filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance, String token) {	
				
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

			String url = "http://localhost:8080/api/userSetting?"
		            + "query=" + query
		            + "&start=" + start
		            + "&rows=" + rows
		            + "&filterField=" + filterField
		            + (fqParams.isEmpty() ? "" : "&" + fqParams)   // ✅ only append fqParams
		            + "&sort=" + sort
		            + "&advanceField=" + advanceField
		            + "&advanceQuery=" + advanceQuery
		            + "&advance=" + advance;				
  
		//	String url="http://rest-service-a53fa300-7190-4851-8bc1-e156470b59db:80/"+toPascalCase("userSetting")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<userSettingResponseTemplate> responseType =
	                new ParameterizedTypeReference<userSettingResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (userSettingResponseTemplate) response2;
		}
			public chatHistoryResponseTemplate  findchatHistoryByQuery(String query, String start,  String rows, String filterField,  List<String>	 filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance, String token) {	
				
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

			String url = "http://localhost:8080/api/chatHistory?"
		            + "query=" + query
		            + "&start=" + start
		            + "&rows=" + rows
		            + "&filterField=" + filterField
		            + (fqParams.isEmpty() ? "" : "&" + fqParams)   // ✅ only append fqParams
		            + "&sort=" + sort
		            + "&advanceField=" + advanceField
		            + "&advanceQuery=" + advanceQuery
		            + "&advance=" + advance;				
  
		//	String url="http://rest-service-a53fa300-7190-4851-8bc1-e156470b59db:80/"+toPascalCase("chatHistory")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<chatHistoryResponseTemplate> responseType =
	                new ParameterizedTypeReference<chatHistoryResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (chatHistoryResponseTemplate) response2;
		}
			public earlyAccessResponseTemplate  findearlyAccessByQuery(String query, String start,  String rows, String filterField,  List<String>	 filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance, String token) {	
				
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

			String url = "http://localhost:8080/api/earlyAccess?"
		            + "query=" + query
		            + "&start=" + start
		            + "&rows=" + rows
		            + "&filterField=" + filterField
		            + (fqParams.isEmpty() ? "" : "&" + fqParams)   // ✅ only append fqParams
		            + "&sort=" + sort
		            + "&advanceField=" + advanceField
		            + "&advanceQuery=" + advanceQuery
		            + "&advance=" + advance;				
  
		//	String url="http://rest-service-a53fa300-7190-4851-8bc1-e156470b59db:80/"+toPascalCase("earlyAccess")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<earlyAccessResponseTemplate> responseType =
	                new ParameterizedTypeReference<earlyAccessResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (earlyAccessResponseTemplate) response2;
		}
			public campaign_submissionsResponseTemplate  findcampaign_submissionsByQuery(String query, String start,  String rows, String filterField,  List<String>	 filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance, String token) {	
				
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

			String url = "http://localhost:8080/api/campaign_submissions?"
		            + "query=" + query
		            + "&start=" + start
		            + "&rows=" + rows
		            + "&filterField=" + filterField
		            + (fqParams.isEmpty() ? "" : "&" + fqParams)   // ✅ only append fqParams
		            + "&sort=" + sort
		            + "&advanceField=" + advanceField
		            + "&advanceQuery=" + advanceQuery
		            + "&advance=" + advance;				
  
		//	String url="http://rest-service-a53fa300-7190-4851-8bc1-e156470b59db:80/"+toPascalCase("campaign_submissions")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<campaign_submissionsResponseTemplate> responseType =
	                new ParameterizedTypeReference<campaign_submissionsResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (campaign_submissionsResponseTemplate) response2;
		}
			public campaignsResponseTemplate  findcampaignsByQuery(String query, String start,  String rows, String filterField,  List<String>	 filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance, String token) {	
				
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

			String url = "http://localhost:8080/api/campaigns?"
		            + "query=" + query
		            + "&start=" + start
		            + "&rows=" + rows
		            + "&filterField=" + filterField
		            + (fqParams.isEmpty() ? "" : "&" + fqParams)   // ✅ only append fqParams
		            + "&sort=" + sort
		            + "&advanceField=" + advanceField
		            + "&advanceQuery=" + advanceQuery
		            + "&advance=" + advance;				
  
		//	String url="http://rest-service-a53fa300-7190-4851-8bc1-e156470b59db:80/"+toPascalCase("campaigns")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<campaignsResponseTemplate> responseType =
	                new ParameterizedTypeReference<campaignsResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (campaignsResponseTemplate) response2;
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
