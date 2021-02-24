package com.zzz.pms.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * (Complaint)实体类
 *
 * @author makejava
 * @since 2021-02-18 12:01:12
 */
public class Complaint implements Serializable {
    private static final long serialVersionUID = 679504309556260046L;
    
    private Integer id;
    /**
    * 投诉编号
    */
    private String complainnum;
    /**
    * 居民编号
    */
    private String busownnum;
    /**
    * 投诉内容
    */
    private String conten;
    /**
    * 投诉反馈
    */
    private String feedback;
    /**
    * 投诉日期
    */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date complaintime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComplainnum() {
        return complainnum;
    }

    public void setComplainnum(String complainnum) {
        this.complainnum = complainnum;
    }

    public String getBusownnum() {
        return busownnum;
    }

    public void setBusownnum(String busownnum) {
        this.busownnum = busownnum;
    }

    public String getConten() {
        return conten;
    }

    public void setConten(String conten) {
        this.conten = conten;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public Date getComplaintime() {
        return complaintime;
    }

    public void setComplaintime(Date complaintime) {
        this.complaintime = complaintime;
    }

}