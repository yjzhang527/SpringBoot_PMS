package com.zzz.pms.service;

import com.zzz.pms.entity.Busowner;
import com.zzz.pms.utils.TableDataInfo;
import com.zzz.pms.vo.BusOwnerVo;

import java.util.List;

/**
 * (Busowner)表服务接口
 *
 * @author makejava
 * @since 2021-02-02 22:10:35
 */
public interface BusownerService {

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
     * @param busOwnerVo 实例对象
     * @return 对象列表
     */
    List<Busowner> queryAll(BusOwnerVo busOwnerVo);

    /**
     * 新增数据
     *
     * @param busowner 实例对象
     * @return 实例对象
     */
    void insert(Busowner busowner);

    /**
     * 修改数据
     *
     * @param busowner 实例对象
     * @return 实例对象
     */
    Busowner update(Busowner busowner);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}