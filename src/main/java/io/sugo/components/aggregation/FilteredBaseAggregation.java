package io.sugo.components.aggregation;

import io.sugo.components.aggregation.base.BaseAggregation;
import io.sugo.components.filter.Filter;

/**
 * Created by chenyuzhi on 17-8-3.
 */
public class FilteredBaseAggregation<T extends BaseAggregation,F extends Filter> extends BaseAggregation {
	private static final String AGGREGATION_TYPE = "lucene_filtered";
	private T aggregator;
	private F filter;

	public FilteredBaseAggregation(){
		super(AGGREGATION_TYPE);
	}

	public FilteredBaseAggregation(T aggregator, F filter){
		super(AGGREGATION_TYPE);
		this.aggregator = aggregator;
		this. filter = filter;
	}

	public T getAggregator() {
		return aggregator;
	}

	public void setAggregator(T aggregator) {
		this.aggregator = aggregator;
	}

	public F getFilter() {
		return filter;
	}

	public void setFilter(F filter) {
		this.filter = filter;
	}
}
