package com.mm.blog.service.impl;

import com.mm.blog.exception.BusinessException;
import com.mm.blog.mapper.CommentMapper;
import com.mm.blog.pojo.Comment;
import com.mm.blog.service.CommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: z_houx
 * @create: 2020-06-05 0:19
 * @Description:评论业务逻辑实现
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Resource
    private CommentMapper commentMapper;

    @Override
    public void save(Comment comment) throws BusinessException {
        commentMapper.save(comment);
    }

    @Override
    public void deleteById(Integer id) throws BusinessException {
        commentMapper.deleteById(id);
    }

    @Override
    public void updateById(Comment comment) throws BusinessException {
        commentMapper.updateById(comment);
    }

    @Override
    public Comment getById(Integer id) throws BusinessException {
        return commentMapper.getById(id);
    }

    @Override
    public List<Comment> getList() throws BusinessException {
        return commentMapper.getList();
    }
}
