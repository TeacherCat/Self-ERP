package cn.hrms.recruit.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.hrms.recruit.biz.HireBiz;
import cn.hrms.recruit.biz.ResultBiz;
import cn.hrms.recruit.biz.ResumesBiz;
import cn.hrms.recruit.entity.Hire;
import cn.hrms.recruit.entity.Result;
import cn.hrms.recruit.entity.Resumes;
import cn.hrms.util.Final;
import cn.hrms.util.Page;
import cn.hrms.util.Tools;

@Controller
public class HireAction {

	private ResumesBiz resumesBiz;
	private ResultBiz resultBiz;
	private HireBiz hireBiz;
	
	/**
	 * 简历列表
	 * @param resumes 简历对象
	 * @param currPageNo 当前页
	 * @param model 传值
	 * @return
	 */
	@RequestMapping("hireList")
	public String hireList(Resumes resumes, Integer currPageNo, Model model){
		resumes.setState("面试通过");
		if("0".equals(resumes.getSex())){
			resumes.setSex(null);
		}
		if("0".equals(resumes.getAge())){
			resumes.setAge(null);
		}
		if("0".equals(resumes.getEducation())){
			resumes.setEducation(null);
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
		return "jsp/recruit/hire/hireList";
	}

	/**
	 * 录用登记
	 * @param hire 录用对象
	 * @param resumesID 简历编号
	 * @param model 传值
	 * @return
	 */
	@RequestMapping("addHire")
	public String addHire(Hire hire, Integer resumesID, Model model){
		if(resumesID != null){
			Resumes resumes = resumesBiz.findResumesByID(resumesID);
			Result result = resultBiz.findResultbyID(resumesID);
			model.addAttribute("resumes", resumes);
			model.addAttribute("result", result);
			return "jsp/recruit/hire/hireAdd";
		}else{
			hire.setTime(Tools.getCurrTime());
			hireBiz.addHire(hire);
			resumesBiz.updResumesState(new Resumes(hire.getId(),"录用"));
			model.addAttribute("msg", Final.hireSuccess);
			return hireList(new Resumes(), 1, model);
		}
	}
	
	
	public void setResumesBiz(ResumesBiz resumesBiz) {
		this.resumesBiz = resumesBiz;
	}
	public void setResultBiz(ResultBiz resultBiz) {
		this.resultBiz = resultBiz;
	}
	public void setHireBiz(HireBiz hireBiz) {
		this.hireBiz = hireBiz;
	}
	
}
