package edu.matc.entity.placesInfo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Viewport{

	@JsonProperty("btmRightPoint")
	private BtmRightPoint btmRightPoint;

	@JsonProperty("topLeftPoint")
	private TopLeftPoint topLeftPoint;

	public void setBtmRightPoint(BtmRightPoint btmRightPoint){
		this.btmRightPoint = btmRightPoint;
	}

	public BtmRightPoint getBtmRightPoint(){
		return btmRightPoint;
	}

	public void setTopLeftPoint(TopLeftPoint topLeftPoint){
		this.topLeftPoint = topLeftPoint;
	}

	public TopLeftPoint getTopLeftPoint(){
		return topLeftPoint;
	}

	@Override
 	public String toString(){
		return 
			"Viewport{" + 
			"btmRightPoint = '" + btmRightPoint + '\'' + 
			",topLeftPoint = '" + topLeftPoint + '\'' + 
			"}";
		}
}