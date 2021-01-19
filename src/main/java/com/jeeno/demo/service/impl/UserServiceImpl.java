package com.jeeno.demo.service.impl;

import com.jeeno.demo.mapper.UserMapper;
import com.jeeno.demo.pojo.UserDO;
import com.jeeno.demo.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author JEENO
 * @version 0.0.1
 * @date 2021/1/13 15:19
 */
@Slf4j
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public UserDO findById(Long id) {
        return userMapper.selectById(id);
    }

    @Override
    public boolean add(UserDO userDO) {
        userDO.setId(null);
        return userMapper.insert(userDO)>0;
    }

    @Override
    public boolean edit(UserDO userDO) {
        return userMapper.updateById(userDO) > 0;
    }

    @Override
    public boolean del(Long id) {
        return userMapper.deleteById(id)>0;
    }

    @Override
    public List<UserDO> findByWorkTitle(String workTitle) {
        return userMapper.selectByWorkTitle(workTitle);
    }

    @Override
    public UserDO findByName(String name) {
        return userMapper.findByName(name);
    }

    @Override
    public List<UserDO> findByWorkTitleUsingXml(String workTitle) {
        return userMapper.selectByWorkTitleUsingXml(workTitle);
    }
}
