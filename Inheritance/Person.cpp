#include"Person.h"
Person::Person(){};
Person::Person(const char* nm,int d,int m,int y):name(nm),dob(d,m,y)
{
    // name=cstring(nm);
    // dob=Date(d,m,y);
}
void Person::display()
{
    name.display();
    cout<<endl;
    dob.display();
}