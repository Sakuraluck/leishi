package com.wxj.util;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import com.wxj.domain.entity.Employee;

/**
 * Map工具类
 *
 */
public class MapUtils {
	
	/**  
	* @Title: entityToMap  
	* @Description: TODO 把任意对象转换成map
	* @param obj 任意对象
	* @param map 传进来的对象
	* @return   
	* @date:2018-12-28 15:34
	*/
	public static Map<String,Object> entityToMap(Object obj,Map<String,Object> map){
		if(obj == null ) {
			return map;
		}
		Field[] fields = obj.getClass().getDeclaredFields();
		for (Field field : fields) {
			String key = field.getName();
			try {
				boolean accessible = field.isAccessible();
				field.setAccessible(true);
				Object value = field.get(obj);
				if(value != null) {
					map.put(key, value.toString());
				}
				field.setAccessible(accessible);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		 return map;
	}
	
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.setName("wxj");
		employee.setAge("35");
		Map<String, Object> map = entityToMap(employee,new HashMap<String,Object>());
		System.out.println(map.toString());
	}
	
}
