#include<iostream>
#include<fstream>
using namespace std;
class Student
{
    int rno;
    char name[20];
    float per;
    public:
    void Acept()
    {
        cout<<"\n\n\t Enter Rno Name and Per ";
        cin>>rno>>name>>per;
    }
    void Display()
    {
        cout<<"\n\n\t"<<rno<<"\t"<<name<<"\t"<<per;
    }
    void AddRecord()
    {
        ofstream fout("student.dat",ios::app|ios::binary);
        Student s1;
        s1.Acept();
        fout.write((char*)&s1,sizeof(Student));
        fout.close();
    }
    void DisplayRecords()
    {
        Student s1;
        // tellp ,tellg
        ifstream fin("student.dat",ios::binary);
        while(fin.read((char*)&s1,sizeof(s1)))
        {
            cout<<"\n\t ****** "<<fin.tellg();
 
            s1.Display();
        }
    }
};
int main()
{
    int ch;
    Student s1;
    do
    {
        cout<<"\n\n\t1. Add Record\
                 \n\t2. Display Records\
                 \n\t0. Exit\
                  \n\t Enter Your chocie ";
        cin>>ch;
        switch (ch)
        {
            case 1:
            s1.AddRecord();
            break;
        case 2:
        s1.DisplayRecords();
        break;
        }
            
    } while (ch!=0);
    


    cout<<"\n\n\n";
    return 0;

}