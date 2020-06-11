package com.mm.blog.service.impl;

import com.mm.blog.exception.BusinessException;
import com.mm.blog.mapper.ReplayMapper;
import com.mm.blog.pojo.Replay;
import com.mm.blog.service.ReplayService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: z_houx
 * @create: 2020-06-05 0:26
 * @Description:回复业务逻辑实现
 */
@Service
public class ReplayServiceImpl implements ReplayService {

    @Resource
    private ReplayMapper replayMapper;

    @Override
    public void save(Replay replay) throws BusinessException {
        replayMapper.save(replay);
    }

    @Override
    public void deleteById(Integer id) throws BusinessException {
        replayMapper.deleteById(id);
    }

    @Override
    public void updateById(Replay replay) throws BusinessException {
        replayMapper.updateById(replay);
    }

    @Override
    public Replay getById(Integer id) throws BusinessException {
        return replayMapper.getById(id);
    }

    @Override
    public List<Replay> getList() throws BusinessException {
        return replayMapper.getList();
    }
}
