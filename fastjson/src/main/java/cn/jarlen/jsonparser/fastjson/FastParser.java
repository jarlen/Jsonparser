package cn.jarlen.jsonparser.fastjson;

import android.content.Context;
import android.text.TextUtils;

import com.alibaba.fastjson.JSON;

import java.util.List;

import cn.jarlen.jsonparser.jsondata.AppsBean;
import cn.jarlen.jsonparser.jsondata.DataBig;
import cn.jarlen.jsonparser.jsondata.DataSmall;
import cn.jarlen.jsonparser.jsondata.DataUtils;
import cn.jarlen.richcommon.log.Log;

/**
 * DESCRIBE:
 * Created by hjl on 2017/2/15.
 */

public class FastParser {

    public static void test2ObjectBig(Context context) {

        String json = DataUtils.getJsonBig(context);

        if (TextUtils.isEmpty(json)) {
            Log.e("json is NULL");
            return;
        }

        Log.w("parser json start");
        long parserStart = System.currentTimeMillis();

        DataBig big = JSON.parseObject(json,DataBig.class);

        long parserEnd = System.currentTimeMillis();
        Log.w("parser json end!!!  time: " + (parserEnd - parserStart));

        String tmpJson = JSON.toJSONString(big);
        long enCodeEnd = System.currentTimeMillis();
        Log.w("enCodeEnd json end!!!  time: " + (enCodeEnd - parserEnd));
    }

    public static void test2ObjectSmall(Context context) {

        String json = DataUtils.getJsonSmall(context);

        if (TextUtils.isEmpty(json)) {
            Log.e("json is NULL");
            return;
        }

        Log.w("parser json start");
        long parserStart = System.currentTimeMillis();

        DataSmall small = JSON.parseObject(json, DataSmall.class);

        long parserEnd = System.currentTimeMillis();
        Log.w("parser json end!!!  time: " + (parserEnd - parserStart));

        String tmpJson = JSON.toJSONString(small);
        long enCodeEnd = System.currentTimeMillis();
        Log.w("enCodeEnd json end!!!  time: " + (enCodeEnd - parserEnd));
    }


    public static void test2ObjectArray(Context context) {

        String json = DataUtils.getJsonArray(context);

        if (TextUtils.isEmpty(json)) {
            Log.e("json is NULL");
            return;
        }

        Log.w("parser json start");
        long parserStart = System.currentTimeMillis();

        List<AppsBean> apps = JSON.parseArray(json,AppsBean.class);

        long parserEnd = System.currentTimeMillis();
        Log.w("parser json end!!!  time: " + (parserEnd - parserStart));

        String tmpJson = JSON.toJSONString(apps);
        long enCodeEnd = System.currentTimeMillis();
        Log.w("enCodeEnd json end!!!  time: " + (enCodeEnd - parserEnd));
    }
}
