// 3. Create class Address area,city object of String class pinCode interger
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
    str=new char[2];
    str="NA";
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
    Address(int p,char* area,char* city)
    {
        pin=pincode(p);
        this->area=cstring(area);
        this->city=cstring(city);
    }
    void display()
    {
        cout<<"The address is :\n";
        pin.display();cout<<endl;
        area.display();cout<<endl;
        city.display();
    }
};
int main()
{
    Address a1(411030,"sadashiv","Pune");
    a1.display();
    Address a2;
    cout<<"THe default address is:"<<endl;
    a2.display();

}