package cn.hrms.recruit.biz.impl;
import java.util.List;
import cn.hrms.recruit.biz.ReleasesBiz;
import cn.hrms.recruit.dao.ReleasesDao;
import cn.hrms.recruit.entity.Releases;
import cn.hrms.util.Page;

public class ReleasesBizImpl implements ReleasesBiz {

	private ReleasesDao releasesDao;
	
	public Releases findReleasesByID(Integer id) {
		return releasesDao.findReleasesByID(id);
	}

	public List<Releases> findAllReleases(){
		return releasesDao.findAllReleases();
	}
	
	public List<Releases> findReleases(Releases releases, Page<Releases> page) {
		return releasesDao.findReleases(releases, page);
	}

	public Integer findTotalCount(Releases releases) {
		return releasesDao.findTotalCount(releases);
	}
	
	public Integer addReleases(Releases releases) {
		return releasesDao.addReleases(releases);
	}

	public Integer updReleases(Releases releases) {
		return releasesDao.updReleases(releases);
	}

	public Integer delReleases(Integer id) {
		return releasesDao.delReleases(id);
	}
	
	
	
	public void setReleasesDao(ReleasesDao releasesDao) {
		this.releasesDao = releasesDao;
	}

}
