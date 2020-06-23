package main;

import java.util.ArrayList;
import java.util.List;
import com.alibaba.fastjson.JSON;
import domain.Grade;
import domain.Student;

public class FASTJson
{
	/**
	 * ���Խ�������
	 */
	public void parseObject()
	{
		System.out.println("------------- ����Ƕ�׶��� --------------");
		// ����Ƕ�� Ƕ�׶�������
		String gradeJSON = "{'id':1,'name':'JAVAEE-1703','stus':[{'id':'101','name':'����','age':16},{'id':'102','name':'����','age':18}]}";
		Grade grade = JSON.parseObject(gradeJSON, Grade.class);
		System.out.println(grade);
		System.out.println("----------------------------------");
		ArrayList<Student> students = grade.getStus();
		for (Student student : students)
		{
			System.out.println("   "+student);
		}
		System.out.println("------------- ����Ƕ�׶��� --------------");
	}
	/**
	 * ���Խ�������
	 */
	public void parseArray()
	{
		// ����
		String arrayJSON = "['����','����','����']";
		List<String> list = JSON.parseArray(arrayJSON, String.class);
		System.out.println(list);
	}
	// ����
	// @Test
	public void test2()
	{
		ArrayList<Student> list = new ArrayList<>();
		for (int i = 1; i < 3; i++)
		{
			list.add(new Student("101" + i, "����" + i, 20 + i));
		}
		Grade grade = new Grade(100001, "����", list);
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