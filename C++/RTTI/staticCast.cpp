#include<iostream>
using namespace std;
#include<typeinfo>
int main()
{
    int a =11;float b;
    b=static_cast<float>(a)/2;
    cout<<b;
    return 0;
}