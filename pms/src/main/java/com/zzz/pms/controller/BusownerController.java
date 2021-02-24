package com.zzz.pms.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zzz.pms.entity.Building;
import com.zzz.pms.entity.Busowner;
import com.zzz.pms.utils.ResultObj;
import com.zzz.pms.utils.TableDataInfo;
import com.zzz.pms.service.BusownerService;
import com.zzz.pms.vo.BusOwnerVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Busowner)表控制层
 *
 * @author makejava
 * @since 2021-02-02 22:10:35
 */
@RestController
@RequestMapping("busowner")
public class BusownerController {
    /**
     * 服务对象
     */
    @Resource
    private BusownerService busownerService;

    /**
     * 查询
     *
     * @param busOwnerVo
     * @return
     */
    @RequestMapping("queryAll")
    public TableDataInfo queryAll(BusOwnerVo busOwnerVo) {
        Page<Busowner> page = PageHelper.startPage(busOwnerVo.getPage(), busOwnerVo.getLimit());
        List<Busowner> data = this.busownerService.queryAll(busOwnerVo);
        TableDataInfo dataInfo = new TableDataInfo(page.getTotal(), data);
        return dataInfo;
    }

    /**
     * 添加
     *
     * @param busowner
     * @return
     */
    @RequestMapping("addBusOwner")
    public ResultObj addBusOwner(Busowner busowner) {
        try {
            this.busownerService.insert(busowner);
            return new ResultObj(200, "添加成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResultObj(-1, "添加失败");
    }

    /**
     * 删除
     *
     * @param busowner
     * @return
     */
    @RequestMapping("deleteById")
    public ResultObj deleteById(Busowner busowner) {
        try {
            this.busownerService.deleteById(busowner.getId());
            return new ResultObj(200, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResultObj(-1, "删除失败");
    }

    /**
     * 更新
     *
     * @param busOwnerVo
     * @return
     */
    @RequestMapping("updateBus")
    public ResultObj updateBus(BusOwnerVo busOwnerVo) {
        try {
            this.busownerService.update(busOwnerVo);
            return new ResultObj(200, "更新成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResultObj(-1, "更新失败");
    }


    /**
     * 删除
     *
     * @param busOwnerVo
     * @return
     */
    @RequestMapping("deleteBus")
    public ResultObj deleteBus(BusOwnerVo busOwnerVo) {
        try {
            this.busownerService.deleteById(busOwnerVo.getId());
            return new ResultObj(200, "更新成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResultObj(-1, "更新失败");
    }
}