package com.zzz.pms.service;

import com.zzz.pms.entity.Repair;
import com.zzz.pms.vo.RepairVo;

import java.util.List;

/**
 * (Repair)表服务接口
 *
 * @author makejava
 * @since 2021-02-18 21:45:27
 */
public interface RepairService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Repair queryById(Integer id);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param repairVo 实例对象
     * @return 对象列表
     */
    List<Repair> queryAll(RepairVo repairVo);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Repair> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param repair 实例对象
     * @return 实例对象
     */
    Repair insert(Repair repair);

    /**
     * 修改数据
     *
     * @param repair 实例对象
     * @return 实例对象
     */
    Repair update(Repair repair);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}