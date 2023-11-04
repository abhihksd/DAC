package evalExp;

public class Postfix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cstack s1=new Cstack(10);
		String exp="945*+";
		int res=0;
		for(int i=0;i<exp.length();i++)
		{
			char ch=exp.charAt(i);
			if(ch>=48 && ch<=57)
			{
				System.out.println(ch-48);
			s1.push(ch-48);	
			}
			else if(isOp(ch))
			{
				int no2=s1.pop();
				int no1=s1.pop();
				switch (ch) {
				case '+':res=no1+no2; 
					break;
				case '-':res=no1-no2; 
				break;
				case '*':res=no1*no2; 
				break;
				case '/':res=no1/no2; 
				break;
				case '%':res=no1%no2; 
				break;

				default:
					break;
				}
				s1.push(res);
			}
			else {System.out.println("Invalid");break;}
		}
		res=s1.pop();

	}

	public static boolean isOp(char ch) {
		char[] operators = { '+', '-', '*', '/', '%', '=', '<', '>', '&', '|', '!', '^' };
		for (char op : operators) {
			if (ch == op)
				return true;
		}
		return false;
	}

}
