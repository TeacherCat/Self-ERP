package cn.hrms.recruit.action;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.hrms.recruit.biz.ReleasesBiz;
import cn.hrms.recruit.entity.Releases;
import cn.hrms.sysset.biz.DeptBiz;
import cn.hrms.sysset.entity.Dept;
import cn.hrms.util.Final;
import cn.hrms.util.Page;
import cn.hrms.util.Tools;

@Controller
public class ReleasesAction {

	private ReleasesBiz releasesBiz;
	private DeptBiz deptBiz;
	
	/**
	 * 职位发布列表
	 * @param releases 查询条件
	 * @param currPageNo 当前页
	 * @param model 传值
	 * @return
	 */
	@RequestMapping("releasesList")
	public String releasesList(Releases releases, Integer currPageNo, Model model){
		if(releases.getDept() == null || releases.getDept().getId() == 0){
			releases.setDept(null);
		}
		if(releases.getType() == null || "0".equals(releases.getType())){
			releases.setType(null);
		}
		if(releases.getEducation() == null || "0".equals(releases.getEducation())){
			releases.setEducation(null);
		}
		Page<Releases> page = new Page<Releases>();
		page.setTotalCount(releasesBiz.findTotalCount(releases));
		page.setPageTotalCount();
		if(currPageNo != null){
			page.setCurrPageNo(currPageNo);
		}
		page.setPageList(releasesBiz.findReleases(releases, page));
		model.addAttribute("page", page);
		model.addAttribute("releases", releases);
		model.addAttribute("deptList", deptBiz.findDept(new Dept()));
		return "jsp/recruit/releases/releasesList";
	}

	/**
	 * 发布职位
	 * @param releases 发布职位对象
	 * @param num 标识
	 * @param model 传值
	 * @return
	 */
	@RequestMapping("addReleases")
	public String addReleases(Releases releases, Integer num, Model model){
		if(num != null){
			List<Dept> deptList = deptBiz.findDept(null);
			model.addAttribute("deptList", deptList);
			return "jsp/recruit/releases/releasesAdd";
		}else{
			releases.setTime(Tools.getCurrTime());
			releasesBiz.addReleases(releases);
			model.addAttribute("msg", Final.addSuccess);
			return releasesList(new Releases(), 1, model);
		}
	}
	
	/**
	 * 修改职位发布
	 * @param releases 职位发布对象
	 * @param releasesID 标识
	 * @param model 传值
	 * @return
	 */
	@RequestMapping("updReleases")
	public String updReleases(Releases releases, Integer releasesID, Model model){
		if(releasesID != null){
			List<Dept> deptList = deptBiz.findDept(null);
			model.addAttribute("deptList", deptList);
			model.addAttribute("releases", releasesBiz.findReleasesByID(releasesID));
			return "jsp/recruit/releases/releasesUpd";
		}else{
			releasesBiz.updReleases(releases);
			model.addAttribute("msg", Final.updSuccess);
			return releasesList(new Releases(), 1, model);
		}
	}
	
	/**
	 * 删除职位发布
	 * @param releasesID 发布编号
	 * @param model 传值
	 * @return
	 */
	@RequestMapping("delReleases")
	public String delReleases(Integer releasesID, Model model){
		releasesBiz.delReleases(releasesID);
		model.addAttribute("msg", Final.delSuccess);
		return releasesList(new Releases(), 1, model);
	}
	
	/**
	 * 职位发布详情
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("detailReleases")
	public String detailReleases(Integer id,Model model){
		Releases releases = releasesBiz.findReleasesByID(id);
		model.addAttribute("releases", releases);
		return "jsp/recruit/releases/releasesDetail";
	}
	
	
	public void setReleasesBiz(ReleasesBiz releasesBiz) {
		this.releasesBiz = releasesBiz;
	}
	public void setDeptBiz(DeptBiz deptBiz) {
		this.deptBiz = deptBiz;
	}
	
}
