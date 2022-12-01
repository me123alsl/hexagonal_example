package com.study.ex_hexagonal.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CommonResponse<T> {
    private boolean success;
    private T response;
    private ErrorEntity error;
}

