package org.kekelidos.weather.application.WeatherApplication.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author kekeli D Akouete
 *
 * The response in Json as a single item 
 */

public class SingleItemObject {
	// class attributes
	private String id;
	private String name;
	private String datacoverage;
	private String mindate;
	private String maxdate;
	
	// member methods
	@JsonProperty("id")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@JsonProperty("name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@JsonProperty("datacoverage")
	public String getDatacoverage() {
		return datacoverage;
	}
	public void setDatacoverage(String datacoverage) {
		this.datacoverage = datacoverage;
	}
	@JsonProperty("mindate")
	public String getMindate() {
		return mindate;
	}
	public void setMindate(String mindate) {
		this.mindate = mindate;
	}
	@JsonProperty("maxdate")
	public String getMaxdate() {
		return maxdate;
	}
	public void setMaxdate(String maxdate) {
		this.maxdate = maxdate;
	}
	
	@Override
	public String toString() {
		return "SingleItemObject =["+"id: "+id+" name: "+name+ " datacoverage: "+datacoverage+" mindate: "+ mindate+" maxdate: "+maxdate+"]";
	}
}
