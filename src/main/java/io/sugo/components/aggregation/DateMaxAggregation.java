package io.sugo.components.aggregation;

/**
 * Created by chenyuzhi on 17-8-2.
 */
public class DateMaxAggregation extends Aggregation{
	private static final String AGGREGATION_TYPE = "lucene_dateMax";

	private String fieldName;
	public DateMaxAggregation(String name, String fieldName){
		super(AGGREGATION_TYPE,name);
		this.fieldName = fieldName;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
}
