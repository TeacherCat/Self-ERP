package cn.hrms.sysset.biz.impl;

import java.util.List;

import cn.hrms.sysset.biz.PropertyBiz;
import cn.hrms.sysset.dao.PropertyDao;
import cn.hrms.sysset.entity.Property;
import cn.hrms.util.Page;

public class PropertyBizImpl implements PropertyBiz{
	private PropertyDao propertyDao;

	public List<Property> findPro(Property pro, Page<Property> page) {
		return propertyDao.findPro(pro, page);
	}

	public Property findProById(Integer id) {
		return propertyDao.findProById(id);
	}

	public int proCount(Property pro) {
		return propertyDao.proCount(pro);
	}

	public int addPro(Property pro) {
		return propertyDao.addPro(pro);
	}

	public int delPro(Integer id) {
		return propertyDao.delPro(id);
	}

	public int updPro(Property pro) {
		return propertyDao.updPro(pro);
	}

	public void setPropertyDao(PropertyDao propertyDao) {
		this.propertyDao = propertyDao;
	}

}
