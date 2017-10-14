package com.wangln.ykdproject.model;

import java.util.Map;

/**
 * Created by Administrator on 2017/10/14 0014.
 */

public interface HttpInterface {
    public void sendGet(String url,Map<String,Object> map,Class class1,int what);
    public void sendPost(String url,Map<String,Object> map,Class class1,int what);
    public void sendJsonPost(String url,Class cla,Class class1,int what);
    public void uploadPic(String url,String loaclPath,Class class1,int what);
}
