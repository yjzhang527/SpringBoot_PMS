package com.zzz.pms.service;

import com.zzz.pms.entity.Building;
import com.zzz.pms.vo.BuildingVo;

import java.util.List;

/**
 * (Building)表服务接口
 *
 * @author makejava
 * @since 2021-02-17 11:24:21
 */
public interface BuildingService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Building queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param buildingVo
     * @return 对象列表
     */
    List<Building> queryAll(BuildingVo buildingVo);

    /**
     * 新增数据
     *
     * @param building 实例对象
     * @return 实例对象
     */
    Building insert(Building building);

    /**
     * 修改数据
     *
     * @param building 实例对象
     * @return 实例对象
     */
    Building update(Building building);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}