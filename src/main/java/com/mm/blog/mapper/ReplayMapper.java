package com.mm.blog.mapper;

import com.mm.blog.pojo.Replay;

import java.util.List;

/**
 * @author: z_houx
 * @create: 2020-06-05 0:23
 * @Description:
 */
public interface ReplayMapper {

    /**
     * 添加
     * @param replay
     */
    void save(Replay replay);

    /**
     * 删除指定回复
     * @param id
     */
    void deleteById(Integer id);

    /**
     * 更新指定回复
     * @param replay
     */
    void updateById(Replay replay);

    /**
     * 查询一个
     *
     * @param id
     * @return
     */
    Replay getById(Integer id);

    /**
     * 查询所有
     *
     * @return
     */
    List<Replay> getList();
}
