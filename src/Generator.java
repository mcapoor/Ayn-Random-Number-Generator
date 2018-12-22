import java.util.Random;
import java.util.Scanner;

public class Generator {
	
	public static int generator() {
		Random rand = new Random();
		int caseNum = rand.nextInt(11) + 1; 
		int number;
		
		switch(caseNum) {
			case 1: 
				number = 672;
		    	break;
			case 2: 
				number = 612;
				break;
			case 3: 
				number = 430;
		    	break;
			case 4: 
				number = 415;
				break;
			case 5: 
				number = 504;
		    	break;
			case 6: 
				number = 522;
				break;
			case 7: 
				number = 644;
		    	break;
			case 8: 
				number = 672;
				break;
			case 9: 
				number = 656;
		    	break;
			case 10: 
				number = 120;
				break;
			default: 
				number = 0;
				break;
		}
		return number;
	}

	public static int getInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many numbers would you like?");
		int input = scan.nextInt();
		
		return input;
	}
	
	public static void main(String[] args) {
		System.out.println("AYN RANDOM NUMBER GENERATOR\n");
		
		int input = getInput();
		
		for (int i = 0; i < input; i++) {
			System.out.println(generator());
		}
		System.out.println("NOTE: if some numbers seem to be favoured, it might just be that they are intrinsically better");
	}
}
