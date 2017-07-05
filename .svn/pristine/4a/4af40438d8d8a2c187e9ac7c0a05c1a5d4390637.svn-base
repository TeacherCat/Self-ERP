package cn.hrms.personnel.biz.impl;
import cn.hrms.personnel.biz.ArchivesAuditBiz;
import cn.hrms.personnel.dao.ArchivesAuditDao;
import cn.hrms.personnel.entity.ArchivesAudit;

public class ArchivesAuditBizImpl implements ArchivesAuditBiz{

	private ArchivesAuditDao archivesAuditDao;
	
	public ArchivesAudit findArchivesAudit(Integer id) {
		return archivesAuditDao.findArchivesAudit(id);
	}

	public Integer addArchivesAudit(ArchivesAudit archivesAudit) {
		return archivesAuditDao.addArchivesAudit(archivesAudit);
	}

	public Integer updArchivesAudit(ArchivesAudit archivesAudit) {
		return archivesAuditDao.updArchivesAudit(archivesAudit);
	}

	public Integer delArchivesAudit(Integer id) {
		return archivesAuditDao.delArchivesAudit(id);
	}

	
	public void setArchivesAuditDao(ArchivesAuditDao archivesAuditDao) {
		this.archivesAuditDao = archivesAuditDao;
	}
}
