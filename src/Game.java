import java.util.Scanner;

public class Game {		
	
	Scanner scan = new Scanner(System.in);
	
	void start() {
		
		String welcomeText = "Herzlich Willkommen bei \"Wer wird Millionär\"!";					
		String tutorialText = "xyz. Bist du bereit? Dann drücke bitte die Taste \"j\".";
		
		showMessage(welcomeText);
		
		String name = getName();
		
		String askShouldShowTutorial = "Hallo " + name + ", bist du bereit? Wenn du ein kleines Tutorial brauchst, drücke bitte die Taste \"j\". Ansonsten geht es mit \"n\" mit der ersten Frage los!";
		showMessage(askShouldShowTutorial);
		
		boolean showTutorial = getYesNoFromUser();
		
		while(showTutorial) {
			showMessage(tutorialText);
			showTutorial = !getYesNoFromUser();
		}
		
		//startGame
		System.out.println("startGame");
		
	}
	
	
		
	
	void showMessage(String message) {									
		System.out.println(message);
	}
	
	
	String getName() {
		
		String prompt = "Bitte gib deinen Namen ein:";
		System.out.println(prompt);
		
		boolean nameIsValid = false;
		String name = "";
		
		while(nameIsValid == false) {
			name = scan.nextLine();
			if(name.equals("")) {
				System.out.println(prompt);
			} else {
				nameIsValid = true;
			}
		}
		return name;
	}
	
	
	boolean getYesNoFromUser() {
		
		boolean answerIsYes = false;
		boolean inputValid = false;
		String prompt = "Bitte gib \"j\" oder \"n\" ein:";
		String input = scan.nextLine();
		
		while(!inputValid) {
			
			if(input.equals("j")) {
				answerIsYes = true;
				inputValid = true;
			} 
			else if(input.equals("n")){
				answerIsYes = false;
				inputValid = true;
			} 
			else if(!inputValid) {
				showMessage(prompt);
				input = scan.nextLine();
			}
		}
		return answerIsYes;
	}
	
}
