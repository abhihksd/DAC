//class Complex with real and img 
//Over load +,-,*
//OVer load post and pre increment operators

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

    Complex operator+(Complex &);   //Operator overloading of +
    Complex operator-(Complex &);   //Operator overloading of -
    Complex operator*(Complex &);   //Operator overloading of *
    Complex operator++(int);        //Operator overloading of c++
    Complex operator++();           //Operator overloading of ++c
};
Complex Complex:: operator++(int a)
{
    Complex temp;
    temp.real=this->real++;
    temp.imag=this->imag++;
    return temp;

}
Complex Complex::operator++()
{
    Complex temp;
    temp.real=++this->real;
    temp.imag=++this->imag;
    return temp;
}
Complex Complex:: operator+(Complex &o)
{
    Complex temp;
    temp.real=this->real+o.real;
    temp.imag=this->imag+o.imag;
    return temp;
}
Complex Complex:: operator-(Complex &o)
{
    Complex temp;
    temp.real=this->real-o.real;
    temp.imag=this->imag-o.imag;
    return temp;
}
Complex Complex:: operator*(Complex &o)
{
    Complex temp;
    temp.real=this->real*o.real;
    temp.imag=this->imag*o.imag;
    return temp;
}
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
    // Complex c1;
    // Complex c2(10,20);
    // const Complex c3(30,40) ; //c3 is constant
    // c1.Display();
    // c2.Display();
    // //c3.Display();   c3 is a constant object and hence cant call Display which is not a const function 
    // cout<<c1.getReal()<<endl;
    // cout<<c2.getReal()<<endl;
    // cout<<c1.getimg()<<endl;
    // cout<<c2.getimg()<<endl;
    // cout<<c3.getReal()<<endl;
    // cout<<c3.getimg()<<endl;

    Complex a(10,20),b(30,40);
    Complex c;
    a.Display();
    b.Display();
    cout<<"Operator + overloading ";
    c=a+b;                                      //overloading + operator       
    c.Display(); 
    cout<<"Operator - overloading ";
    c=a-b;                                     //overloading - operator  
    c.Display();
    cout<<"Operator * overloading ";
    c=a*b;                                    //overloading * operator     
    c.Display();
    cout<<"Operator c++ overloading ";
    Complex d=c++;                                       //overloading c++ operator  
    d.Display();
    cout<<"Operator ++c overloading ";
    Complex e=++c;                                       //overloading ++C operator  
    e.Display();
    return 0;
}