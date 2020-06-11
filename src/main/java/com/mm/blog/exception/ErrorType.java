package com.mm.blog.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author: z_houx
 * @create: 2020-06-10 21:44
 * @Description:错误类型的枚举
 */
@Getter
@AllArgsConstructor
public enum ErrorType {

    /**
     * 错误类型
     */
    SAVE_FILED(101, "添加数据失败"),
    SAVE_SUCCESS(102, "添加数据成功"),
    UPDATE_FILED(201, "更新数据失败"),
    UPDATE_SUCCESS(202, "更新数据成功"),
    DELETE_FILED(301, "删除数据失败"),
    DELETE_SUCCESS(302, "删除数据成功"),
    GET_FILED(401, "获取数据失败"),
    GET_SUCCESS(402, "获取数据成功");

    private int code;

    private String msg;

}
