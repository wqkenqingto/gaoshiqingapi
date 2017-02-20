/*
 *
 *  * Copyright (c) 2016. com.blogadmin.gaoshiqing.com All right reserved. This software is the
 *  * confidential and proprietary information of Aliyun.com ("Confidential
 *  * Information"). You shall not disclose such Confidential Information and shall
 *  * use it only in accordance with the terms of the license agreement you entered
 *  * into with com.blogadmin.gaoshiqing.com .
 *
 */

package com.gaoshiqing.common;

/**
 * Created by Arvin on 16/6/27.
 */
public class PlainResult<T> extends BaseResult {

    private static final long serialVersionUID = 1L;
    /**
     * 返回数据
     */
    private T                 data;

    /**
     * @return the data
     */
    public T getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(T data) {
        this.data = data;
    }
}
