package test;

import java.util.Comparator;

public class Fruit{
	int no; // number
	String name; // name
	int price; // price
	
	public Fruit(int a, String b, int c)
	{
		no = a;
		name = b;
		price = c;
	}
	
	@Override
	public String toString()
	{
		return this.no + "/" + this.name + "/" + this.price;
	}
	
}


class FruitComparator implements Comparator<Fruit>
{
	@Override
	public int compare(Fruit o1, Fruit o2)
	{
		return o1.name.compareTo(o2.name);
	}
	
	
}