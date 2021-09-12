package test;

public class Student implements Comparable<Student>{
	int no; // number
	String name; // name
	int age; // age
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
	
	public Student(int a, String b, int c)
	{
		no = a;
		name = b;
		age = c;		
	}
	
	@Override
	public String toString()
	{
		return this.no + "/" + this.name + "/" + this.age;
	}
}
