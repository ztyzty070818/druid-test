package io.sugo.components.aggregation;

import io.sugo.components.aggregation.base.CommonAggregation;

/**
 * Created by chenyuzhi on 17-8-2.
 */
public class DateMaxBaseAggregation extends CommonAggregation {
	private static final String AGGREGATION_TYPE = "lucene_dateMax";


	public DateMaxBaseAggregation(String name, String fieldName){
		super(AGGREGATION_TYPE,name,fieldName);
	}

}
