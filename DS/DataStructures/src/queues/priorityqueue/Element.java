package queues.priorityqueue;

public class Element {
    int data;
    int priority;
    public Element(int data,int priority)
    {
        this.data=data;
        this.priority=priority;
    }

    public int getPriority() {
        return priority;
    }


    public String toString() {
        return "Element{" +
                "data=" + data +
                ", priority=" + priority +
                '}';
    }

}
