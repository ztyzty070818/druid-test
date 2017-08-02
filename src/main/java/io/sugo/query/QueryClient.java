package io.sugo.query;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.sugo.components.Aggregation.CountAggregation;
import io.sugo.components.Aggregation.HyperUniqueAggregation;
import io.sugo.dataUtil.JsonFormater;
import io.sugo.query.member.Context;

/**
 * Created by chenyuzhi on 17-7-28.
 */
public class QueryClient {
	static TimeseriesQuery query = new TimeseriesQuery();

	public static void main(String[] args) throws JsonProcessingException {
		ObjectMapper jsonMapper = new ObjectMapper();
		query.setDataSource("druid-test");
		query.setGranularity("all");
		query.setIntervals("1000/3000");
		query.setContext(new Context(1800,true,"v2"));
		query.addAggregation(new HyperUniqueAggregation("ageCount","age"));
		query.addAggregation(new CountAggregation("__Value"));
		println(JsonFormater.format(jsonMapper.writeValueAsString(query)));
		println(JsonFormater.format(query.query("http://192.168.0.225:8082/druid/v2")));

	}

	public static void println(String str){
		System.out.println(str);
	}
}
