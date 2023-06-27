package com.xx.core;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T bo;

    public CommonResult(Integer code, String message) {
        this.code = code;
        this.message = message;
        this.bo = null;
    }

    public static <T> CommonResult<T> successReturn(T data) {
        return new CommonResult<>(200, "", data);
    }


    public static <T> CommonResult<T> from(Integer code, String message, T data) {
        return new CommonResult<>(code, message, data);
    }
}
