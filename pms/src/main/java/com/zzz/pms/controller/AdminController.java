package com.zzz.pms.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.zzz.pms.entity.Admin;
import com.zzz.pms.service.AdminService;
import com.zzz.pms.utils.ResultObj;
import com.zzz.pms.utils.TableDataInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (Admin)表控制层
 *
 * @author makejava
 * @since 2021-02-02 17:12:37
 */
@Controller
@RequestMapping("admin")
public class AdminController {
    /**
     * 服务对象
     */
    @Resource
    private AdminService adminService;

    /**
     * 登录
     *
     * @param username
     * @param password
     * @param model
     * @return
     */
    @RequestMapping("toIndex")
    public String login(@Param("loginname") String username, @Param("pwd") String password, Model model) {
        String url = "";
        Admin admin = adminService.login(username, password);
        model.addAttribute("admin", admin);
        url = null != admin ? "index/index" : "index/login";
        return url;
    }

    /**
     * 根据id修改用户信息
     *
     * @param admin
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "updateAdmin")
    public ResultObj updateAdmin(Admin admin) {
        try {
            adminService.update(admin);
            return ResultObj.UPDATE_SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ResultObj.UPDATE_ERROR;
        }
    }

    /**
     * 修改密码
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "updatePwd")
    public ResultObj updatePwd(Integer id, @RequestBody String data) {
        try {
            Map map = JSON.parseObject(data);
            Admin admin = adminService.queryById(id);
            if (!admin.getPwd().equals(map.get("old_password")))
                return ResultObj.UPDATE_ERROR;

            if (!map.get("new_password").equals(map.get("again_password")))
                return ResultObj.UPDATE_ERROR;

            admin.setPwd(map.get("new_password").toString());
            adminService.update(admin);
            return ResultObj.UPDATE_SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ResultObj.UPDATE_ERROR;
        }
    }
}