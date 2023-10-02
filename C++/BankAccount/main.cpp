#include"BankAccount.cpp"
int BankAcc::cnt=0;
float BankAcc::interestRate=0.0;
int main()
{
    float f1=8.5f;
    //BankAcc::setIntRate(f);
    BankAcc b1;
    double bal;
    b1.setIntRate(f1);
    char n[20];
    cout<<"Enter name of customer";
    cin>>n;
    cout<<"Enter balance amount";
    cin>>bal;
    BankAcc b2(n,bal);
    b1.display();
    b2.display();
    

}