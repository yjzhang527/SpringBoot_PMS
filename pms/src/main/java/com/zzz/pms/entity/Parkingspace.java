package com.zzz.pms.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * (Parkingspace)实体类
 *
 * @author makejava
 * @since 2021-02-18 21:31:09
 */
public class Parkingspace implements Serializable {
    private static final long serialVersionUID = -24670722110766511L;
    
    private Integer id;
    /**
    * 车位编号
    */
    private String parkingnum;
    /**
    * 车主编号
    */
    private String busownnum;
    /**
    * 车牌号码
    */
    private String carnumber;
    /**
    * 车辆颜色
    */
    private String carcolor;
    /**
    * 车辆出入卡编号
    */
    private String parkingcard;
    /**
    * 办理日期
    */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date createtime;
    /**
    * 经办人
    */
    private String createadmin;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParkingnum() {
        return parkingnum;
    }

    public void setParkingnum(String parkingnum) {
        this.parkingnum = parkingnum;
    }

    public String getBusownnum() {
        return busownnum;
    }

    public void setBusownnum(String busownnum) {
        this.busownnum = busownnum;
    }

    public String getCarnumber() {
        return carnumber;
    }

    public void setCarnumber(String carnumber) {
        this.carnumber = carnumber;
    }

    public String getCarcolor() {
        return carcolor;
    }

    public void setCarcolor(String carcolor) {
        this.carcolor = carcolor;
    }

    public String getParkingcard() {
        return parkingcard;
    }

    public void setParkingcard(String parkingcard) {
        this.parkingcard = parkingcard;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreateadmin() {
        return createadmin;
    }

    public void setCreateadmin(String createadmin) {
        this.createadmin = createadmin;
    }

}