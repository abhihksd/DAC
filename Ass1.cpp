// Create file for Writing
#include<iostream>
#include<fstream>
using namespace std;

/*int main()
{
    // Open File For Writing
    //ofstream fout("abc.txt"); // object with constructor
    ofstream fout;
    fout.open("abc.txt");
    fout<<"Know-IT Pune.";
    fout.close();
    
    cout<<"\n\n\n\n";
    return 0;
}*/
int main()
{
    // Open File For Writing
    //ofstream fout("abc.txt"); // object with constructor
    ofstream fout;
    int i;
    fout.open("abc.txt",ios::app);
    fout<<"Know-IT Pune.";
    
    // Write A to z characters in file
    // with for loop insert character by character
    fout<<"\n\n";
    for(i=65;i<=90;i++)
    {
        fout.put(char(i));
        fout.put(' ');

    }
    fout.close();
    cout<<"\n\n\n\n";
    return 0;
}