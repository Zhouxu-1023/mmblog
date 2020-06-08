package com.mm.blog.controller;

import com.mm.blog.dto.DataResult;
import com.mm.blog.pojo.Article;
import com.mm.blog.service.ArticleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
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
    @ApiOperation(value = "获取指定id的文章的接口",notes = "id不能为空")
    @ApiImplicitParam(paramType = "query",value = "文章id",name = "id",dataType = "Integer",required =true )
    public DataResult getArticleById(@PathVariable("id")Integer id) {
        DataResult<Article> dataResult = new DataResult<>();
        Article article = articleService.getById(id);
        if (null != article){
            dataResult.setData(article);
            dataResult.setMessage("查询成功！");
            dataResult.setCode("200");
        }else {
            dataResult.setMessage("查询失败！");
            dataResult.setCode("404");
        }
        return dataResult;
    }

    @DeleteMapping(value = "/articles/{id}")
    @ApiOperation(value = "删除指定id的文章的接口",notes = "id不能为空")
    @ApiImplicitParam(paramType = "query",value = "文章id",name = "id",dataType = "Integer",required =true )
    public DataResult deleteArticleById(@PathVariable("id")Integer id) {
        DataResult<Article> dataResult = new DataResult<>();
        Article article = articleService.getById(id);
        if (null != article){
            dataResult.setData(article);
            dataResult.setMessage("查询成功！");
            dataResult.setCode("200");
        }else {
            dataResult.setMessage("查询失败！");
            dataResult.setCode("404");
        }
        return dataResult;
    }

    @PostMapping(value = "/articles")
    @ApiOperation(value = "添加文章的接口")
    public DataResult saveArticle(@RequestParam Article article) {
        DataResult<Article> dataResult = new DataResult<>();
        if (null != article){
            articleService.save(article);
            dataResult.setMessage("添加成功！");
            dataResult.setCode("200");
        }else {
            dataResult.setMessage("添加失败！");
            dataResult.setCode("404");
        }
        return dataResult;
    }

    @PutMapping(value = "/articles/{id}")
    @ApiOperation(value = "更新指定id文章的接口",notes = "id不能为空")
    @ApiImplicitParam(paramType = "query",value = "文章id",name = "id",dataType = "Integer",required =true )
    public DataResult updateArticleById(@RequestParam Article article) {
        DataResult<Article> dataResult = new DataResult<>();
        if (null != article){
            articleService.updateById(article);
            dataResult.setData(article);
            dataResult.setMessage("更新成功！");
            dataResult.setCode("200");
        }else {
            dataResult.setMessage("更新失败！");
            dataResult.setCode("404");
        }
        return dataResult;
    }


    @GetMapping(value = "/articles")
    @ApiOperation(value = "获取所有文章的接口")
    public DataResult getArticles() {
        DataResult<List> dataResult = new DataResult<>();
        List<Article> articleList = articleService.getList();
        if (null != articleList){
            dataResult.setData(articleList);
            dataResult.setMessage("查询成功！");
            dataResult.setCode("200");
        }else {
            dataResult.setMessage("查询失败！");
            dataResult.setCode("404");
        }
        return dataResult;
    }
}
