#include<iostream>
using namespace std;
#include<string.h>
class Person{
    char name[20];
    int age;
    public:
    Person(){age=18;strcpy(name,"Na");}
    Person(const char*nm,int age)
    {
        strcpy(name,nm);
        this->age=age;
    }
    void display()
    {
        cout<<name<<endl<<age<<endl;
    }
};
class Emp:public Person
{
    int empid;
    protected: 
    double salary;
    public:
    Emp(){empid=0;salary=0;}
    Emp(int empid,double salary,const char* nm,int age):Person(nm,age)
    {
        this->empid=empid;
        this->salary=salary;
    }
    void display()
    {
        cout<<empid<<endl;
        Person::display();
        cout<<salary<<endl;
    }
};

class WageEmp:public Emp{
    double hrs,rate;
    public:
    WageEmp()
    {
        hrs=0;rate=10;
    }
    WageEmp(double hr,double rt,int empid,double salary,const char* nm,int age):Emp(empid,salary,nm,age)
    {
        hrs=hr;
        rate=rt;
    }
    void display()
    {
        Emp::display();
        cout<<hrs<<endl<<rate<<endl;
    }
    void calsal()
    {
        double sal=salary+(hrs*rate);
        cout<<sal<<endl;
    }
};
class SalesPerson:public Emp
{
    int sales;
    int com;
    public:
    SalesPerson()
    {
        sales=0;com=0;
    }
    SalesPerson(int sales,int com,int empid,double salary,const char* nm,int age):Emp(empid,salary,nm,age)
    {
        this->sales=sales;
        this->com=com;
    }
    void calsal()
    {
        double sal=salary+(sales*com);
        cout<<sal<<endl;
    }
    void display()
    {
        Emp::display();
        cout<<sales<<endl<<com<<endl;
    }

};

class Manager:public Emp
{
    int Ta,HRA;
    public:
    Manager()
    {
        Ta=100;HRA=1000;
    }
    Manager(int ta,int hra,int empid,double salary,const char* nm,int age):Emp(empid,salary,nm,age)
    {
        this->Ta=ta;
        this->HRA=hra;
    }
    void calsal()
    {
        double sal=salary+Ta+HRA;
        cout<<sal;
    }
    void display()
    {
        cout<<Ta<<endl<<HRA<<endl;
        Emp::display();
    }
};

int main()
{
    WageEmp w1(6, 12,101,10000,"Abhi",20);
    w1.display();cout<<endl;
    w1.calsal();cout<<endl;
    SalesPerson s1(5,10,102,20000,"Abhi2",21);
    s1.display();cout<<endl;
    s1.calsal();cout<<endl;
    Manager m1(5000,20000,103,500000,"Abhi3",40);
    m1.display();cout<<endl;
    m1.calsal();cout<<endl;
    return 0;
}
