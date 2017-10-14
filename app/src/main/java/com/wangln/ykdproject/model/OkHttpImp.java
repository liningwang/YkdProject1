package com.wangln.ykdproject.model;

import com.alibaba.fastjson.JSON;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Created by Administrator on 2017/10/14 0014.
 */

public class OkHttpImp implements HttpInterface{
    private static OkHttpClient okHttpClient;
    private static OkHttpImp okHttpImp;
    HttpCallback callback;
    public static final MediaType MEDIA= MediaType.parse("application/octet-stream");
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    private OkHttpImp(HttpCallback callback){
        okHttpClient = new OkHttpClient();
        this.callback = callback;
    }
    public static OkHttpImp getInstance(HttpCallback callback){
        if(okHttpImp == null) {
            okHttpImp = new OkHttpImp(callback);
            return okHttpImp;
        } else {
            return okHttpImp;
        }
    }
    @Override
    public void sendGet(String url, Map<String, Object> map,Class class1,int what) {

        Request request = new Request.Builder()
                .url(url)
                .build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(new OkhttpCallBack(class1,callback,what));
    }
    @Override
    public void sendPost(String url, Map<String, Object> map,Class class1,int what) {
//        RequestBody body = RequestBody.create(JSON,"{\"aaa\":1,\"bbb\":2}");
        FormBody.Builder builder = new FormBody.Builder();
        for(String key : map.keySet()) {
            Object obj = map.get(key);
            builder.add(key, String.valueOf(obj));
        }
        RequestBody body = builder.build();

        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(new OkhttpCallBack(class1,callback,what));
    }

    @Override
    public void sendJsonPost(String url,Class cla,Class response,int what) {
        String str = com.alibaba.fastjson.JSON.toJSONString(cla);
        RequestBody body = RequestBody.create(JSON,str);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(new OkhttpCallBack(response,callback,what));
    }

    @Override
    public void uploadPic(String url, String loaclPath,Class response,int what) {
        File file = new File(loaclPath);
        RequestBody body = new MultipartBody.Builder()
                .addFormDataPart("file",file.getName(),RequestBody.create(MEDIA,file))
                .build();
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(new OkhttpCallBack(response,callback,what));
    }

}
