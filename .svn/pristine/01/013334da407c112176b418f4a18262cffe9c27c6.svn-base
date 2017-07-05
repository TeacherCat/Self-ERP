package cn.hrms.sysset.dao;

import java.util.List;

import cn.hrms.sysset.entity.Users;
import cn.hrms.util.Page;

public interface UsersDao {
	
	/**
	 * 登陆 
	 * @param users 登陆信息
	 */
	public Users loginUsers(Users users);
	
	/**
	 * 修改密码
	 * @param users 用户信息
	 * @return
	 */
	public Integer updUsersPwd(Users users);
	
	/**
	 * 查询用户
	 * @return
	 */
	public List<Users> findUsers(Users users, Page<Users> page);
	
	/**
	 * 根据用户名查找
	 * @param name 用户名
	 * @return
	 */
	public Users findUsersById(String name);
	
	/**
	 * 查找用户数量
	 * @param users 条件
	 * @return
	 */
	public int usersCount(Users users);
	
	/**
	 * 新增用户
	 * @param user 需要新增的用户信息
	 * @return
	 */
	public int addUsers(Users users);
	
	/**
	 * 删除用户
	 * @param name 用户名
	 * @return
	 */
	public int delUsers(String name);
	
	/**
	 * 修改用户
	 * @param user 要修改成的用户信息
	 * @return
	 */
	public int updUsers(Users users);

}
