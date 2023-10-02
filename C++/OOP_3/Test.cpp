#include<iostream>
using namespace std;
void Swap(int &a,int &b)
{
    int c;
    c=a;
    a=b;
    b=c;
}
void Swap(int* a,int* b)
{
    int c;
    c=*a;
    *a=*b;
    *b=c;
    
}
int main()
{
    int a=12,b=13;
    cout<<a<<"  "<<b;
    Swap(a,b);
    cout<<a<<"  "<<b;
    Swap(&a,&b);
     cout<<a<<"  "<<b;
    return 0;

}