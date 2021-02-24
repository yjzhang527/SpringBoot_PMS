package com.zzz.pms.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zzz.pms.entity.Complaint;
import com.zzz.pms.service.ComplaintService;
import com.zzz.pms.utils.ResultObj;
import com.zzz.pms.utils.TableDataInfo;
import com.zzz.pms.vo.ComplaintVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Complaint)表控制层
 *
 * @author makejava
 * @since 2021-02-18 12:01:13
 */
@RestController
@RequestMapping("complaint")
public class ComplaintController {
    /**
     * 服务对象
     */
    @Resource
    private ComplaintService complaintService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Complaint selectOne(Integer id) {
        return this.complaintService.queryById(id);
    }

    /**
     * 查询
     *
     * @param complaintVo
     * @return
     */
    @RequestMapping("queryAll")
    public TableDataInfo queryAll(ComplaintVo complaintVo) {
        Page<Object> page = PageHelper.startPage(complaintVo.getPage(), complaintVo.getLimit());
        List<Complaint> data = this.complaintService.queryAll(complaintVo);
        TableDataInfo dataInfo = new TableDataInfo(page.getTotal(), data);
        return dataInfo;
    }

    /**
     * 添加
     *
     * @param complaintVo
     * @return
     */
    @RequestMapping("addComplaint")
    public ResultObj addComplaint(ComplaintVo complaintVo) {
        try {
            complaintService.insert(complaintVo);
            return new ResultObj(200, "添加成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResultObj(-1, "添加失败");
    }

    /**
     * 删除
     *
     * @param complaintVo
     * @return
     */
    @RequestMapping("deleteById")
    public ResultObj deleteById(ComplaintVo complaintVo) {
        try {
            complaintService.deleteById(complaintVo.getId());
            return new ResultObj(200, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResultObj(-1, "删除失败");
    }


    /**
     * 更新
     *
     * @param complaintVo
     * @return
     */
    @RequestMapping("update")
    public ResultObj update(ComplaintVo complaintVo) {
        try {
            complaintService.update(complaintVo);
            return new ResultObj(200, "更新成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResultObj(-1, "更新失败");
    }

}