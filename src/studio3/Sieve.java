package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What number do you want to verify prime numbers until?");
		int n =in.nextInt();
		boolean [] sieve;
		sieve = new boolean [n+1];
		for(int i=2; i<n+1; i++)
		{
			sieve [i] = true;
		}

		for (int a=2; a<n; a++)
		{
			if(sieve [a]==true)
			{
				for (int b=a; b*a<n; b++)
				{
					sieve [a*b]= false;
				}
			}

		}
		for (int c=0; c<n; c++)
		{
			if (sieve [c]==true)
			{
				System.out.println("The number " + c + " is prime!");
			}
		}
	}

}
