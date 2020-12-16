package edu.matc.entity.placesInfo;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Places.
 */
public class Places{

    @JsonProperty("summary")
    private Summary summary;

    @JsonProperty("results")
    private List<ResultsItem> results;

    /**
     * Set summary.
     *
     * @param summary the summary
     */
    public void setSummary(Summary summary){
        this.summary = summary;
    }

    /**
     * Get summary summary.
     *
     * @return the summary
     */
    public Summary getSummary(){
        return summary;
    }

    /**
     * Set results.
     *
     * @param results the results
     */
    public void setResults(List<ResultsItem> results){
        this.results = results;
    }

    /**
     * Get results list.
     *
     * @return the list
     */
    public List<ResultsItem> getResults(){
        return results;
    }

    @Override
    public String toString(){
        return
                "Places{" +
                        "summary = '" + summary + '\'' +
                        ",results = '" + results + '\'' +
                        "}";
    }
}