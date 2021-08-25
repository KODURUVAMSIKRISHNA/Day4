package controlstatements;
import java.util.Scanner;
public class DataMining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int even=0,odd=0;

        Scanner scan=new Scanner(System.in);

        int n=scan.nextInt();

        while(n!=0){

            int b=n%10;

            if(b%2==0){

                even=even+b;

            }else

            odd=odd+b;

            n=n/10;

        }

        if(even==odd){

            System.out.println("yes");

        }else

        System.out.println("No");
	}

}
