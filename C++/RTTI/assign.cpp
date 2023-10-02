// 1. Declare variable with built in data type like(int,char,float,char[]).
//    Declare class and check it's data type at runtime.
//    a.use typeid operator and check data type of all variable at runtime.
//    b.In same cpp file write note on typeinfo class typeid operator.

#include<iostream>
#include<typeinfo>
using namespace std;
class Test{

};
int main()
{
    int a=10;char ch='A';float f=3.14f; char c[4]={'A','B','H','I'};
    Test t1;int b=20;                             //expected output will be
    cout<<"Type of int: "<<typeid(a).name()<<endl;                   //int
    cout<<"type of char :"<<typeid(ch).name()<<endl<<              //char
    "Type of float: "<<typeid(f).name()<<endl<<                    //float
    "Type of char array: "<<typeid(c).name()<<endl<<              //char[4] 
    "Type of char array element: "<<typeid(c[0]).name()<<endl<<   //char 
    "Type of class: "<<typeid(t1).name()<<endl;                    //class Test
    if(typeid(a)==typeid(ch))
    cout<<"Same";
    else
    cout<<"Type id of a is :"<<typeid(a).name();
    return 0;


}