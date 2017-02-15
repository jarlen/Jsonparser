package cn.jarlen.jsonparser.original;

import android.content.Context;
import android.text.TextUtils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import cn.jarlen.jsonparser.jsondata.AppsBean;
import cn.jarlen.jsonparser.jsondata.DataBig;
import cn.jarlen.jsonparser.jsondata.DataSmall;
import cn.jarlen.jsonparser.jsondata.DataUtils;
import cn.jarlen.richcommon.log.Log;

/**
 * DESCRIBE:
 * Created by hjl on 2017/2/13.
 */

public class OriJsonParser {


    public static void test2ObjectBig(Context context){

        String json = DataUtils.getJsonBig(context);

        if(TextUtils.isEmpty(json)){
            Log.e("json is NULL");
            return;
        }

        Log.w("parser json start");
        long parserStart = System.currentTimeMillis();

        JSONObject jsonObject = null;
        DataBig big = null;

        try {
            jsonObject = new JSONObject(json);
            big = new DataBig();
            big.setStatus(jsonObject.optInt("status"));
            big.setMessage(jsonObject.optString("message"));

            JSONObject contentObject = jsonObject.optJSONObject("content");
            DataBig.ContentBean contentBean = new DataBig.ContentBean();
            contentBean.setAuthor(contentObject.optString("author"));
            contentBean.setCreat_at(contentObject.optString("creat_at"));
            contentBean.setDesc(contentObject.optString("desc"));
            contentBean.setFrom(contentObject.optString("from"));
            contentBean.setTo(contentObject.optString("to"));
            contentBean.setType(contentObject.optString("type"));

            JSONArray appsArray = contentObject.getJSONArray("apps");
            List<AppsBean> apps = new ArrayList<>();

            int appsCount = appsArray.length();
            for(int index = 0;index < appsCount;index++){
                JSONObject appsObject = appsArray.getJSONObject(index);
                AppsBean appsBean = new AppsBean();
                appsBean.setHeaderId(appsObject.optInt("headerId"));
                appsBean.setAppName(appsObject.optString("appName"));
                appsBean.setIconUrl(appsObject.optString("iconUrl"));
                appsBean.setStart(appsObject.optString("start"));
                apps.add(appsBean);
            }
            contentBean.setApps(apps);

            JSONArray picsArray = contentObject.getJSONArray("pics");
            List<DataBig.ContentBean.PicsBean> pics = new ArrayList<>();

            int picsCount = picsArray.length();
            for(int index = 0;index < picsCount;index++){
                JSONObject picsObject = picsArray.getJSONObject(index);
                DataBig.ContentBean.PicsBean picsBean = new DataBig.ContentBean.PicsBean();
                picsBean.setUrl(picsObject.optString("url"));
                picsBean.setAlt(picsObject.optString("alt"));

                pics.add(picsBean);
            }
            contentBean.setPics(pics);
            big.setContent(contentBean);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        long parserEnd = System.currentTimeMillis();
        Log.w("parser json end!!!  time: "+(parserEnd - parserStart));
    }

    public static void test2ObjectSmall(Context context){
        String json = DataUtils.getJsonSmall(context);

        if(TextUtils.isEmpty(json)){
            Log.e("json is NULL");
            return;
        }

        Log.w("parser json start");
        long parserStart = System.currentTimeMillis();

        JSONObject jsonObject = null;
        DataSmall small = null;

        try {
            jsonObject = new JSONObject(json);
            small = new DataSmall();
            small.setStatus(jsonObject.optInt("status"));
            small.setMessage(jsonObject.optString("message"));

            JSONArray appsArray = jsonObject.getJSONArray("apps");
            List<AppsBean> apps = new ArrayList<>();
            int appsCount = appsArray.length();
            for(int index = 0;index < appsCount;index++){
                JSONObject appsObject = appsArray.getJSONObject(index);
                AppsBean appsBean = new AppsBean();
                appsBean.setHeaderId(appsObject.optInt("headerId"));
                appsBean.setAppName(appsObject.optString("appName"));
                appsBean.setIconUrl(appsObject.optString("iconUrl"));
                appsBean.setStart(appsObject.optString("start"));
                apps.add(appsBean);
            }
            small.setApps(apps);

        } catch (JSONException e) {
            e.printStackTrace();
        }
        long parserEnd = System.currentTimeMillis();
        Log.w("parser json end!!!  time: "+(parserEnd - parserStart));
    }

}
