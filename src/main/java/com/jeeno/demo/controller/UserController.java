package com.jeeno.demo.controller;

import com.jeeno.demo.pojo.UserDO;
import com.jeeno.demo.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author JEENO
 * @version 0.0.1
 * @date 2021/1/13 15:17
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;

    @GetMapping("/{id}")
    public UserDO findUser(@PathVariable Long id) {
        return userService.findById(id);
    }

    @PostMapping("")
    public String addUser(@RequestBody UserDO userDO){
        return userService.add(userDO)? "添加成功": "添加失败";
    }

    @PutMapping("")
    public String editUser(@RequestBody UserDO userDO) {
        return userService.edit(userDO)? "编辑成功" : "编辑失败";
    }

    @DeleteMapping("/{id}")
    public String delUser(@PathVariable Long id) {
        return userService.del(id)? "删除成功":"删除失败";
    }

    @GetMapping("/list/workTitle")
    public List<UserDO> findByWorkTitle(String workTitle) {
        return userService.findByWorkTitle(workTitle);
    }

    @GetMapping("/list/xml/workTitle")
    public List<UserDO> findByWorkTitleUsingXml(String workTitle) {
        return userService.findByWorkTitleUsingXml(workTitle);
    }

    @GetMapping("/name")
    public UserDO findByName(String name) {
        return userService.findByName(name);
    }
}
