package domain;

import java.util.ArrayList;
/**
 * 班级
 */
public class Clazz
{
	// 班级编号
	private String id;
	// 班级名称
	private String className;
	// 有多少学�?
	private ArrayList<Student> stus;
	public Clazz(String id, String name, ArrayList<Student> stus)
	{
		super();
		this.id = id;
		this.className = name;
		this.stus = stus;
	}
	public Clazz()
	{
		super();
	}
	@Override
	public String toString()
	{
		return "Grade [id=" + id + ", name=" + className + ", stus=" + stus
				+ "]";
	}
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	public String getName()
	{
		return className;
	}
	public void setName(String name)
	{
		this.className = name;
	}
	public ArrayList<Student> getStus()
	{
		return stus;
	}
	public void setStus(ArrayList<Student> stus)
	{
		this.stus = stus;
	}

}