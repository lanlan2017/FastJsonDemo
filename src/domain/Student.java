package domain;

public class Student
{
	// Ñ§ºÅ
	private String id;
	// ĞÕÃû
	private String name;
	// ÄêÁä
	private int age;
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
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public Student(String id, String name, int age)
	{
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public Student()
	{
		super();
	}
	@Override
	public String toString()
	{
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}