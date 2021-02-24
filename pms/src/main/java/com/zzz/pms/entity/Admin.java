package com.zzz.pms.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.thymeleaf.util.DateUtils;

import java.io.Serializable;
import java.util.*;

/**
 * (Admin)实体类
 *
 * @author makejava
 * @since 2021-02-02 17:12:36
 */
@AllArgsConstructor
@NoArgsConstructor
public class Admin implements Serializable {
    private static final long serialVersionUID = -25581561023008549L;
    
    private Integer id;
    /**
    * 真实姓名
    */
    private String name;
    /**
    * 登录名
    */
    private String loginname;
    /**
    * 地址
    */
    private String address;
    /**
    * 性别
    */
    private Integer sex;
    /**
    * 职位备注
    */
    private String remark;
    /**
    * 登录密码
    */
    private String pwd;
    /**
    * 入职日期
    */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date hiredate;
    /**
    * 头像地址
    */
    private String imgpath;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getHiredate() {
        return DateUtils.format(hiredate, "yyyy-MM-dd",Locale.CHINA);
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    public static void main(String[] args) {
        System.out.println(Object.class.hashCode());
    }

}