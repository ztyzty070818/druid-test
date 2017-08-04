package io.sugo.query;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.sugo.components.aggregation.*;
import io.sugo.components.filter.BoundFilter;
import io.sugo.components.postAggregation.ArithmeticPostAggregation;
import io.sugo.components.postAggregation.FieldAccessPostAggregation;
import io.sugo.components.postAggregation.HyperUniqueCardinalityPostAggregation;
import io.sugo.dataUtil.JsonFormater;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chenyuzhi on 17-7-28.
 */
public class QueryClient {
	static TimeseriesQuery query = new TimeseriesQuery();
	static ObjectMapper jsonMapper = new ObjectMapper();

	public static void main(String[] args) throws JsonProcessingException {
		testTimseriesQuery();

	}

	public static void testTimseriesQuery()throws JsonProcessingException{

		query.setDataSource("csv-test");
		query.setGranularity("all");
		query.setIntervals("1000/3000");
		Map<String, Object> context = new HashMap<>();
		context.put("timeout",1800);
		context.put("useOffheap",true);
		context.put("groupByStrategy","v2");
		query.setContext(context);
		//添加Aggregation配置
		query.addAggregation(new CountBaseAggregation("__Counts"));
		query.addAggregation(new DateMaxBaseAggregation("MAX_DATE","birthday"));
		query.addAggregation(new DateMinBaseAggregation("MIN_DATE","birthday"));
		query.addAggregation(new DoubleMaxBaseAggregation("DOUBLE_MAX_SALARY","salary"));
		query.addAggregation(new DoubleMinBaseAggregation("DOUBLE_MIN_SALARY","salary"));
		query.addAggregation(new HyperUniqueBaseAggregation("HyperUnique_age","age"));
		query.addAggregation(new LongMaxBaseAggregation("LONG_MAX_AGE", "age"));
		query.addAggregation(new LongMinBaseAggregation("LONG_MIN_AGE", "age"));
		query.addAggregation(new LongSumBaseAggregation("LONG_SUM_AGE", "age"));
		query.addAggregation(new FilteredBaseAggregation(
				new CountBaseAggregation("_FilteredCounts"),
				new BoundFilter("age",null,"20",
						false,true,true)));

		query.addAggregation(new ThetaSketchAggregation("ThetaSketchAggregation_Name","age",16,
				true,true,1));

		//添加PostAggregation配置
		query.addPostAggregation(new FieldAccessPostAggregation("FieldAcessPostAggregation_MaxSalary","DOUBLE_MAX_SALARY"));
		query.addPostAggregation(new HyperUniqueCardinalityPostAggregation("HyperUniqueCardinality_Name","HyperUnique_age"));

		ArithmeticPostAggregation arithmeticPostAggregation =
				new ArithmeticPostAggregation("ArithmeticPostAggregation_Name", "-");
		FieldAccessPostAggregation postAggregation1 = new FieldAccessPostAggregation("FieldAcessPostAggregation_MaxSalary","LONG_MAX_AGE");
		FieldAccessPostAggregation postAggregation2 = new FieldAccessPostAggregation("FieldAcessPostAggregation_MinSalary","LONG_MIN_AGE");
		arithmeticPostAggregation.addPostAggregationFileds(postAggregation1);
		arithmeticPostAggregation.addPostAggregationFileds(postAggregation2);
		query.addPostAggregation(arithmeticPostAggregation);


		//println(JsonFormater.format(jsonMapper.writeValueAsString(query)));
		println(JsonFormater.format(query.query("http://192.168.0.225:8082/druid/v2")));
	}

	public static void println(String str){
		System.out.println(str);
	}
}
