package org.kekelidos.weather.application.WeatherApplication;

public class WeatherObject {
	private String id;
	private String name;
	private int datacoverage;
	private String mindate;
	private String maxdate;
	
	@Override
	public String toString() {
		return "WeatherObject {id="+ id +",name="+name+ ",datacoverage=" + datacoverage + ",mindate="+ mindate +",maxdate=" + maxdate+"}";
	}
	

}
