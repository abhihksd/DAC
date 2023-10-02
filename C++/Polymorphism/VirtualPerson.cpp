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
    virtual void display()
    {
        cout<<"Name: "<<name<<endl<<"Age: "<<age<<endl;
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
        cout<<"Empid: "<<empid<<endl;
        Person::display();
        cout<<"Base Salary: "<<salary<<endl;
    }
    virtual void calsal()=0;       //pure virtual function 
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
        cout<<"------------------------\n";
        Emp::display();
        cout<<"Hours :"<<hrs<<endl<<"Rate: "<<rate<<endl;
        cout<<"------------------------\n";
    }
    void calsal()
    {
        double sal=salary+(hrs*rate);
        cout<<"Calculated Salary of WageEmp: "<<sal<<endl;
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
        cout<<"Calculate Salary of SalesPerson: "<<sal<<endl;
    }
    void display()
    {
        cout<<"------------------------\n";
        Emp::display();
        cout<<"Sales: "<<sales<<endl<<"Commission: "<<com<<endl;
        cout<<"------------------------\n";
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
        cout<<"Calculated Salary of Manager : "<<sal<<endl;
    }
    void display()
    {
        cout<<"------------------------\n";
        Emp::display();
        cout<<"TA: "<<Ta<<endl<<"HRA: "<<HRA<<endl;
        cout<<"------------------------\n";
    }
};

int main()
{
     WageEmp w1(6, 12,101,10000,"Abhi",20);
     SalesPerson s1(5,10,102,20000,"Abhi2",21);
     Manager m1(5000,20000,103,500000,"Abhi3",23);
    // WageEmp w1(6, 12,101,10000,"Abhi",20);
    // w1.display();cout<<endl;
    // w1.calsal();cout<<endl;
    // SalesPerson s1(5,10,102,20000,"Abhi2",21);
    // s1.display();cout<<endl;
    // s1.calsal();cout<<endl;
    // Manager m1(5000,20000,103,500000,"Abhi3",40);
    // m1.display();cout<<endl;
    // m1.calsal();cout<<endl;



    //Polymorphism calliing the display function of derived classes using the Pointer for Person
    Person *ptr[3];
    ptr[0]=&m1;
    ptr[0]=new Manager(5000,20000,103,500000,"Abhi",20);
    ptr[0]->display();


    
    ptr[1]=&w1;
    ptr[1]=new WageEmp(6, 12,101,10000,"Abhi2",30);
    ptr[1]->display();


    ptr[2]=&s1;
    ptr[2]=new SalesPerson(5,10,102,20000,"Abhi3",21);
    ptr[2]->display();


//Emp class *pointer array to call calsal function 
    Emp *e[3];
    e[0]=&m1;
    e[0]=new Manager(5000,20000,103,500000,"Abhi4",20);
    e[0]->calsal();

    e[1]=&w1;
    e[1]=new WageEmp(6, 12,101,10000,"Abhi",20);
    e[1]->calsal();

    e[2]=&s1;
    e[2]=new SalesPerson(5,10,102,20000,"Abhi2",21);
    e[2]->calsal();

    return 0;
}
