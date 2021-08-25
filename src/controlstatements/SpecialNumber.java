package controlstatements;
import java.util.Scanner;
public class SpecialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);

        int m,n,i,b,c,d,e,f,t;

        m=s.nextInt();

        n=s.nextInt();

        for(i=m;i<=n;i++)

        {

            t=i;

             b=i%10;

             c=i/10;

            d=b+c;

            e=b*c;

            f=d+e;

            if(f==t)

            {

                System.out.println(f);

            }

        }
	}

}
