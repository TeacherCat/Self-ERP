package cn.hrms.recruit.action;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.hrms.recruit.biz.HireBiz;
import cn.hrms.recruit.biz.ReleasesBiz;
import cn.hrms.recruit.biz.ResultBiz;
import cn.hrms.recruit.biz.ResumesBiz;
import cn.hrms.recruit.entity.Hire;
import cn.hrms.recruit.entity.Releases;
import cn.hrms.recruit.entity.Result;
import cn.hrms.recruit.entity.Resumes;
import cn.hrms.util.Final;
import cn.hrms.util.Page;
import cn.hrms.util.Tools;

@Controller
public class ResumesAction {

	private ResumesBiz resumesBiz;
	private ReleasesBiz releasesBiz;
	private ResultBiz resultBiz;
	private HireBiz hireBiz;
	
	/**
	 * 简历列表
	 * @param resumes 简历对象
	 * @param currPageNo 当前页
	 * @param model 传值
	 * @return
	 */
	@RequestMapping("resumesList")
	public String resumesList(Resumes resumes, Integer currPageNo, Model model){
		if("0".equals(resumes.getSex())){
			resumes.setSex(null);
		}
		if("0".equals(resumes.getAge())){
			resumes.setAge(null);
		}
		if("0".equals(resumes.getEducation())){
			resumes.setEducation(null);
		}
		if("0".equals(resumes.getState())){
			resumes.setState(null);
		}
		Page<Resumes> page = new Page<Resumes>();
		page.setTotalCount(resumesBiz.findTotalCount(resumes));
		page.setPageTotalCount();
		if(currPageNo != null){
			page.setCurrPageNo(currPageNo);
		}
		page.setPageList(resumesBiz.findResumes(resumes, page));
		model.addAttribute("page", page);
		model.addAttribute("resumes", resumes);
		return "jsp/recruit/resumes/resumesList";
	}
	
	/**
	 * 简历登记
	 * @param resumes 简历对象
	 * @param num 标识
	 * @param model 传值
	 * @return
	 */
	@RequestMapping("addResumes")
	public String addResumes(Resumes resumes, Integer num, Model model){
		if(num != null){
			List<Releases> releasesList = releasesBiz.findAllReleases();
			model.addAttribute("releasesList", releasesList);
			return "jsp/recruit/resumes/resumesAdd";
		}else{
			resumes.setTime(Tools.getCurrTime());
			resumesBiz.addResumes(resumes);
			model.addAttribute("msg", Final.addSuccess);
			return resumesList(new Resumes(), 1, model);
		}
	}
	
	/**
	 * 修改简历
	 * @param resumes 简历对象
	 * @param resumesID 标识
	 * @param model 传值
	 * @return
	 */
	@RequestMapping("updResumes")
	public String updResumes(Resumes resumes, Integer resumesID, Model model){
		if(resumesID != null){
			List<Releases> releasesList = releasesBiz.findAllReleases();
			resumes = resumesBiz.findResumesByID(resumesID);
			model.addAttribute("releasesList", releasesList);
			model.addAttribute("resumes", resumes);
			return "jsp/recruit/resumes/resumesUpd";
		}else{
			resumesBiz.updResumes(resumes);
			model.addAttribute("msg", Final.updSuccess);
			return resumesList(new Resumes(), 1, model);
		}
	}
	
	/**
	 * 简历详情
	 * @param resumesID 简历编号
	 * @param model 传值
	 * @return
	 */
	@RequestMapping("detailResumes")
	public String detailResumes(Integer resumesID, Model model){
		Resumes resumes = resumesBiz.findResumesByID(resumesID);
		Result result = resultBiz.findResultbyID(resumesID);
		Hire hire = hireBiz.findHireByID(resumesID);
		model.addAttribute("resumes", resumes);
		model.addAttribute("result", result);
		model.addAttribute("hire", hire);
		return "jsp/recruit/resumes/resumesDetail";
	}
	
	/**
	 * 删除简历
	 * @param resumesID 简历编号
	 * @param currPageNo 当前页
	 * @param model 传值
	 * @return
	 */
	@RequestMapping("delResumes")
	public String delResumes(Integer resumesID, Integer currPageNo, Model model){
		resumesBiz.delResumes(resumesID);
		resultBiz.delResult(resumesID);
		hireBiz.delHire(resumesID);
		model.addAttribute("msg", Final.delSuccess);
		return resumesList(new Resumes(), currPageNo, model);
	}
	
	
	
	public void setResumesBiz(ResumesBiz resumesBiz) {
		this.resumesBiz = resumesBiz;
	}
	public void setReleasesBiz(ReleasesBiz releasesBiz) {
		this.releasesBiz = releasesBiz;
	}
	public void setResultBiz(ResultBiz resultBiz) {
		this.resultBiz = resultBiz;
	}
	public void setHireBiz(HireBiz hireBiz) {
		this.hireBiz = hireBiz;
	}
	
	
}
