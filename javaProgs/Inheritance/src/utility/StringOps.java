package utility;

import interfaces.StringOperation;

public class StringOps implements StringOperation {

	@Override
	public void reverse(String str) {
		String c1="";
		char[] copy = new char[str.length()];
		// TODO Auto-generated method stub
		for (int i = 0; i < str.length(); i++) {
			copy[i] = str.charAt(i);
		}
		for (int i = copy.length - 1; i >= 0; i--) {
			str += copy[i];
		}
		System.out.print(str);

	}

	@Override
	public void isUpper(String str) {
		// TODO Auto-generated method stub
		boolean flag=true;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i)<= 'z') {
				flag = false;
				break;
			}
		}
		if(flag)
		System.out.println("String is UpperCase");
		else
			System.out.println("String contains lowercase");

	}

	@Override
	public int length(String str) {
		// TODO Auto-generated method stub
		int cnt = 0;
		for (int i = 0; i < str.length(); i++)
			cnt++;
		return cnt;
	}

	@Override
	public boolean isPalindrome(String str) {
		// TODO Auto-generated method stub
		char[] copy = new char[str.length()];
		String c1="";
		// TODO Auto-generated method stub
		for (int i = 0; i < str.length(); i++) {
			copy[i] = str.charAt(i);
		}
		for (int i = copy.length - 1; i >= 0; i--) {
			c1 += copy[i];
		}
		if(c1.equals(str))
			return true;
		else
		return false;
	}

	@Override
	public String append(String str1, String str2) {
		// TODO Auto-generated method stub
		
		return str1+""+str2;
	}

}
