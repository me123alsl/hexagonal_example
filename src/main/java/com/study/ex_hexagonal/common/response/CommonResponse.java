package com.study.ex_hexagonal.common.response;

import lombok.Builder;
import lombok.Getter;

@Getter
public class CommonResponse<T> {
    private boolean success;
    private T response;
    private ErrorEntity error;

    @Builder
    public CommonResponse(boolean success, T response, ErrorEntity error) {
        this.success = success;
        this.response = response;
        this.error = error;
    }
}

