//  Create class Employee with data type name.
//    Derive classes Programmer,DataBaseAdministrator,SystemAdministrator.
//    a. all classes has display and test functions.
//    a. programmer class has function Codding();
//    b. DataBaseAdministrator class has function CreateDataBase();
//    c. SystemAdministrator class has function SystemUpdate();
//    d. Create Array of Employee Pointer with size 5.
//    e. Check name of all classes  at runtime.
//    g. Excute class specific function from respective classes.
#include<iostream>
#include<typeinfo>
using namespace std;

class Employee{
    char name[20];
    public:
    virtual void display(){cout<<"we are in employee display function"<<endl;}
    virtual void test(){cout<<"We are in emplpoyee test function"<<endl;}
    

};
class Programmer:public Employee{
    public:
    void display(){cout<<"we are in programmer display function"<<endl;}
    void test(){cout<<"We are in programmer test function"<<endl;}
    void codding(){cout<<"Writing code *BEEPBOOP*"<<endl;}
};
class DataBaseAdmin:public Employee{
    public:
    void display(){cout<<"we are in Databaseadmin display function"<<endl;}
    void test(){cout<<"We are in Databaseadmin test function"<<endl;}
    void createDatabase(){cout<<"Creating Database *BEEBOOP*"<<endl;}

};
class SystemAdmin:public Employee{
    public:
     void display(){cout<<"we are in SystemAdmin display function"<<endl;}
      void test(){cout<<"We are in SystemAdmin test function"<<endl;}
      void sysupdate(){cout<<"Updating system *BEEPBOOP*"<<endl;}
};
void Check(Employee**);
int main()
{
    Employee *e[5];
    e[0]=new Programmer();
    e[1]=new DataBaseAdmin();
    e[2]=new SystemAdmin();
    for(int i=0;i<3;i++)
    {
        e[i]->display();
        e[i]->test();
    }
    //make employee into programmer
    Programmer *p=dynamic_cast<Programmer*>(e[0]);
    p->codding();
    DataBaseAdmin *d=dynamic_cast<DataBaseAdmin*>(e[1]);
    d->createDatabase();
    SystemAdmin *s=dynamic_cast<SystemAdmin*>(e[2]);
    s->sysupdate();
    Check(e);
return 0;    
}
void Check(Employee **es)
{
    for(int i=0;i<3;i++)
    cout<<typeid(es[i]).name()<<endl;

}