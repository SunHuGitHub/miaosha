package com.miaoshaproject.service;


/**
 * @author Tiger
 * @date 2020/11/10 21:26
 * 封装本地缓存操作类
 */
public interface CacheService {
    //存方法
    void setCommonCache(String key,Object value);

    //取方法
    Object getFromCommonCache(String key);
}