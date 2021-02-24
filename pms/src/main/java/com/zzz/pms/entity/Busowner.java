package com.zzz.pms.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * (Busowner)实体类
 *
 * @author makejava
 * @since 2021-02-16 10:39:16
 */
public class Busowner implements Serializable {
    private static final long serialVersionUID = -71535368339181169L;
    
    private Integer id;
    /**
    * 业主编号
    */
    private String busownnum;
    /**
    * 业主姓名
    */
    private String busownname;
    /**
    * 业主性别
    */
    private Integer busownsex;
    /**
    * 业主联系电话
    */
    private String busowntel;
    /**
    * 业主邮箱
    */
    private String busownemail;
    /**
    * 注册时间
    */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date rigtime;
    /**
    * 业主证件类型
    */
    private String idcardtype;
    /**
    * 业主证件号
    */
    private String idcard;
    /**
    * 购买房产日期
    */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date saleteim;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBusownnum() {
        return busownnum;
    }

    public void setBusownnum(String busownnum) {
        this.busownnum = busownnum;
    }

    public String getBusownname() {
        return busownname;
    }

    public void setBusownname(String busownname) {
        this.busownname = busownname;
    }

    public Integer getBusownsex() {
        return busownsex;
    }

    public void setBusownsex(Integer busownsex) {
        this.busownsex = busownsex;
    }

    public String getBusowntel() {
        return busowntel;
    }

    public void setBusowntel(String busowntel) {
        this.busowntel = busowntel;
    }

    public String getBusownemail() {
        return busownemail;
    }

    public void setBusownemail(String busownemail) {
        this.busownemail = busownemail;
    }

    public Date getRigtime() {
        return rigtime;
    }

    public void setRigtime(Date rigtime) {
        this.rigtime = rigtime;
    }

    public String getIdcardtype() {
        return idcardtype;
    }

    public void setIdcardtype(String idcardtype) {
        this.idcardtype = idcardtype;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public Date getSaleteim() {
        return saleteim;
    }

    public void setSaleteim(Date saleteim) {
        this.saleteim = saleteim;
    }

}