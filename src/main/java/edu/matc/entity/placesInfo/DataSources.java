package edu.matc.entity.placesInfo;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Data sources.
 */
public class DataSources{

	@JsonProperty("poiDetails")
	private List<PoiDetailsItem> poiDetails;

	/**
	 * Set poi details.
	 *
	 * @param poiDetails the poi details
	 */
	public void setPoiDetails(List<PoiDetailsItem> poiDetails){
		this.poiDetails = poiDetails;
	}

	/**
	 * Get poi details list.
	 *
	 * @return the list
	 */
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