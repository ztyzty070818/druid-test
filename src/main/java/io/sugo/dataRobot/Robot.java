package io.sugo.dataRobot;

import org.joda.time.DateTime;

import java.io.*;
import java.util.Properties;

/**
 * Created by qwe on 17-7-22.
 */
public class Robot {
    public static void main(String[] args) throws IOException {
        int num = 0;

        Properties props = new Properties();
        props.load(new FileInputStream("data.properties"));

        DataCreator creator = new DataCreator();
        int numPerDay = Integer.parseInt(props.getProperty("numPerDay"));
        int numDay = Integer.parseInt(props.getProperty("numDay"));


        File file = new File(props.getProperty("savePath"));


        if(!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        if(!file.exists()) {
            file.createNewFile();
        }


        FileWriter fileWriter = new FileWriter(file);

        DateTime start = new DateTime(2017,5,1,0,0);
        DateTime current;

        for(int j=0;j<numDay;j++) {
            current = start.plusDays(j);
            for(int i=0;i<numPerDay;i++) {

                num++;
                String sendStr = creator.generateData( num , current);
                fileWriter.write(sendStr+"\r\n");

                if( (j*numPerDay+i) % 100000 == 0) {
                    System.out.println("send count:"+ (num));
                }
            }
        }

        System.out.println("send total:"+ (num));

        fileWriter.close();
    }

}
