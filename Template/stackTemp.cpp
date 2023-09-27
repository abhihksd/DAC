#include <iostream>
using namespace std;
template <class T>
class cstack
{
private:
    int size;
    int top;
    T *arr;

public:
    cstack()
    {
        size = 3;
        top = -1;
        arr = new T[size];
    }
    cstack(int sz)
    {
        size = sz;
        top = -1;
        arr = new T[size];
    }
    void push(T e)
    {
            top++;
            arr[top] = e;  
    }
    int pop()
    {
        int no;
        if (top < 0)
        {
            cout << "Stack is empty";
        }
        else
        {
            no = arr[top];
            top--;
        }
        return no;
    }
    int getTop()
    {
        return top;
    }
    
    void display()
    {
        cout << "The stack is: " << endl;
        for (int i = top; i >= 0; i--)
        {
            cout << arr[i] << endl;
        }
    }
};
int main()
{
    int ch,n,size=5,type;
    cstack<int> c1(size);
    // c1.push(10);
    // c1.push(20);
    // c1.push(30);
    // c1.push(40);
    // c1.push(50);
    // c1.display();
    // cout<<"Stack after pop"<<endl;
    // c1.pop();
    // c1.display();
    do
    {
        cout << "\n Enter choice \n 1. Push\n 2. Pop\n 3. Display";
        cin >> ch;
        switch (ch)
        {
        case /* constant-expression */ 1:
        if(c1.getTop()<size)
        {
            cout << "Enter the number to push: " << endl;
            cin >> n;
            c1.push(n);
        }
        else
        {
        cout<<"Stack is full\n";
        }
            break;
        case 2:
            cout << "The element being removed is: " << c1.pop();
            break;
        case 3:
            c1.display();
            break;

        default:
            break;
        }
    }while(ch!=0);
    return 0;
}