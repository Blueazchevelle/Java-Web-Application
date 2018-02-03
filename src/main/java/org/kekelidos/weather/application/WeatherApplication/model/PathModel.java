package org.kekelidos.weather.application.WeatherApplication.model;

public class PathModel {
	protected String datasetid;
	protected String startdate;
	protected String enddate;
	protected String sortfield;
	protected String sortorder = "ASC";
	protected int limit = 50;
	protected int offset = 1;
	
	public String getDatasetid() {
		return datasetid;
	}
	public void setDatasetid(String datasetid) {
		this.datasetid = datasetid.toUpperCase();
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getSirtfield() {
		return sortfield;
	}
	public void setSirtfield(String sirtfield) {
		this.sortfield = sirtfield;
	}
	public String getSortorder() {
		return sortorder;
	}
	public void setSortorder(String sortorder) {
		this.sortorder = sortorder;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public String toQueryString() {
		return "?datasetid=" + datasetid + "&startdate=" + startdate + "&enddate=" + enddate + "&sortfield="
				+ sortfield + "&sortorder=" + sortorder + "&limit=" + limit + "&offset=" + offset ;
	}
	@Override
	public String toString() {
		return "Endpoint= {datasetid: " + datasetid +", "+ "startdate: " + startdate + ", " + "enddate: " + enddate + ", " + "sortfield: "
				+ sortfield +", " + "sortorder: " + sortorder +", " + "limit: " + limit +", " + "offset: " + offset +"}";
	
	}

}
