package _01_Intro;

public class ArmstrongNumber {
	public int count(int num) {
		int ognum;
		int cnt = 0;
//		while (num > 0) {
//			num = num / 10;
//			cnt++;
//
//		}
		ognum=num;
		for(;ognum!=0;ognum/=10,cnt++);    //its using increment the iterator's as cnt

		return cnt;

	}

	public int power(int base, int index) {
		int res = 1;
		for (int i = 1; i <= index; i++) {
			res = res * base;
		}

		return res;
	}

	public void armstrngNum() {
		int index, num , mod, sum = 0, temp;
		
		for (num = 1; num <= 1000; num++) {
			temp = num;
			sum=0;
			index = count(num);
			while (temp > 0) {
				mod = temp % 10;
				temp = temp / 10;
				sum = sum + power(mod, index);

			}

			if (sum == num) {
				
				System.out.println(num);
			}
			
		}

	}



}
