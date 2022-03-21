//By: Nicko Arellano 3/21/2022
import java.util.Scanner;
public class reverse{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a string");
		String str = scan.nextLine();
		for(int i = (str.length() -1); i>=0; i--){
			char letter = str.charAt(i);
			System.out.printf("%s",letter);

		}
	}
}
