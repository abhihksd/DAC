#include <iostream>
#include <string.h>
using namespace std;
class cstring
{
    int length;
    char *name;

public:
    cstring();
    cstring(int, char *);
    cstring(cstring &);
    ~cstring();
    void display();
    bool operator<(cstring &);
    bool operator>(cstring &);
    bool operator==(cstring &);
    cstring operator=(cstring &);
    char& operator[](int);
};
bool cstring::operator<(cstring &obj)
{
     if(strcmp(this->name,obj.name)==-1)
     return true;
     else
     return false;

}
bool cstring::operator>(cstring &obj)
{
    if(strcmp(this->name,obj.name)==1)
     return true;
     else
     return false;

}
bool cstring::operator==(cstring &obj)
{
    if(strcmp(this->name,obj.name)==0)
     return true;
     else
     return false;
}
cstring cstring::operator=(cstring &obj)
{
    this->length=obj.length;
    this->name=new char[this->length+1];
    strcpy(this->name,obj.name);
    return *this;
}
char& cstring:: operator[](int ind)
{
    if(ind>=0 && ind<this->length)
    return this->name[ind];   
}

cstring::cstring()
{
    length = 1;
    name = new char[length];
    name[0] = '\0';
}
cstring::cstring(int len, char* name)
{
    length = len;
    this->name = new char[length + 1];
    strcpy(this->name, name);
}
cstring::cstring(cstring &obj)
{
    this->length = obj.length;
    this->name = new char[this->length + 1];
    strcpy(this->name,obj.name);
}
cstring::~cstring()
{
    delete[] name;
}
void cstring::display()
{
    cout << "String name: " << name << endl;
}
int main()
{
    char str[6]="Neeta";
    char str2[6]="Seeta";
    cstring c1(5,str);
    cstring c2(5, str2);
    cstring c3 = c2;
    c1.display();
    c2.display();
    c3.display();
    if(c1>c2)
     cout<<"C1 is greater than c2"<<endl;
     else 
     cout<<"C2 is greater than c1"<<endl;

    if(c1>c2)
     cout<<"C1 is greater than c2"<<endl;
     else 
     cout<<"C2 is greater than c1"<<endl;

    if(c3==c2)
     cout<<"C1 is equal to c2"<<endl;
     else 
     cout<<"C2 is not equal c1"<<endl;

     cout<<"Overloading subscript[] operator"<<c1[3];
}