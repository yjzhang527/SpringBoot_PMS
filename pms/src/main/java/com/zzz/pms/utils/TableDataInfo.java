package com.zzz.pms.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 *
 * <p>
 *
 * @Author: Zzz
 * @Date: 2021/2/2 21:24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TableDataInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 总记录数 */
    private long count;

    /** 列表数据 */
    private List<?> data;

    /** 消息状态码 */
    private int code;

    /** 消息内容 */
    private String msg;

    /**
     * 分页
     * @param count 列表数据
     * @param data 总记录数
     */
    public TableDataInfo(long count, List<?> data) {
        this.count = count;
        this.data = data;
    }
}
