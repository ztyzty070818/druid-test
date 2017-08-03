package io.sugo.dataRobot;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.joda.time.DateTime;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

/**
 * Created by qwe on 17-7-22.
 */
public class DataCreator{


        public DataCreator() throws IOException {
            Properties props = new Properties();
            props.load(new FileInputStream("data.properties"));
        }


        public static Random random;

        public String generateData(int i,DateTime dateTime) throws JsonProcessingException {
            random = new Random(i);

            //年龄
            int age = random.nextInt(50) + 15;
            //省份
            String province = DataConst.province[random.nextInt(34)];
            //时间
            DateTime dt = dateTime.plusMillis(random.nextInt(1000 * 60 * 60 * 24));
            //生日
            DateTime birthday = dt.minusYears(age).plusMillis(random.nextInt(1000 * 60 * 60 * 24 * 365));
            //薪资
            long salary = random.nextInt(20000)  + 3000;
            //平均分
            float average = random.nextInt(100) + random.nextFloat();
            //身高
            double height = random.nextInt(70) + 130 + random.nextDouble();
            //体重
            //BigDecimal weight = new BigDecimal(random.nextInt(50) + 30 +random.nextDouble());

            List list = new ArrayList();
            list.add(age);
            list.add(province);
            list.add(dt.getMillis());
            list.add(birthday.getMillis());
            list.add(salary);
            list.add(height);
            //list.add(weight);
            list.add(average);

            return getCsvFromList(list);

        }

        public static String getCsvFromList(List list) {
            StringBuffer csvStr = new StringBuffer();
            Iterator iterator = list.iterator();
            while(iterator.hasNext()) {
                csvStr.append(iterator.next() + ",");
            }
            return csvStr.substring(0,csvStr.length()-1);
        }

}
