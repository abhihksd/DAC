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
    cout<<"------Bank Details of : "<<acNo<<"-------------------\n";
    cout<<"Account Number        : "<<acNo<<endl;
    cout<<"Name                  : "<<name<<endl;
    cout<<"Balance               : "<<balance<<endl;
    cout<<"Interest Rate         : "<<interestRate<<endl;
    cout<<"--------------------------------------------\n";

}
void BankAcc::setIntRate(float f)
{
    interestRate=f;
}