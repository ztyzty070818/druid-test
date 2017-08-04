package io.sugo.components.aggregation;

import io.sugo.components.aggregation.base.CommonAggregation;

/**
 * Created by chenyuzhi on 17-7-28.
 */
public class HyperUniqueBaseAggregation extends CommonAggregation {
	private static final String AGGREGATION_TYPE = "lucene_hyperUnique";

	public HyperUniqueBaseAggregation(String name, String fieldName) {
		super(AGGREGATION_TYPE, name,fieldName);
	}
}
