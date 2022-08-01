import java.util.Scanner;

public class Genap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputUser = new Scanner(System.in);
		int x,y,n;
		y = 0;
		n = inputUser.nextInt();
		for(int i = 1; i <= n;i++) {
			x = i *2;
			y +=x;
			System.out.print(x + " ");
		}
		System.out.println("\nHasil dari perjumlahan bilangan adalah = " + y);
		
	}

}
