package cn.hrms.recruit.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.hrms.recruit.biz.ResultBiz;
import cn.hrms.recruit.biz.ResumesBiz;
import cn.hrms.recruit.entity.Result;
import cn.hrms.recruit.entity.Resumes;
import cn.hrms.util.Final;
import cn.hrms.util.Page;
import cn.hrms.util.Tools;

@Controller
public class ResultAction {

	private ResumesBiz resumesBiz;
	private ResultBiz resultBiz;
	
	/**
	 * 简历列表
	 * @param resumes 简历对象
	 * @param currPageNo 当前页
	 * @param model 传值
	 * @return
	 */
	@RequestMapping("resultList")
	public String resultList(Resumes resumes, Integer currPageNo, Model model){
		resumes.setState("待面试");
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
		return "jsp/recruit/result/resultList";
	}

	/**
	 * 面试结果登记
	 * @param resumesID 简历编号
	 * @param model 传值
	 * @return
	 */
	@RequestMapping("addResult")
	public String addResult(Result result, Integer resumesID, Model model){
		if(resumesID != null){
			Resumes resumes = resumesBiz.findResumesByID(resumesID);
			model.addAttribute("resumes", resumes);
			return "jsp/recruit/result/resultAdd";
		}else{
			result.setTime(Tools.getCurrTime());
			resultBiz.addResult(result);
			resumesBiz.updResumesState(new Resumes(result.getId(), result.getResult()));
			model.addAttribute("msg", Final.resultSuccess);
			return resultList(new Resumes(), 1, model);
		}
	}
	
	
	
	public void setResumesBiz(ResumesBiz resumesBiz) {
		this.resumesBiz = resumesBiz;
	}
	public void setResultBiz(ResultBiz resultBiz) {
		this.resultBiz = resultBiz;
	}
	
}
