package sba1Practice;

import java.lang.reflect.Array;

public class Cricket implements Sport {

	int[] playerIDs = {};

	public Cricket() {
		for (int i = 0; i < playerIDs.length; i++) {
			playerIDs[i] = 1;
		}
		
		System.out.println("A new cricket team has been formed");
	}

	@Override
	public void caluclateAvgAge(int[] age) {
		int sum = 0;
		for (int i = 0; i < age.length; i++) {
			sum += age[i];
		}
		double avg = sum / age.length;
		System.out.printf("The average age of the team is: " + String.format("%.2f", avg));
	}

	@Override
	public void retirePlayer(int id) {
		if (playerIDs[id] == -1) {
			System.out.println("Player with id: " + id + "has already retired.");
		} else {
			playerIDs[id] = -1;
			System.out.println("Player with id: " + id + " has retired.");
		}
	}

}
