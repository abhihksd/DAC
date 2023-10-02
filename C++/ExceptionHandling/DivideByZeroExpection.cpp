#include<iostream>
using namespace std;
int main()
{
    int a=10,b=0;

    try{
        if(b==0)
        throw 100;
        cout<<"the division of a and b is: "<<a/b;

    }catch(int a){
        cout<<"Can't divide by zero";
    }
    cout<<"Add: "<<a+b<<endl;
    cout<<"Sub: "<<a-b<<endl;
    cout<<"Multi: "<<a*b<<endl;
    return 0;
} 