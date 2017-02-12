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

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.io.Serializable;

public class BaseResult implements Serializable {

    private static final long serialVersionUID = -1310595910549310013L;

    /**
     * 标识本次调用是否返回
     */
    private boolean           success;

    /**
     * 本次调用返回code，一般为错误代码
     */
    private String            code;

    /**
     * 本次调用返回的消息，一般为错误消息
     */
    private String            message;

    /**
     * 请求Id
     */
    private String            requestId;

    public BaseResult() {
        this.code = "200";
        this.success = true;
        this.message = "success";
    }

    /**
     * 设置错误信息
     *
     * @param code
     * @param message
     */
    public BaseResult setErrorMessage(String code, String message) {
        this.code = code;
        this.success = false;
        this.message = message;
        return this;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("code:" + this.code);
        sb.append("message:" + this.message);

        return sb.substring(0);
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String toJsonString() {
        //return JSON.toJSONString(this, SerializerFeature.DisableCircularReferenceDetect);
        return JSON.toJSONString(this, SerializerFeature.WriteMapNullValue);
    }

}
