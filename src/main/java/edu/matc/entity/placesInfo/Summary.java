package edu.matc.entity.placesInfo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Summary.
 */
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

	/**
	 * Set fuzzy level.
	 *
	 * @param fuzzyLevel the fuzzy level
	 */
	public void setFuzzyLevel(int fuzzyLevel){
		this.fuzzyLevel = fuzzyLevel;
	}

	/**
	 * Get fuzzy level int.
	 *
	 * @return the int
	 */
	public int getFuzzyLevel(){
		return fuzzyLevel;
	}

	/**
	 * Set total results.
	 *
	 * @param totalResults the total results
	 */
	public void setTotalResults(int totalResults){
		this.totalResults = totalResults;
	}

	/**
	 * Get total results int.
	 *
	 * @return the int
	 */
	public int getTotalResults(){
		return totalResults;
	}

	/**
	 * Set offset.
	 *
	 * @param offset the offset
	 */
	public void setOffset(int offset){
		this.offset = offset;
	}

	/**
	 * Get offset int.
	 *
	 * @return the int
	 */
	public int getOffset(){
		return offset;
	}

	/**
	 * Set query.
	 *
	 * @param query the query
	 */
	public void setQuery(String query){
		this.query = query;
	}

	/**
	 * Get query string.
	 *
	 * @return the string
	 */
	public String getQuery(){
		return query;
	}

	/**
	 * Set query time.
	 *
	 * @param queryTime the query time
	 */
	public void setQueryTime(int queryTime){
		this.queryTime = queryTime;
	}

	/**
	 * Get query time int.
	 *
	 * @return the int
	 */
	public int getQueryTime(){
		return queryTime;
	}

	/**
	 * Set num results.
	 *
	 * @param numResults the num results
	 */
	public void setNumResults(int numResults){
		this.numResults = numResults;
	}

	/**
	 * Get num results int.
	 *
	 * @return the int
	 */
	public int getNumResults(){
		return numResults;
	}

	/**
	 * Set geo bias.
	 *
	 * @param geoBias the geo bias
	 */
	public void setGeoBias(GeoBias geoBias){
		this.geoBias = geoBias;
	}

	/**
	 * Get geo bias geo bias.
	 *
	 * @return the geo bias
	 */
	public GeoBias getGeoBias(){
		return geoBias;
	}

	/**
	 * Set query type.
	 *
	 * @param queryType the query type
	 */
	public void setQueryType(String queryType){
		this.queryType = queryType;
	}

	/**
	 * Get query type string.
	 *
	 * @return the string
	 */
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