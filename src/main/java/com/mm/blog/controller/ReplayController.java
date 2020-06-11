package com.mm.blog.controller;

import com.mm.blog.dto.DataResult;
import com.mm.blog.exception.BusinessException;
import com.mm.blog.exception.ErrorType;
import com.mm.blog.pojo.Comment;
import com.mm.blog.pojo.Replay;
import com.mm.blog.service.ReplayService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: z_houx
 * @create: 2020-06-08 22:02
 * @Description:
 */
@RestController
@RequestMapping(value = "/blog")
@Api(value = "评论回复的接口")
public class ReplayController {

    @Autowired
    private ReplayService replayService;

    @PostMapping(value = "/replays")
    @ApiOperation(value = "添加评论的接口",notes = "添加评论的接口")
    public DataResult<Replay> save(@RequestBody Replay replay){
        DataResult<Replay> dataResult = new DataResult<>();
        try {
            replayService.save(replay);
            dataResult.setCode(ErrorType.SAVE_SUCCESS.getCode());
            dataResult.setMessage(ErrorType.SAVE_SUCCESS.getMsg());
        } catch (BusinessException e) {
            dataResult.setMessage(ErrorType.SAVE_FILED.getMsg());
            dataResult.setCode(ErrorType.SAVE_FILED.getCode());
        }
        return dataResult;
    }

    @PutMapping(value = "/replays/{id}")
    @ApiOperation(value = "修改评论的接口",notes = "修改评论的接口")
    public DataResult<Replay> updateReplayById(@RequestBody Replay replay){
        DataResult<Replay> dataResult = new DataResult<>();
        try {
            replayService.updateById(replay);
            dataResult.setCode(ErrorType.UPDATE_SUCCESS.getCode());
            dataResult.setMessage(ErrorType.UPDATE_SUCCESS.getMsg());
        } catch (BusinessException e) {
            dataResult.setMessage(ErrorType.UPDATE_FILED.getMsg());
            dataResult.setCode(ErrorType.UPDATE_FILED.getCode());
        }
        return dataResult;
    }

    @DeleteMapping(value = "/replays/{id}")
    @ApiOperation(value = "删除指定评论的接口",notes = "删除指定评论的接口")
    public DataResult<Replay> deleteById(@RequestParam Integer id){
        DataResult<Replay> dataResult = new DataResult<>();
        try {
            replayService.deleteById(id);
            dataResult.setCode(ErrorType.DELETE_SUCCESS.getCode());
            dataResult.setMessage(ErrorType.DELETE_SUCCESS.getMsg());
        } catch (BusinessException e) {
            dataResult.setMessage(ErrorType.DELETE_FILED.getMsg());
            dataResult.setCode(ErrorType.DELETE_FILED.getCode());
        }
        return dataResult;
    }

    @GetMapping(value = "/replays/{id}")
    @ApiOperation(value = "获取指定评论的接口",notes = "获取指定评论的接口")
    public DataResult<Replay> getReplayById(@RequestParam Integer id){
        DataResult<Replay> dataResult = new DataResult<>();
        try {
            Replay replay = replayService.getById(id);
            dataResult.setData(replay);
            dataResult.setCode(ErrorType.SAVE_SUCCESS.getCode());
            dataResult.setMessage(ErrorType.SAVE_SUCCESS.getMsg());
        } catch (BusinessException e) {
            dataResult.setMessage(ErrorType.SAVE_FILED.getMsg());
            dataResult.setCode(ErrorType.SAVE_FILED.getCode());
        }
        return dataResult;
    }

    @GetMapping(value = "/replays")
    @ApiOperation(value = "获取评论的接口",notes = "获取评论的接口")
    public DataResult<List<Replay>> getReplay(){
        DataResult<List<Replay>> dataResult = new DataResult<>();
        try {
            List<Replay> replayList = replayService.getList();
            dataResult.setData(replayList);
            dataResult.setCode(ErrorType.SAVE_SUCCESS.getCode());
            dataResult.setMessage(ErrorType.SAVE_SUCCESS.getMsg());
        } catch (BusinessException e) {
            dataResult.setMessage(ErrorType.SAVE_FILED.getMsg());
            dataResult.setCode(ErrorType.SAVE_FILED.getCode());
        }
        return dataResult;
    }
}
