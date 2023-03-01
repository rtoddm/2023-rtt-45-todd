package sba1Practice;

public class Football implements Sport {

	int[] playerIDs = {};

	public Football() {
		int[] playerIDs = new int[11];
		for (int i = 0; i < playerIDs.length; i++) {
			playerIDs[i] = 1;
		}
		System.out.println("A new football team has been formed");
	}

	@Override
	public void caluclateAvgAge(int[] age) {
		int sum = 0;
		for (int i = 0; i < age.length; i++) {
			sum += age[i];
		}
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

	public void Transfer(int fee, int id) {
		if(playerIDs[id] == 1) {
			System.out.println("Player with id: " + id + "has been transferrred with a fee of: " + fee);
		}else {
			System.out.println("Player has already retired");
		}
	}
	
	}

