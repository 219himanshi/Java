package day1;
import java.util.*;
public class AddNum {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("How many numbers do you want to sum? ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the number: ");
			int num=sc.nextInt();
			sum+=num;
		}
		System.out.println("Sum: "+sum);
	}

}
