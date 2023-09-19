#include<iostream>
#include<string.h>
using namespace std;
class cstring{
    int length;
    char *name;
    public:
    cstring();
    cstring(int, char*);
    cstring(cstring&);
    ~cstring();
    void display(); 
};
cstring::cstring()
{
    length=1;
    name=new char[length];
    name[0]='\0';   
}
cstring::cstring(int len,char *name)
{
    length=len;
    this->name=new char[length+1];
    strcpy(this->name,name);
}
cstring::cstring(cstring &obj)
{
    this->length=obj.length;
    this->name=new char[this->length+1];
    strcpy(this->name,name);

}
cstring::~cstring()
{
    delete[] name;
}
void cstring::display()
{
    cout<<"String name: "<<name<<endl;
    
}
int main()
{
    cstring c1;
    cstring c2(5,"Seeta");
    cstring c3=c2;
    c1.display();
    c2.display();
    c3.display();
}