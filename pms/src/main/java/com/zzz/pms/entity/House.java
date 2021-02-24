package com.zzz.pms.entity;

import java.io.Serializable;

/**
 * (House)实体类
 *
 * @author makejava
 * @since 2021-02-18 20:45:27
 */
public class House implements Serializable {
    private static final long serialVersionUID = 771744729052997773L;
    
    private Integer id;
    /**
    * 房屋编号
    */
    private String houseid;
    /**
    * 所属楼栋
    */
    private Integer buildid;
    /**
    * 房屋面积
    */
    private Integer acreage;
    /**
    * 房屋朝向
    */
    private String direction;
    /**
    * 房屋楼层
    */
    private Integer floorsnum;
    /**
    * 房屋单元号
    */
    private Integer unitnum;
    /**
    * 房屋类型
    */
    private String type;
    /**
    * 房屋产权
    */
    private Integer property;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHouseid() {
        return houseid;
    }

    public void setHouseid(String houseid) {
        this.houseid = houseid;
    }

    public Integer getBuildid() {
        return buildid;
    }

    public void setBuildid(Integer buildid) {
        this.buildid = buildid;
    }

    public Integer getAcreage() {
        return acreage;
    }

    public void setAcreage(Integer acreage) {
        this.acreage = acreage;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Integer getFloorsnum() {
        return floorsnum;
    }

    public void setFloorsnum(Integer floorsnum) {
        this.floorsnum = floorsnum;
    }

    public Integer getUnitnum() {
        return unitnum;
    }

    public void setUnitnum(Integer unitnum) {
        this.unitnum = unitnum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getProperty() {
        return property;
    }

    public void setProperty(Integer property) {
        this.property = property;
    }

}