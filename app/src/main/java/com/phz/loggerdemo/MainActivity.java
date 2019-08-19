package com.phz.loggerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.orhanobut.logger.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
    private String JSON_CONTENT = "{\"userid\":1,\"nickname\":\"xixi\",\"headimg\":\"eeeeee\",\"birth\":\"2018-12-12\",\"sex\":1,\"provinceid\":1,\"cityid\":1,\"city\":\"深圳市\",\"imei\":\"ioioipiopi\"}";
    private String XML_CONTENT = "<note>\n" + "<to>George</to>\n" + "<from>John</from>\n" + "<heading>Reminder</heading>\n" + "<body>Don't forget the meeting!</body>\n" + "</note>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LoggerExample();
    }

    private void LoggerExample() {
        //打印json
        Logger.json(JSON_CONTENT);
        //打印XML
        Logger.xml(XML_CONTENT);
        //List
        List<String> list = new ArrayList<>();
        list.add("haizhuo");
        list.add("001");
        Logger.d(list);
        //Map
        Map<String, Object> map = new HashMap<>();
        map.put("name", "haizhuo");
        map.put("index", 001);
        Logger.d(map);
        //Set
        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("world");
        Logger.d(set);
        //字符串格式化
        Logger.d("hello %s%d", "haizhuo", 1);
        //打印Exception
        int[] ints = new int[3];
        try {
            ints[3] = 12;
        } catch (Exception e) {
            Logger.e(e, "抛出异常");
        }
        /**
         * 打印的TAG:全局设置的TAG-自定义tag
         * 举个例子本demo打印的TAG:LoggerDemo-LBW
         */
        Logger.log(Logger.ERROR,"LBW","NB",null);
    }
}
