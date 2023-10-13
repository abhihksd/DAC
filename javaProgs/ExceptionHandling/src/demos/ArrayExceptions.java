package demos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] arr;
			int size;
			Scanner sc = new Scanner(System.in);
			System.out.println("enter size of array");
			size = sc.nextInt();
			arr = new int[size];

			for (int i = 0; i < size ; i++) {
				System.out.println("enter the" + i + "th number in array");
				arr[i] = sc.nextInt();
			}

			System.out.println("Enter index number to display element");
			int index = sc.nextInt();
			System.out.println(arr[index]);
		} catch (InputMismatchException e) {
			System.out.println("Only intergers allowed");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Entered index is out of range");
		} catch (Exception e) {
			System.out.println("Array full");
		}

	}

}
