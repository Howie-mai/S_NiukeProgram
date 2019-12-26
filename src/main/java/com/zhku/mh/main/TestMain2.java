package com.zhku.mh.main;

import com.alibaba.fastjson.JSON;
import com.zhku.mh.bean.*;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ClassName：
 * Time：2019/12/11 14:32
 * Description：
 * Author： mh
 */
public class TestMain2 {
    public static void main(String[] args) {
//        TestBean testBean = new TestBean();
//        testBean.setStatus(0);
//        TestBean testBean1 = new TestBean();
//        testBean1.setStatus(1);
//        TestBean testBean2 = new TestBean();
//        testBean2.setStatus(2);
//        TestBean testBean3 = new TestBean();
//        testBean3.setStatus(3);
//        TestBean testBean4 = new TestBean();
//        testBean4.setStatus(4);
//        TestBean testBean5 = new TestBean();
//        testBean5.setStatus(5);
//
//        List<TestBean> list = new ArrayList<TestBean>();
//        list.add(testBean);
//        list.add(testBean1);
//        list.add(testBean2);
//        list.add(testBean5);
//        list.add(testBean3);
//        list.add(testBean4);
//
//        List<TestBean> finalList = list.parallelStream()
//                .filter(item -> item.getStatus() >= 2)
//                .sorted(Comparator.comparing(TestBean::getStatus).reversed())
//                .collect(Collectors.toList());
//
//        System.out.println(finalList);

//        List<Integer> list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(2);
//        list.add(5);
//        list.add(3);
//        list.add(4);
//        list.add(6);
//
//        List<Integer> finalList = list.parallelStream()
//                .filter(item -> item >= 2)
//                .sorted(Comparator.comparing(Integer::intValue).reversed())
//                .collect(Collectors.toList());
//
//        System.out.println(finalList);
//        Byte a = 3 ,b=4,d;
//        d = a + b;
//        d = 3 + 2;

//        TestBean testBean = new TestBean();
//        TestBean2 testBean2 = new TestBean2();
//        testBean.setStatus(1);
//
//        BeanUtils.copyProperties(testBean,testBean2);
//
//        System.out.println(testBean);
//        System.out.println(testBean2);

        List<TestBean> l1 = new ArrayList<>();

        l1.add(new TestBean(1,"张三"));
        l1.add(new TestBean(2,"李四"));

        String jsonString = JSON.toJSONString(l1);
        List<TestBean2> l2 = JSON.parseArray(jsonString,TestBean2.class);

        System.out.println(l1);
        System.out.println(l2);


    }
}
