package com.mm.blog.service.impl;

import com.mm.blog.exception.BusinessException;
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
    public void save(Category category) throws BusinessException {

        categoryMapper.save(category);
    }

    @Override
    public void deleteById(Integer id) throws BusinessException {
        categoryMapper.deleteById(id);
    }

    @Override
    public void updateById(Category category) throws BusinessException {
        categoryMapper.updateById(category);
    }

    @Override
    public Category getById(Integer id) throws BusinessException {
        return categoryMapper.getById(id);
    }

    @Override
    public List<Category> getList() throws BusinessException {
        return categoryMapper.getList();
    }
}
