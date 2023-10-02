#include<iostream>
#include<fstream>
#include<ctype.h>
using namespace std;
int main()
{
    fstream fin;
    char ch;
     fin.open("AtoZ.cpp",ios::in);
    // while(fin)
    // {
    //     ch=fin.get();
    //     cout<<ch;
    // }
int cnt=0,space_cnt=0,digit_cnt=0,new_cnt=0;
    while(fin)
    {
        ch=fin.get();
        if(isalpha(ch))
        {
            cnt++;
        }
        else if(ch==' ')
        {
            space_cnt++;
        }
        else if(isdigit(ch))
        {
            digit_cnt++;
        }
        else if(ch=='\n')
        new_cnt++;

    }
    
    cout<<"Number of characters: "<<cnt<<endl<<
          "number of spaces: "<<space_cnt<<endl<<
          "Number of digits : "<<digit_cnt<<endl<<
          "Number of new lines: "<<new_cnt;
    fin.close();
    return 0;
}