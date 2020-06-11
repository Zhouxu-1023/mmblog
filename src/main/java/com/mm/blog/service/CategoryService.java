package com.mm.blog.service;

import com.mm.blog.exception.BusinessException;
import com.mm.blog.pojo.Category;

import java.util.List;

/**
 * @author: z_houx
 * @create: 2020-06-03 22:34
 * @Description:Category业务逻辑
 */
public interface CategoryService {

    /**
     * 添加
     *
     * @param category
     */
    void save(Category category) throws BusinessException;

    /**
     * 删除指定分类
     *
     * @param id
     */
    void deleteById(Integer id) throws BusinessException;

    /**
     * 更新指定
     *
     * @param category
     */
    void updateById(Category category) throws BusinessException;

    /**
     * 获取单个
     *
     * @param id
     * @return
     */
    Category getById(Integer id) throws BusinessException;

    /**
     * 获取所有分类
     *
     * @return
     */
    List<Category> getList() throws BusinessException;
}
