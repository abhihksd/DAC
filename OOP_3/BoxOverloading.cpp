#include<iostream>
using namespace std;
class Box{
    private:
    int height,width,depth;
    public:
    Box();
    Box(int,int,int);
    void Display() const;
    int vol();
    bool operator<(Box&);
    bool operator>(Box&);
    bool operator==(Box&);
};
bool Box::operator<(Box &a)
{
    if (this->vol()<a.vol())
    return true;
    else 
    return false;
}
bool Box::operator>(Box &a)
{
     if (this->vol()>a.vol())
    return true;
    else 
    return false;
}
bool Box::operator==(Box &a)
{
     if (this->vol()==a.vol())
    return true;
    else 
    return false;
}


int Box:: vol()
{
    int v=height*width*depth;
    return v;
}
Box::Box()
{
    height=width=depth=1;   
}
Box::Box(int h,int w,int d)
{
    height=h;
    width=w;
    depth=d;
}
void Box::Display() const
{
    cout<<"Dimensions are :" <<height<<"x"<<width<<"x"<<depth<<endl<<endl;

}
int main()
{
    Box b1;
    Box b3(3,3,3);
    Box b2(2,4,3);
    b1.Display();b2.Display();
    if(b1>b3)
    cout<<"Condition is true"<<endl;
    else
    cout<<"Condition is false"<<endl;
    if(b2<b3)
    cout<<"Condition is true"<<endl;
    else
    cout<<"Condition is false"<<endl;
    if(b1==b3)
    cout<<"Condition is true"<<endl;
    else
    cout<<"Condition is false"<<endl;
   
    return 0;
}