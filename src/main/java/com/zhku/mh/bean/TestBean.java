package com.zhku.mh.bean;

import lombok.Data;

/**
 * ClassName：
 * Time：2019/11/26 9:23
 * Description：
 * Author： mh
 */
@Data
public class TestBean {
    /**
     *
     */
    private Integer status;

    private String name;

    public TestBean() {
    }

    public TestBean(Integer status, String name) {
        this.status = status;
        this.name = name;
    }

}
