package Demo;

import utility.StringOps;
import interfaces.StringOperation;
public class StringDemo extends StringOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringOperation s=new StringOps();
		s.reverse("string");
		System.out.println(s.length("String"));
		s.isUpper("HELLo");
		System.out.println(s.isPalindrome("atta"));
		System.out.println(s.append("Hello","World"));

	}

}
