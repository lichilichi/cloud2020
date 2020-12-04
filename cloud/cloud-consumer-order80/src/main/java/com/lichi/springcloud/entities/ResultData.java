package com.lichi.springcloud.entities;

import lombok.Data;

import java.util.List;

/**
 * @author lichi
 * @create 2020-12-04 9:02
 */
@Data
public class ResultData {
    private List data;
    private List links;
}
