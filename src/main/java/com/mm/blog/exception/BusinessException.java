package com.mm.blog.exception;


/**
 * @author: z_houx
 * @create: 2020-06-10 21:31
 * @Description:自定义异常
 */

public class BusinessException extends RuntimeException {

    private Integer code;

    /**
     * 使用枚举中的错误类型
     * @param type
     */
    public BusinessException(ErrorType type){
        super(type.getMsg());
        this.code=type.getCode();
    }

    /**
     * 使用自定的错误类型
     * @param code
     * @param msg
     */
    public BusinessException(Integer code, String msg){
        super(msg);
        this.code = code;
    }
}
