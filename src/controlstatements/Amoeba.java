package controlstatements;
import java.util.Scanner;
public class Amoeba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of Months :");
	       int n=sc.nextInt();

	       int a=0,b=1;

	       int c=a+b;

	       while(n!=3)

	       {

	           a=b;

	           b=c;

	           c=a+b;

	           n--;

	       }

	       System.out.printf("The amoeba size is %d",c);
	}

}
