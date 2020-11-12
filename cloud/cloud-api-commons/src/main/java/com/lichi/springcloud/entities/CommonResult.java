package com.lichi.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lichi
 * @create 2020-11-10 9:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult <T>{

    private Integer code;
    private String message;
    private T data;

    private  CommonResult(Integer code, String message) {
        this(code, message,null);
    }
}
