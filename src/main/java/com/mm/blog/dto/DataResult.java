package com.mm.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: z_houx
 * @create: 2020-06-07 0:00
 * @Description:返回结果集
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataResult<T> {

    private T data;

    private String message;

    private Integer code;
}
