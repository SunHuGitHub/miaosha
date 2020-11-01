package com.miaoshaproject.dataobject;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * promo
 * @author 
 */
@Data
public class PromoDO implements Serializable {
    private Integer id;

    private String promoName;

    private Date startDate;

    private Integer itemId;

    private Double promoItemPrice;
    private Date endDate;

    private static final long serialVersionUID = 1L;
}