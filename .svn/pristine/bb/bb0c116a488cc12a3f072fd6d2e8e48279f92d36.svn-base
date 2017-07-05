package cn.hrms.personnel.dao.impl;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import cn.hrms.personnel.dao.ArchivesAuditDao;
import cn.hrms.personnel.entity.ArchivesAudit;

public class ArchivesAuditDaoImpl extends SqlSessionDaoSupport implements ArchivesAuditDao{

	public ArchivesAudit findArchivesAudit(Integer id) {
		return super.getSqlSession().selectOne("cn.hrms.personnel.entity.ArchivesAudit.findArchivesAuditByID", id);
	}

	public Integer addArchivesAudit(ArchivesAudit archivesAudit) {
		return super.getSqlSession().insert("cn.hrms.personnel.entity.ArchivesAudit.addArchivesAudit", archivesAudit);
	}

	public Integer updArchivesAudit(ArchivesAudit archivesAudit) {
		return super.getSqlSession().update("cn.hrms.personnel.entity.ArchivesAudit.updArchivesAudit", archivesAudit);
	}

	public Integer delArchivesAudit(Integer id) {
		return super.getSqlSession().delete("cn.hrms.personnel.entity.ArchivesAudit.delArchivesAudit", id);
	}

}
