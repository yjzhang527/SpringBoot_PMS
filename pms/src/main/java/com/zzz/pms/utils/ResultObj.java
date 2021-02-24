package com.zzz.pms.utils;

import com.zzz.pms.constast.SYSConstast;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultObj {

	public static final ResultObj  LOGIN_SUCCESS=new ResultObj(SYSConstast.OK, "登陆成功");
	public static final ResultObj  LOGIN_ERROR_PASS=new ResultObj(SYSConstast.ERROR, "登陆失败,用户名或密码不正确");
	public static final ResultObj  LOGIN_ERROR_CODE=new ResultObj(SYSConstast.ERROR, "登陆失败,验证码不正确");

	public static final ResultObj  UPDATE_SUCCESS=new ResultObj(SYSConstast.OK, "更新成功");
	public static final ResultObj  UPDATE_ERROR=new ResultObj(SYSConstast.ERROR, "更新失败");

	public static final ResultObj  ADD_SUCCESS=new ResultObj(SYSConstast.OK, "添加成功");
	public static final ResultObj  ADD_ERROR=new ResultObj(SYSConstast.ERROR, "添加失败");

	public static final ResultObj  DELETE_SUCCESS=new ResultObj(SYSConstast.OK, "删除成功");
	public static final ResultObj  DELETE_ERROR=new ResultObj(SYSConstast.ERROR, "删除失败");

	public static final ResultObj  RESET_SUCCESS=new ResultObj(SYSConstast.OK, "重置成功");
	public static final ResultObj  RESET_ERROR=new ResultObj(SYSConstast.ERROR, "重置失败");

	public static final ResultObj  DISPATCH_SUCCESS=new ResultObj(SYSConstast.OK, "分配成功");
	public static final ResultObj  DISPATCH_ERROR=new ResultObj(SYSConstast.ERROR, "分配失败");

	public static final ResultObj  OPERATE_SUCCESS=new ResultObj(SYSConstast.OK, "操作成功");
	public static final ResultObj  OPERATE_ERROR=new ResultObj(SYSConstast.ERROR, "操作失败");
	private Integer code;
	private String msg;



}
