package cn.jarlen.jsonparser;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import cn.jarlen.jsonparser.fastjson.FastParser;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.testBtn).setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        FastParser.test2ObjectArray(this);
        FastParser.test2ObjectBig(this);
        FastParser.test2ObjectSmall(this);
    }
}
