package utility;

public class StringOps2 {
	public void displayI(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}

	public void displayAscii(String str) {
		for (int i = 0; i < str.length(); i++)
			System.out.println((int) str.charAt(i));
	}

	public void opposite(String str) {
		// char ch;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				char ch = (char) (str.charAt(i) + 32);
				System.out.println(ch);
			}
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				char ch = (char) (str.charAt(i) - 32);
				System.out.println(ch);
			}
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				System.out.println(str.charAt(i));
			}
			if (str.charAt(i) >= ':' && str.charAt(i) <= '@') {

				System.out.println(str.charAt(i));
			}

		}
	}

	public void countVowels(String str) {
		int cnt=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'
			   ||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'	)
			{
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	public void displaySpecialChar(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='!'|| str.charAt(i)<='@'|| str.charAt(i)<='#'|| 
			 str.charAt(i)<='$'|| str.charAt(i)<='%'|| str.charAt(i)<='&'|| 
			 str.charAt(i)<='?'|| str.charAt(i)<=':'
					)
			{
				System.out.print(str.charAt(i));
			}
			
		}
	}
}
