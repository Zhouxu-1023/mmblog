package com.mm.blog.controller;

import com.mm.blog.dto.DataResult;
import com.mm.blog.exception.BusinessException;
import com.mm.blog.exception.ErrorType;
import com.mm.blog.pojo.Category;
import com.mm.blog.service.CategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PostMapping(value = "/categorys")
    @ApiOperation(value = "添加文章分类",notes = "添加文章分类")
    public DataResult<Category> saveCategory(@RequestBody Category category){
        DataResult<Category> dataResult = new DataResult<>();
        try {
            categoryService.save(category);
            dataResult.setCode(ErrorType.SAVE_SUCCESS.getCode());
            dataResult.setMessage(ErrorType.SAVE_SUCCESS.getMsg());
        } catch (BusinessException e) {
           dataResult.setCode(ErrorType.SAVE_FILED.getCode());
           dataResult.setMessage(ErrorType.SAVE_FILED.getMsg());
        }
        return dataResult;
    }

    @PutMapping(value = "/categorys/{id}")
    @ApiOperation(value = "更新文章分类",notes = "更新文章分类")
    public DataResult<Category> updateCategoryById(@RequestBody Category category){
        DataResult<Category> dataResult = new DataResult<>();
        try {
            categoryService.updateById(category);
            dataResult.setMessage(ErrorType.UPDATE_SUCCESS.getMsg());
            dataResult.setCode(ErrorType.UPDATE_SUCCESS.getCode());
        } catch (BusinessException e) {
            dataResult.setMessage(ErrorType.UPDATE_FILED.getMsg());
            dataResult.setCode(ErrorType.UPDATE_FILED.getCode());
        }
        return dataResult;
    }

    @DeleteMapping(value = "/categorys/{id}")
    @ApiOperation(value = "删除文章分类",notes = "删除文章分类")
    public DataResult<Category> deleteCategoryById(@RequestParam Integer id){
        DataResult<Category> dataResult = new DataResult<>();
        try {
            categoryService.deleteById(id);
            dataResult.setMessage(ErrorType.DELETE_SUCCESS.getMsg());
            dataResult.setCode(ErrorType.DELETE_SUCCESS.getCode());
        } catch (BusinessException e) {
            dataResult.setMessage(ErrorType.DELETE_FILED.getMsg());
            dataResult.setCode(ErrorType.DELETE_FILED.getCode());
        }
        return dataResult;
    }

    @GetMapping(value = "/categorys/{id}")
    @ApiOperation(value = "获取指定id分类",notes = "获取指定id分类")
    public DataResult<Category> getCategoryById(@RequestParam Integer id){
        DataResult<Category> dataResult = new DataResult<>();
        try {
            Category category = categoryService.getById(id);
            dataResult.setData(category);
            dataResult.setMessage(ErrorType.DELETE_SUCCESS.getMsg());
            dataResult.setCode(ErrorType.DELETE_SUCCESS.getCode());
        } catch (BusinessException e) {
            dataResult.setMessage(ErrorType.DELETE_FILED.getMsg());
            dataResult.setCode(ErrorType.DELETE_FILED.getCode());
        }
        return dataResult;
    }

    @GetMapping(value = "/categorys")
    @ApiOperation(value = "获取所有分类",notes = "获取所有分类")
    public DataResult<List<Category>> getCategoryById(){
        DataResult<List<Category>> dataResult = new DataResult<>();
        try {
            List<Category> categoryList = categoryService.getList();
            dataResult.setData(categoryList);
            dataResult.setMessage(ErrorType.DELETE_SUCCESS.getMsg());
            dataResult.setCode(ErrorType.DELETE_SUCCESS.getCode());
        } catch (BusinessException e) {
            dataResult.setMessage(ErrorType.DELETE_FILED.getMsg());
            dataResult.setCode(ErrorType.DELETE_FILED.getCode());
        }
        return dataResult;
    }

}
