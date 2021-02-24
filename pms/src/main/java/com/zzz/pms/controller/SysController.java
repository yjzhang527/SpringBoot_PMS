package com.zzz.pms.controller;

import com.zzz.pms.entity.Admin;
import com.zzz.pms.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * <p>
 * 首页控制器
 * <p>
 *
 * @Author: Zzz
 * @Date: 2021/2/2 18:16
 */
@Controller
@RequestMapping("sys")
public class SysController {

    @Resource
    private AdminService adminService;

    /**
     * 跳转到login页面
     *
     * @return login页面
     */
    @RequestMapping("toLogin")
    public String toLogin() {
        return "index/login";
    }

    /**
     * 跳转到welcome页面
     *
     * @return welcome页面
     */
    @RequestMapping("toWelcome")
    public String toWelcome() {
        return "index/welcome";
    }

    /**
     * 跳转到业主管理页面
     *
     * @return 业主管理页面
     */
    @RequestMapping("toPropertyManage")
    public String toPropertyManage() {
        return "property/propertyManage";
    }

    /**
     * 跳转到基本资料页面
     *
     * @return 基本资料页面
     */
    @RequestMapping("toUserSetting")
    public String toUserSetting(Model model, Integer id) {
        Admin admin = adminService.queryById(id);
        model.addAttribute("admin", admin);
        return "sys/user-setting";
    }

    /**
     * 跳转到修改密码页面
     *
     * @return 修改密码页面
     */
    @RequestMapping("toUserPwd")
    public String toUserPwd(Integer id, Model model) {
        model.addAttribute("id", id);
        return "sys/user-password";
    }

    /**
     * 跳转到添加页面
     *
     * @return 添加用户页面
     */
    @RequestMapping("toAdd")
    public String toAdd() {
        return "property/add";
    }

    /**
     * 编辑页面
     *
     * @return
     */
    @RequestMapping("toAddParameter")
    public String toAddParameter() {
        return "property/add";
    }

    /**
     * 跳转楼栋管理界面
     *
     * @return
     */
    @RequestMapping("toBuildManage")
    public String toBuildManage() {
        return "property/buildManage";
    }

    /**
     * 跳转房屋管理界面
     *
     * @return
     */
    @RequestMapping("toHouseManage")
    public String toHouseManage() {
        return "property/houseManage";
    }

    /**
     * 跳转车位管理界面
     *
     * @return
     */
    @RequestMapping("toParkingManage")
    public String toParkingManage() {
        return "property/parkingManage";
    }

    /**
     * 跳转报修管理界面
     *
     * @return
     */
    @RequestMapping("toRepairManage")
    public String toRepairManage() {
        return "property/repairManage";
    }

    /**
     * 跳转投诉管理界面
     *
     * @return
     */
    @RequestMapping("toComplaintManage")
    public String toComplaintManage() {
        return "property/complaintManage";
    }
}
