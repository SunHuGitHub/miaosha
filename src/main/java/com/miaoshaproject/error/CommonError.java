package com.miaoshaproject.error;
/**
 * @author Tiger
 * @date 2020/10/30 09:01
 */
public interface CommonError {
    int getErrCode();

    String getErrMsg();

    CommonError setErrMsg(String errMsg);
}