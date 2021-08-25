package controlstatements;
import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
        int n=sc.nextInt();
        System.out.println("Enter m:");
        int m=sc.nextInt();

        for(int i=1;i<=m;i++)

        {

            System.out.println(i+"*"+n+"="+n*i);

        }

    }      
	}
