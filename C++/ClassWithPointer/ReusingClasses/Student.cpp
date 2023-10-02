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
    cout << str ;
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
    
    public:
    void setdata(const char* ,int ,int ,int,int,int ,int);
    void display();
    Student();
    Student(const char*,int,int,int,int,int,int);
};
int Student::cnt=0;
void Student::setdata(const char* name,int db,int mb,int yb,int da,int ma,int ya)
{
this->name=cstring(name);
    dob=Date(db,mb,yb);
    doa=Date(da,ma,ya);
}
Student::Student()
{
    cnt++;
    rno=cnt;
    dob=Date();
    doa=Date();

}
Student::Student(const char* name,int db,int mb,int yb,int da,int ma,int ya):dob(db,mb,yb),doa(da,ma,ya)
{
    cnt++;
    rno=cnt;
   // dob=Date(db,mb,yb);  we have called the constuctor through member initializer list 
    //doa=Date(da,ma,ya); 
    this->name=cstring(name);
}
void Student::display()
{
    cout<<"--------Details--------\n";
    cout<<"Roll Number       : \n"<<rno<<endl;
    cout<<"Name             : ";
    name.display();cout<<endl;
    cout<<"Date of birth    : ";
    dob.display();cout<<endl;
    cout<<"Date of Admission: ";
    doa.display();
}
int main()
{
    char sr[10];
    int bd,bm,by,ad,am,ay;  
   // Student s1("abhi",16,1,1996,18,9,2023);
    Student *s;
    s=new Student[5];
    for(int i=0;i<5;i++)
    {
        
        cout<<"Enter Name  \n";
        cin>>sr;
        cout<<"Date of Birth dd/m/yyy\n";
        cin>>bd>>bm>>by; 
        cout<<"Date of Year dd/m/yyyy\n";
        cin>>ad>>am>>ay;
        s[i].setdata(sr,bd,bm,by,ad,am,ay);
    }
    for(int i=0;i<5;i++)
    s[i].display();

   // s1.display();                        
    return 0;;
}