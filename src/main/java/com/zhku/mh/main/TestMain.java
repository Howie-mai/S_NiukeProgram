package com.zhku.mh.main;

import com.zhku.mh.bean.TestBean;



/**
 * ClassName：
 * Time：2019/11/26 9:31
 * Description：
 * Author： mh
 */
public class TestMain {



    public static void main(String[] args) {
//        TestBean bean = new TestBean();
//        bean.setStatus(1);
//        System.out.println(bean);
//        TestServiceMethod.checkStatus(bean);
//        System.out.println(bean);

        TestBean bean = new TestBean();
        System.out.println(bean.getClass().getClassLoader());
        System.out.println(bean.getClass().getClassLoader().getParent());
        System.out.println(bean.getClass().getClassLoader().getParent().getParent());

        System.out.println("=========");

        Integer a = new Integer(1);
        System.out.println(a.getClass().getClassLoader());
//        System.out.println(a.getClass().getClassLoader().getParent());
//        System.out.println(a.getClass().getClassLoader().getParent().getParent());

        System.out.println("=========");

    }
}
