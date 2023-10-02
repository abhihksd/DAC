// . Create a class Point having data members as x, y (co-ordinates).
// Add static data member ct to countnumber of objects created.
// Implement display function to display the co-ordinates like [10,20].
// Print number of object created.

#include <iostream>
using namespace std;
class Point
{
    int x, y;
    static int cnt;

public:
    void display();
    Point(int, int);
    int getcnt();
};
int Point::getcnt()
{
    return cnt;
}
Point::Point(int a, int b)
{
    x = a;
    y = b;
    cnt++;
}
void Point::display()
{
    cout << "[" << x << "," << y << "]";
}
int Point::cnt;

int main()
{
    Point p1(10, 20);
    Point p2(30, 40);
    cout << p1.getcnt();
}