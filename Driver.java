
public class Driver 
{
	public static void main(String[] args)
	{
		Queue myQueue = new Queue();
		for(int i = 0; i < 100; i ++)
		{
			myQueue.enqueue(new Person("Person " + i));
		}
		for(int i = 0; i < 100; i++)
		{
			try
			{
				myQueue.dequeue().display();
			}
			catch(Exception e)	
			{
				System.out.println("blah");
			}
		}
	}
}
