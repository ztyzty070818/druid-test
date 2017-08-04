package io.sugo.query;


import com.fasterxml.jackson.databind.ObjectMapper;
import io.sugo.components.aggregation.base.BaseAggregation;
import io.sugo.components.filter.Filter;
import io.sugo.components.postAggregation.base.BasePostAggregation;
import io.sugo.query.base.BaseQuery;
import io.sugo.query.base.CommonQuery;
import io.sugo.query.member.Context;
import io.sugo.components.aggregation.CountBaseAggregation;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by chenyuzhi on 17-7-28.
 */
public class TimeseriesQuery <T extends BaseAggregation, P extends BasePostAggregation> extends CommonQuery {
	private static final String QUERY_TYPE = "lucene_timeseries";
	private Filter filter;
	private List<T> aggregations = new LinkedList();
	private List<P> postAggregations = new LinkedList();


	public TimeseriesQuery(){
		super(QUERY_TYPE);
	}

	public TimeseriesQuery(String dataSource, String granularity, String intervals) {
		super(QUERY_TYPE,dataSource,granularity,intervals,null);
	}



	public TimeseriesQuery(String dataSource,
						   String granularity,
						   String intervals,
						   Map<String, Object> context,
						   Filter filter,
						   List<T> aggregations,
						   List<P> postAggregations) {
		super(QUERY_TYPE,dataSource,intervals,granularity,context);
		this.aggregations = aggregations;
		this.postAggregations = postAggregations;
		this.filter = filter;
	}

	public void setAggregations(List<T> aggregations) {
		this.aggregations = aggregations;
	}

	public  List<T> getAggregations() {
		return aggregations;
	}

	public List<P> getPostAggregations() {
		return postAggregations;
	}

	public void setPostAggregations(List<P> postAggregations) {
		this.postAggregations = postAggregations;
	}

	public  void addAggregation(T t){
		this.aggregations.add(t);
	}

	public void addPostAggregation(P p){
		this.postAggregations.add(p);
	}

	public Filter getFilter() {
		return filter;
	}

	public void setFilter(Filter filter) {
		this.filter = filter;
	}

}
