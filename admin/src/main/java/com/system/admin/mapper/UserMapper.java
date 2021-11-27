package com.system.admin.mapper;


import org.springframework.stereotype.Repository;
import com.system.admin.entity.User;

import java.util.List;

@Repository
public interface UserMapper {

    List<User> query();
}
