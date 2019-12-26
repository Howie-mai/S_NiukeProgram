package com.zhku.mh.util;

import com.zhku.mh.bean.TestBean;

/**
 * ClassName：
 * Time：2019/11/26 9:30
 * Description：
 * Author： mh
 */
public class TestServiceMethod {

    public static TestBean checkStatus(TestBean bean){
        bean.setStatus(0);
        return bean;
    }
}
