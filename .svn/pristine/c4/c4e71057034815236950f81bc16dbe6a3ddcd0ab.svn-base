package cn.hrms.util;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * 工具类
 * @author Administrator
 *
 */
public class Tools {

	/**
	 * 获取UUID
	 * @return
	 */
	public static String getUUID(){
		String uuid = UUID.randomUUID().toString();
		uuid = uuid.replace("-", "");
		return uuid;
	}
	
	/**
	 * 获取系统当前时间
	 * @return
	 */
	public static String getCurrTime(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(new Date());
	}
	
	/**
	 * 获取6位随机数
	 * @return
	 */
	public static String getRandom(){
		String str = "";
		for(int i = 0;i < 6;i++){
			str += (int)(Math.random()*10);
		}
		return str;
	}
}
