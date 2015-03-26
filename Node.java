
public class Node 
{
	private Person payload;
	private Node nextNode;
	private Node prevNode;
	
	public Node(Person payload)
	{
		this.payload = payload;
		this.nextNode = null;
		this.prevNode = null;
	}

	public Node getNextNode() 
	{
		return nextNode;
	}

	public void setNextNode(Node nextNode) 
	{
		this.nextNode = nextNode;
	}

	public Node getPrevNode() 
	{
		return prevNode;
	}

	public void setPrevNode(Node prevNode) 
	{
		this.prevNode = prevNode;
	}

	public Person getPayload() 
	{
		return payload;
	}
	
}
