import java.util.*;

public class DotComBust {
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
	private int numOfGuesses = 0;

	private void setUpGame() {
		DotCom one = new DotCom();
		one.setName("Pets.com");
		DotCom two = new DotCom();
		two.setName("eToys.com");
		DotCom three = new DotCom();
		three.setName("Go2.com");

		dotComList.add(one);
		dotComList.add(two);
		dotComList.add(three);

		System.out.println("Your objective is eliminate three dot coms");
		System.out.println("Try eliminate all with the less number of guesses");

		for (DotCom dotComToSet : dotComList) {
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComToSet.setLocationCells(newLocation);
		}
	}

	private void startPlaying() {
		while (!dotComList.isEmpty()) {
			String userGuess = helper.getUserInput("Insert a guess")
			checkUserGuess(userGuess);
		}
		finishGame();
	}

	private void checkUserGuess(String userGuess) {
		numOfGuesses++;
		String result = "miss";

		for (DotCom dotComToTest : dotComList) {
			result = dotComToTest.checkYourself(userGuess);
			
			if result.equals("hit") {
				break;
			}

			if result.equals("kill") {
				dotComList.remove(dotComToTest);
				break;
			}
		}

		System.one.println(result)
	}

	private void finishGame() {
		System.out.println("All the dot coms were eliminated! Now your set is empty.");

		if (numOfGuesses <= 18) {
			System.out.println("You used only " + numOfGuesses + " guesses".);
			System.out.println("You left before eliminate your guesses.");
		} else {
			System.out.println("Took to long. " + numOfGuesses + " guesses".);
			System.out.println("Don't will have fishery with this guesses.");
		}
	}

	public static void main(String[] args) {
		DotComBust game = new DotComBust();
		game.setUpGame();
		game.startPlaying();
	}
}
