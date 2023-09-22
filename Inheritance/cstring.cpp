#include"cstring.h"
#include<string.h>

cstring::cstring()
{
    strcpy(str,"NA");
}
cstring::cstring(const char *str)
{
    this->str=new char[strlen(str)+1];
    strcpy(this->str,str);
}
cstring::cstring(cstring &obj)
{
    this->str=new char(strlen(obj.str)+1);
    strcpy(this->str,obj.str);

}
// cstring cstring::operator=(cstring &obj)
// {
//     this->str=new char[strlen(obj.str)+1];
//     strcpy(this->str,obj.str);
//     return *this;

// }
cstring::~cstring()
{
    delete[] str;
}

void cstring::display()
{
    cout<<str<<endl;
}
