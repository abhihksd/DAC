#include<iostream>
#include<string.h>
using namespace std;

class Person{
    char name[20];
    int age;
    public:
    Person();
    Person(const char*,int);
    void display();
};

Person::Person(){};
Person::Person(const char* nm,int ag)
{
    strcpy(name,nm);
    age=ag;
}
void Person::display()
{
    cout<<name<<endl<<age;
    
}

class Emp:public Person
{
    int empid;
    double salary;
    public:
    Emp();
    Emp(int,const char*,int,double); //empid name age sal
    void display();
};

Emp::Emp(){empid=0;salary=0;}
Emp::Emp(int eid,const char*nm,int age,double sal)
{
    this->empid=eid;
    this->salary=sal;
    Person:Person(nm,age);
}
void Emp::display()
{
    cout<<empid<<salary;
    Person:display();
    
}
class wageemp: public Emp{
    double hrs,rate;
    public:
    wageemp();
    wageemp(double,double,const char*, int,int,double);
    
};