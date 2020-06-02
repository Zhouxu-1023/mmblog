package com.mm.blog.mapper;

import com.mm.blog.pojo.Article;

import java.util.List;

/**
 * @author: z_houx
 * @create: 2020-06-02 22:24
 * @Description:
 */
public interface ArticleMapper {
    /**
     * 添加
     * @param article
     */
    void save(Article article);

    /**
     * 删除
     * @param id
     */
    void deleteById(Integer id);

    /**
     * 修改指定文章
     * @param article
     */
    void updateById(Article article);

    /**
     * 获取指定id文章
     * @param id
     * @return
     */
    Article getById(Integer id);

    /**
     * 获取所有文章
     * @return
     */
    List<Article> getList();
}
