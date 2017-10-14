package com.wangln.ykdproject.view.activiy;

import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.wangln.ykdproject.R;
import com.wangln.ykdproject.bean.CategoryBean;
import com.wangln.ykdproject.bean.FirstPageBean;
import com.wangln.ykdproject.c.C;
import com.wangln.ykdproject.model.HttpCallback;
import com.wangln.ykdproject.model.HttpFactory;
import com.wangln.ykdproject.model.HttpInterface;
import com.wangln.ykdproject.model.OkHttpImp;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements HttpCallback{
    private HttpInterface okHttpImp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void getFirst(View view) {
        okHttpImp = HttpFactory.createHttp(this,1);
        Log.d("wang",okHttpImp.toString());
        Map map = new HashMap<String,Integer>();
        map.put("page",0);
        map.put("rows",10);
        okHttpImp.sendPost("http://114.215.46.63/Test/first/homepage",map, FirstPageBean.class,1);
    }

    public void category(View view) {
        okHttpImp = HttpFactory.createHttp(this,1);
        Log.d("wang","category" + okHttpImp.toString());
        okHttpImp = OkHttpImp.getInstance(this);
        Map map = new HashMap<String,Integer>();
        okHttpImp.sendPost("http://114.215.46.63/Test/first/classificationofgoods",map, CategoryBean.class,2);
    }
    @Override
    public void onSuccess(Object obj,int what) {
        if(what == 1) {
            FirstPageBean bean = (FirstPageBean) obj;
            Log.d("wang", bean.toString());
        } else if(what == 2) {
            CategoryBean bean = (CategoryBean) obj;
            Log.d("wang",bean.toString());
        }
    }

    @Override
    public void onError(String msg,int what) {
        Log.d("wang",msg);
    }
}
