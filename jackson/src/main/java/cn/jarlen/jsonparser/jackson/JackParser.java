package cn.jarlen.jsonparser.jackson;

import android.content.Context;
import android.text.TextUtils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

import cn.jarlen.jsonparser.jsondata.DataBig;
import cn.jarlen.jsonparser.jsondata.DataUtils;
import cn.jarlen.richcommon.log.Log;

/**
 * DESCRIBE:
 * Created by hjl on 2017/2/15.
 */

public class JackParser {


    public static void test2ObjectBig(Context context) {

        String json = DataUtils.getJsonBig(context);

        if (TextUtils.isEmpty(json)) {
            Log.e("json is NULL");
            return;
        }

        Log.w("parser json start");
        long parserStart = System.currentTimeMillis();

        ObjectMapper mObjectMapper = new ObjectMapper();

        DataBig big = null;
        try {
            big = mObjectMapper.readValue(json, DataBig.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        long parserEnd = System.currentTimeMillis();
        Log.w("parser json end!!!  time: " + (parserEnd - parserStart));

    }

    public static void test2ObjectSmall(Context context) {

        String json = DataUtils.getJsonSmall(context);

        if (TextUtils.isEmpty(json)) {
            Log.e("json is NULL");
            return;
        }

        Log.w("parser json start");
        long parserStart = System.currentTimeMillis();
    }
}
