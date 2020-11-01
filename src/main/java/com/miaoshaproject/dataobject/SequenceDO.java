package com.miaoshaproject.dataobject;

import java.io.Serializable;
import lombok.Data;

/**
 * sequence_info
 * @author 
 */
@Data
public class SequenceDO implements Serializable {
    private String name;

    private Integer currentValue;

    private Integer step;

    private static final long serialVersionUID = 1L;
}