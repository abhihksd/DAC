package Demo;

import java.util.Scanner;

import bank.*;

public class BankAccountDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new SavingsAccount(1001, "Abhi", 10000);
		Account a2 = new RecurringAccount(1002, "NotAbhi", 20000, 500);
		System.out.println(a1);
		a1.withdraw(1000);
		System.out.println(a1.getBalance());
		a2.withdraw(100);
		int acno, type;
		String nm;
		double balance, amt, inst;
		Account[] accs = new Account[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < accs.length; i++) {
			System.out.println("Enter type of account: \n1.Savings \n2.Recurring");
			type = sc.nextInt();
			if (type == 1) {
				System.out.println("Enter acno: ");
				acno = sc.nextInt();
				System.out.println("Enter name: ");
				nm = sc.next();
				System.out.println("Enter balance");
				balance = sc.nextDouble();
				accs[i] = new SavingsAccount(acno, nm, balance);
			
			}
			if (type == 2) {
				System.out.println("Enter acno: ");
				acno = sc.nextInt();
				System.out.println("Enter name: ");
				nm = sc.nextLine();
				System.out.println("Enter balance: ");
				balance = sc.nextDouble();
				System.out.println("Enter installment: ");
				inst=sc.nextDouble();
				accs[i]=new RecurringAccount(acno,nm,balance,inst);

			}

		}
		sc.close();

	}

}
