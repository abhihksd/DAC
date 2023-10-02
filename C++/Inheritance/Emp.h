#include"Person.h"
#include"person.cpp"
#ifndef EMP
#define EMP
class Emp:public Person
{
    int empid;
    double salary;
    public:
    Emp();
    Emp(int,const char*,int,int,int,double);
    void display();
};
#endif
