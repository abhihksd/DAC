#include<iostream>
#include<fstream>
using namespace std;

int main()
{
    ifstream fin("abc.txt");
    char ch;
    while(fin)
    {
        ch=fin.get(); // main<--- file
        cout<<ch; // consol <--- main

    }
    fin.close();
    cout<<"\n\n\n";
    return 0;
}