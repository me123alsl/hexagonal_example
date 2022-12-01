package com.study.ex_hexagonal.common.exception;

import com.study.ex_hexagonal.common.response.CommonResponse;
import com.study.ex_hexagonal.common.response.ErrorEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    protected ResponseEntity<?> handleException(Exception e) {
        CommonResponse response = CommonResponse.builder()
                .success(false)
                .response(null)
                .error(ErrorEntity.builder()
                        .code("E000")
                        .message(e.getMessage())
                        .build())
                .build();
        return ResponseEntity.badRequest().body(response);
    }

}
