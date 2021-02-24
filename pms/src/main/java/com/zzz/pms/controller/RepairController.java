package com.zzz.pms.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zzz.pms.entity.Repair;
import com.zzz.pms.service.RepairService;
import com.zzz.pms.utils.ResultObj;
import com.zzz.pms.utils.TableDataInfo;
import com.zzz.pms.vo.RepairVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Repair)表控制层
 *
 * @author makejava
 * @since 2021-02-18 21:45:27
 */
@RestController
@RequestMapping("repair")
public class RepairController {
    /**
     * 服务对象
     */
    @Resource
    private RepairService repairService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Repair selectOne(Integer id) {
        return this.repairService.queryById(id);
    }

    /**
     * 查询
     *
     * @param repairVo
     * @return
     */
    @RequestMapping("queryAll")
    public TableDataInfo queryAll(RepairVo repairVo) {
        Page<Object> page = PageHelper.startPage(repairVo.getPage(), repairVo.getLimit());
        List<Repair> data = this.repairService.queryAll(repairVo);
        TableDataInfo dataInfo = new TableDataInfo(page.getTotal(), data);
        return dataInfo;
    }

    /**
     * 添加
     *
     * @param repairVo
     * @return
     */
    @RequestMapping("addRepair")
    public ResultObj addRepair(RepairVo repairVo) {
        try {
            repairService.insert(repairVo);
            return new ResultObj(200, "添加成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResultObj(-1, "添加失败");
    }

    /**
     * 删除
     *
     * @param repairVo
     * @return
     */
    @RequestMapping("deleteById")
    public ResultObj deleteById(RepairVo repairVo) {
        try {
            repairService.deleteById(repairVo.getId());
            return new ResultObj(200, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResultObj(-1, "删除失败");
    }


    /**
     * 更新
     *
     * @param repairVo
     * @return
     */
    @RequestMapping("update")
    public ResultObj update(RepairVo repairVo) {
        try {
            repairService.update(repairVo);
            return new ResultObj(200, "更新成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResultObj(-1, "更新失败");
    }
}