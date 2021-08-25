package controlstatements;
import java.util.Scanner;
public class Print2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a");
        int a=s.nextInt();
        System.out.println("Enter the value of b");
        int b=s.nextInt();

        int c=a;

       while(b<=a)

        {

            System.out.println(c);

            c--;

            b++;

			      }

	}

}
