#include <iostream>
#include <string.h>
using namespace std;
class cstring
{

public:
    char *str;
    cstring() { strcpy(str, "NA"); };
    cstring(const char *st)
    {
        str = new char[strlen(st) + 1];
        strcpy(str, st);
    }
 
    ~cstring()
    {
        delete[] str;
    }
    friend ostream &operator<<(ostream &ot, const cstring& st)
    {
        ot << st.str;
        return ot;
    }
    friend istream &operator>>(istream &in,cstring& st)
    {
         in>>st.str;
        
        return in>>st.str;
    }
};
int main()
{
    char s[5] = "Abhi";
    cstring a;
    cstring c1(s);
    cout << c1;
    cin>>a;
    cout<<a.str;
    return 0;
}