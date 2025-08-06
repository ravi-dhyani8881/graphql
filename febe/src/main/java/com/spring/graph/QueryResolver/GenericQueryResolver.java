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
		
			public userResponseTemplate  finduserByQuery(String query, String start,  String rows, String filterField,  String filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance) {	
				
			HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity <String> entity = new HttpEntity<String>(headers);
		    
			String url="http://rest-service-0456e7b5-eb4e-4970-a00d-6d85aecf55be:80/"+toPascalCase("user")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<userResponseTemplate> responseType =
	                new ParameterizedTypeReference<userResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (userResponseTemplate) response2;
		}
			public organizationResponseTemplate  findorganizationByQuery(String query, String start,  String rows, String filterField,  String filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance) {	
				
			HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity <String> entity = new HttpEntity<String>(headers);
		    
			String url="http://rest-service-0456e7b5-eb4e-4970-a00d-6d85aecf55be:80/"+toPascalCase("organization")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<organizationResponseTemplate> responseType =
	                new ParameterizedTypeReference<organizationResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (organizationResponseTemplate) response2;
		}
			public subOrganizationResponseTemplate  findsubOrganizationByQuery(String query, String start,  String rows, String filterField,  String filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance) {	
				
			HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity <String> entity = new HttpEntity<String>(headers);
		    
			String url="http://rest-service-0456e7b5-eb4e-4970-a00d-6d85aecf55be:80/"+toPascalCase("subOrganization")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<subOrganizationResponseTemplate> responseType =
	                new ParameterizedTypeReference<subOrganizationResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (subOrganizationResponseTemplate) response2;
		}
			public environmentResponseTemplate  findenvironmentByQuery(String query, String start,  String rows, String filterField,  String filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance) {	
				
			HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity <String> entity = new HttpEntity<String>(headers);
		    
			String url="http://rest-service-0456e7b5-eb4e-4970-a00d-6d85aecf55be:80/"+toPascalCase("environment")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<environmentResponseTemplate> responseType =
	                new ParameterizedTypeReference<environmentResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (environmentResponseTemplate) response2;
		}
			public graphResponseTemplate  findgraphByQuery(String query, String start,  String rows, String filterField,  String filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance) {	
				
			HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity <String> entity = new HttpEntity<String>(headers);
		    
			String url="http://rest-service-0456e7b5-eb4e-4970-a00d-6d85aecf55be:80/"+toPascalCase("graph")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<graphResponseTemplate> responseType =
	                new ParameterizedTypeReference<graphResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (graphResponseTemplate) response2;
		}
			public publishGraphResponseTemplate  findpublishGraphByQuery(String query, String start,  String rows, String filterField,  String filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance) {	
				
			HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity <String> entity = new HttpEntity<String>(headers);
		    
			String url="http://rest-service-0456e7b5-eb4e-4970-a00d-6d85aecf55be:80/"+toPascalCase("publishGraph")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<publishGraphResponseTemplate> responseType =
	                new ParameterizedTypeReference<publishGraphResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (publishGraphResponseTemplate) response2;
		}
			public publishRestResponseTemplate  findpublishRestByQuery(String query, String start,  String rows, String filterField,  String filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance) {	
				
			HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity <String> entity = new HttpEntity<String>(headers);
		    
			String url="http://rest-service-0456e7b5-eb4e-4970-a00d-6d85aecf55be:80/"+toPascalCase("publishRest")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<publishRestResponseTemplate> responseType =
	                new ParameterizedTypeReference<publishRestResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (publishRestResponseTemplate) response2;
		}
			public apiKeyResponseTemplate  findapiKeyByQuery(String query, String start,  String rows, String filterField,  String filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance) {	
				
			HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity <String> entity = new HttpEntity<String>(headers);
		    
			String url="http://rest-service-0456e7b5-eb4e-4970-a00d-6d85aecf55be:80/"+toPascalCase("apiKey")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<apiKeyResponseTemplate> responseType =
	                new ParameterizedTypeReference<apiKeyResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (apiKeyResponseTemplate) response2;
		}
			public userSettingResponseTemplate  finduserSettingByQuery(String query, String start,  String rows, String filterField,  String filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance) {	
				
			HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity <String> entity = new HttpEntity<String>(headers);
		    
			String url="http://rest-service-0456e7b5-eb4e-4970-a00d-6d85aecf55be:80/"+toPascalCase("userSetting")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<userSettingResponseTemplate> responseType =
	                new ParameterizedTypeReference<userSettingResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (userSettingResponseTemplate) response2;
		}
			public ConfigurationResponseTemplate  findConfigurationByQuery(String query, String start,  String rows, String filterField,  String filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance) {	
				
			HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity <String> entity = new HttpEntity<String>(headers);
		    
			String url="http://rest-service-0456e7b5-eb4e-4970-a00d-6d85aecf55be:80/"+toPascalCase("Configuration")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<ConfigurationResponseTemplate> responseType =
	                new ParameterizedTypeReference<ConfigurationResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (ConfigurationResponseTemplate) response2;
		}
			public graphVersionsResponseTemplate  findgraphVersionsByQuery(String query, String start,  String rows, String filterField,  String filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance) {	
				
			HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity <String> entity = new HttpEntity<String>(headers);
		    
			String url="http://rest-service-0456e7b5-eb4e-4970-a00d-6d85aecf55be:80/"+toPascalCase("graphVersions")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<graphVersionsResponseTemplate> responseType =
	                new ParameterizedTypeReference<graphVersionsResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (graphVersionsResponseTemplate) response2;
		}
			public graphDeploymentsResponseTemplate  findgraphDeploymentsByQuery(String query, String start,  String rows, String filterField,  String filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance) {	
				
			HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity <String> entity = new HttpEntity<String>(headers);
		    
			String url="http://rest-service-0456e7b5-eb4e-4970-a00d-6d85aecf55be:80/"+toPascalCase("graphDeployments")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<graphDeploymentsResponseTemplate> responseType =
	                new ParameterizedTypeReference<graphDeploymentsResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (graphDeploymentsResponseTemplate) response2;
		}
			public deploymentConfigurationResponseTemplate  finddeploymentConfigurationByQuery(String query, String start,  String rows, String filterField,  String filterQuery,  String sort, String  advanceField,  String advanceQuery,  String advance) {	
				
			HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity <String> entity = new HttpEntity<String>(headers);
		    
			String url="http://rest-service-0456e7b5-eb4e-4970-a00d-6d85aecf55be:80/"+toPascalCase("deploymentConfiguration")+"/findByQuery?query="+query+"&start="+start+"&rows="+rows+"&filterField="+filterField+"&filterQuery="+filterQuery+"&sort="+sort+"&advanceField="+advanceField+"&advanceQuery="+advanceQuery+"&advance="+advance;
		    ParameterizedTypeReference<deploymentConfigurationResponseTemplate> responseType =
	                new ParameterizedTypeReference<deploymentConfigurationResponseTemplate>() {};

			var response2=restTemplate.exchange(url,HttpMethod.GET, entity, responseType).getBody();
			return (deploymentConfigurationResponseTemplate) response2;
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
