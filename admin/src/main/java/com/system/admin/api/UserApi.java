package com.system.admin.api;


import com.system.admin.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.system.admin.entity.User;
import java.util.List;

@RestController
public class UserApi {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/welcome")
    public String welcome(){
        return "------------------welcome！欢迎光临！-------------";
    }
    @GetMapping("/mybatis")
    public String mybatis(){
        List<User> userList = userMapper.query();
        return userList.toString();
    }

}
