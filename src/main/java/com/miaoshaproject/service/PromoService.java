package com.miaoshaproject.service;

import com.miaoshaproject.service.model.PromoModel;

/**
 * @author Tiger
 * @date 2020/11/1 9:39
 */
public interface PromoService {
    //根据itemid获取即将进行的或正在进行的秒杀活动
    PromoModel getPromoByItemId(Integer itemId);
}
