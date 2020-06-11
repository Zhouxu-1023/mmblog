package com.mm.blog.controller;

import com.mm.blog.dto.DataResult;
import com.mm.blog.exception.BusinessException;
import com.mm.blog.exception.ErrorType;
import com.mm.blog.pojo.Comment;
import com.mm.blog.service.CommentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: z_houx
 * @create: 2020-06-08 22:01
 * @Description:
 */
@RestController
@RequestMapping(value = "/blog")
@Api(value = "文章评论的接口")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping(value = "/comments")
    @ApiOperation(value = "添加评论的接口",notes = "添加评论的接口")
    public DataResult<Comment> save(@RequestBody Comment comment){
        DataResult<Comment> dataResult = new DataResult<>();
        try {
            commentService.save(comment);
            dataResult.setCode(ErrorType.SAVE_SUCCESS.getCode());
            dataResult.setMessage(ErrorType.SAVE_SUCCESS.getMsg());
        } catch (BusinessException e) {
            dataResult.setMessage(ErrorType.SAVE_FILED.getMsg());
            dataResult.setCode(ErrorType.SAVE_FILED.getCode());
        }
        return dataResult;
    }

    @PutMapping(value = "/comments/{id}")
    @ApiOperation(value = "修改评论的接口",notes = "修改评论的接口")
    public DataResult<Comment> updateCommentById(@RequestBody Comment comment){
        DataResult<Comment> dataResult = new DataResult<>();
        try {
            commentService.updateById(comment);
            dataResult.setCode(ErrorType.UPDATE_SUCCESS.getCode());
            dataResult.setMessage(ErrorType.UPDATE_SUCCESS.getMsg());
        } catch (BusinessException e) {
            dataResult.setMessage(ErrorType.UPDATE_FILED.getMsg());
            dataResult.setCode(ErrorType.UPDATE_FILED.getCode());
        }
        return dataResult;
    }

    @DeleteMapping(value = "/comments/{id}")
    @ApiOperation(value = "删除指定评论的接口",notes = "删除指定评论的接口")
    public DataResult<Comment> deleteById(@RequestParam Integer id){
        DataResult<Comment> dataResult = new DataResult<>();
        try {
            commentService.deleteById(id);
            dataResult.setCode(ErrorType.DELETE_SUCCESS.getCode());
            dataResult.setMessage(ErrorType.DELETE_SUCCESS.getMsg());
        } catch (BusinessException e) {
            dataResult.setMessage(ErrorType.DELETE_FILED.getMsg());
            dataResult.setCode(ErrorType.DELETE_FILED.getCode());
        }
        return dataResult;
    }

    @GetMapping(value = "/comments/{id}")
    @ApiOperation(value = "获取指定评论的接口",notes = "获取指定评论的接口")
    public DataResult<Comment> getCommentById(@RequestParam Integer id){
        DataResult<Comment> dataResult = new DataResult<>();
        try {
            Comment comment = commentService.getById(id);
            dataResult.setData(comment);
            dataResult.setCode(ErrorType.SAVE_SUCCESS.getCode());
            dataResult.setMessage(ErrorType.SAVE_SUCCESS.getMsg());
        } catch (BusinessException e) {
            dataResult.setMessage(ErrorType.SAVE_FILED.getMsg());
            dataResult.setCode(ErrorType.SAVE_FILED.getCode());
        }
        return dataResult;
    }

    @GetMapping(value = "/comments")
    @ApiOperation(value = "获取评论的接口",notes = "获取评论的接口")
    public DataResult<List<Comment>> getComment(){
        DataResult<List<Comment>> dataResult = new DataResult<>();
        try {
            List<Comment> commentList = commentService.getList();
            dataResult.setData(commentList);
            dataResult.setCode(ErrorType.SAVE_SUCCESS.getCode());
            dataResult.setMessage(ErrorType.SAVE_SUCCESS.getMsg());
        } catch (BusinessException e) {
            dataResult.setMessage(ErrorType.SAVE_FILED.getMsg());
            dataResult.setCode(ErrorType.SAVE_FILED.getCode());
        }
        return dataResult;
    }
}
