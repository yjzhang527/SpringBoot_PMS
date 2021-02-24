package com.zzz.pms.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zzz.pms.entity.Building;
import com.zzz.pms.entity.Busowner;
import com.zzz.pms.service.BuildingService;
import com.zzz.pms.utils.ResultObj;
import com.zzz.pms.utils.TableDataInfo;
import com.zzz.pms.vo.BuildingVo;
import com.zzz.pms.vo.BusOwnerVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Building)表控制层
 *
 * @author makejava
 * @since 2021-02-17 10:47:24
 */
@RestController
@RequestMapping("building")
public class BuildingController {
    /**
     * 服务对象
     */
    @Resource
    private BuildingService buildingService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Building selectOne(Integer id) {
        return this.buildingService.queryById(id);
    }

    /**
     * 查询
     *
     * @param buildingVo
     * @return
     */
    @RequestMapping("queryAll")
    public TableDataInfo queryAll(BuildingVo buildingVo) {
        Page<Building> page = PageHelper.startPage(buildingVo.getPage(), buildingVo.getLimit());
        List<Building> data = this.buildingService.queryAll(buildingVo);
        TableDataInfo dataInfo = new TableDataInfo(page.getTotal(), data);
        return dataInfo;
    }


    /**
     * 添加
     *
     * @param buildingVo
     * @return
     */
    @RequestMapping("addBuilding")
    public ResultObj addBuilding(BuildingVo buildingVo) {
        try {
            buildingService.insert(buildingVo);
            return new ResultObj(200, "添加成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResultObj(-1, "添加失败");
    }

    /**
     * 删除
     *
     * @param buildingVo
     * @return
     */
    @RequestMapping("deleteById")
    public ResultObj deleteById(BuildingVo buildingVo) {
        try {
            buildingService.deleteById(buildingVo.getId());
            return new ResultObj(200, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResultObj(-1, "删除失败");
    }


    /**
     * 更新
     *
     * @param buildingVo
     * @return
     */
    @RequestMapping("update")
    public ResultObj update(BuildingVo buildingVo) {
        try {
            buildingService.update(buildingVo);
            return new ResultObj(200, "更新成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResultObj(-1, "更新失败");
    }
}