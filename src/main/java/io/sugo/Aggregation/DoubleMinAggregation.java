package io.sugo.Aggregation;

/**
 * Created by chenyuzhi on 17-8-2.
 */
public class DoubleMinAggregation extends Aggregation{
	private static final String AGGREGATION_TYPE = "lucene_doubleMax";
	private String fieldName;
	public DoubleMinAggregation(String name,String fieldName){
		super(AGGREGATION_TYPE,name);
		this.fieldName = fieldName;
	}
}
