package edu.matc.entity.placesInfo;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

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

	public void setScore(double score){
		this.score = score;
	}

	public double getScore(){
		return score;
	}

	public void setEntryPoints(List<EntryPointsItem> entryPoints){
		this.entryPoints = entryPoints;
	}

	public List<EntryPointsItem> getEntryPoints(){
		return entryPoints;
	}

	public void setAddress(Address address){
		this.address = address;
	}

	public Address getAddress(){
		return address;
	}

	public void setViewport(Viewport viewport){
		this.viewport = viewport;
	}

	public Viewport getViewport(){
		return viewport;
	}

	public void setDist(double dist){
		this.dist = dist;
	}

	public double getDist(){
		return dist;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setPoi(Poi poi){
		this.poi = poi;
	}

	public Poi getPoi(){
		return poi;
	}

	public void setPosition(Position position){
		this.position = position;
	}

	public Position getPosition(){
		return position;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setDataSources(DataSources dataSources){
		this.dataSources = dataSources;
	}

	public DataSources getDataSources(){
		return dataSources;
	}

	public void setInfo(String info){
		this.info = info;
	}

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