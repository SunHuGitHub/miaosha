package com.miaoshaproject.controller.viewobject;

import lombok.Data;

/**
 * @author Tiger
 * @date 2020/10/29 20:32
 */
@Data
public class UserVO {
    private Integer id;
    private String name;
    private Byte gender;
    private Integer age;
    private String telphone;
}