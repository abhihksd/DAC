#ifndef STR
#define STR
#include<iostream>
using namespace std;
class cstring
{
    char *str;
    public:
    cstring();
    cstring(const char*);
    cstring(cstring&);
    // cstring operator=(cstring&);
    void display();
    ~cstring();
};
#endif