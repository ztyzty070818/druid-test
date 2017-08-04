package io.sugo.dataRobot;

import io.sugo.dataUtil.JsonFormater;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Random;

/**
 * Created by qwe on 17-7-27.
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        String str = "{\"2017-07-17T00:00:00.000Z/2017-07-18T00:00:00.000Z\":{\"com_ByXp4k5HW_project_default_sdk_2017-07-17T00:00:00.000Z_2017-07-18T00:00:00.000Z_2017-07-17T07:19:47.993Z_1\":{\"metadata\":{\"dataSource\":\"com_ByXp4k5HW_project_default_sdk\",\"interval\":\"2017-07-17T00:00:00.000Z/2017-07-18T00:00:00.000Z\",\"version\":\"2017-07-17T07:19:47.993Z\",\"loadSpec\":{\"type\":\"local\",\"path\":\"/data1/druid/storage/com_ByXp4k5HW_project_default_sdk/2017-07-17T00:00:00.000Z_2017-07-18T00:00:00.000Z/2017-07-17T07:19:47.993Z/1/index.zip\"},\"dimensions\":\"\",\"metrics\":\"\",\"shardSpec\":{\"type\":\"numbered\",\"partitionNum\":1,\"partitions\":0},\"binaryVersion\":9,\"size\":15197,\"identifier\":\"com_ByXp4k5HW_project_default_sdk_2017-07-17T00:00:00.000Z_2017-07-18T00:00:00.000Z_2017-07-17T07:19:47.993Z_1\"},\"servers\":[\"192.168.0.212:8083\"]},\"com_ByXp4k5HW_project_default_sdk_2017-07-17T00:00:00.000Z_2017-07-18T00:00:00.000Z_2017-07-17T07:19:47.993Z\":{\"metadata\":{\"dataSource\":\"com_ByXp4k5HW_project_default_sdk\",\"interval\":\"2017-07-17T00:00:00.000Z/2017-07-18T00:00:00.000Z\",\"version\":\"2017-07-17T07:19:47.993Z\",\"loadSpec\":{\"type\":\"local\",\"path\":\"/data1/druid/storage/com_ByXp4k5HW_project_default_sdk/2017-07-17T00:00:00.000Z_2017-07-18T00:00:00.000Z/2017-07-17T07:19:47.993Z/0/index.zip\"},\"dimensions\":\"\",\"metrics\":\"\",\"shardSpec\":{\"type\":\"numbered\",\"partitionNum\":0,\"partitions\":0},\"binaryVersion\":9,\"size\":15161,\"identifier\":\"com_ByXp4k5HW_project_default_sdk_2017-07-17T00:00:00.000Z_2017-07-18T00:00:00.000Z_2017-07-17T07:19:47.993Z\"},\"servers\":[\"192.168.0.212:8083\"]}}}";
        println(JsonFormater.format(str));

    }

    public static void println(String str){
        System.out.println(str);
    }
}
