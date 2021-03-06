package com.miaoshaproject.error;

/**
 * @author Tiger
 * @date 2020/10/30 09:32
 */
public class BusinessException extends Exception implements CommonError {

    private CommonError commonError;

    /**
     * 直接接收EmBusinessError的传参用于构造业务异常
     *
     * @param commonError
     */
    public BusinessException(CommonError commonError) {
        this.commonError = commonError;
    }

    /**
     * 接收自定义errMsg的方式构造业务异常
     *
     * @param commonError
     * @param errMsg
     */
    public BusinessException(CommonError commonError, String errMsg) {
        this.commonError = commonError;
        this.commonError.setErrMsg(errMsg);
    }


    @Override
    public int getErrCode() {
        return this.commonError.getErrCode();
    }

    @Override
    public String getErrMsg() {
        return this.commonError.getErrMsg();
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.commonError.setErrMsg(errMsg);
        return this;
    }

    public CommonError getCommonError() {
        return commonError;
    }
}