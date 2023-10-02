#include <iostream>
#include <string.h>
using namespace std;
class cstring
{
    int len;
    char *str;

public:
    cstring();

    cstring(const char *);
    ~cstring(); // destructor
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
cstring::~cstring()
{
    delete[] str;
}
void cstring::display()
{
    cout << len << str << endl;
}
int main()
{
    cstring c1;
    cstring c2("Abhi");
    c2.display();
    // c2.~cstring();
    c2.display();
    {
        cstring c1 = c2;
    }
    c1.display();
    c2.display();
    cout<<"User defined copy constructor";
    //Copy constructor user defined 
    {
        cstring c1(c2);
    }
    return 0;
}
