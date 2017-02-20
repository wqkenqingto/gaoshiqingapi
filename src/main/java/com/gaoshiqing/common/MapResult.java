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

import java.util.Map;

/**
 * Created by Arvin on 16/12/12.
 */
public class MapResult extends BaseResult {

    private static final long serialVersionUID = 1278368355633522961L;

    private Map<String, Object> data;

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}
