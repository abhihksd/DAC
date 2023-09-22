#include"cstring.cpp"
#include"Date.cpp"
#ifndef PER
#define PER
class Person{
    cstring name;
    Date dob;
    public:
    Person();
    Person(const char*,int,int,int);
    void display();
};
#endif
