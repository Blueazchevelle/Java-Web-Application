package org.kekelidos.weather.application.WeatherApplication;

import java.io.IOException;
import org.apache.http.client.ClientProtocolException;




public class WeatherApplication {

	public static void main(String[] args) {
		
		WeatherClass myWeather = new WeatherClass();
		myWeather.setAccessToken("src/resources/java/token.txt");
		myWeather.setHostName("www.ncdc.noaa.gov", 443, "https");
		
		String[] endpoints = {"datasets","datacategories","datatypes","locationcategories","locations","stations","data"};

		try {
			for(int i = 0; i < endpoints.length; i++) {
				if(endpoints[i].equals("data")) {
					String data = myWeather.makeRequest(endpoints[i]+"?datasetid=GHCND&location=ZIP:21244&startdate=2010-05-01&enddate=2010-05-01&limit=10&includemetadata=false");
					System.out.println(endpoints[i]);
					System.out.println(data);
				}else {
					String data = myWeather.makeRequest(endpoints[i]+"?datasetid=GHCND&limit=5");
					System.out.println(endpoints[i]);
					System.out.println(data);
				}
			}
		}catch(ClientProtocolException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
