package com.wangln.ykdproject.model;

import com.wangln.ykdproject.c.C;

import java.lang.reflect.Method;

import okhttp3.Callback;

/**
 * Created by Administrator on 2017/10/14 0014.
 */

public class HttpFactory {
    public static HttpInterface createHttp(HttpCallback callback,int type){
        if(type == 1) {
            HttpInterface httpInterface = OkHttpImp.getInstance(callback);
            return httpInterface;
        } else if(type == 2) {
            HttpInterface httpInterface = new TaskHttpImpl();
            return httpInterface;
        } else if(type == 3) {
            HttpInterface httpInterface = new HttpurlImpl();
            return  httpInterface;
        }
       /*try {
            //根据类名获取Class对象
            Class c=Class.forName(C.cls);
//参数类型数组
            Class[] parameterTypes={HttpCallback.class};
//根据参数类型获取相应的构造函数
            java.lang.reflect.Constructor constructor=c.getConstructor(parameterTypes);
//参数数组
            Object[] parameters={callback};
//根据获取的构造函数和参数，创建实例
            Object obj=constructor.newInstance(parameters);

            Method a = c.getDeclaredMethod("getInstance",HttpCallback.class);
            a.invoke(obj,callback);
        } catch (Exception e) {
            e.printStackTrace();
        }
*/
        return null;
    }
}
