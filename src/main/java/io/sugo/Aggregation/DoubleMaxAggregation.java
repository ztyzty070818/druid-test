package io.sugo.Aggregation;

/**
 * Created by chenyuzhi on 17-8-2.
 */
public class DoubleMaxAggregation extends Aggregation {
	private static final String AGGREGATION_TYPE = "lucene_doubleMax";
	private String fieldName;

	public DoubleMaxAggregation(String name, String fieldName){
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
