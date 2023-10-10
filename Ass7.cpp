// virtual Destructor
#include<iostream>
using namespace std;

class Base
{
    public:
    Base()
    {
        cout<<"\n\t Iam in BAseconstructor ";
    }
    virtual ~ Base()
    {
        cout<<"\n\t Iam in BAse destructor ";
    }
};
class Derive:public Base
{
    public:
    Derive()
    {
        cout<<"\n\t I am in Derive constructor ";
    }
    ~Derive()
    {
        cout<<"\n\t Iam in Derivedestructor ";
    }
};

int main()
{
   // Base *b=new Base();

    //Derive d1;

    //delete b;

   // Derive *d=new Derive();
    //delete d;

    Base *b=new Derive();
    delete b;
    // only destructor for base class in invoke
    // to avoid this , we need to declare virtual destructor


    cout<<"\n\n\n\n";
    return 0;
}