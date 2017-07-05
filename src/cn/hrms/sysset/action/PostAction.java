package cn.hrms.sysset.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.hrms.personnel.biz.ArchivesBiz;
import cn.hrms.sysset.biz.DeptBiz;
import cn.hrms.sysset.biz.PostBiz;
import cn.hrms.sysset.entity.Dept;
import cn.hrms.sysset.entity.Post;
import cn.hrms.util.Final;
import cn.hrms.util.Page;

@Controller("PostAction")
public class PostAction {
	private PostBiz postBiz;
	private DeptBiz deptBiz;
	private ArchivesBiz archivesBiz;
	
	/**
	 * 职位列表分页显示
	 * @param post 职位对象
	 * @param currPageNo 当前页
	 * @param model 传值
	 * @return
	 */
	@RequestMapping("postList")
	public String postList(Post post, Integer currPageNo, Model model){
		if(post.getDept() == null || post.getDept().getId() == 0){  //不需按部门查找则设为空
			post.setDept(null);
		}
		Page<Post> page = new Page<Post>();
		page.setTotalCount(postBiz.postCount(post));
		page.setPageTotalCount();
		if(currPageNo != null){
			page.setCurrPageNo(currPageNo);
		}
		page.setPageList(postBiz.findPost(post, page));
		model.addAttribute("page", page);
		model.addAttribute("post", post);
		model.addAttribute("deptList", deptBiz.findDept(new Dept()));
		return "jsp/sysset/post/postList";
	}
	
	/**
	 * 新增职位
	 * @param post 职位对象
	 * @param res 标识
	 * @param model 传值
	 * @return
	 */
	@RequestMapping("postAdd")
	public String postAdd(Post post, Integer res, Model model){
		if(res == null){  //res如果为空则新增，不为空则直接跳转到新增页面
			postBiz.addPost(post);
			model.addAttribute("msg", Final.addSuccess);
			return postList(new Post(), 1, model);
		}
		model.addAttribute("deptList", deptBiz.findDept(new Dept()));
		return "jsp/sysset/post/postAdd";
	}
	
	/**
	 * 职位详情显示
	 * @param id 职位编号
	 * @param model 传值
	 * @return
	 */
	@RequestMapping("postDetail")
	public String postDetail(Integer id, Model model){
		model.addAttribute("post", postBiz.findPostById(id));
		return "jsp/sysset/post/postDetail";
	}
	
	/**
	 * 修改职位
	 * @param post 职位对象
	 * @param res 标识
	 * @param model 传值
	 * @return
	 */
	@RequestMapping("postUpd")
	public String postUpd(Post post, Integer res, Model model){
		model.addAttribute("deptList", deptBiz.findDept(new Dept()));
		if(res == null){  //res如果为空则修改，不为空则直接跳转到修改页面
			postBiz.updPost(post);
			model.addAttribute("post", null);
			model.addAttribute("msg", Final.updSuccess);
			return postList(new Post(), 1, model);
		}
		model.addAttribute("post", postBiz.findPostById(post.getId()));  //查找要修改到信息
		return "jsp/sysset/post/postUpd";
	}
	
	/**
	 * 删除职位
	 * @param id 职位编号
	 * @return
	 */
	@RequestMapping(value="postDel")
	public String postDel(Integer id, Integer currPageNo, Integer res, Model model){
		if(archivesBiz.findArcByPost(id).size() > 0){
			model.addAttribute("msg", "该职位下包含员工，不能删除！");
		}else{
			postBiz.delPost(id);
			model.addAttribute("msg", Final.delSuccess);
		}
		return postList(new Post(), currPageNo, model);
	}

	public void setPostBiz(PostBiz postBiz) {
		this.postBiz = postBiz;
	}

	public void setDeptBiz(DeptBiz deptBiz) {
		this.deptBiz = deptBiz;
	}

	public void setArchivesBiz(ArchivesBiz archivesBiz) {
		this.archivesBiz = archivesBiz;
	}
	
}
