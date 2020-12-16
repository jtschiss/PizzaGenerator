package edu.matc.entity.placesInfo;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Results item.
 */
public class ResultsItem{

	@JsonProperty("score")
	private double score;

	@JsonProperty("entryPoints")
	private List<EntryPointsItem> entryPoints;

	@JsonProperty("address")
	private Address address;

	@JsonProperty("viewport")
	private Viewport viewport;

	@JsonProperty("dist")
	private double dist;

	@JsonProperty("id")
	private String id;

	@JsonProperty("poi")
	private Poi poi;

	@JsonProperty("position")
	private Position position;

	@JsonProperty("type")
	private String type;

	@JsonProperty("dataSources")
	private DataSources dataSources;

	@JsonProperty("info")
	private String info;

	/**
	 * Set score.
	 *
	 * @param score the score
	 */
	public void setScore(double score){
		this.score = score;
	}

	/**
	 * Get score double.
	 *
	 * @return the double
	 */
	public double getScore(){
		return score;
	}

	/**
	 * Set entry points.
	 *
	 * @param entryPoints the entry points
	 */
	public void setEntryPoints(List<EntryPointsItem> entryPoints){
		this.entryPoints = entryPoints;
	}

	/**
	 * Get entry points list.
	 *
	 * @return the list
	 */
	public List<EntryPointsItem> getEntryPoints(){
		return entryPoints;
	}

	/**
	 * Set address.
	 *
	 * @param address the address
	 */
	public void setAddress(Address address){
		this.address = address;
	}

	/**
	 * Get address address.
	 *
	 * @return the address
	 */
	public Address getAddress(){
		return address;
	}

	/**
	 * Set viewport.
	 *
	 * @param viewport the viewport
	 */
	public void setViewport(Viewport viewport){
		this.viewport = viewport;
	}

	/**
	 * Get viewport viewport.
	 *
	 * @return the viewport
	 */
	public Viewport getViewport(){
		return viewport;
	}

	/**
	 * Set dist.
	 *
	 * @param dist the dist
	 */
	public void setDist(double dist){
		this.dist = dist;
	}

	/**
	 * Get dist double.
	 *
	 * @return the double
	 */
	public double getDist(){
		return dist;
	}

	/**
	 * Set id.
	 *
	 * @param id the id
	 */
	public void setId(String id){
		this.id = id;
	}

	/**
	 * Get id string.
	 *
	 * @return the string
	 */
	public String getId(){
		return id;
	}

	/**
	 * Set poi.
	 *
	 * @param poi the poi
	 */
	public void setPoi(Poi poi){
		this.poi = poi;
	}

	/**
	 * Get poi poi.
	 *
	 * @return the poi
	 */
	public Poi getPoi(){
		return poi;
	}

	/**
	 * Set position.
	 *
	 * @param position the position
	 */
	public void setPosition(Position position){
		this.position = position;
	}

	/**
	 * Get position position.
	 *
	 * @return the position
	 */
	public Position getPosition(){
		return position;
	}

	/**
	 * Set type.
	 *
	 * @param type the type
	 */
	public void setType(String type){
		this.type = type;
	}

	/**
	 * Get type string.
	 *
	 * @return the string
	 */
	public String getType(){
		return type;
	}

	/**
	 * Set data sources.
	 *
	 * @param dataSources the data sources
	 */
	public void setDataSources(DataSources dataSources){
		this.dataSources = dataSources;
	}

	/**
	 * Get data sources data sources.
	 *
	 * @return the data sources
	 */
	public DataSources getDataSources(){
		return dataSources;
	}

	/**
	 * Set info.
	 *
	 * @param info the info
	 */
	public void setInfo(String info){
		this.info = info;
	}

	/**
	 * Get info string.
	 *
	 * @return the string
	 */
	public String getInfo(){
		return info;
	}

	@Override
 	public String toString(){
		return 
			"ResultsItem{" + 
			"score = '" + score + '\'' + 
			",entryPoints = '" + entryPoints + '\'' + 
			",address = '" + address + '\'' + 
			",viewport = '" + viewport + '\'' + 
			",dist = '" + dist + '\'' + 
			",id = '" + id + '\'' + 
			",poi = '" + poi + '\'' + 
			",position = '" + position + '\'' + 
			",type = '" + type + '\'' + 
			",dataSources = '" + dataSources + '\'' + 
			",info = '" + info + '\'' + 
			"}";
		}
}