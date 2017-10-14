package com.wangln.ykdproject.model;

/**
 * Created by Administrator on 2017/10/14 0014.
 */

public interface HttpCallback {
    public void onSuccess(Object obj,int what);
    public void onError(String msg,int what);
}
