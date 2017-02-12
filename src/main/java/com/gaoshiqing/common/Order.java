package com.gaoshiqing.common;

/**
 * 排序
 * Created by 王雪莹 on 2016/12/19.
 */
public enum Order {
    ASC("asc","升序"),
    DESC("desc","降序");
    private String code;
    private String name;

    private Order(String code, String Name){

    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
