package com.mm.blog.mapper;

import com.mm.blog.pojo.User;

import java.util.List;

/**
 * @author: z_houx
 * @create: 2020-06-06 23:54
 * @Description:
 */
public interface UserMapper {
    /**
     * 添加
     * @param user
     */
    void save(User user);

    /**
     * 删除
     * @param id
     */
    void deleteById(Integer id);

    /**
     * 修改
     * @param user
     */
    void updateById(User user);

    /**
     * 获取一个
     * @param id
     * @return
     */
    User getById(Integer id);

    /**
     * 获取所有
     * @return
     */
    List<User> getList();
}
