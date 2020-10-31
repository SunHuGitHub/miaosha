package com.miaoshaproject;

import com.miaoshaproject.dao.UserDOMapper;
import com.miaoshaproject.dataobject.UserDO;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication(scanBasePackages = {"com.miaoshaproject"})
@Controller
@MapperScan("com.miaoshaproject.dao")
public class MiaoshaApplication {

    @Autowired
    private UserDOMapper userDOMapper;


    public static void main(String[] args) {
        SpringApplication.run(MiaoshaApplication.class, args);
    }

    @GetMapping("/")
    @ResponseBody
    private UserDO init() {
        UserDO userDO = userDOMapper.selectByPrimaryKey(1);
        if (null == userDO) {
            return null;
        } else {
          return userDO;
        }
    }
}
