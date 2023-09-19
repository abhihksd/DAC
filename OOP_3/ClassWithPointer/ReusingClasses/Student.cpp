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
void cstring::display()
{
    cout << str << endl;
}


class Date
{
    int date,month,year;
    public:
    Date();
    Date(int,int,int);
    void display();
};
Date::Date()
{
    date=month=year=1;
}
Date::Date(int d,int m,int y)
{
    date=d;month=m;year=y;
}
void Date::display()
{
    cout<<date<<"/"<<month<<"/"<<year;
}
class Student
{
    static int cnt;
    int rno;
    cstring name;
    Date dob;    //date of birth
    Date doa;    //date of admission
    void display();
    public:
    
    Student(const char*,int,int,int,int,int,int);
};
int Student::cnt=0;

Student::Student(const char* name,int db,int mb,int yb,int da,int ma,int ya)
{
    cnt++;
    rno=cnt;
    dob=Date(db,mb,yb);
    doa=Date(da,ma,ya);
    this->name=cstring(name);
}
void Student::display()
{
    cout<<"Name             : ";
    name.display();cout<<endl;
    cout<<"Date of birth    : ";
    dob.display();cout<<endl;
    cout<<"Date of Admission: ";
    doa.display();
}
int main()
{
    char sr[5]="abhi";
    Student s1(sr,16,1,1996,18,9,2023);
    s1.display();
    return 0;;
}