package org.kekelidos.weather.application.WeatherApplication;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.kekelidos.weather.application.WeatherApplication.model.DataObject;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestJsonPojos {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		
		ObjectMapper mapper = new ObjectMapper();
		//mapper.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		
		WeatherClass myWeather = new WeatherClass();
		myWeather.setAccessToken("src/resources/java/token.txt");
		myWeather.setHostName("www.ncdc.noaa.gov", 443, "https");
		String data = " ";
		
		try {
			data = myWeather.makeRequest("data?datasetid=GHCND&location=ZIP:21244&startdate=2010-05-01&enddate=2010-05-01&limit=10&includemetadata=false");
//			System.out.println(data);
				
		}catch(ClientProtocolException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		DataObject myObject = mapper.readValue(data, DataObject.class);
		System.out.println(myObject.toString());
		myObject.SearchResults("tavg");
//		System.out.println("first single data = "+ myObject.SearchResults("prcp"));
		

	}

}
