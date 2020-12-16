package edu.matc.entity.placesInfo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Summary{

	@JsonProperty("fuzzyLevel")
	private int fuzzyLevel;

	@JsonProperty("totalResults")
	private int totalResults;

	@JsonProperty("offset")
	private int offset;

	@JsonProperty("query")
	private String query;

	@JsonProperty("queryTime")
	private int queryTime;

	@JsonProperty("numResults")
	private int numResults;

	@JsonProperty("geoBias")
	private GeoBias geoBias;

	@JsonProperty("queryType")
	private String queryType;

	public void setFuzzyLevel(int fuzzyLevel){
		this.fuzzyLevel = fuzzyLevel;
	}

	public int getFuzzyLevel(){
		return fuzzyLevel;
	}

	public void setTotalResults(int totalResults){
		this.totalResults = totalResults;
	}

	public int getTotalResults(){
		return totalResults;
	}

	public void setOffset(int offset){
		this.offset = offset;
	}

	public int getOffset(){
		return offset;
	}

	public void setQuery(String query){
		this.query = query;
	}

	public String getQuery(){
		return query;
	}

	public void setQueryTime(int queryTime){
		this.queryTime = queryTime;
	}

	public int getQueryTime(){
		return queryTime;
	}

	public void setNumResults(int numResults){
		this.numResults = numResults;
	}

	public int getNumResults(){
		return numResults;
	}

	public void setGeoBias(GeoBias geoBias){
		this.geoBias = geoBias;
	}

	public GeoBias getGeoBias(){
		return geoBias;
	}

	public void setQueryType(String queryType){
		this.queryType = queryType;
	}

	public String getQueryType(){
		return queryType;
	}

	@Override
 	public String toString(){
		return 
			"Summary{" + 
			"fuzzyLevel = '" + fuzzyLevel + '\'' + 
			",totalResults = '" + totalResults + '\'' + 
			",offset = '" + offset + '\'' + 
			",query = '" + query + '\'' + 
			",queryTime = '" + queryTime + '\'' + 
			",numResults = '" + numResults + '\'' + 
			",geoBias = '" + geoBias + '\'' + 
			",queryType = '" + queryType + '\'' + 
			"}";
		}
}