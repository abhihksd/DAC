package string_cstack;

public class Cstack {
    private int top;
    private int size;
    private String[] arr;

    public Cstack() {
        top = -1;
        size = 3;
        arr = new String[size];

    }

    public Cstack(int size) {
        top = -1;
        this.size = size;
        arr = new String[this.size];
    }

    public boolean isEmpty() {
        if (top == -1)
            return true;
        else return false;

    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else return false;
    }

    public void push(String str) {
        if (top == size - 1) {
            System.out.println("Stack is full");
        } else {
            top++;
            arr[top] = str;
        }
    }

    public String pop() {
        if (top == -1) {
            System.out.println("stack is empty");
            return "NA";

        } else {
            return arr[top--];
        }
    }
    public void display()
    {
        System.out.println("Stack: ");
        int temp=top;
        while(temp>-1)
        {
            System.out.println(arr[temp]);
            temp--;

        }
    }
    public String peek()
    {
        return arr[top];
    }
}
