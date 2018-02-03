package org.kekelidos.weather.application.WeatherApplication.model;

/**
 * 
 * @author kekeli D Akouete
 * 
 * Description:
 * A location is a geo-political entity.
 */

public class LocationPath extends PathModel{
	protected String datacategoryid;
	protected String locationcategoryid;
	
	public LocationPath() {
		super();
	}

	public String getDatacategoryid() {
		return datacategoryid;
	}

	public void setDatacategoryid(String datacategoryid) {
		this.datacategoryid = datacategoryid.toUpperCase();
	}

	public String getLocationcategoryid() {
		return locationcategoryid;
	}

	public void setLocationcategoryid(String locationcategoryid) {
		this.locationcategoryid = locationcategoryid.toUpperCase();
	}
	
	@Override
	public String toString() {
		return "Locations = {datasetid: " + datasetid + ", " + "locationcategoryid: " + locationcategoryid + ", " + "datacategoryid: " + datacategoryid
				+ ", " + "startdate: " + startdate + ", " + "enddate: " + enddate + ", " + "sortfield: " + sortfield + ", " + "sortorder: " + sortorder + "limit: " + limit 
				+ ", " + "offset: " + offset +"}";
	}
	@Override
	public String toQueryString() {
		return "?datasetid=" + datasetid + "&locationcategoryid=" + locationcategoryid + "&datacategoryid=" + datacategoryid
				+ "&startdate=" + startdate + "&enddate=" + enddate + "&sortfield=" + sortfield + "&sortorder=" + sortorder + "&limit=" + limit 
				+ "&offset=" + offset;
	}
}
