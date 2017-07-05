package cn.hrms.pub.action;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import cn.hrms.util.Tools;

@Controller
public class AjaxFileAction {

	/**
	 * 文件上传
	 * @param myfiles 上传的文件
	 * @throws IOException
	 */
	@RequestMapping("fileUpload")
	public String FileUpload(@RequestParam MultipartFile myfiles,HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		
		String pathName = request.getParameter("pathName");
		if(pathName != null && pathName != ""){
			FileDelete(request,pathName);
		}
		
		// 获取文件存放路径
		String realPath = request.getSession().getServletContext().getRealPath(File.separatorChar + "upload") + File.separatorChar + request.getParameter("name");
		// 设置响应给前台内容的数据格式
		response.setContentType("text/html; charset=UTF-8");
		// 以打印的方式响应结果
		PrintWriter out = response.getWriter();
		// 上传的文件名
		String fileName = "" ;
		
		if (myfiles.isEmpty()) {
			out.print("2请选择文件后再上传！");
			out.flush();
			return null;
		} else {
			// 获取文件后缀
			String hou = myfiles.getOriginalFilename().substring(myfiles.getOriginalFilename().indexOf("."));
			fileName = Tools.getUUID() + hou;
			try {
				FileUtils.copyInputStreamToFile(myfiles.getInputStream(), new File(realPath,fileName));
			} catch (IOException e) {
				out.print("2上传失败！");
				out.flush();
				return null;
			}
		}
			
		out.print("1"+"upload" + File.separatorChar + request.getParameter("name") + File.separatorChar + fileName);
		out.flush();
		return null;
	}
	
	@RequestMapping("fileDownload")
	public String fileDownload(@RequestParam("pathName") String pathName,HttpServletRequest request, HttpServletResponse response) {
		if (pathName != null) {
			//下载路径
			String realPath = request.getSession().getServletContext().getRealPath("/") + pathName;
			//文件名
			String fileName = pathName.substring(pathName.lastIndexOf("\\")+1);
			File file = new File(realPath);
			if (file.exists()) {
				response.setContentType("application/force-download");// 设置强制下载不打开
				response.addHeader("Content-Disposition","attachment;fileName=" + fileName);// 设置文件名
				byte[] buffer = new byte[1024];
				FileInputStream fis = null;
				BufferedInputStream bis = null;
				try {
					fis = new FileInputStream(file);
					bis = new BufferedInputStream(fis);
					OutputStream os = response.getOutputStream();
					int i = bis.read(buffer);
					while (i != -1) {
						os.write(buffer, 0, i);
						i = bis.read(buffer);
					}
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					if (bis != null) {
						try {
							bis.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					if (fis != null) {
						try {
							fis.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
		return null;
	}
	
	/**
	 * 文件删除
	 * @param request 请求
	 * @param pathName 路径
	 */
	public void FileDelete(HttpServletRequest request,String pathName){
		//文件路径
		String filePath = request.getSession().getServletContext().getRealPath("/") + pathName;
		File file = new File(filePath);
		if(file.exists() && file.isFile()){
			file.delete();
		}
	}
}
