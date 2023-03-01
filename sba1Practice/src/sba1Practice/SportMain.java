package sba1Practice;

import java.util.Scanner;

public class SportMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Cricket cricket = new Cricket();
		Football football = new Football();
		
		int[] ageForCricket = new int[11];
		int[] ageForFootball = new int[11];
		
		for(int i = 0; i < 2; i++) 
		{
		String[] age = scanner.nextLine().split(" ");
		if(i == 0) {
		int j = 0;
		for(String s : age)
			ageForCricket[j++] = Integer.parseInt(s);
			}
		else {
			int j = 0;
			for(String s : age)
				ageForFootball[j++] = Integer.parseInt(s);
		}
		}
		
		cricket.caluclateAvgAge(ageForCricket);
		football.caluclateAvgAge(ageForFootball);
	
		for(int i = 0; i < 6; i++) {
			
			if(i <3) {
				int x = Integer.parseInt(scanner.nextLine());
				
				cricket.retirePlayer(x);
			}
			else if(i < 5) {
				int x = Integer.parseInt(scanner.nextLine());
				football.retirePlayer(x);
			}
			else {
				String[] temp = scanner.nextLine().split(" ");
				football.Transfer(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
				
			}
		}
	}
	
}
