package _01_Intro;

public class Palindrome {
	public boolean isPalindrome(int num) {
		
		int temp = num;
		int rev = 0, mod;
		while (num > 0) {
			mod = num % 10;
			num = num / 10;
			rev = (rev * 10) + mod;

		}
		if (rev == temp) {
			//System.out.println(temp + " is palindrome. ");
			return true;
		}
		else return false;

	}

}
