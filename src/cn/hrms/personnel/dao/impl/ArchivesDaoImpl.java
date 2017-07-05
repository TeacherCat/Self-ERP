package cn.hrms.personnel.dao.impl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.hrms.personnel.dao.ArchivesDao;
import cn.hrms.personnel.entity.Archives;
import cn.hrms.util.Page;

public class ArchivesDaoImpl extends SqlSessionDaoSupport implements ArchivesDao{

	public List<Archives> findArchives(Archives archives, Page<Archives> page) {
		Map<String ,Object> params = new HashMap<String, Object>();
		params.put("archives", archives);
		params.put("start", ((page.getCurrPageNo()-1)*page.getPageSize()));
		params.put("size", page.getPageSize());
		return super.getSqlSession().selectList("cn.hrms.personnel.entity.Archives.findArchives",params);
	}

	public Integer findTotalCount(Archives archives) {
		return super.getSqlSession().selectOne("cn.hrms.personnel.entity.Archives.findTotalCount", archives);
	}

	public List<Archives> findArcByPost(Integer postId) {
		return super.getSqlSession().selectList("cn.hrms.personnel.entity.Archives.findArcByPost", postId);
	}

	public Integer addArchives(Archives archives) {
		return super.getSqlSession().insert("cn.hrms.personnel.entity.Archives.addArchives", archives);
	}

	public Integer updArchives(Archives archives) {
		return super.getSqlSession().update("cn.hrms.personnel.entity.Archives.updArchives", archives);
	}

	public Integer updArchivesState(Archives archives) {
		return super.getSqlSession().update("cn.hrms.personnel.entity.Archives.updArchivesState", archives);
	}

	public Integer delArchives(Integer id) {
		return super.getSqlSession().delete("cn.hrms.personnel.entity.Archives.delArchives", id);
	}

}
