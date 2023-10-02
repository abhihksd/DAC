#include <iostream>
using namespace std;
class A
{
public:
    int a;
    A() { cout << "We are in A\n"; }
    void display()
    {
        cout << "we are in A.display()\n";
    }
};
class B : virtual public A
{
    double d1;

public:
    B() { cout << "WE are in B\n"; }
};
class C : virtual public A
{
    int a;

public:
    C() { cout << "WE are in C\n"; }
};
class D : public B, public C
{
    char a;

public:
    D() { cout << "WE are in D\n"; }
};
int main()
{
    D d1;
    d1.display();
    cout << "Size of A " << sizeof(A) << endl;
    cout << "Size of B " << sizeof(B) << endl;
    cout << "Size of C " << sizeof(C) << endl;
    cout << "Size of D " << sizeof(D) << endl;
    return 0;
}