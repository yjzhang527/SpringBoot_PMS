package com.zzz.pms.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zzz.pms.entity.House;
import com.zzz.pms.entity.Parkingspace;
import com.zzz.pms.service.ParkingspaceService;
import com.zzz.pms.utils.ResultObj;
import com.zzz.pms.utils.TableDataInfo;
import com.zzz.pms.vo.HouseVo;
import com.zzz.pms.vo.ParkingVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Parkingspace)表控制层
 *
 * @author makejava
 * @since 2021-02-18 21:31:09
 */
@RestController
@RequestMapping("parkingspace")
public class ParkingspaceController {
    /**
     * 服务对象
     */
    @Resource
    private ParkingspaceService parkingspaceService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Parkingspace selectOne(Integer id) {
        return this.parkingspaceService.queryById(id);
    }

    /**
     * 查询
     *
     * @param parkingVo
     * @return
     */
    @RequestMapping("queryAll")
    public TableDataInfo queryAll(ParkingVo parkingVo) {
        Page<Object> page = PageHelper.startPage(parkingVo.getPage(), parkingVo.getLimit());
        List<Parkingspace> data = this.parkingspaceService.queryAll(parkingVo);
        TableDataInfo dataInfo = new TableDataInfo(page.getTotal(), data);
        return dataInfo;
    }

    /**
     * 添加
     *
     * @param parkingVo
     * @return
     */
    @RequestMapping("addParking")
    public ResultObj addParking(ParkingVo parkingVo) {
        try {
            parkingspaceService.insert(parkingVo);
            return new ResultObj(200, "添加成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResultObj(-1, "添加失败");
    }

    /**
     * 删除
     *
     * @param parkingVo
     * @return
     */
    @RequestMapping("deleteById")
    public ResultObj deleteById(ParkingVo parkingVo) {
        try {
            parkingspaceService.deleteById(parkingVo.getId());
            return new ResultObj(200, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResultObj(-1, "删除失败");
    }


    /**
     * 更新
     *
     * @param parkingVo
     * @return
     */
    @RequestMapping("update")
    public ResultObj update(ParkingVo parkingVo) {
        try {
            parkingspaceService.update(parkingVo);
            return new ResultObj(200, "更新成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResultObj(-1, "更新失败");
    }

}