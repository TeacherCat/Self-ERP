package cn.hrms.personnel.action;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.hrms.personnel.biz.ArchivesAuditBiz;
import cn.hrms.personnel.biz.ArchivesBiz;
import cn.hrms.personnel.entity.Archives;
import cn.hrms.personnel.entity.ArchivesAudit;
import cn.hrms.sysset.biz.DeptBiz;
import cn.hrms.sysset.biz.PostBiz;
import cn.hrms.sysset.entity.Dept;
import cn.hrms.sysset.entity.Post;
import cn.hrms.util.Final;
import cn.hrms.util.Page;
import cn.hrms.util.Tools;

import com.alibaba.fastjson.JSON;

@Controller
public class ArchivesAction {

	private ArchivesBiz archivesBiz;
	private ArchivesAuditBiz archivesAuditBiz;
	private DeptBiz deptBiz;
	private PostBiz postBiz;
	
	/**
	 * 级联菜单
	 * @param deptID 部门编号
	 * @return
	 */
	@RequestMapping("leaveMenu")
	public String leaveMenu(Integer deptID,HttpServletResponse response) throws IOException{
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		List<Post> postList = postBiz.findPostByDeptId(deptID);
		String str = JSON.toJSONString(postList);
		out.print(str);
		return null;
	}
	
	/**
	 * 档案列表显示
	 * @param archives 查询条件
	 * @param currPageNo 当前页
	 * @param model 传值
	 * @return
	 */
	@RequestMapping("archivesList")
	public String archivesList(Archives archives,Integer currPageNo,Model model){
		if("0".equals(archives.getSex())){
			archives.setSex(null);
		}
		if("0".equals(archives.getEducation())){
			archives.setEducation(null);
		}
		if("0".equals(archives.getState())){
			archives.setState(null);
		}
		Page<Archives> page = new Page<Archives>();
		page.setTotalCount(archivesBiz.findTotalCount(archives));
		page.setPageTotalCount();
		if(currPageNo != null){
			page.setCurrPageNo(currPageNo);
		}
		page.setPageList(archivesBiz.findArchives(archives, page));
		model.addAttribute("page", page);
		model.addAttribute("archives", archives);
		return "jsp/personnel/archivesList";
	}
	
	/**
	 * 档案登记
	 * @param archives 档案对象
	 * @param num 是否为新增操作
	 * @param model 传值
	 * @return
	 */
	@RequestMapping("addArchives")
	public String addArchives(Archives archives,Integer num,Model model){
		if(num != null){
			List<Dept> deptList = deptBiz.findDept(null);
			model.addAttribute("deptList", deptList);
			return "jsp/personnel/archivesAdd";
		}else{
			archives.setTime(Tools.getCurrTime());
			archivesBiz.addArchives(archives);
			model.addAttribute("msg", Final.addSuccess);
		}
		return archivesList(new Archives(),1,model);
	}

	/**
	 * 修改档案
	 * @param archives 档案信息
	 * @param id 档案编号
	 * @param model
	 * @return
	 */
	@RequestMapping("updArchives")
	public String updArchives(Archives archives,Integer archivesID,Model model ){
		if(archivesID != null){
			List<Dept> deptList = deptBiz.findDept(new Dept());
			List<Post> postList = postBiz.findPost(new Post(),new Page<Post>());
			archives = archivesBiz.findArchives(new Archives(archivesID), new Page<Archives>()).get(0);
			model.addAttribute("deptList", deptList);
			model.addAttribute("postList", postList);
			model.addAttribute("archives", archives);
			return "jsp/personnel/archivesUpd";
		}else{
			archivesBiz.updArchives(archives);
			model.addAttribute("msg", Final.updSuccess);
		}
		return archivesList(new Archives(),1,model);
	}
	
	/**
	 * 申请档案变更
	 * @param archives 档案对象
	 * @param archivesID 档案编号
	 * @param model 传值
	 * @return
	 */
	@RequestMapping("changeArchives")
	public String changeArchives(Archives archives,Integer archivesID,Model model){
		if(archivesID != null){
			List<Dept> deptList = deptBiz.findDept(new Dept());
			List<Post> postList = postBiz.findPost(new Post(),new Page<Post>());
			archives = archivesBiz.findArchives(new Archives(archivesID), new Page<Archives>()).get(0);
			model.addAttribute("deptList", deptList);
			model.addAttribute("postList", postList);
			model.addAttribute("archives", archives);
			return "jsp/personnel/archivesChange";
		}else{
			archivesBiz.updArchives(archives);
			model.addAttribute("msg", Final.changeSuccess);
		}
		return archivesList(new Archives(),1,model);
	}
	
	/**
	 * 档案详情
	 * @param archivesID 档案编号
	 * @param model 传值
	 * @return 
	 */
	@RequestMapping("detailArchives")
	public String detailArchives(Integer archivesID,Model model){
		Archives archives = archivesBiz.findArchives(new Archives(archivesID), new Page<Archives>()).get(0);
		ArchivesAudit archivesAudit = archivesAuditBiz.findArchivesAudit(archivesID);
		model.addAttribute("archives", archives);
		model.addAttribute("archivesAudit", archivesAudit);
		return "jsp/personnel/archivesDetail";
	}
	
	/**
	 * 审核档案
	 * @param archivesAudit 审核对象
	 * @param archivesID 档案编号
	 * @param model 传值
	 * @return
	 */
	@RequestMapping("auditArchives")
	public String auditArchives(ArchivesAudit archivesAudit,Integer archivesID,Model model){
		if(archivesID != null){
			Archives archives = archivesBiz.findArchives(new Archives(archivesID), new Page<Archives>()).get(0);
			model.addAttribute("archives", archives);
			return "jsp/personnel/archivesAudit";
		}else{
			archivesAudit.setTime(Tools.getCurrTime());
			//修改档案状态为审核结果
			archivesBiz.updArchivesState(new Archives(archivesAudit.getId(),archivesAudit.getResult()));
			//判断是否存在该档案的审核记录
			if(archivesAuditBiz.findArchivesAudit(archivesAudit.getId()) != null){
				archivesAuditBiz.updArchivesAudit(archivesAudit);
			}else{
				archivesAuditBiz.addArchivesAudit(archivesAudit);
			}
			model.addAttribute("msg", Final.auditSuccess);
		}
		return archivesList(new Archives(),1,model);
	}
	
	/**
	 * 逻辑删除档案（修改档案状态）
	 * @param archivesID 档案编号
	 * @param currPageNo 当前页
	 * @param model 传值
	 * @return
	 */
	@RequestMapping("delLogArchives")
	public String delLogArchives(Integer archivesID, Integer currPageNo,Model model){
		archivesBiz.updArchivesState(new Archives(archivesID, "已删除"));
		archivesAuditBiz.delArchivesAudit(archivesID);
		model.addAttribute("msg", Final.delSuccess);
		return archivesList(new Archives(),currPageNo,model);
	}
	
	/**
	 * 物理删除档案（删除档案信息）
	 * @param archivesID 档案编号
	 * @param currPageNo 当前页
	 * @param model 传值
	 * @return
	 */
	@RequestMapping("delPhyArchives")
	public String delPhyArchives(Integer archivesID, Integer currPageNo,Model model){
		archivesBiz.delArchives(archivesID);
		archivesAuditBiz.delArchivesAudit(archivesID);
		model.addAttribute("msg", Final.delPermanentSuccess);
		return archivesList(new Archives(),currPageNo,model);
	}
	
	/**
	 * 恢复档案信息
	 * @param archivesId 档案编号
	 * @param currPageNo 当前页
	 * @param model 传值
	 * @return
	 */
	@RequestMapping("recArchives")
	public String recArchives(Integer archivesID, Integer currPageNo,Model model){
		archivesBiz.updArchivesState(new Archives(archivesID,"起草"));
		model.addAttribute("msg", Final.recSuccess);
		return archivesList(new Archives(),currPageNo,model);
	}
	
	
	
	public void setArchivesBiz(ArchivesBiz archivesBiz) {
		this.archivesBiz = archivesBiz;
	}
	public void setArchivesAuditBiz(ArchivesAuditBiz archivesAuditBiz) {
		this.archivesAuditBiz = archivesAuditBiz;
	}
	public void setDeptBiz(DeptBiz deptBiz) {
		this.deptBiz = deptBiz;
	}
	public void setPostBiz(PostBiz postBiz) {
		this.postBiz = postBiz;
	}
	
}
