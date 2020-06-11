package com.mm.blog.controller;

import com.mm.blog.dto.DataResult;
import com.mm.blog.pojo.Category;
import com.mm.blog.service.CategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: z_houx
 * @create: 2020-06-08 22:00
 * @Description:
 */
@RestController
@RequestMapping(value = "/blog")
@Api(value = "文章分类的接口")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PutMapping(value = "/categorys")
    @ApiOperation(value = "添加文章分类的接口",notes = "添加文章分类")
    public DataResult saveCategory(@RequestBody Category category){
        DataResult<Category> dataResult = new DataResult<>();
        categoryService.save(category);
        return dataResult;
    }


}
