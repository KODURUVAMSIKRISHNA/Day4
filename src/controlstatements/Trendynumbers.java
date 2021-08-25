package controlstatements;
import java.util.Scanner;
public class Trendynumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);

	       int a=scan.nextInt();

	       if(a>99 && a<=999){

	            a=a%100;

	            a=a/10;

	           if(a%3==0){

	               System.out.printf("Trendy Number");

	           }else

	           System.out.printf("Not a Trendy Number");

	       }else

	       System.out.printf("Not a Trendy Number");
	}

}
