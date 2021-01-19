package com.jeeno.demo.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jeeno.demo.pojo.UserDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author JEENO
 * @version 0.0.1
 * @date 2021/1/13 15:15
 */
@Mapper
public interface UserMapper extends BaseMapper<UserDO> {

    /**
     * 根据职称查找用户列表 (注解方式）
     * @param workTitle 职称
     * @return List
     */
    @Select(value = "select * from user_info where work_title = #{workTitle}")
    List<UserDO> selectByWorkTitle(String workTitle);

    /**
     * 根据用户名查找用户信息（xml方式）
     * @param name 用户名
     * @return List
     */
    UserDO findByName(String name);

    /**
     * 根据职称查找用户列表（xml方式）
     * @param workTitle 职称
     * @return List
     */
    List<UserDO> selectByWorkTitleUsingXml(String workTitle);
}
