//Date with constructor
#include<iostream>
using namespace std;
class Time{
    int hour,min,sec;
    public:
    Time(int,int,int);
    void Display();
};
Time::Time(int h,int m,int s)
{
    hour=h;
    min=m;
    sec=s;
}
void Time::Display()
{
    cout<<"THe Time is: "<< hour<<":"<<min<<":"<<sec;
}
int main()
{
    Time t1(12,30,35);
    t1.Display();
    return 0;

}