package reverse;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of first array ...");
		int size = sc.nextInt();
		int arr1[] = new int[size];
		System.out.println("Enter the values of first array..");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}

		System.out.println("Enter the size of the second array...");
		int size2 = sc.nextInt();
		int arr2[] = new int[size2];
		System.out.println("Enter the values of the second array....");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}

		int temp1 = 0;
		int temp2 = 0;
		for (int i = arr1.length - 1; i >= 0; i--) {
			temp1 = temp1 * 10 + arr1[i];
		}
		for (int i = arr2.length - 1; i >= 0; i--) {
			temp2 = temp2 * 10 + arr2[i];
		}
		int sum = temp1 + temp2;
		System.out.println("Sum of the Arrays");
		System.out.println(sum);
	}
}