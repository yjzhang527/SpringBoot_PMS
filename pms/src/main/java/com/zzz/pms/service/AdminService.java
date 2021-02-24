package com.zzz.pms.service;

import com.zzz.pms.entity.Admin;
import com.zzz.pms.utils.TableDataInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Admin)表服务接口
 *
 * @author makejava
 * @since 2021-02-02 17:12:37
 */
public interface AdminService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Admin queryById(Integer id);

    /**
     * @param loginName 登录名
     * @param pwd       登录密码
     * @return 实例对象
     */
    Admin login(@Param("loginname") String loginName, @Param("pwd") String pwd);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Admin> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param admin 实例对象
     * @return 实例对象
     */
    Admin insert(Admin admin);

    /**
     * 修改数据
     *
     * @param admin 实例对象
     * @return 实例对象
     */
    int update(Admin admin);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}