package io.sugo.components.aggregation;

import io.sugo.components.aggregation.base.NameableAggregation;

/**
 * Created by chenyuzhi on 17-7-28.
 */
public class CountBaseAggregation extends NameableAggregation {
	private static final String AGGREGATION_TYPE = "lucene_count";


	public CountBaseAggregation(String name) {
		super(AGGREGATION_TYPE,name);
	}


}
