package com.woniu.mall.common.exception;

import com.woniu.mall.common.api.IErrorCode;

public class Asserts {
    public static void fail(String message){
        throw new ApiException(message);
    }
    public static void fail(IErrorCode errorCode){
        throw new ApiException(errorCode);
    }
}
