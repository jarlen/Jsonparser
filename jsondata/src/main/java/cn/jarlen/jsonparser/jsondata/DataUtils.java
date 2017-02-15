package cn.jarlen.jsonparser.jsondata;

import android.content.Context;

import java.io.IOException;
import java.io.InputStream;

/**
 * DESCRIBE:
 * Created by hjl on 2017/2/15.
 */

public class DataUtils {


    /**
     * 获取测试数据(数据量大)
     * @param context
     * @return
     * String
     */
    public static String getJsonBig(Context context) {
        String json = "";

        InputStream is = null;
        try {
            is = context.getAssets().open("test_big.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            json = new String(buffer, "utf-8");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            is = null;
        }

        return json;
    }


    public static String getJsonArray(Context context){
        String json = "";

        InputStream is = null;
        try {
            is = context.getAssets().open("test_array.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            json = new String(buffer, "utf-8");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            is = null;
        }

        return json;
    }


    /**
     * 获取测试数据(数据量小)
     * @param context
     * @return
     */
    public static String getJsonSmall(Context context) {
        String json = "";

        InputStream is = null;
        try {
            is = context.getAssets().open("test_small.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            json = new String(buffer, "utf-8");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            is = null;
        }

        return json;
    }
}
