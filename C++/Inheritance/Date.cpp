#include<iostream>
using namespace std;
#include"Date.h"

Date::Date()
{
    day=month=year=1;
}
Date::Date(int d,int m,int y)
{
    day=d; month=m; year=y;
}
void Date::display()
{
 cout<<day<<"/"<<month<<"/"<<year;
}