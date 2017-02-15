package cn.jarlen.jsonparser.gson;

import android.content.Context;
import android.text.TextUtils;

import com.google.gson.Gson;

import cn.jarlen.jsonparser.jsondata.DataBig;
import cn.jarlen.jsonparser.jsondata.DataSmall;
import cn.jarlen.jsonparser.jsondata.DataUtils;
import cn.jarlen.richcommon.log.Log;

/**
 * DESCRIBE:
 * Created by hjl on 2017/2/15.
 */

public class GsonParser {

    public static void test2ObjectBig(Context context) {

        String json = DataUtils.getJsonBig(context);

        if (TextUtils.isEmpty(json)) {
            Log.e("json is NULL");
            return;
        }

        Log.w("parser json start");
        long parserStart = System.currentTimeMillis();

        Gson gson = new Gson();
        DataBig big = gson.fromJson(json, DataBig.class);

        long parserEnd = System.currentTimeMillis();
        Log.w("parser json end!!!  time: " + (parserEnd - parserStart));

        String tmpJson = gson.toJson(big);
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

        Gson gson = new Gson();
        DataSmall small = gson.fromJson(json, DataSmall.class);
        long parserEnd = System.currentTimeMillis();
        Log.w("parser json end!!!  time: " + (parserEnd - parserStart));

        String tmpJson = gson.toJson(small);
        long enCodeEnd = System.currentTimeMillis();
        Log.w("enCodeEnd json end!!!  time: " + (enCodeEnd - parserEnd));
    }
}
