//Implement No argument constructor and paramerised conctructor for Date
#include<iostream>
using namespace std;
class Date{
    int day,month,year;
    public: 
    Date(int,int,int);
    Date();
    void display();

};
Date::Date(){
    day=month=1;year=2023;
}
Date::Date(int d,int m,int y=0)
{
    day=d;month=m;year=y;

}
void Date:: display()
{
    cout<<"The Date: "<<day<<"/"<<month<<"/"<<year<<endl;
}
int main()
{
    Date d0;
    Date d1(15,9,2023);
    d1.display();
    Date d2(12,3);
    d0.display();
    d2.display();
    d2=d1;
    d2.display();
    return 0;
}