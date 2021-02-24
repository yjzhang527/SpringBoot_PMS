package com.zzz.pms.service.impl;

import com.zzz.pms.entity.Repair;
import com.zzz.pms.dao.RepairDao;
import com.zzz.pms.service.RepairService;
import com.zzz.pms.vo.RepairVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Repair)表服务实现类
 *
 * @author makejava
 * @since 2021-02-18 21:45:27
 */
@Service("repairService")
public class RepairServiceImpl implements RepairService {
    @Resource
    private RepairDao repairDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Repair queryById(Integer id) {
        return this.repairDao.queryById(id);
    }

    /**
     * 通过实体作为筛选条件查询
     *
     * @param repairVo 实例对象
     * @return 对象列表
     */
    @Override
    public List<Repair> queryAll(RepairVo repairVo) {
        return this.repairDao.queryAll(repairVo);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Repair> queryAllByLimit(int offset, int limit) {
        return this.repairDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param repair 实例对象
     * @return 实例对象
     */
    @Override
    public Repair insert(Repair repair) {
        this.repairDao.insert(repair);
        return repair;
    }

    /**
     * 修改数据
     *
     * @param repair 实例对象
     * @return 实例对象
     */
    @Override
    public Repair update(Repair repair) {
        this.repairDao.update(repair);
        return this.queryById(repair.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.repairDao.deleteById(id) > 0;
    }
}