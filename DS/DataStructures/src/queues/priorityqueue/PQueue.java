package queues.priorityqueue;

import java.util.Arrays;

public class PQueue {
    int front;
    int rear;
    int size;
    Element [] e;
    public PQueue(int size)
    {
        this.size=size;
        front=rear=0;
        e=new Element[this.size];
    }
    public boolean isEmpty()
    {
        if(front==rear)
            return true;
        return false;
    }
    public boolean isFull()
    {
        if(rear==size-1)
            return true;
        else return false;
    }
    public void enQueue(Element e)
    {
        Element temp;
        if(!isFull())
        {

            this.e[rear++]=e;
            if(rear!=0)
            {
                for(int i=0;i<rear;i++)
                {
                    for(int j=0;j<rear-1;j++)
                    {
                        if(this.e[j].getPriority()>this.e[j+1].getPriority())
                        {
                            temp=this.e[j];
                            this.e[j]=this.e[j+1];
                            this.e[j+1]=temp;
                        }
                    }
                }
            }

        }

    }
    public Element deQueue()
    {
        Element e=null;
        if(!isEmpty())
        {
            e=this.e[++front];
        }
        return e;
    }
    public void display()
    {
        int temp=front;
        while(temp<rear)
        {
            System.out.println(this.e[temp]);
            temp++;
        }
    }



}
