import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner inputUser = new Scanner(System.in);
		
		String words, reverseWD = "";
		// input the words
		words = inputUser.nextLine();
		// the length of the words
		int wdLength = words.length();
		
		// looping to make words read from right to left
		// the length -1, because the words index from 0 but the length count from 1
		for(int i= (wdLength -1);i>=0;i--) {
			
			reverseWD = reverseWD + words.charAt(i);
		}
		
		System.out.println(reverseWD);
		
		// in condition use method replace all to lost the space in words
		
		if (words.replaceAll(" ", "").equalsIgnoreCase(reverseWD.replaceAll(" ", ""))) {
		      System.out.println(words + " kata palindrum.");
		    }
		    else {
		      System.out.println(words + " bukan kata palindrum.");
		    }
	}

}
