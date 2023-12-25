package com.aliner.service.Impl;

import com.aliner.common.Result;
import com.aliner.mapper.UserMapper;
import com.aliner.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public Result getAllUser() {
        return new Result(200,userMapper.selectList(null));
    }
}
