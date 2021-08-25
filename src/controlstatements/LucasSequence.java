package controlstatements;
import java.util.Scanner;
public class LucasSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int a=0,b=0,c=1;

        System.out.printf("%d %d %d ",a,b,c);

        while(n!=3&&n>1)

        {

            int d=a+b+c;

            System.out.printf("%d ",d);

            a=b;

            b=c;

            c=d;

            n--;

        }       
	}

}
