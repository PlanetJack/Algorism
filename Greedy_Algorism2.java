package Algorism;

import java.util.Arrays;
import java.util.Scanner;

public class Greedy_Algorism2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many make a array room? : ");
		int n = scanner.nextInt();
		
		System.out.println("Enter M : ");
		int m = scanner.nextInt();
		
		System.out.println("Enter K : ");
		int k = scanner.nextInt();
		
		int[] number = new int[n];
		System.out.println("Enter array room numbers : ");
		for(int i=0; i<n; i++) {
			number[i] = scanner.nextInt();
			System.out.print(number[i]+ " ");
		}
		
		Arrays.sort(number);
		System.out.println(Arrays.toString(number));
		
		int firstMax = number[n-1];
		int secMax = number[n-2];
		
		System.out.println(firstMax);
		System.out.println(secMax);
		
		int sum = 0;
		
		while(m != 0) {
			for(int i=0; i<=k; i++) {
				if(i == k) {
					sum += secMax;
					m -= 1;
				}
				else {
					sum += firstMax;
					m -= 1;
					
				}
			}
			
		}
		System.out.println("Sum :  " + sum);
		
		
		
	}

}
