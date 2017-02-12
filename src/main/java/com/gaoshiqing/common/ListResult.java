/*
 *
 *  * Copyright (c) 2016. mocentre.com All right reserved. This software is the
 *  * confidential and proprietary information of Aliyun.com ("Confidential
 *  * Information"). You shall not disclose such Confidential Information and shall
 *  * use it only in accordance with the terms of the license agreement you entered
 *  * into with mocentre.com .
 *
 */

package com.gaoshiqing.common;

import java.util.List;

/**
 * 类ListResult.java的实现描述：用于接口返回list
 * 
 * @param <T>
 */
public class ListResult<T> extends BaseResult {

    private static final long serialVersionUID = 1L;

    private List<T>           data;

    private int               count;

    public ListResult() {
        super();
    }

    public ListResult(List<T> data, Integer count) {
        super();
        this.count = count == null ? data.size() : count;
        this.data = data;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
