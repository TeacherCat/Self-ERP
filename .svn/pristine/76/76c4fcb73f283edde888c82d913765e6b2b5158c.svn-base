package cn.hrms.sysset.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.hrms.sysset.biz.DeptBiz;
import cn.hrms.sysset.biz.TopicBiz;
import cn.hrms.sysset.entity.Dept;
import cn.hrms.sysset.entity.Topic;
import cn.hrms.util.Final;
import cn.hrms.util.Page;

@Controller("topicAction")
public class TopicAction {
	private TopicBiz topicBiz;
	private DeptBiz deptBiz;
	
	/**
	 * 题库列表
	 * @param topic 题库对象
	 * @param currPageNo 当前页
	 * @param model 传值
	 * @return
	 */
	@RequestMapping("topicList")
	public String topicList(Topic topic, Integer currPageNo, Model model){
		//题库级别等于0，则设为空
		if(topic.getLevel() != null && topic.getLevel().equals("0")){
			topic.setLevel(null);
		}
		//题库的部门编号等于0，则设为空
		if(topic.getDept() != null && topic.getDept().getId() == 0){
			topic.setDept(null);
		}
		Page<Topic> page = new Page<Topic>();
		page.setTotalCount(topicBiz.TopCount(topic));
		page.setPageTotalCount();
		if(currPageNo != null){
			page.setCurrPageNo(currPageNo);
		}
		page.setPageList(topicBiz.findTop(topic, page));
		model.addAttribute("page", page);
		model.addAttribute("deptList", deptBiz.findDept(new Dept()));
		model.addAttribute("topic", topic);
		return "jsp/sysset/topic/topicList";
	}
	
	/**
	 * 新增题库
	 * @param topic 题库对象
	 * @param res 标志
	 * @param model 传值
	 * @return
	 */
	@RequestMapping("topicAdd")
	public String topicAdd(Topic topic, Integer res, Model model){
		if(res != null){  //res如果为空则新增，不为空则直接跳转到新增页面
			model.addAttribute("deptList", deptBiz.findDept(new Dept()));
			return "jsp/sysset/topic/topicAdd";
		}else{
			topicBiz.addTop(topic);
			model.addAttribute("msg", Final.addSuccess);
			return topicList(new Topic(), 1, model);
		}
		
	}
	
	/**
	 * 删除题库
	 * @param id 题库编号
	 * @return
	 */
	@RequestMapping("topicDel")
	public String topicDel(Integer id, Integer currPageNo ,Model model){
		topicBiz.delTop(id);
		model.addAttribute("msg", Final.delSuccess);
		return topicList(new Topic(), currPageNo, model);
	}
	
	/**
	 * 修改题库
	 * @param topic 题库对象
	 * @param res 标志
	 * @param model 传值
	 * @return
	 */
	@RequestMapping("topicUpd")
	public String topicUpd(Topic topic, Integer res, Model model){
		if(res != null){
			model.addAttribute("topic", topicBiz.findTopById(topic.getId()));
			model.addAttribute("deptList", deptBiz.findDept(new Dept()));
			return "jsp/sysset/topic/topicUpd";
		}else{
			topicBiz.updTop(topic);
			model.addAttribute("topic", null);
			model.addAttribute("msg", Final.updSuccess);
			return topicList(new Topic(), 1, model);
		}
	}
	
	/**
	 * 题库详情
	 * @param id 题库编号
	 * @param model 传值
	 * @return
	 */
	@RequestMapping("topicDetail")
	public String topicDetail(Integer id, Model model){
		model.addAttribute("topic", topicBiz.findTopById(id));
		return "jsp/sysset/topic/topicDetail";
	}

	public void setTopicBiz(TopicBiz topicBiz) {
		this.topicBiz = topicBiz;
	}

	public void setDeptBiz(DeptBiz deptBiz) {
		this.deptBiz = deptBiz;
	}

}
