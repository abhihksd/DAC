package queues.priorityqueue;

public class PriorityQ {
    public static void main(String[] args) {
        Element e=new Element(10,1);
        Element f=new Element(20,5);
        Element g=new Element(30,2);
        Element h=new Element(40,3);
    PQueue p=new PQueue(10);
    p.enQueue(e);
    p.enQueue(f);
    p.enQueue(g);
    p.enQueue(h);
    p.deQueue();
    p.display();
    }

}
