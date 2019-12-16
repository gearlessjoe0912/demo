package generator;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("JSON.toJSONString(date) = " + JSONArray.toJSON(date).toString());
        String dateStr = JSONArray.toJSON(date).toString();
        Date date1 = JSONArray.parseObject(dateStr, Date.class);
        System.out.println("(date == date1) = " + (date == date1));
    }
}
