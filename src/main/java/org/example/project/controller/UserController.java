package org.example.project.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.example.project.entity.User;
import org.example.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.ParseException;
import java.util.List;

@RestController
@Api("班组类型,组织设置接口")
@RequestMapping("/userWork")
public class UserController {
    @Autowired
    UserService userService;

    /**
     * 新增用户
     */
    @PostMapping("/addUser")
    @ApiOperation("新增用户")
    public User addAffair(@RequestBody @Valid @ApiParam(name = "用户对象", value = "传入json格式", required = true) User user) throws ParseException {
        userService.save(user);
        return user;
    }

    /**
     * 获取所有用户
     */
    @GetMapping("/getAllUser")
    @ApiOperation("获取所有用户")
    public List<User> getAllOrg() {
        List<User> list = userService.list();
        return list;
    }

}
