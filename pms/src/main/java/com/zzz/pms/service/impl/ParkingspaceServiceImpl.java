package com.zzz.pms.service.impl;

import com.zzz.pms.entity.Parkingspace;
import com.zzz.pms.dao.ParkingspaceDao;
import com.zzz.pms.service.ParkingspaceService;
import com.zzz.pms.vo.ParkingVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Parkingspace)表服务实现类
 *
 * @author makejava
 * @since 2021-02-18 21:31:09
 */
@Service("parkingspaceService")
public class ParkingspaceServiceImpl implements ParkingspaceService {
    @Resource
    private ParkingspaceDao parkingspaceDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Parkingspace queryById(Integer id) {
        return this.parkingspaceDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Parkingspace> queryAllByLimit(int offset, int limit) {
        return this.parkingspaceDao.queryAllByLimit(offset, limit);
    }

    /**
     * 通过实体作为筛选条件查询
     *
     * @param parkingVo 实例对象
     * @return 对象列表
     */
    public List<Parkingspace> queryAll(ParkingVo parkingVo){
        return this.parkingspaceDao.queryAll(parkingVo);
    }

    /**
     * 新增数据
     *
     * @param parkingspace 实例对象
     * @return 实例对象
     */
    @Override
    public Parkingspace insert(Parkingspace parkingspace) {
        this.parkingspaceDao.insert(parkingspace);
        return parkingspace;
    }

    /**
     * 修改数据
     *
     * @param parkingspace 实例对象
     * @return 实例对象
     */
    @Override
    public Parkingspace update(Parkingspace parkingspace) {
        this.parkingspaceDao.update(parkingspace);
        return this.queryById(parkingspace.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.parkingspaceDao.deleteById(id) > 0;
    }
}