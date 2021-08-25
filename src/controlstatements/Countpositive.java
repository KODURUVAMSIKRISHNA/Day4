package controlstatements;
import java.util.Scanner;
public class Countpositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);

        int a[]=new int[20];
        System.out.println("Enter the value of n:");
        int n=s.nextInt();
        System.out.println("Enter the number:");
        int count=0,i,count1=0;

        for(i=0;i<n;i++)

        {

            a[i]=s.nextInt();

        }

        for(i=0;i<n;i++)

        {

        if(a[i]>=0)

        {

            count++;

        }

        else

        {

          count1++;

        }

        }

        System.out.println("Number of positive numbers is "+count+" and the number of negative numbers is "+count1);

	}

}
