package org.kekelidos.weather.application.WeatherApplication.model;

/**
 * 
 * @author kekeli D Akouete
 * 
 * Description:
 * A station is a any weather observing platform where data is recorded.
 */

public class StationPath extends PathModel{
	protected String datacategoryid;
	protected String datatypeid;
	protected String locationid;
	protected String extent;
	
	public StationPath() {
		super();
	}

	public String getDatacategoryid() {
		return datacategoryid;
	}

	public void setDatacategoryid(String datacategoryid) {
		this.datacategoryid = datacategoryid.toUpperCase();
	}

	public String getDatatypeid() {
		return datatypeid;
	}

	public void setDatatypeid(String datatypeid) {
		this.datatypeid = datatypeid.toUpperCase();
	}

	public String getLocationid() {
		return locationid;
	}

	public void setLocationid(String locationid) {
		this.locationid = locationid.toUpperCase();
	}

	public String getExtent() {
		return extent;
	}

	public void setExtent(String extent) {
		this.extent = extent;
	}
	
	@Override
	public String toString() {
		return "Stations = {datasetid: " + datasetid + ", " + "locationid: " + locationid + ", " + "datacategoryid: " + datacategoryid 
				+ ", " + "datatypeid: " + datatypeid + ", " + "extent: " + extent + ", " + "startdate: " + startdate + ", " + "enddate: "
				+ enddate + ", " + "sortfield: " + sortfield + ", " + "sortorder: " + sortorder + ", " + "limit: " + limit 
				+ ", " + "offset: " + offset +"}";
	}
	@Override
	public String toQueryString() {
		return "?datasetid=" + datasetid + "&locationid=" + locationid + "&datacategoryid=" + datacategoryid 
				+ "&datatypeid=" + datatypeid + "&extent=" + extent + "&startdate=" + startdate + "&enddate="
				+ enddate + "&sortfield=" + sortfield + "&sortorder=" + sortorder + "&limit=" + limit 
				+ "&offset=" + offset;
	}
		
}
