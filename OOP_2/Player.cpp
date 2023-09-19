// 3. Write a program to create a class player with members as
// 1. player_Id
// 2. Player_name char
// 3. runs
// 4. wickets taken
// 5. innings played.
// Create an array of 10 players and write functions to display information of player write global functions for
// 1. Dipslay player having maximum runs
// 2. Display player having maximum wkts.
#include <iostream>
using namespace std;
class Player
{
private:
    int pid, runs, wkts, inn;
    char Player_name[20];
    // const int player_no;
public:
    // void setRuns();
    // void setWkts();
    void setData();
    int getRuns();
    int getWkts();
    void display();
};
void Player::display()
{
    cout << "Player Details :" << Player_name << pid << endl
         << runs << endl
         << wkts << endl
         << inn << endl;
}
void Player::setData()
{
    cout << "enter the details of the player pid,runs,wkts,inn,name";
    cin >> pid >> runs >> wkts >> inn >> Player_name;
}
int Player::getRuns()
{
    return runs;
}
int Player::getWkts()
{
    return wkts;
}

Player maxRuns(Player p[],int size)
{
    Player mr = p[0];
    int max = mr.getRuns();
    for (int i = 1; i < size; i++)
    {
        if (p[i].getRuns() > max)
        {
            max = p[i].getRuns();
            mr = p[i];
        }
    }
    mr.display();
    return mr;
}
Player maxWkts(Player p[],int size)
{
    Player mw = p[0];
    int max = p[0].getWkts();
    for (int i = 1; i < size; i++)
    {
        if (p[i].getWkts() > max)
        {
            max = p[i].getWkts();
            mw = p[i];
        }
    }
    mw.display();
    return mw;
}

int main()
{
    Player p[2];
    
    for (int i = 0; i < 2; i++)
    {
        p[i].setData();
    }
    for (int i = 0; i < 2; i++)
    {
        p[i].display();
    }
    int size=sizeof(p)/sizeof(p[0]);
    //cout<<"the size of array is "<<size;
    Player P_Max_Run = maxRuns(p,size);
    cout << "The player with maximum runs is : ";

    P_Max_Run.display();
    cout << "The player with maximum wickets is : ";
    maxWkts(p,size).display();
    return 0;
}