package com.zzz.pms.service.impl;

import com.zzz.pms.entity.Complaint;
import com.zzz.pms.dao.ComplaintDao;
import com.zzz.pms.service.ComplaintService;
import com.zzz.pms.vo.ComplaintVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Complaint)表服务实现类
 *
 * @author makejava
 * @since 2021-02-18 12:01:12
 */
@Service("complaintService")
public class ComplaintServiceImpl implements ComplaintService {
    @Resource
    private ComplaintDao complaintDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Complaint queryById(Integer id) {
        return this.complaintDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Complaint> queryAllByLimit(int offset, int limit) {
        return this.complaintDao.queryAllByLimit(offset, limit);
    }

    /**
     * 查询全部
     *
     * @param complaintVo
     * @return
     */
    @Override
    public List<Complaint> queryAll(ComplaintVo complaintVo) {
        return complaintDao.queryAll(complaintVo);
    }

    /**
     * 新增数据
     *
     * @param complaint 实例对象
     * @return 实例对象
     */
    @Override
    public Complaint insert(Complaint complaint) {
        this.complaintDao.insert(complaint);
        return complaint;
    }

    /**
     * 修改数据
     *
     * @param complaint 实例对象
     * @return 实例对象
     */
    @Override
    public Complaint update(Complaint complaint) {
        this.complaintDao.update(complaint);
        return this.queryById(complaint.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.complaintDao.deleteById(id) > 0;
    }
}