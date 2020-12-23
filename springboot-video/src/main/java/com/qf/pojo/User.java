package com.qf.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("user")
public class User {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String email;

    private String phoneNum;

    private String password;

    private String code;

    private String nickName;

    private String sex;

    private String birthday;

    private String address;

    private String imgUrl;

    private Date createtime;


}