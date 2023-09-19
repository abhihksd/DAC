#include<iostream>
using namespace std;
class BankAcc{
private:
int acNo;
static int cnt;
char name[20];
double balance;
static float interestRate;
public:
static void setIntRate(float);
BankAcc();
BankAcc(const char*,double); //name,balance
void display();
};