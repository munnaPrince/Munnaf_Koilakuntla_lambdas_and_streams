package epamLambda;

import java.util.Scanner;

public class Avg {
	public static int findAvg(int a[]) {
		int avg=0,sum=0;
		for(int i:a) {
			sum+=i;
		}
		avg = sum/a.length;
		return avg;
	}

		
	public static void main(String[] args) {
		Scanner o = new Scanner(System.in);
		int n=o.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			a[i]=o.nextInt();
		int average = findAvg(a);
		o.close();
		System.out.println("the average is "+average);
	}


}
