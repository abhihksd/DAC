#include"BankAccount.h"
#include<string.h>
BankAcc::BankAcc()
{
    cnt++;
    acNo=cnt;
    strcpy(name,"NA");
    balance=0;
}

BankAcc::BankAcc(const char *name,double bal)
{
    cnt++;
    acNo=cnt;
    strcpy(this->name,name);
    balance=bal;

}

void BankAcc::display()
{
    cout<<"------Bank Details of "<<acNo<<"----------";
    cout<<acNo<<endl;
    cout<<name<<endl;
    cout<<balance<<endl;
    cout<<interestRate<<endl;
    cout<<"-------------------------------------------";

}
void BankAcc::setIntRate(float f)
{
    interestRate=f;
}