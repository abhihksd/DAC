#include<iostream>
using namespace std;
class Math1
{
    public:
    int a,b;
    Math1(){a=10;b=2;}
    int add(){return (a+b);}
    int sub(){return (a-b);}  
    void calArea(int r){cout<<"Area of circle"<<3.14f*r*r;}
};
class Math2
{
    public:
    int a,b;
    Math2(){a=10;b=2;}
    int multi(){return a*b;}
    int div(){return a/b;}
    void calArea(int r){cout<<"Area of square"<<r*r;}
};
class calc:public Math1,public Math2{

};
int main()
{
    calc c1;
   cout<< c1.add()<<endl;
    cout<<c1.sub()<<endl;
    cout<<c1.multi()<<endl;
    cout<<c1.div()<<endl;
    c1.Math1::calArea(5);cout<<endl;
    c1.Math2::calArea(10);
    return 0;

}
