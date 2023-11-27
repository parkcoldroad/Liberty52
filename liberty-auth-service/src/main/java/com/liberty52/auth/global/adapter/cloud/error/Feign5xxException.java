package com.liberty52.auth.global.adapter.cloud.error;

public class Feign5xxException extends FeignClientException {
    public Feign5xxException() {
        super(FeignErrorCode.ERROR_5XX);
    }
}
