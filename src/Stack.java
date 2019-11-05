
public class Stack
{
	Object stk[];
	int capacity,top=-1;
	public Stack(int capacity)
	{
		this.capacity=capacity;
		stk=new Object[capacity];
	}
	public String toString()
	{
		String st="[";
		for(int i=0;i<=top;i++)
		{
			st=st+stk[i];
			if(i<top)
				st=st+",";
		}
		return st+"]";
	}
	public boolean push(Object ele)
	{
		if(top==capacity)
		{
			System.out.println("Stack is full");
			return false;
		}
		stk[++top]=ele;
		return true;
		
	}
	public boolean pop() 
	{
		if(top==-1)
		{
			System.out.println("Stack underflow");
			return false;
		}
		top--;
		return true;
	}
	public Object peek()
	{
		return stk[top];
	}
	public int srearch(Object obj)
	{
		
		for(int i=0;i<=top;i++)
		{
			if(stk[i]==obj)
				return top-i+1;
		}
		return -1;
		
	}
	
	
}
