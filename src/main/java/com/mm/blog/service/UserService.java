package com.mm.blog.service;

import com.mm.blog.exception.BusinessException;
import com.mm.blog.pojo.User;

import java.util.List;

/**
 * @author: z_houx
 * @create: 2020-06-06 23:56
 * @Description:
 */
public interface UserService {

    /**
     * 添加
     *
     * @param user
     */
    void save(User user) throws BusinessException;

    /**
     * 删除
     *
     * @param id
     */
    void deleteById(Integer id) throws BusinessException;

    /**
     * 修改
     *
     * @param user
     */
    void updateById(User user) throws BusinessException;

    /**
     * 获取一个
     *
     * @param id
     * @return
     */
    User getById(Integer id) throws BusinessException;

    /**
     * 获取所有
     *
     * @return
     */
    List<User> getList() throws BusinessException;
}
