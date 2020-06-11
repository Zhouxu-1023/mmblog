package com.mm.blog.service;

import com.mm.blog.exception.BusinessException;
import com.mm.blog.pojo.Replay;

import java.util.List;

/**
 * @author: z_houx
 * @create: 2020-06-05 0:25
 * @Description:
 */
public interface ReplayService {


    /**
     * 添加
     *
     * @param replay
     */
    void save(Replay replay) throws BusinessException;

    /**
     * 删除指定回复
     *
     * @param id
     */
    void deleteById(Integer id) throws BusinessException;

    /**
     * 更新指定回复
     *
     * @param replay
     */
    void updateById(Replay replay) throws BusinessException;

    /**
     * 查询一个
     *
     * @param id
     * @return
     */
    Replay getById(Integer id) throws BusinessException;

    /**
     * 查询所有
     *
     * @return
     */
    List<Replay> getList() throws BusinessException;
}
