package org.kekelidos.weather.application.WeatherApplication.model;

import java.util.LinkedList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author kekeli D Akouete
 *
 * Definition:
 * The data object return has these attributes
 */

public class DataObject {
	private Results[] results;

	@JsonProperty("results")
    public Results[] getResults () {
    	
        return results;
    }
    
    public void setResults (Results[] results) {
        this.results = results;
    }

    @Override
    public String toString() {
    	
    	List <String> res = new LinkedList<String>();
    	for(Results rst : results) {
    		res.add(rst.toString()+"\n");
    	}
        return "DataObject ={"+ res.toString() +"}";
    	
//    	return "DataObject ={"+results.toString()+"}";
    }
    
    public Results SearchResults(String datatype) {
    	Results rst = new Results();
    	for(int i = 0; i < results.length; i++ ) {
    		if(results[i].getDatatype().equals(datatype.toUpperCase())) {
    			rst = results[i];
    			System.out.println(rst.toString());
    		}
    	}
    	return rst;
    }

}
