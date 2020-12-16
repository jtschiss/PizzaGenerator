package edu.matc.entity.placesInfo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PoiDetailsItem{

	@JsonProperty("id")
	private String id;

	@JsonProperty("sourceName")
	private String sourceName;

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setSourceName(String sourceName){
		this.sourceName = sourceName;
	}

	public String getSourceName(){
		return sourceName;
	}

	@Override
 	public String toString(){
		return 
			"PoiDetailsItem{" + 
			"id = '" + id + '\'' + 
			",sourceName = '" + sourceName + '\'' + 
			"}";
		}
}