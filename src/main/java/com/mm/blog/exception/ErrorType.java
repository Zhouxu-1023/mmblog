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
    SAVE_FILED(1, "添加数据失败"),
    UPDATE_FILED(2, "更新数据失败"),
    DELETE_FILED(3, "删除数据失败"),
    GET_FILED(4, "获取数据失败");

    private int code;

    private String msg;

}
