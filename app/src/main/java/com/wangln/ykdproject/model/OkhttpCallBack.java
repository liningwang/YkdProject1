package com.wangln.ykdproject.model;

import com.alibaba.fastjson.JSON;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * Created by Administrator on 2017/10/14 0014.
 */

public class OkhttpCallBack implements Callback {
    Class c;
    HttpCallback callback;
    int what;
    public OkhttpCallBack(Class c,HttpCallback callback,int what){
        this.c = c;
        this.callback = callback;
        this.what = what;
    }
    @Override
    public void onFailure(Call call, IOException e) {
        callback.onError(e.toString(),what);
    }

    @Override
    public void onResponse(Call call, Response response) throws IOException {
        String json = response.body().string();
        Object obj = JSON.parseObject(json,c);
        callback.onSuccess(obj,what);
    }
}
