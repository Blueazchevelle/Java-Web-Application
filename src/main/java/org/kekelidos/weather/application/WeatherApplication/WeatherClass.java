package org.kekelidos.weather.application.WeatherApplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHttpRequest;
import org.apache.http.util.EntityUtils;

public class WeatherClass {

	//class properties
		private String accessToken;
		private HttpHost host;
		private String resources;
		
		//Constructor
		public WeatherClass() {
			accessToken = null;
			host = null;
			resources = null;
		}
		
		//instance method to access the token string
		public void setAccessToken(String filePath) { 
			Scanner sc = null;
			try {
			File token = new File(filePath);
	    	sc =  new Scanner(token);
	    	//Open and read the token file.
			while(sc.hasNext()) {
				accessToken = sc.nextLine();
			}
			}catch(FileNotFoundException e) {
				System.out.println("The specified file path could not be found!");
				
			}catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
			finally {
				sc.close();
			}
		}
		public String getAccessToken() {
			return accessToken;
		}
		public String getResources() {
			return resources;
		}
		public void setHostName(String address, int port, String protocol) {
			host = new HttpHost(address, port, protocol);
		}
		public HttpHost getHost() {
			return host;
		}
		
		//Class methods, REST call to the NOAA server
		public String makeRequest(String resourcePath) throws ClientProtocolException, IOException {
			String httpMethod = "GET";
			String Path = "/cdo-web/api/v2/";
			HttpEntity entity1;
			
			BasicHttpRequest httpRequest = new BasicHttpRequest(httpMethod, Path + resourcePath);
		    httpRequest.addHeader("token", accessToken);
		    
		    CloseableHttpClient httpclient = HttpClients.createDefault();
		    CloseableHttpResponse response = httpclient.execute(host, httpRequest);
		    if(response.getStatusLine().getStatusCode() == 200) {
		    	 entity1 = response.getEntity();
		 	    resources = getWeatherData(entity1);
		    }else {
		    	resources = response.getStatusLine().toString();
		    	System.out.println("StatusCode: "+ response.getStatusLine().getStatusCode());
		    }
		    httpclient.close();
		    
		    return resources;
		    
		}
		private String getWeatherData(HttpEntity entity1) throws UnsupportedOperationException, IOException {
			    String result = null;
			    // do something useful with the response body
			    InputStream obj  = entity1.getContent();
			    byte[] buffer = new byte[4096];
			    StringBuilder data = new StringBuilder();
			    	while(obj.read(buffer) != -1) {
			    		data.append(new String(buffer));
			    	}
			    result = data.toString();
			    EntityUtils.consume(entity1);
	        return result;
		}
}
