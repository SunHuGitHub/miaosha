package com.miaoshaproject.service.impl;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.ItemService;
import com.miaoshaproject.service.model.ItemModel;
import com.miaoshaproject.validator.ValidatorImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Tiger
 * @date 2020/10/31 10:29
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    ValidatorImpl validator;


    @Override
    @Transactional(rollbackFor = BusinessException.class)
    public ItemModel createItem(ItemModel itemModel) throws BusinessException {
        //校验入参

        //model -> dataobject



        return null;
    }

    @Override
    public List<ItemModel> listItem() {
        return null;
    }

    @Override
    public ItemModel getItemById(Integer id) {
        return null;
    }

    @Override
    public boolean decreaseStock(Integer itemId, Integer amount) throws BusinessException {
        return false;
    }

    @Override
    public void increaseSales(Integer itemId, Integer amount) throws BusinessException {

    }
}
