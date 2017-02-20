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

import java.io.Serializable;


public enum CommonResultCode implements Serializable{

    SUCCESS("200", "successful"),
    EXCEPTION("-100", "server exception, msg is %s"),
    ILLEGAL_PARAM("-101", "illegal parameter, param is %s"),
    ILLEGAL_PARAM_LENGTH("-102", "illegal paramter length, param is %s"),
    ILLEGAL_AUTH("-103", "illegal auth"),
    ILLEGAL_AUTH_STATUS("-104", "illegal auth status, current status is %s"),
    ERROR_DB("-105", "db error"),
    ERROR_INVOKE_PROXY("-106", "invoke proxy error, proxy result code is %s, msg is %s"),
    ERROR_DATA_EXISTS("-107", "%s data exist"),
    DUBBO_RPC_ERROR("-108", "Dubbo rpc error,msg is %s");

    public final String code;
    public final String message;

    CommonResultCode(String code, String msg) {
        this.code = code;
        this.message = msg;
    }


    public void mixIn(BaseResult result) {
        result.setErrorMessage(this.name(), this.message);
    }

    public void mixIn(BaseResult result, Object... args) {
        result.setErrorMessage(this.name(), this.message);

        try {
            result.setMessage(String.format(result.getMessage(), args));
        } catch (Exception e) {
        }
    }
}
