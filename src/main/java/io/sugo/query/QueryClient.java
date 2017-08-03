package io.sugo.query;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.sugo.components.aggregation.*;
import io.sugo.components.filter.BoundFilter;
import io.sugo.dataUtil.JsonFormater;
import io.sugo.query.member.Context;

/**
 * Created by chenyuzhi on 17-7-28.
 */
public class QueryClient {
	static TimeseriesQuery query = new TimeseriesQuery();

	public static void main(String[] args) throws JsonProcessingException {
		ObjectMapper jsonMapper = new ObjectMapper();
		query.setDataSource("csv-test");
		query.setGranularity("all");
		query.setIntervals("1000/3000");
		query.setContext(new Context(1800,true,"v2"));
		query.addAggregation(new HyperUniqueBaseAggregation("HyperUnique_age","age"));
		query.addAggregation(new CountBaseAggregation("__Counts"));
		query.addAggregation(new DoubleMaxBaseAggregation("DOUBLE_MAX_SALARY","salary"));
		query.addAggregation(new DoubleMinBaseAggregation("DOUBLE_MIN_SALARY","salary"));
		query.addAggregation(new LongMaxBaseAggregation("LONG_MAX_AGE", "age"));
		query.addAggregation(new LongMinBaseAggregation("LONG_MIN_AGE", "age"));
		query.addAggregation(new LongSumBaseAggregation("LONG_SUM_AGE", "age"));
		query.addAggregation(new FilteredBaseAggregation(
														new CountBaseAggregation("_FilteredCounts"),
														new BoundFilter("age",null,"20",
																false,true,true)));

		query.addAggregation(new ThetaSketchAggregation("ThetaSketchAggregation_Name","age",16,
														true,true,1));
		println(JsonFormater.format(jsonMapper.writeValueAsString(query)));
		println(JsonFormater.format(query.query("http://192.168.0.225:8082/druid/v2")));

	}

	public static void println(String str){
		System.out.println(str);
	}
}
