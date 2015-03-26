
public class Queue 
{
	Node head;
	Node tail;
	
	public Queue()
	{
		this.head = null;
		this.tail = null;
	}
	
	public Person dequeue()
	{
		Node nodeToReturn = this.head;
		if(nodeToReturn == null)
		{
			return null;
		}
		else
		{
			if(this.head.getNextNode() != null)
			{
				this.head.getNextNode().setPrevNode(null);
			}
			this.head = this.head.getNextNode();
			nodeToReturn.setNextNode(null);
			return nodeToReturn.getPayload();
		}
	}
	public void enqueue(Person p)
	{
		Node n = new Node(p);
		if(this.tail == null)
		{
			this.tail = n;
			this.head = n;
		}
		else
		{
			n.setPrevNode(this.tail);
			this.tail.setNextNode(n);
			this.tail = n;
		}
	}
}
