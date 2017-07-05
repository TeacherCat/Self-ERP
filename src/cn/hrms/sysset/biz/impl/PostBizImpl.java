package cn.hrms.sysset.biz.impl;

import java.util.List;

import cn.hrms.sysset.biz.PostBiz;
import cn.hrms.sysset.dao.PostDao;
import cn.hrms.sysset.entity.Post;
import cn.hrms.util.Page;

public class PostBizImpl implements PostBiz{
	private PostDao postDao;

	public List<Post> findPost(Post post, Page<Post> page) {
		return postDao.findPost(post, page);
	}

	public Post findPostById(Integer id) {
		return postDao.findPostById(id);
	}

	public int postCount(Post post) {
		return postDao.postCount(post);
	}

	public int addPost(Post post) {
		return postDao.addPost(post);
	}
	
	public int delPost(Integer id) {
		return postDao.delPost(id);
	}
	
	public int updPost(Post post) {
		return postDao.updPost(post);
	}

	public List<Post> findPostByDeptId(Integer id) {
		return postDao.findPostByDeptId(id);
	}

	public void setPostDao(PostDao postDao) {
		this.postDao = postDao;
	}

}
