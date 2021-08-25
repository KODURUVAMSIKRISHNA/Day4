package controlstatements;
import java.util.Scanner;
public class CollatzProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

	       int a=sc.nextInt();

	       int count=0;

	       System.out.println(a);

	       while(a!=1)

	       {

	           if(a%2==0){

	               a=a/2;

	               System.out.println(a);

	               count++;

	           }

	           else

	           {

	               a=(3*a)+1;

	               System.out.println(a);

	               count++;

	           }

	       }

	       System.out.println(count);

	}

}
