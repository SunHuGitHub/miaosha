package com.miaoshaproject.dataobject;

import java.io.Serializable;
import lombok.Data;
import lombok.Getter;

/**
 * user_info
 * @author 
 */
@Data
public class UserDO implements Serializable {
    private Integer id;

    private String name;

    /**
     * 1男2女
     */
    private Byte gender;

    private Integer age;

    private String telphone;

    /**
     * bytelphone/bywechat/byaliplay
     */
    private String registerMode;

    private String thirdPartyId;

    private static final long serialVersionUID = 1L;
}