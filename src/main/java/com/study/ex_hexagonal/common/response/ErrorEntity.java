package com.study.ex_hexagonal.common.response;

import lombok.Builder;
import lombok.Getter;

@Getter
public class ErrorEntity {
    private String code;
    private String message;

    @Builder
    public ErrorEntity(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
