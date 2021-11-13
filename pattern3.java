package Geek_assignment;
import java.util.*;
public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int star =n;
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("* ");
			}
			System.out.println();
			star--;
	}

}
}
