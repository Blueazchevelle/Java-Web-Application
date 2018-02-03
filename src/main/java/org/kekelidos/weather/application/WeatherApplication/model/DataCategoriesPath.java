package org.kekelidos.weather.application.WeatherApplication.model;
/**
 * 
 * @author kekeli D Akouete
 * 
 * Description:
 * A data category is a general type of data used to group similar data types.
 */

public class DataCategoriesPath extends DatasetsPath {
	public DataCategoriesPath() {
		super();
	}
	@Override
	public String toString() {
		return "DataCategories = {datatypeid: " + datatypeid +", "+ "locationid: " + locationid +", "+ "stationid: " + stationid 
			    +", "+ "startdate: " + startdate +", "+ "enddate: " + enddate +", "+ "sortfield: " + sortfield +", "+ 
				"sortorder: " + sortorder +", "+ "limit:" + limit +", "+ "offset: " + offset +"}";
	}
	
}
