package controlstatements;
import java.util.Scanner;
public class SumofNnatural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0,i=0;                
        Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of n:");
        n=sc.nextInt();
        int a[]=new int[n]; 

        while(i<n)
         {      
 System.out.println("Enter  number  "+(i+1)+":");
            a[i]=sc.nextInt();
 sum+=a[i];    
 i++;     
          }
       System.out.println("sum is ="+sum);          
	}

}
