package com.mkyong.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class JerseyClientGet {

	public static void main(String[] args) {
		
//		String uri="http://localhost:8080/RESTfulExample/rest/json/metallica/get";
		String uri="http://localhost:8080/RESTfulExample/rest/user";
//		String type="application/json";
		
		String type="application/+xml";
		
		invoke(uri,type);

	}
	
	
	public static void invoke(String uri,String type){
		
		try {

			Client client = Client.create();

			WebResource webResource = client.resource(uri);

			ClientResponse response = webResource.accept(type).get(ClientResponse.class);

			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}

			String output = response.getEntity(String.class);

			System.out.println("调用服务端返回值： .... \n");
			System.out.println(output);
			
		} catch (Exception e) {

			e.printStackTrace();

		}
		
	}

}