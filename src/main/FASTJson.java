package main;

import java.util.ArrayList;
import java.util.List;
import com.alibaba.fastjson.JSON;
import domain.Grade;
import domain.Student;

public class FASTJson
{
	/**
	 * 测试解析数组
	 */
	public void parseObject()
	{
		System.out.println("------------- 解析嵌套对象 --------------");
		// 对象嵌套 嵌套对象数组
		String gradeJSON = "{'id':1,'name':'JAVAEE-1703','stus':[{'id':'101','name':'张三','age':16},{'id':'102','name':'李四','age':18}]}";
		Grade grade = JSON.parseObject(gradeJSON, Grade.class);
		System.out.println(grade);
		System.out.println("----------------------------------");
		ArrayList<Student> students = grade.getStus();
		for (Student student : students)
		{
			System.out.println("   "+student);
		}
		System.out.println("------------- 解析嵌套对象 --------------");
	}
	/**
	 * 测试结束数组
	 */
	public void parseArray()
	{
		// 数组
		String arrayJSON = "['张三','李四','王五']";
		List<String> list = JSON.parseArray(arrayJSON, String.class);
		System.out.println(list);
	}
	// 生成
	// @Test
	public void test2()
	{
		ArrayList<Student> list = new ArrayList<>();
		for (int i = 1; i < 3; i++)
		{
			list.add(new Student("101" + i, "码子" + i, 20 + i));
		}
		Grade grade = new Grade(100001, "张三", list);
		String json = JSON.toJSONString(grade);
		System.out.println(json);
	}
	public static void main(String[] args)
	{
		FASTJson fastJson = new FASTJson();
		fastJson.parseObject();
		fastJson.test2();
	}
}