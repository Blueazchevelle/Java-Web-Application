package org.kekelidos.weather.application.WeatherApplication.model;

/**
 * 
 * @author kekeli D Akouete
 * 
 * Description:
 * A dataset is the primary grouping for data at NCDC.
 */

public class DatasetsPath extends PathModel {
	protected String datatypeid;
	protected String locationid;
	protected String stationid;
	
	public DatasetsPath() {
		super();
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
	
	public String getDatatypeid() {
		return datatypeid;
	}

	public void setDatatypeid(String datatypeid) {
		this.datatypeid = datatypeid.toUpperCase();
	}

	@Override
	public String toQueryString() {
		return "?datatypeid=" + datatypeid + "&locationid=" + locationid + "&stationid=" + stationid 
				+ "&startdate=" + startdate + "&enddate=" + enddate + "&sortfield=" + sortfield + 
				"&sortorder=" + sortorder + "&limit=" + limit + "&offset=" + offset ;
	}
	@Override
	public String toString() {
		return "Datasets = {datatypeid: " + datatypeid +", "+ "locationid: " + locationid +", "+ "stationid: " + stationid 
		    +", "+ "startdate: " + startdate +", "+ "enddate: " + enddate +", "+ "sortfield: " + sortfield +", "+ 
			"sortorder: " + sortorder +", "+ "limit:" + limit +", "+ "offset: " + offset +"}";
	}
}
