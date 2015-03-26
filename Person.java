import java.util.Random;


public class Person 
{
	private String name;
	private int walletBalance;
	private static Random r = new Random();
	public Person(String name)
	{
		this.name = name;
		this.walletBalance = Person.r.nextInt(10);
	}
	
	public void display()
	{
		System.out.println("Hi, my name is: " + this.name + " and I have: $" + this.walletBalance + " on me!");
	}
}
