package day1;

public class AddArgs {

	public static void main(String[] args) {
		System.out.println("Enter length: "+args.length);
		int sum=0;
		if(args.length==0)
		{
			System.out.println("no parameters..");
		}
		else
		{
			for(int i=0;i<args.length;i++)
			{
				sum+=Integer.parseInt(args[i]);
			}
			System.out.println("Sum: "+sum);
		}

	}

}
