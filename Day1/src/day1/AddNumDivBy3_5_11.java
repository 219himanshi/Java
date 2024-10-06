package day1;
import java.util.*;

//Write a program to accept 10 numbers from user and find sum of all numbers which are either divisible
//by 5 or 3 or 11

public class AddNumDivBy3_5_11 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter how many numbers do you want to add?");
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter number: ");
			int num=sc.nextInt();
			if(num%3==0 || num%5==0 || num%11==0)
			{
				sum+=num;
			}
       }
		System.out.println("Sum: "+sum);
	}
}
