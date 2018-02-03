package org.kekelidos.weather.application.WeatherApplication.model;


import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * @author kekeli D Akouete
 * 
 * Definition:
 * The results from data resource have these attributes
 * 
 */


public class Results {
	private String date;
	private String datatype;
	private String station;
	private String attributes;
	private int value;
	
	
	//Property accessor methods
	
	@JsonProperty("date")
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	@JsonProperty("datatype")
	public String getDatatype() {
		return datatype;
	}
	public void setDatatype(String datatype) {
		this.datatype = datatype;
	}
	
	@JsonProperty("station")
	public String getStation() {
		return station;
	}
	public void setStation(String station) {
		this.station = station;
	}
	
	@JsonProperty("attributes")
	public String getAttributes() {
		return attributes;
	}
	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}
	
	@JsonProperty("value")
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "Results [date = "+date+", datatype = "+datatype+", station = "+station+"; attributes = "+attributes+", value = "+value+"]";
	}

}
