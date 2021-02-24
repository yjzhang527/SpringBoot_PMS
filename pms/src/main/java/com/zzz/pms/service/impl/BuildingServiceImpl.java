package com.zzz.pms.service.impl;

import com.zzz.pms.entity.Building;
import com.zzz.pms.dao.BuildingDao;
import com.zzz.pms.service.BuildingService;
import com.zzz.pms.vo.BuildingVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Building)表服务实现类
 *
 * @author makejava
 * @since 2021-02-17 11:24:22
 */
@Service("buildingService")
public class BuildingServiceImpl implements BuildingService {
    @Resource
    private BuildingDao buildingDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Building queryById(Integer id) {
        return this.buildingDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param buildingVo
     * @return 对象列表
     */
    @Override
    public List<Building> queryAll(BuildingVo buildingVo) {
        return this.buildingDao.queryAll(buildingVo);
    }

    /**
     * 新增数据
     *
     * @param building 实例对象
     * @return 实例对象
     */
    @Override
    public Building insert(Building building) {
        this.buildingDao.insert(building);
        return building;
    }

    /**
     * 修改数据
     *
     * @param building 实例对象
     * @return 实例对象
     */
    @Override
    public Building update(Building building) {
        this.buildingDao.update(building);
        return this.queryById(building.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.buildingDao.deleteById(id) > 0;
    }
}