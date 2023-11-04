package string_linked_list;

public class LinkedList {
	Node head;
	public LinkedList()
	{
		head=null;
	}
	public void addEnd(String data)
	{
		Node record=new Node(data);
		if(head==null)
			head=record;
		else
		{
			Node move;
			for(move=head;move.link!=null;move=move.link);
			move.link=record;
		}
	}
	public void addBeg(String data)
	{
		Node record=new Node(data);
		if(head==null)
		head=record;
		else
		{
			record.link=head;
			head=record;
		}
	}
	public boolean contains(String data)
	{
		Node move=head;
		//boolean flag=false;
		while(move.link!=null)
		{
			if(move.data.equals(data))
			{
				return true;
				
			}
			if(move.link==null)
			{
				if(move.data.equals(data))
					return true;
			}
			move=move.link;
		}
		return false;
	}
	
	public int size()
	{
		Node move=head;
		int cnt=0;
		while(move.link!=null)
		{
			cnt++;
			move=move.link;
		}
		if(move.link==null)
			cnt++;
		return cnt;
	}
	public void modify(String d1,String newData)
	{
		Node move=head;
		while(move.link!=null)
		{
			if(move.data.equals(d1))
			{
				move.data=newData;
			}
			
			move=move.link;	
		}
		if(move.link==null && move.data.equals(d1))
		{
			move.data=newData;
		}
		
	}
	public void modify(int index,String newdata)
	{
		Node move=head;
		if(index>size())
			System.out.println("Index out of bounds");
		else
		{
			
			int cnt=0;
			while(move.link!=null)
			{
				cnt++;
				if(cnt==index)
				{
					move.data=newdata;
				}
				move=move.link;
			}
			if(move.link==null&& index==size())
				move.data=newdata;
				
			
		}
	}
	
	public void display()
	{
		Node move=head;
		while(move.link!=null)
		{
			System.out.println(move.data);
			move=move.link;
		}
		System.out.println(move.data);
	}
	

}
