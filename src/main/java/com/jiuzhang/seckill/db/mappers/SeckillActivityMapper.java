package com.jiuzhang.seckill.db.mappers;

import com.jiuzhang.seckill.db.po.SeckillActivity;

import java.util.List;

public interface SeckillActivityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SeckillActivity record);

    int insertSelective(SeckillActivity record);

    SeckillActivity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SeckillActivity record);

    int updateByPrimaryKey(SeckillActivity record);

    List<SeckillActivity> querySeckillActivitysByStatus(int status);

    int lockStock(long activityId);

    int deductStock(Long seckillActivityId);

    void revertStock(Long seckillActivityId);
}