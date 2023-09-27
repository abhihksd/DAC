#include <iostream>
using namespace std;
template <class E>
bool search(E *a, E item, int b)
{
    for (int i = 0; i < b; i++)
    {
        if (a[i] == item)
        {
            return true;
            break;
        }
    }
    return false;
}
template <class T>
void Swap(T &a, T &b)
{
    T temp;
    temp = a;
    a = b;
    b = temp;
}

int main()
{

    // Swapping using template
    int a = 5, b = 10;
    char c = 'A', d = 'B';
    cout << "Before swap: " << a << " " << b << endl;
    Swap<int>(a, b);
    cout << "After swap: " << a << " " << b << endl;

    cout << "Before swap: " << c << " " << d << endl;
    Swap(c, d);
    cout << "After swap: " << c << " " << d << endl;

    // Lenear Search using template
    int ar[5] = {2, 5, 3, 6, 1};
    if (search(ar, 3, 5))
    {
        cout << "Item found" << endl;
    }
    else
        cout << "Item not found" << endl;

    char arr[5] = {'a', 'c', 'd', 'r', 'e'};

    if (search(arr, 'd', 5))
    {
        cout << "Item found" << endl;
    }
    else
        cout << "Item not found" << endl;
    return 0;
}