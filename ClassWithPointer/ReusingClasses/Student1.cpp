// using char name[]

#include <iostream>
#include <string.h>
using namespace std;
class Date
{
    int date, month, year;

public:
    Date();
    Date(int, int, int);
    void display();
};
Date::Date()
{
    date = month = year = 1;
}
Date::Date(int d, int m, int y)
{
    date = d;
    month = m;
    year = y;
}
void Date::display()
{
    cout << date << "/" << month << "/" << year;
}
class Student
{
    static int cnt;
    int rno;
    char name[20];
    Date dob;
    Date doa;

public:
    Student();
    Student(char *, int, int, int, int, int, int);
    void display();
    void setname(char *);
    void setdob(Date &);
    void setdoa(Date &);
};
int Student::cnt = 0;
Student::Student()
{
    cnt++;
    rno = cnt;
    strcpy(name, "NA");
    // dob and doa are already intialized at the time of declaration of objects
}
Student::Student(char *nm, int db, int mb, int yb, int da, int ma, int ya) : dob(db, mb, yb), doa(da, ma, ya)
{
    strcpy(name,nm);
    cnt++;
    rno = cnt;
}
void Student::setname(char *nm)
{
    strcpy(this->name, nm);
}
void Student::setdoa(Date &d)
{
    doa = d;
}
void Student::setdob(Date &d)
{
    dob = d;
}

void Student::display()
{
    cout << "Student details"<<endl;
    cout << rno << endl;
    cout << name << endl;
    dob.display();
    cout << endl;
    doa.display();
}
int main()
{
    Student s1;
    Date db(16, 1, 1996);
    Date da(20, 9, 2023);
    s1.display();
    char stname[20] = "Abhi";
    s1.setname(stname);
    s1.setdob(db);
    s1.setdoa(da);
    s1.display();
    return 0;
}
