package cn.hrms.sysset.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.hrms.sysset.biz.ProjectBiz;
import cn.hrms.sysset.entity.Project;
import cn.hrms.util.Final;
import cn.hrms.util.Page;

@Controller("projectAction")
public class ProjectAction {
	private ProjectBiz projectBiz;
	
	/**
	 * 分页显示薪酬项目列表
	 * @param currPageNo 当前页
	 * @param model 传值
	 * @return
	 */
	@RequestMapping("projectList")
	public String projectList(Integer currPageNo, Model model){
		Page<Project> page = new Page<Project>();
		page.setTotalCount(projectBiz.proCount());
		page.setPageTotalCount();
		if(currPageNo != null){
			page.setCurrPageNo(currPageNo);
		}
		page.setPageList(projectBiz.findPro(page));
		model.addAttribute("page", page);
		return "jsp/sysset/project/projectList";
	}
	
	/**
	 * 新增薪酬项目
	 * @param pro 薪酬项目对象
	 * @param res 标志
	 * @param model 传值
	 * @return
	 */
	@RequestMapping("projectAdd")
	public String projectAdd(Project pro, Integer res, Model model){
		if(res != null){  //res如果为空则新增，不为空则直接跳转到新增页面
			return "jsp/sysset/project/projectAdd";
		}else{
			projectBiz.addPro(pro);
			model.addAttribute("msg", Final.addSuccess);
			return projectList(1, model);
		}
	}
	
	
	/**
	 * 删除薪酬项目
	 * @param id 项目编号
	 * @return
	 */
	@RequestMapping("projectDel")
	public String projectDel(Integer id, Integer currPageNo ,Model model){
		projectBiz.delPro(id);
		model.addAttribute("msg", Final.delSuccess);
		return projectList(currPageNo, model);
	}
	
	/**
	 * 修改薪酬项目
	 * @param pro 薪酬项目对象
	 * @param res 标志
	 * @param model 传值
	 * @return
	 */
	@RequestMapping("projectUpd")
	public String projectUpd(Project pro, Integer res, Model model){
		if(res != null){
			model.addAttribute("project", projectBiz.findProById(pro.getId()));
			return "jsp/sysset/project/projectUpd";
		}else{
			projectBiz.updPro(pro);
			model.addAttribute("project", null);
			model.addAttribute("msg", Final.updSuccess);
			return projectList(1, model);
		}
	}
	
	/**
	 * 薪酬项目详情
	 * @param id 薪酬项目编号
	 * @param model 传值
	 * @return
	 */
	@RequestMapping("projectDetail")
	public String projectDetail(Integer id, Model model){
		model.addAttribute("project", projectBiz.findProById(id));
		return "jsp/sysset/project/projectDetail";
	}

	public void setProjectBiz(ProjectBiz projectBiz) {
		this.projectBiz = projectBiz;
	}

}
