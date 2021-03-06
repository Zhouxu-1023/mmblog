package com.mm.blog.mapper;

import com.mm.blog.pojo.Category;

import java.util.List;

/**
 * @author: z_houx
 * @create: 2020-06-03 21:56
 * @Description:分类Mapper
 */
public interface CategoryMapper {
    /**
     * 添加
     * @param category
     */
    void save(Category category);

    /**
     * 删除指定分类
     * @param id
     */
    void deleteById(Integer id);

    /**
     * 更新指定
     * @param category
     */
    void updateById(Category category);

    /**
     * 获取单个
     * @param id
     * @return
     */
    Category getById(Integer id);

    /**
     * 获取所有分类
     * @return
     */
    List<Category> getList();
}
