package com.zzz.pms.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * (Repair)实体类
 *
 * @author makejava
 * @since 2021-02-18 21:45:27
 */
public class Repair implements Serializable {
    private static final long serialVersionUID = -88874904860203957L;
    
    private Integer id;
    /**
    * 报修编号
    */
    private String repairid;
    /**
    * 居民编号
    */
    private String busownnum;
    /**
    * 报修内容
    */
    private String repaircontent;
    /**
    * 报修时间
    */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date createtime;
    /**
    * 维修人员
    */
    private String repairadmin;
    /**
    * 维修时间
    */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date repairtime;
    /**
    * 报修费用
    */
    private String repairfee;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRepairid() {
        return repairid;
    }

    public void setRepairid(String repairid) {
        this.repairid = repairid;
    }

    public String getBusownnum() {
        return busownnum;
    }

    public void setBusownnum(String busownnum) {
        this.busownnum = busownnum;
    }

    public String getRepaircontent() {
        return repaircontent;
    }

    public void setRepaircontent(String repaircontent) {
        this.repaircontent = repaircontent;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getRepairadmin() {
        return repairadmin;
    }

    public void setRepairadmin(String repairadmin) {
        this.repairadmin = repairadmin;
    }

    public Date getRepairtime() {
        return repairtime;
    }

    public void setRepairtime(Date repairtime) {
        this.repairtime = repairtime;
    }

    public String getRepairfee() {
        return repairfee;
    }

    public void setRepairfee(String repairfee) {
        this.repairfee = repairfee;
    }

}