package org.kekelidos.weather.application.WeatherApplication.model;
/**
 * 
 * @author kekeli D Akouete
 * 
 * Description:
 * A data type is a specific type of data that is often unique to a dataset.
 */

public class DataTypesPath extends PathModel {
	protected String datacategoryid;
	protected String locationid;
	protected String stationid;
	
	public DataTypesPath() {
		super();
	}

	public String getDatacategoryid() {
		return datacategoryid;
	}

	public void setDatacategoryid(String datacategoryid) {
		this.datacategoryid = datacategoryid.toUpperCase();
	}

	public String getLocationid() {
		return locationid;
	}

	public void setLocationid(String locationid) {
		this.locationid = locationid.toUpperCase();
	}

	public String getStationid() {
		return stationid;
	}

	public void setStationid(String stationid) {
		this.stationid = stationid.toUpperCase();
	}
	
	@Override
	public String toString() {
		return "DataTypes = {datasetid: " + datasetid +", "+ "locationid: " + locationid +", "+ "stationid: " + stationid 
				+", "+ "datacategoryid: " + datacategoryid +", "+ "startdate: " + startdate +", "+ "enddate: " + enddate 
				+", "+ "sortfield: " + sortfield +", "+ "sortorder: " + sortorder +", "+ "limit: " + limit +", "+ "offset: " + offset+ "}";
	}
	@Override
	public String toQueryString() {
		return "?datasetid=" + datasetid + "&locationid=" + locationid + "&stationid=" + stationid 
				+ "&datacategoryid=" + datacategoryid + "&startdate=" + startdate + "&enddate=" + enddate 
				+ "&sortfield=" + sortfield + "&sortorder=" + sortorder + "&limit=" + limit + "&offset=" + offset;
	}
	
}
