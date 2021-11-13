package Geek_assignment;
import java.util.Scanner;
public class Day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		//number from 1 to n;
		System.out.println("number from 0 to "+n);
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
		
		//number from n to 0;
		System.out.println("number from "+n+" to 0");
		int i=n;
		while(i>=0) {
			System.out.println(i);
			i--;
		}
		
		//tables of n;
		System.out.println("tables of "+n);
		for(i=1;i<=10;i++) {
			int table = n*i;
			System.out.println(table);
		}
		
		//reverse table using while;
		System.out.println("reversetable of "+n);
		int k=10;
		while(k>0) {
			int reversetable=n*k;
			System.out.println(reversetable);
			k--;
		}
	}

}
