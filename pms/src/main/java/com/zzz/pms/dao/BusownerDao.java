package com.zzz.pms.dao;

import com.zzz.pms.entity.Busowner;

import java.util.List;

/**
 * (Busowner)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-02 22:10:35
 */
public interface BusownerDao {

    /**
     * 通过ID查询单条数据
     *
     * @param busownnum 主键
     * @return 实例对象
     */
    Busowner queryById(String busownnum);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param busowner 实例对象
     * @return 对象列表
     */
    List<Busowner> queryAll(Busowner busowner);

    /**
     * 新增数据
     *
     * @param busowner 实例对象
     * @return 影响行数
     */
    int insert(Busowner busowner);

    /**
     * 修改数据
     *
     * @param busowner 实例对象
     * @return 影响行数
     */
    int update(Busowner busowner);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}