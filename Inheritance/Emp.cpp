#include"Emp.h"
Emp::Emp(){empid=0;salary=0;}
Emp::Emp(int eid,const char*nm,int d,int m,int y,double sal):Person(nm,d,m,y)
{
    this->empid=eid;
    this->salary=sal;
}
void Emp::display()
{
    cout<<empid<<endl;
    Person::display();
    cout<<endl;
    cout<<salary;
}