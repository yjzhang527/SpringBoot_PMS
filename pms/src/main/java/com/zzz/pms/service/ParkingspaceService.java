package com.zzz.pms.service;

import com.zzz.pms.entity.Parkingspace;
import com.zzz.pms.vo.ParkingVo;

import java.util.List;

/**
 * (Parkingspace)表服务接口
 *
 * @author makejava
 * @since 2021-02-18 21:31:09
 */
public interface ParkingspaceService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Parkingspace queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Parkingspace> queryAllByLimit(int offset, int limit);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param parkingVo 实例对象
     * @return 对象列表
     */
    List<Parkingspace> queryAll(ParkingVo parkingVo);

    /**
     * 新增数据
     *
     * @param parkingspace 实例对象
     * @return 实例对象
     */
    Parkingspace insert(Parkingspace parkingspace);

    /**
     * 修改数据
     *
     * @param parkingspace 实例对象
     * @return 实例对象
     */
    Parkingspace update(Parkingspace parkingspace);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}