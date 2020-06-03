package com.mm.blog.service.impl;

import com.mm.blog.mapper.CategoryMapper;
import com.mm.blog.pojo.Category;
import com.mm.blog.service.CategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: z_houx
 * @create: 2020-06-03 22:35
 * @Description:分类业务逻辑
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Resource
    private CategoryMapper categoryMapper;

    @Override
    public void save(Category category) {

        categoryMapper.save(category);
    }

    @Override
    public void deleteById(Integer id) {
        categoryMapper.deleteById(id);
    }

    @Override
    public void updateById(Category category) {
        categoryMapper.updateById(category);
    }

    @Override
    public Category getById(Integer id) {
        return categoryMapper.getById(id);
    }

    @Override
    public List<Category> getList() {
        return categoryMapper.getList();
    }
}
