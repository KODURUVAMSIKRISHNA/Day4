package controlstatements;
import java.util.Scanner;
public class Kaprekarnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc =new Scanner(System.in);

	      int num = sc.nextInt();

	      int p = 0;

	      int digit=0,sq,sum=0;

	      sq = num*num;

	      p=sq;

	      while(sq>0)

	      {

	        digit++;

	        sq = sq/10;

	      }

	      int k =(int)Math.pow(10,(digit/2));

	      while(p>0)

	      {

	        sum = sum+(p%k);

	        p=p/k;

	      }

	      if(sum==num){

	        System.out.println("Kaprekar Number");

	      }

	      else{

	        System.out.println("Not a Kaprekar Number");

	      }
	}

}
