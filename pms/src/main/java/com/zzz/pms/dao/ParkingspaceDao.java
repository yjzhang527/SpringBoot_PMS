package com.zzz.pms.dao;

import com.zzz.pms.entity.Parkingspace;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Parkingspace)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-18 21:31:09
 */
public interface ParkingspaceDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Parkingspace queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Parkingspace> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param parkingspace 实例对象
     * @return 对象列表
     */
    List<Parkingspace> queryAll(Parkingspace parkingspace);

    /**
     * 新增数据
     *
     * @param parkingspace 实例对象
     * @return 影响行数
     */
    int insert(Parkingspace parkingspace);

    /**
     * 修改数据
     *
     * @param parkingspace 实例对象
     * @return 影响行数
     */
    int update(Parkingspace parkingspace);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}