package com.mm.blog.service;

import com.mm.blog.exception.BusinessException;
import com.mm.blog.pojo.Article;

import java.util.List;

/**
 * @author: z_houx
 * @create: 2020-06-02 22:33
 * @Description:文章业务逻辑接口
 */
public interface ArticleService {

    /**
     * 添加
     * @param article
     */
    void save(Article article) throws BusinessException;

    /**
     * 删除
     * @param id
     */
    void deleteById(Integer id) throws BusinessException;

    /**
     * 修改指定文章
     * @param article
     */
    void updateById(Article article) throws BusinessException;

    /**
     * 获取指定id文章
     * @param id
     * @return
     */
    Article getById(Integer id) throws BusinessException;

    /**
     * 获取所有文章
     * @return
     */
    List<Article> getList() throws BusinessException;
}
