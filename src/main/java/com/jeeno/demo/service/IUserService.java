package com.jeeno.demo.service;

import com.jeeno.demo.pojo.UserDO;

import java.util.List;

/**
 * @author JEENO
 * @version 0.0.1
 * @date 2021/1/13 15:18
 */
public interface IUserService {

    /**
     * 根据用户id查询用户信息
     * @param id 用户id
     * @return UserDO
     */
    UserDO findById(Long id);

    /**
     * 添加用户
     * @param userDO 用户信息
     * @return UserDO
     */
    boolean add(UserDO userDO);

    /**
     * 编辑用户
     * @param userDO 用户信息
     * @return UserDO
     */
    boolean edit(UserDO userDO);

    /**
     * 删除用户
     * @param id 用户id
     * @return String
     */
    boolean del(Long id);

    /**
     * 根据职称查找用户列表（注解方式）
     * @param workTitle 职称
     * @return List
     */
    List<UserDO> findByWorkTitle(String workTitle);

    /**
     * 根据用户名查找用户
     * @param name 用户名
     * @return UserDO
     */
    UserDO findByName(String name);

    /**
     * 根据职称查找用户列表（xml方式）
     * @param workTitle 职称
     * @return List
     */
    List<UserDO> findByWorkTitleUsingXml(String workTitle);
}
