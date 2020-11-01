package com.miaoshaproject.dataobject;

import java.io.Serializable;

import lombok.Data;

/**
 * order_info
 *
 * @author
 */
@Data
public class OrderDO implements Serializable {
    private String id;

    private Integer userId;

    private Integer itemId;

    private Double itemPrice;

    private Integer amount;

    private Double orderPrice;

    private Integer promoId;

    private static final long serialVersionUID = 1L;
}