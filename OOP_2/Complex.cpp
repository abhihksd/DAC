//2. Create class Complex with data member real and imag.
//implement default constructor and paramerised constructor.
//Declare Display, getReal and getimg() functions as constant.
//Create constant object and check with constant and not constant function.
#include<iostream>
using namespace std;
class Complex{
    int real,imag;
    public:
    Complex();
    Complex(int,int);
    void Display() const;
    int getReal() const;
    int getimg() const; 
};
Complex::Complex()
{
    real=imag=1;
}
Complex::Complex(int a,int b)
{
    real=a; imag=b;
}
void Complex:: Display() const
{
    if(imag>0)
    cout<<real<<"+"<<imag<<"i"<<endl;
    else if(imag<0)
    cout<<real<<imag<<"i"<<endl;
    else
    cout<<real<<endl;
}
int Complex:: getReal() const
{
    return real;
}
int Complex:: getimg() const
{
    return imag;
}

int main()
{
    Complex c1;
    Complex c2(10,20);
    const Complex c3(30,40) ; //c3 is constant
    c1.Display();
    c2.Display();
    //c3.Display();   c3 is a constant object and hence cant call Display which is not a const function 
    cout<<c1.getReal()<<endl;
    cout<<c2.getReal()<<endl;
    cout<<c1.getimg()<<endl;
    cout<<c2.getimg()<<endl;
    cout<<c3.getReal()<<endl;
    cout<<c3.getimg()<<endl;
    return 0;
}