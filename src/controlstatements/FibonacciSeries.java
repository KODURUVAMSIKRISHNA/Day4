package controlstatements;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int n,fact=1,x=1;

	        Scanner sc=new Scanner(System.in);

	        n=sc.nextInt();

	        while(fact<n)

	    {

	        x=x+1;

	        fact=fact*x;

	    }

	if(fact==n)

	{

	    System.out.println("Yes");

	}

	    else

	{

	    System.out.println("No");

	}

	}

}
