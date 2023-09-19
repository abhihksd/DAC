#include<iostream>
#include<string.h>
using namespace std;
class cstring
{
    int len;
    char *str;

public:
    cstring();
    cstring(const char *);
   // ~cstring(); // destructor
    void display();
    cstring(cstring &);
};
cstring::cstring(cstring &ref)
{
    this->len=ref.len;
    this->str=new char[this->len+1];
    strcpy(this->str,ref.str);
}
cstring::cstring()
{
    len = 1;
    str = new char[len];
    str[0] = '\0';
}
cstring::cstring(const char *str)
{
    len = strlen(str);
    this->str = new char[len + 1];
    strcpy(this->str, str);
}
// cstring::~cstring()
// {
//     delete[] str;
// }
void cstring::display()
{
    cout << str << endl;
}


class Date{
    int day,month,year;
    public: 
    Date(int,int,int);
    Date();
    void display();

};
Date::Date(){
    day=month=1;year=2023;
}
Date::Date(int d,int m,int y=0)
{
    day=d;month=m;year=y;

}
void Date:: display()
{
    cout<<"The Date: "<<day<<"/"<<month<<"/"<<year<<endl;
}

class Person{
    cstring name;
    Date dob;
    public: 
    Person();
    Person(const char*,int,int,int);
    void display();
};
Person::Person(const char* str,int d,int m,int y)//: name(str), dob(d,m,y)
{
    this->name=cstring(str);
    dob=Date(d,m,y);
}

void Person::display()
{
    name.display();
    dob.display();
}

int main()
{
    char sr[5]="abhi";
    Person p1(sr,18,9,2023);
    p1.display();
}