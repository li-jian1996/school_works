
package cn.edu.hbpu.recruitment.util;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

import cn.edu.hbpu.recruitment.pojo.Job;
import cn.edu.hbpu.recruitment.pojo.Person;
import cn.edu.hbpu.recruitment.pojo.jobCompanyPojo;

 

public class CommonUtils {

	public static String getUUID(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
	
	public static String path="D:\\dev\\upload\\";
	
     public static void uploadFiles(Person person,MultipartFile[] files){
		String picNames="";
	 
		System.out.println("commonutil 开始上传文件");
		for (int i = 0; i < files.length; i++) {
			if (files[i]!=null) {
				String picName=getUUID();
				String filename=files[i].getOriginalFilename();
				String extname=filename.substring(filename.indexOf("."));
				System.out.println("文件uuid"+picName);
				try {
					files[i].transferTo(new File(path+picName+extname));
					System.out.println("文件保存成功");
				} catch (Exception e) {
					e.printStackTrace();
				}
				picNames+=picName+extname+",";
				System.out.println(picNames);
			}
		}
		person.setHeadimage(picNames.substring(0,picNames.length()-1));

	}
	
}

/**
 *  反射工具类写不来，这个留着以后再说， 
 * @author  jelly
 * @version 1.01
 * @date 2018年8月6日10:35:36 
 */
//@SuppressWarnings("unchecked")    
//public static jobCompanyPojo jobToJobCompanyPojo(Job job,jobCompanyPojo jobCompanyPojo) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
//	
//	 Class cls1 = job.getClass();  
//	 Class cls2 = jobCompanyPojo.getClass(); 
//     Field[] fields1 = cls1.getDeclaredFields();  
//     Field[] fields2 = cls2.getDeclaredFields();  
//     for(int i=0; i<fields1.length; i++){  
//         Field f = fields1[i];  
//         String name = f.getName();
//         // 将属性的首字母大写
//         name = name.replaceFirst(name.substring(0, 1), name.substring(0, 1)
//                 .toUpperCase());
//         // 获取属性类型
//         String type = f.getGenericType().toString();
//         f.setAccessible(true);    // 打开 访问 权限 ！！
//         try {
//			    
//			     if (type.equals("class java.lang.String"))
//		            {
//		                // 如果type是类类型，则前面包含"class "，后面跟类名
//				    	 Method method1= cls1.getMethod("get" +name);
//					     Method method2= cls2.getMethod("set" +name);
//		                // 调用getter方法获取属性值
//		                String value = (String) method1.invoke(job);
//		                if (value != null)
//		                {
//		                     method2.invoke(jobCompanyPojo, value);
//		                }
//
//		            }
//			     
//		} catch (SecurityException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (NoSuchMethodException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//     }   
//	
//	
//	return jobCompanyPojo;
//	
//}


