package cn.hrms.sysset.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.hrms.sysset.dao.PropertyDao;
import cn.hrms.sysset.entity.Property;
import cn.hrms.util.Page;

public class PropertyDaoImpl extends SqlSessionDaoSupport implements PropertyDao {

	public List<Property> findPro(Property pro, Page<Property> page) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("pro", pro);
		params.put("start", (page.getCurrPageNo()-1)*page.getPageSize());
		params.put("pageSize", page.getPageSize());
		return this.getSqlSession().selectList("cn.hrms.sysset.entity.Property.findPro", params);
	}

	public Property findProById(Integer id) {
		return this.getSqlSession().selectOne("cn.hrms.sysset.entity.Property.findProById", id);
	}

	public int proCount(Property pro) {
		return this.getSqlSession().selectOne("cn.hrms.sysset.entity.Property.proCount", pro);
	}

	public int addPro(Property pro) {
		return this.getSqlSession().insert("cn.hrms.sysset.entity.Property.addPro", pro);
	}

	public int delPro(Integer id) {
		return this.getSqlSession().delete("cn.hrms.sysset.entity.Property.delPro", id);
	}

	public int updPro(Property pro) {
		return this.getSqlSession().update("cn.hrms.sysset.entity.Property.updPro", pro);
	}

}
