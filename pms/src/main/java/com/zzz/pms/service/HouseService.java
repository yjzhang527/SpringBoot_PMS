package com.zzz.pms.service;

import com.zzz.pms.entity.House;
import com.zzz.pms.vo.HouseVo;

import java.util.List;

/**
 * (House)表服务接口
 *
 * @author makejava
 * @since 2021-02-18 20:45:27
 */
public interface HouseService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    House queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<House> queryAllByLimit(int offset, int limit);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param houseVo 实例对象
     * @return 对象列表
     */
    List<House> queryAll(HouseVo houseVo);

    /**
     * 新增数据
     *
     * @param house 实例对象
     * @return 实例对象
     */
    House insert(House house);

    /**
     * 修改数据
     *
     * @param house 实例对象
     * @return 实例对象
     */
    House update(House house);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}