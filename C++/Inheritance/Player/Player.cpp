#include <iostream>
#include <string.h>
using namespace std;
class Player
{
    int pid;
    char pname[20];
    public:
    Player();
    Player(int,const char* );
    void display();
    void setdata(int,const char*);
};
Player::Player()
{
    pid = 0;
    strcpy(pname, "NA");
}
Player::Player(int id, const char *nm)
{
    this->pid = id;
    strcpy(this->pname, nm);
}

void Player::display()
{
    cout << pid << endl
         << pname;
}
void Player::setdata(int id, const char *nm)
{
    this->pid = id;
    strcpy(this->pname, nm);
}
class Batsman : public Player
{
    int inn, notout, runs;

public:
    float calcavg(); // avg=run/(inn-notout)
    Batsman();
    //  Batsman(int,const char *,int,int,int);
    void readData(int, const char*, int, int, int);
    void display();
};
float Batsman::calcavg()
{
   
    
        float avg = runs / (inn - notout);
        return avg;
    
}
Batsman::Batsman()
{
    inn = notout = runs = 1;
}
// Batsman::Batsman(int id,const char * nm,int inn,int notout,int runs)
void Batsman::readData(int id,const char *nm, int inn, int notout, int runs)
{
   Player:setdata(id,nm);
    this->inn = inn;
    this->notout = notout;
    this->runs = runs;
}
void Batsman::display()
{
    Player::display();
    cout<<inn<<endl<<notout<<endl<<runs;
}

int main()
{
    // Batsman b;
    // char s[20]="Abhi";
    // b.readData(101,s,3,1,100);
    // b.display();
    // cout<<b.calcavg();
    Batsman s1;
    char s[]="Abhi";
    s1.readData(101,s,3,1,100);
    cout<<"this is the avg"<<s1.calcavg()<<endl;
    s1.display();
    return 0;
}