
import java.util.Scanner;

public class Perulangan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputUser = new Scanner(System.in);
		int batas;
		System.out.println("Masukan batas dari pola :");
		batas = inputUser.nextInt();
		for(int i = 1;i<=batas;i++) {
			for(int j = i; j<= batas;j++) {
				System.out.print(" ");
							
			}
			if(i<=9) {
				for(int k = 1;k<= i;k++) {
					System.out.print(i+" ");
				}
			}else if(i>9) {
				for(int l = 1;l<=i;l++) {
					System.out.print(i);
				}
			}
			
			System.out.println("");
		}
		
	}

}
