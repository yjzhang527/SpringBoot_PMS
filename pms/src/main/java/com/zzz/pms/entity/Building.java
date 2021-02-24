package com.zzz.pms.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * (Building)实体类
 *
 * @author makejava
 * @since 2021-02-17 11:24:15
 */
public class Building implements Serializable {
    private static final long serialVersionUID = -62636137994367301L;
    
    private Integer id;
    /**
    * 楼栋号
    */
    private String buildId;
    /**
    * 楼栋名称
    */
    private String buildname;
    /**
    * 楼层高度
    */
    private Integer buildheight;
    /**
    * 层数
    */
    private Integer floors;
    /**
    * 房屋数量
    */
    private Integer housenum;
    /**
    * 住户数量
    */
    private Integer residentnum;
    /**
    * 建成时间
    */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date buildtime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBuildid() {
        return buildId;
    }

    public void setBuildid(String buildid) {
        this.buildId = buildid;
    }

    public String getBuildname() {
        return buildname;
    }

    public void setBuildname(String buildname) {
        this.buildname = buildname;
    }

    public Integer getBuildheight() {
        return buildheight;
    }

    public void setBuildheight(Integer buildheight) {
        this.buildheight = buildheight;
    }

    public Integer getFloors() {
        return floors;
    }

    public void setFloors(Integer floors) {
        this.floors = floors;
    }

    public Integer getHousenum() {
        return housenum;
    }

    public void setHousenum(Integer housenum) {
        this.housenum = housenum;
    }

    public Integer getResidentnum() {
        return residentnum;
    }

    public void setResidentnum(Integer residentnum) {
        this.residentnum = residentnum;
    }

    public Date getBuildtime() {
        return buildtime;
    }

    public void setBuildtime(Date buildtime) {
        this.buildtime = buildtime;
    }

}