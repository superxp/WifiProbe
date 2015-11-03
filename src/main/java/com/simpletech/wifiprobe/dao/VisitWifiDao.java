package com.simpletech.wifiprobe.dao;

import java.util.List;

import com.simpletech.wifiprobe.dao.base.BaseDao;
import com.simpletech.wifiprobe.model.VisitWifi;

/**
 * 数据库表t_visit_wifi的Dao接口
 * @author 树朾
 * @date 2015-11-03 17:09:44 中国标准时间
 */
public interface VisitWifiDao extends BaseDao<VisitWifi>{

	/**
	 * 插入一条新数据
	 * @param model 添加的数据
	 * @return 改变行数
	 */
	int insert(VisitWifi model) throws Exception;
	/**
	 * 根据ID删除
	 * @param id 主键ID
	 * @return 改变行数
	 */
	int delete(Object id) throws Exception;
	/**
	 * 更新一条数据
	 * @param model 需要更新数据
	 * @return 改变行数
	 */
	int update(VisitWifi model) throws Exception;
	/**
	 * 统计全部出数据
	 * @return 全部数据量
	 */
	int countAll() throws Exception;
	/**
	 * 根据ID获取
	 * @param id 主键ID
	 * @return 数据对象 or null
	 */
	VisitWifi findById(Object id) throws Exception;
	/**
	 * 获取全部数据
	 * @return 全部所有数据
	 */
	List<VisitWifi> findAll() throws Exception;
	/**
	 * 分页查询数据
	 * @param limit 分页最大值
	 * @param start 开始编号
	 * @return 分页列表数据
	 */
	List<VisitWifi> findByPage(int limit,int start) throws Exception;
	

}
