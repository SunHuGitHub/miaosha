package com.miaoshaproject.dataobject;

import java.io.Serializable;
import lombok.Data;

/**
 * item_stock
 * @author 
 */
@Data
public class ItemStockDO implements Serializable {
    private Integer id;

    private Integer stock;

    private Integer itemId;

    private static final long serialVersionUID = 1L;
}