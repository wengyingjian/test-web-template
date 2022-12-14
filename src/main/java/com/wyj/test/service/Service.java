package com.wyj.test.service;

import com.wyj.test.data.mapper.StrategyMapper;
import com.wyj.test.data.po.StrategyPO;
import org.redisson.api.RedissonClient;

import javax.annotation.Resource;

@org.springframework.stereotype.Service
public class Service {
    @Resource
    private StrategyMapper strategyMapper;

    @Resource
    private RedissonClient redissonClient;

    public void test1() {
        StrategyPO strategyPO = strategyMapper.selectByPrimaryKey(1L);
        System.out.println("1");

        redissonClient.getBucket("123").set("666");
        System.out.println("22");
    }
}
