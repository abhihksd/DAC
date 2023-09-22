#include<iostream>
#include<string.h>
using namespace std;
//#include"Emp.cpp"
class cstring
{
    char *str;
    public:
    cstring();
    cstring(const char*);
    cstring(cstring&);
     cstring operator=(cstring&);
    void display();
    ~cstring();
};
 //cstring cstring::operator=(cstring&);

cstring::cstring()
{
    this->str=new char[5];
    strcpy(str,"NA");
}
cstring::cstring(const char *str)
{
    this->str=new char[strlen(str)+1];
    strcpy(this->str,str);
}
cstring::cstring(cstring &obj)
{
    this->str=new char[strlen(obj.str)+1];
    strcpy(this->str,obj.str);

}
cstring cstring::operator=(cstring &obj)
{
    this->str=new char[strlen(obj.str)+1];
    strcpy(this->str,obj.str);
    return *this;

 }
cstring::~cstring()
{
    delete[] str;
}

void cstring::display()
{
    cout<<str<<endl;
}
class Date{
    int day,month,year;
    public:
    Date();
    Date(int,int,int);
    void display();
};
Date::Date()
{
    day=month=year=1;
}
Date::Date(int d,int m,int y)
{
    day=d; month=m; year=y;
}
void Date::display()
{
 cout<<day<<"/"<<month<<"/"<<year;
}

class Person{
    cstring name;
    Date dob;
    public:
    Person();
    Person(const char*,int,int,int);
    void display();
};

Person::Person(){};
Person::Person(const char* nm,int d,int m,int y):name(nm),dob(d,m,y)
{
    //name=cstring(nm);
    //dob=Date(d,m,y);
}
void Person::display()
{
    name.display();
    dob.display();
}
class Emp:public Person
{
    int empid;
    double salary;
    public:
    Emp();
    Emp(int,const char*,int,int,int,double);
    void display();
};Emp::Emp(){empid=0;salary=0;}
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


int main()
{
    Emp e1;
    Emp e2(101,"abhi",16,1,1996,10000);
    e1.display();
    e2.display();
    return 0;
}