#include<iostream>
#include<string.h>
using namespace std;
class Book{
    
    static int cnt;
    int bookid;
    float price;
    char *bookname;
    public:
    Book();                       //..Default Constructor..
    Book(const char*,float);      //..Parameterized Constructor..
    Book(Book&);                  //..Copy Constructor..
    ~Book();                      //..Destructor..
    void Display() const;
};
Book::Book()
{
    cnt++;
    bookid=cnt;
    price=0;
    bookname=new char[2];
    strcpy(bookname,"N");
}

Book::Book(const char *name,float price)
{
    cnt++;
    bookid=cnt;
    this->price=price;
    bookname=new char[strlen(name)+1];
    strcpy(bookname,name);
}
Book::Book(Book &obj)
{
    
    this->bookid=obj.bookid;
    this->bookname=new char[strlen(obj.bookname)+1];
    strcpy(this->bookname,obj.bookname);
    this->price=obj.price;
}
Book::~Book()
{
    delete[] bookname;
}
void Book::Display() const
{
    cout<<endl;
 cout<<"\n----------Book "<<bookid<<" Details--------------\n";
 cout<<"Book      : "<<bookid<<endl<<
       "Book Name : "<<bookname<<endl<<
       "Price     : "<<price;
}
int Book::cnt=0;
int main()
{
    Book b1;
    Book b2("Lets C++",132.5f);
    b1.Display();
    b2.Display();
    Book b3=b2;
    b3.Display();
    return 0;
}