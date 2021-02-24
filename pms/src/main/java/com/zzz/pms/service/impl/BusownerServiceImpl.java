package com.zzz.pms.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zzz.pms.dao.BusownerDao;
import com.zzz.pms.entity.Busowner;
import com.zzz.pms.service.BusownerService;
import com.zzz.pms.utils.TableDataInfo;
import com.zzz.pms.vo.BusOwnerVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Busowner)表服务实现类
 *
 * @author makejava
 * @since 2021-02-02 22:10:35
 */
@Service("busownerService")
public class BusownerServiceImpl implements BusownerService {
    @Resource
    private BusownerDao busownerDao;

    /**
     * 通过ID查询单条数据
     *
     * @param busownnum 主键
     * @return 实例对象
     */
    @Override
    public Busowner queryById(String busownnum) {
        return this.busownerDao.queryById(busownnum);
    }

    /**
     * 查询数据
     *
     * @param busOwnerVo
     * @return
     */
    @Override
    public List<Busowner> queryAll(BusOwnerVo busOwnerVo) {
        return this.busownerDao.queryAll(busOwnerVo);
    }

    /**
     * 新增数据
     *
     * @param busowner 实例对象
     * @return 实例对象
     */
    @Override
    public void insert(Busowner busowner) {
        this.busownerDao.insert(busowner);
    }

    /**
     * 修改数据
     *
     * @param busowner 实例对象
     * @return 实例对象
     */
    @Override
    public Busowner update(Busowner busowner) {
        this.busownerDao.update(busowner);
        return this.queryById(busowner.getBusownnum());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    public boolean deleteById(Integer id) {
        return this.busownerDao.deleteById(id) > 0;
    }
}