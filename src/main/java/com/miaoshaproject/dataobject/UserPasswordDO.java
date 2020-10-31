package com.miaoshaproject.dataobject;

import java.io.Serializable;
import lombok.Data;

/**
 * user_password
 * @author 
 */
@Data
public class UserPasswordDO implements Serializable {
    private Integer id;

    private String encrptPassword;

    private Integer userId;

    private static final long serialVersionUID = 1L;
}