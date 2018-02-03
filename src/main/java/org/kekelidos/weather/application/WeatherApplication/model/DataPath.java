package org.kekelidos.weather.application.WeatherApplication.model;
/**
 * 
 * @author kekeli D Akouete
 * 
 * Description:
 * A datum is an observed value along with any ancillary attributes at a specific place and time.
 */

public class DataPath extends PathModel {
	protected String datatypeid;
	protected String locationid;
	protected String stationid;
	protected String units;
	protected boolean includemetadata;
	
	public DataPath(String id) {
		super.datasetid = id.toUpperCase();
		
	}

	public String getDatatypeid() {
		return datatypeid;
	}

	public void setDatatypeid(String datatypeid) {
		this.datatypeid = datatypeid.toUpperCase();
	}

	public String getLicationid() {
		return locationid;
	}

	public void setLicationid(String licationid) {
		this.locationid = licationid.toUpperCase();
	}

	public String getStationid() {
		return stationid;
	}

	public void setStationid(String stationid) {
		this.stationid = stationid.toUpperCase();
	}

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public boolean getIncludemetadata() {
		return includemetadata;
	}

	public void setIncludemetadata(boolean includemetadata) {
		this.includemetadata = includemetadata;
	}
	@Override
	public String toQueryString() {
		
		return "?datasetid=" + datasetid + "&datatypeid=" + datatypeid + "&locationid=" + locationid
				+ "&stationid=" + stationid + "&startdate=" + startdate + "&enddate=" + enddate + "&units=" 
				+ units + "&sortfield=" + sortfield + "&sortorder=" + sortorder + "&limit=" + limit
				+ "&offset=" + offset + "&includemetadata=" + includemetadata;
	}
	
	@Override
	public String toString() {
		return "Data = {datasetid: " + datasetid +", " + "datatypeid: " + datatypeid +", " + "locationid: " + locationid
				+", " + "stationid: " + stationid +", " + "startdate: " + startdate +", " + "enddate: " + enddate +", " + "units: " 
				+ units +", " + "sortfield: " + sortfield +", " + "sortorder: " + sortorder +", " + "limit: " + limit +", "
				+ "offset: " + offset +", " + "includemetadata: " + includemetadata + "}";
	}

}
