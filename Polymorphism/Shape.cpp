#include <iostream>
#include<cmath>
using namespace std;
class Shape
{

public:
    long area, param;
    virtual void calcArea() = 0;
    virtual void calcParam() = 0;
};
class Circle : public Shape
{
    int side;

public:
    Circle() { side = 5; }
    void calcArea()
    {
        area = 3.14f * side * side;
        cout << "Area of circle: " << area << endl;
    }
    void calcParam()
    {
        param = 2 * 3.14f * side;
        cout << "Circumferemce of Circle: " << param << endl;
    }
};

class Square : public Shape
{
    int side;

public:
    Square() { side = 7; }
    void calcArea()
    {
        area = side * side;
        cout << "The area of Square is: " << area << endl;
    }
    void calcParam()
    {
        param = 4 * side;
        cout << "Parameter of square is: " << param << endl;
    }
};

class Triangle : public Shape
{
    int base, height;

public:
    Triangle()
    {
        base = 3;
        height = 4;
    }
    void calcArea()
    {
        area = (base * height) / 2;
        cout << "Area of triangle is: " << area << endl;
    }

    void calcParam()
    {
        int side=(base*base)+(height*height);
        side=sqrt(side);
        param = base + height+side;
        cout << "Parameter of triangle is: " << param << endl;
    }
};

int main()
{
    Shape *ptr[3];

    Circle c1;
    ptr[0] = &c1;
    ptr[0]->calcArea();
    ptr[0]->calcParam();
    cout << endl;
    Square s1;
    ptr[1] = &s1;
    ptr[1]->calcArea();
    ptr[1]->calcParam();
    cout << endl;
    Triangle t1;
    ptr[2] = &t1;

    ptr[2]->calcArea();
    ptr[2]->calcParam();
}