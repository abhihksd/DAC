/*4. Create Employee class as 
employeelD integer
employeeName Object of String class 
permentAddress Object of Address class 
currentAdress Object of Address Class*/

#include<iostream>
#include<string.h>
using namespace std;
class cstring
{
    char* str;
    public:
    cstring();
    cstring(const char*);
    void display();
};
cstring::cstring()
{
    str=new char[1];
    str[0]='\0';

}
cstring::cstring(const char* str)
{
    this->str=new char[strlen(str)+1];
    strcpy(this->str,str);
}
void cstring::display()
{
    cout<<str;
}
//--------------------------------------------
//--------------------------------------------
class pincode
{
    int pin;
    public:
    pincode()
    {
        pin=0;
    }
    pincode(int p)
    {
        pin=p;
    }
    void display()
    {
        cout<<pin;
    }
};
/*----------------------------------------------
-----------------------------------------------*/
class Address
{
    pincode pin;
    cstring area;
    cstring city;
    public: 
    Address()
    {
        pin=pincode();
        area=cstring();
        city=cstring();
    }
    Address(int p,const char* area,const char* city)
    {
        pin=pincode(p);
        this->area=cstring(area);
        this->city=cstring(city);
    }
    void display()
    {
        cout<<"\n";
        pin.display();cout<<endl;
        area.display();cout<<endl;
        city.display();
    }
};
class Employee{
    static int cnt;
    int eid;
    cstring ename;
    Address per_ad;
    Address cur_ad;
    public:
    Employee();
    Employee(const char*,int ,const char*,const char*,int,const char*,const char*);
    void display();
};
int Employee::cnt=1000;
Employee::Employee()
{
    cnt++;
    eid=cnt;
    ename=cstring();
    per_ad=Address();
    cur_ad=Address();
}
Employee::Employee(const char* ename,int pp,const char* parea,const char* pcity,int cp,const char* carea,const char* ccity)
{
    cnt++;
    eid=cnt;
    this->ename=cstring(ename);
    per_ad=Address(pp,parea,pcity);
    cur_ad=Address(cp,carea,ccity); 
}
void Employee::display()
{
    cout<<"----------------------------Employee Details--------------------------------\n";
    cout<<"id"<<eid<<endl;
    cout<<"name               : ";ename.display();cout<<endl;
    cout<<"permanent address  : "; per_ad.display();cout<<endl;
    cout<<"Current Address    : "; cur_ad.display();cout<<endl;
    cout<<"-----------------------------------------------------------------------------\n";
}
int main()
{
    Employee e1;
    Employee e2("Abhi",452010,"Vijay Nagar","Indore",411030,"sadashiv","Pune");
    e1.display();
    e2.display();
}
