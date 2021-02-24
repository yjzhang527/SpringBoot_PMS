package com.zzz.pms.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zzz.pms.entity.House;
import com.zzz.pms.service.HouseService;
import com.zzz.pms.utils.ResultObj;
import com.zzz.pms.utils.TableDataInfo;
import com.zzz.pms.vo.HouseVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (House)表控制层
 *
 * @author makejava
 * @since 2021-02-18 20:45:28
 */
@RestController
@RequestMapping("house")
public class HouseController {
    /**
     * 服务对象
     */
    @Resource
    private HouseService houseService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public House selectOne(Integer id) {
        return this.houseService.queryById(id);
    }

    /**
     * 查询
     *
     * @param houseVo
     * @return
     */
    @RequestMapping("queryAll")
    public TableDataInfo queryAll(HouseVo houseVo) {
        Page<Object> page = PageHelper.startPage(houseVo.getPage(), houseVo.getLimit());
        List<House> data = this.houseService.queryAll(houseVo);
        TableDataInfo dataInfo = new TableDataInfo(page.getTotal(), data);
        return dataInfo;
    }

    /**
     * 添加
     *
     * @param houseVo
     * @return
     */
    @RequestMapping("addHouse")
    public ResultObj addhouse(HouseVo houseVo) {
        try {
            houseService.insert(houseVo);
            return new ResultObj(200, "添加成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResultObj(-1, "添加失败");
    }

    /**
     * 删除
     *
     * @param houseVo
     * @return
     */
    @RequestMapping("deleteById")
    public ResultObj deleteById(HouseVo houseVo) {
        try {
            houseService.deleteById(houseVo.getId());
            return new ResultObj(200, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResultObj(-1, "删除失败");
    }


    /**
     * 更新
     *
     * @param houseVo
     * @return
     */
    @RequestMapping("update")
    public ResultObj update(HouseVo houseVo) {
        try {
            houseService.update(houseVo);
            return new ResultObj(200, "更新成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResultObj(-1, "更新失败");
    }

}