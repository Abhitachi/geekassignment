package Geek_assignment;
import java.util.*;
public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int space =n-1;
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=space;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
			space--;
		}
	}

}
