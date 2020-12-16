package edu.matc.entity.placesInfo;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DataSources{

	@JsonProperty("poiDetails")
	private List<PoiDetailsItem> poiDetails;

	public void setPoiDetails(List<PoiDetailsItem> poiDetails){
		this.poiDetails = poiDetails;
	}

	public List<PoiDetailsItem> getPoiDetails(){
		return poiDetails;
	}

	@Override
 	public String toString(){
		return 
			"DataSources{" + 
			"poiDetails = '" + poiDetails + '\'' + 
			"}";
		}
}