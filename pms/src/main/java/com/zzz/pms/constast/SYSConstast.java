package com.zzz.pms.constast;

/**
 * 常量接口
 * @author LJH
 *
 */
public interface SYSConstast {

	/**
	 * 状态码
	 *
	 */
    Integer OK=200;
	Integer ERROR=-1;

	/**
	 * 用户默认密码
	 */
    String USER_DEFAULT_PWD="123456";

	/**
	 * 菜单权限类型
	 */
    String TYPE_MNEU = "menu";
	String TYPE_PERMISSION = "permission";
	/**
	 * 可以状态
	 */
    Object AVAILABLE_TRUE = 1;
	Object AVAILABLE_FALSE = 0;

	/**
	 * 用户类型
	 */
    Integer USER_TYPE_SUPER = 0;
	Integer USER_TYPE_NORMAL = 1;

	/**
	 * 展开类型
	 */
    Integer OPEN_TRUE = 1;
	Integer OPEN_FALSE = 0;

	/**
	 * 商品默认图片
	 */
    String IMAGES_DEFAULTGOODSIMG_PNG = "images/defaultgoodsimg.png";

}
