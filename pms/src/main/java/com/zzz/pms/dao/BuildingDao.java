package com.zzz.pms.dao;

import com.zzz.pms.entity.Building;
import com.zzz.pms.vo.BuildingVo;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Building)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-17 11:24:19
 */
public interface BuildingDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Building queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param building
     * @return 对象列表
     */
    List<Building> queryAll(Building building);

    /**
     * 新增数据
     *
     * @param building 实例对象
     * @return 影响行数
     */
    int insert(Building building);

    /**
     * 修改数据
     *
     * @param building 实例对象
     * @return 影响行数
     */
    int update(Building building);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}