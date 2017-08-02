package io.sugo.aggregation;

/**
 * Created by chenyuzhi on 17-8-2.
 */
public class DoubleMinAggregation extends Aggregation{
	private static final String AGGREGATION_TYPE = "lucene_doubleMin";
	private String fieldName;
	public DoubleMinAggregation(String name,String fieldName){
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
