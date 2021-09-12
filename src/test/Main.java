/// 2주차 실습 1.1

package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> al = new ArrayList<Student>();
		
		System.out.println("-------------------------");
		System.out.println("Student App Sort 기능 구현");

		
		System.out.println("Student List (Ordered by name)");
		al.add(new Student(101, "Kim", 23));
		al.add(new Student(102, "Choi", 21));
		al.add(new Student(107, "Lee", 22));
		al.add(new Student(108, "HwangBo", 20));
		al.add(new Student(103, "Jang", 26));
		al.add(new Student(106, "Moon", 25));
		al.add(new Student(110, "HwangBo", 23));
		al.add(new Student(111, "Park", 23));
		al.add(new Student(113, "Jang", 25));
		al.add(new Student(109, "Do", 29));
		
		Collections.sort(al); // sorting
		
		for (Student s : al)
		{
			System.out.println(s.toString());
		}
		
		System.out.println("-------------------------");
		System.out.println("Fruit App Sort 기능 구현");

		List<Fruit> fl = new ArrayList<Fruit>();
		System.out.println("Fruit List (Ordered by name)");
		fl.add(new Fruit(101, "Apple", 1000));
		fl.add(new Fruit(102, "Peach", 3000));
		fl.add(new Fruit(103, "Kiwi", 81000));
		fl.add(new Fruit(104, "Mango", 120000000)); // Mango is too expensive! lol:)
		fl.add(new Fruit(105, "Gold-kiwi", 810000));
		fl.add(new Fruit(106, "AppleMango", 2800000));
		fl.add(new Fruit(107, "Banana", 1000));
		fl.add(new Fruit(108, "PineApple", 9700));
		fl.add(new Fruit(109, "Watermelon", 20000));
		fl.add(new Fruit(110, "Melon", 800));
		
		Collections.sort(fl, new FruitComparator());
		for (Fruit f : fl)
		{
			System.out.println(f.toString());
		}
		
		System.out.println("-------------------------");
	}

}
