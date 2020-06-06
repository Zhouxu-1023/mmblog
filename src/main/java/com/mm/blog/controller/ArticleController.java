package com.mm.blog.controller;

import com.mm.blog.dto.DataResult;
import com.mm.blog.pojo.Article;
import com.mm.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



/**
 * @author: z_houx
 * @create: 2020-06-06 23:58
 * @Description:
 */
@RestController
@RequestMapping(value = "/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping(method = RequestMethod.GET)
    public DataResult getArticleById(Integer id) {
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
}
