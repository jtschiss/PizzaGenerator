package edu.matc.entity.placesInfo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Viewport.
 */
public class Viewport{

	@JsonProperty("btmRightPoint")
	private BtmRightPoint btmRightPoint;

	@JsonProperty("topLeftPoint")
	private TopLeftPoint topLeftPoint;

	/**
	 * Set btm right point.
	 *
	 * @param btmRightPoint the btm right point
	 */
	public void setBtmRightPoint(BtmRightPoint btmRightPoint){
		this.btmRightPoint = btmRightPoint;
	}

	/**
	 * Get btm right point btm right point.
	 *
	 * @return the btm right point
	 */
	public BtmRightPoint getBtmRightPoint(){
		return btmRightPoint;
	}

	/**
	 * Set top left point.
	 *
	 * @param topLeftPoint the top left point
	 */
	public void setTopLeftPoint(TopLeftPoint topLeftPoint){
		this.topLeftPoint = topLeftPoint;
	}

	/**
	 * Get top left point top left point.
	 *
	 * @return the top left point
	 */
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