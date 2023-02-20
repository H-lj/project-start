package org.example.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.project.entity.User;
import org.example.project.mapper.UserMapper;
import org.example.project.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
