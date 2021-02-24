package com.zzz.pms.service;

import com.zzz.pms.entity.Complaint;
import com.zzz.pms.vo.ComplaintVo;

import java.util.List;

/**
 * (Complaint)表服务接口
 *
 * @author makejava
 * @since 2021-02-18 12:01:12
 */
public interface ComplaintService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Complaint queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Complaint> queryAllByLimit(int offset, int limit);

    /**
     * 查询全部
     * @param complaintVo
     * @return
     */
    List<Complaint> queryAll(ComplaintVo complaintVo);

    /**
     * 新增数据
     *
     * @param complaint 实例对象
     * @return 实例对象
     */
    Complaint insert(Complaint complaint);

    /**
     * 修改数据
     *
     * @param complaint 实例对象
     * @return 实例对象
     */
    Complaint update(Complaint complaint);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}