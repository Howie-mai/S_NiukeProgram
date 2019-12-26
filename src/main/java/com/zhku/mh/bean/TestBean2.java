package com.zhku.mh.bean;

import lombok.Data;

/**
 * ClassName：
 * Time：2019/12/16 11:49
 * Description：
 * Author： mh
 */
@Data
public class TestBean2 {
    private Integer status;

    private String username;

    public TestBean2() {
    }

    public TestBean2(Integer status, String username) {
        this.status = status;
        this.username = username;
    }
}
