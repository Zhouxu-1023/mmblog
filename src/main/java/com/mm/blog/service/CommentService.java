package com.mm.blog.service;

import com.mm.blog.pojo.Comment;

import java.util.List;

/**
 * @author: z_houx
 * @create: 2020-06-05 0:18
 * @Description:评论业务逻辑接口
 */
public interface CommentService {

    /**
     * 添加
     * @param comment
     */
    void save(Comment comment);

    /**
     * 删除指定评论
     * @param id
     */
    void deleteById(Integer id);

    /**
     * 更新指定评论
     *
     * @param comment
     */
    void updateById(Comment comment);

    /**
     * 查找一个
     *
     * @param id
     * @return
     */
    Comment getById(Integer id);

    /**
     * 查找多个
     *
     * @return
     */
    List<Comment> getList();
}
