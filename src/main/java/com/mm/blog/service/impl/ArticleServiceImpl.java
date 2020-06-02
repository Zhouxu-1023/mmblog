package com.mm.blog.service.impl;

import com.mm.blog.mapper.ArticleMapper;
import com.mm.blog.pojo.Article;
import com.mm.blog.service.ArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: z_houx
 * @create: 2020-06-02 22:34
 * @Description:文章业务逻辑实现类
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Resource
    private ArticleMapper articleMapper;

    @Override
    public void save(Article article) {
        articleMapper.save(article);
    }

    @Override
    public void deleteById(Integer id) {
        articleMapper.deleteById(id);
    }

    @Override
    public void updateById(Article article) {
        articleMapper.updateById(article);
    }

    @Override
    public Article getById(Integer id) {
        return articleMapper.getById(id);
    }

    @Override
    public List<Article> getList() {
        return articleMapper.getList();
    }
}
