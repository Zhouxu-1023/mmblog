package com.mm.blog.controller;

import com.mm.blog.dto.DataResult;
import com.mm.blog.exception.BusinessException;
import com.mm.blog.exception.ErrorType;
import com.mm.blog.pojo.Article;
import com.mm.blog.service.ArticleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author: z_houx
 * @create: 2020-06-06 23:58
 * @Description:
 */
@RestController
@RequestMapping(value = "/blog")
@Api(value = "文章接口")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping(value = "/articles/{id}")
    @ApiOperation(value = "获取指定id的文章的接口", notes = "id不能为空")
    @ApiImplicitParam(paramType = "query", value = "文章id", name = "id", dataType = "Integer", required = true)
    public DataResult<Article> getArticleById(@PathVariable("id") Integer id) {
        DataResult<Article> dataResult = new DataResult<>();
        Article article = null;
        try {
            article = articleService.getById(id);
            if (null != article) {
                dataResult.setData(article);
                dataResult.setMessage(ErrorType.GET_SUCCESS.getMsg());
                dataResult.setCode(ErrorType.GET_SUCCESS.getCode());
            }
        } catch (BusinessException e) {
            dataResult.setMessage(ErrorType.GET_FILED.getMsg());
            dataResult.setCode(ErrorType.GET_FILED.getCode());
        }
        return dataResult;
    }

    @DeleteMapping(value = "/articles/{id}")
    @ApiOperation(value = "删除指定id的文章的接口", notes = "id不能为空")
    @ApiImplicitParam(paramType = "query", value = "文章id", name = "id", dataType = "Integer", required = true)
    public DataResult<Article> deleteArticleById(@PathVariable("id") Integer id) {
        DataResult<Article> dataResult = new DataResult<>();
        Article article = null;
        try {
            article = articleService.getById(id);
            if (null != article) {
                dataResult.setData(article);
                dataResult.setMessage(ErrorType.DELETE_SUCCESS.getMsg());
                dataResult.setCode(ErrorType.DELETE_SUCCESS.getCode());
            }
        } catch (BusinessException e) {
            dataResult.setMessage(ErrorType.DELETE_FILED.getMsg());
            dataResult.setCode(ErrorType.DELETE_FILED.getCode());
        }
        return dataResult;
    }

    @PostMapping(value = "/articles")
    @ApiOperation(value = "添加文章的接口")
    public DataResult<Article> saveArticle(@RequestBody Article article) {
        DataResult<Article> dataResult = new DataResult<>();
        if (null != article) {
            try {
                articleService.save(article);
                dataResult.setMessage(ErrorType.SAVE_SUCCESS.getMsg());
                dataResult.setCode(ErrorType.SAVE_FILED.getCode());
            } catch (BusinessException e) {
                dataResult.setMessage(ErrorType.SAVE_FILED.getMsg());
                dataResult.setCode(ErrorType.SAVE_FILED.getCode());
            }

        }
        return dataResult;
    }

    @PutMapping(value = "/articles/{id}")
    @ApiOperation(value = "更新指定id文章的接口", notes = "id不能为空")
    @ApiImplicitParam(paramType = "query", value = "文章id", name = "id", dataType = "Integer", required = true)
    public DataResult<Article> updateArticleById(@RequestBody Article article) {
        DataResult<Article> dataResult = new DataResult<>();
        if (null != article) {
            try {
                articleService.updateById(article);
                dataResult.setData(article);
                dataResult.setMessage(ErrorType.UPDATE_SUCCESS.getMsg());
                dataResult.setCode(ErrorType.UPDATE_SUCCESS.getCode());
            } catch (BusinessException e) {
                dataResult.setMessage(ErrorType.UPDATE_FILED.getMsg());
                dataResult.setCode(ErrorType.UPDATE_FILED.getCode());
            }
        }
        return dataResult;
    }


    @GetMapping(value = "/articles")
    @ApiOperation(value = "获取所有文章的接口")
    public DataResult<List<Article>> getArticles() {
        DataResult<List<Article>> dataResult = new DataResult<>();
        List<Article> articleList = null;
        try {
            articleList = articleService.getList();
            if (null != articleList) {
                dataResult.setData(articleList);
                dataResult.setMessage(ErrorType.GET_SUCCESS.getMsg());
                dataResult.setCode(ErrorType.GET_SUCCESS.getCode());
            }
        } catch (BusinessException e) {
            dataResult.setMessage(ErrorType.GET_FILED.getMsg());
            dataResult.setCode(ErrorType.GET_FILED.getCode());
        }
        return dataResult;
    }
}
