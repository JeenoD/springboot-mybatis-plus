package com.jeeno.demo.pojo;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;
import lombok.ToString;

/**
 * @author JEENO
 * @version 0.0.1
 * @date 2021/1/13 15:10
 */
@Data
@ToString
@TableName(value = "user_info")
public class UserDO {

    /**
     * 主键，并设置自增
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 地址
     */
    private String address;

    /**
     * 工作职称
     * xml-plus.configuration.map-underscore-to-camel-case 将db中下划线做驼峰处理
     */
    private String workTitle;
}
