package org.kekelidos.weather.application.WeatherApplication.model;
/**
 * 
 * @author kekeli D Akouete
 * 
 * Description:
 * A location category is a grouping of similar locations.
 */

public class LocationCategoriesPath extends PathModel{
	public LocationCategoriesPath() {
		super();
	}
	
	@Override
	public String toString() {
		return "LocationCategories = {datasetid: " + datasetid + ", " + "startdate: " + startdate + ", " + "enddate: " + enddate + ", " + "sortfield: "
				+ sortfield + ", " + "sortorder: " + sortorder + ", " + "limit: " + limit + ", " + "offset: " + offset +"}";
	}
	@Override
	public String toQueryString() {
		return "?datasetid=" + datasetid + "&startdate=" + startdate + "&enddate=" + enddate + "&sortfield="
				+ sortfield + "&sortorder=" + sortorder + "&limit=" + limit + "&offset=" + offset;
	}

}
