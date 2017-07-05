package cn.hrms.sysset.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.hrms.sysset.dao.RoleDao;
import cn.hrms.sysset.entity.Role;

public class RoleDaoImpl extends SqlSessionDaoSupport implements RoleDao {

	@Override
	public List<Role> findRole() {
		return this.getSqlSession().selectList("cn.hrms.sysset.entity.Role.findRole");
	}

}
