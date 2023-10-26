package evalExp;

public class Postfix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cstack s1=new Cstack(10);
		String exp="945*+";
		for(int i=0;i<exp.length();i++)
		{
			char ch=exp.charAt(i);
			if(ch>=48 && ch<=57)
			{
				System.out.println(ch-48);
			s1.push(ch-48);	
			}
			else if(exp.)
		}

	}

}
