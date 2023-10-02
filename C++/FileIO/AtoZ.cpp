#include <iostream>
#include <fstream>
using namespace std;
int main()
{
    // ofstream fout("abc.txt");
    ofstream fout;
    int i;
    fout.open("abc.txt", ios::app);
    fout << "Know-IT Pune";
    fout << "\n\n";
    for (int i = 65; i <= 90; i++)
    {
        fout.put(char(i));
        fout.put(' ');
    }
    fout.close();
    return 0;
}