import java.util.*;


public class Game {		
	
	Scanner scan = new Scanner(System.in);
	List<Question> allQuestions = new ArrayList<>();
	Random random = new Random();
	
	
	List<Question> getAllQuestions(){
		return this.allQuestions;
	}
	
	void init(List<Question> allQuestions) {
		
		//50� Fragen
		allQuestions.add(new Question("Mit der angeheirateten Verwandschaft ist man ...?", 1, Arrays.asList(new String[] {"verschw�gert", "verbr�dert", "vernefft", "vernichtet"}), 0));
		allQuestions.add(new Question("Bei einem gut gelaunten Zombie handelt es sich sozusagen um einen...?", 1, Arrays.asList(new String[] {"kah Freitag", "kristi Himmelfahrt", "fingst Montag", "frohen Leichnam"}), 3));
		allQuestions.add(new Question("Was geh�rt f�r manche zu ihrem T�tigkeitsfeld?", 1, Arrays.asList(new String[] {"veranwalten", "verb�ckern", "verarzten", "verf�rstern"}), 2));
		allQuestions.add(new Question("Ein Zeuge hatte genau beobachtet, was der ...?", 1, Arrays.asList(new String[] {"Bank�ber fall", "Handtaschen raub", "Ladendieb stahl", "Trick betrug"}), 2));
		allQuestions.add(new Question("Ist das alte ranzig geworden, ist es Zeit, dass ich vor dem Anmachen des Salats das ...?", 1, Arrays.asList(new String[] {"Licht test", "Motor w�sche", "Reifen service", "�l wechsel"}), 3));
		
		//100� Fragen
		allQuestions.add(new Question("Wer wird in der Polizeikontrolle zur Kasse gebeten?", 2, Arrays.asList(new String[] {"Airbagn�rgler", "Lenkerst�nkerer", "Kuppelquengler", "Gurtmuffel"}), 3));
		allQuestions.add(new Question("Verzweifelt man an einer Sache, ist das einer Redensart zufolge zum...?", 2, Arrays.asList(new String[] {"Schafescheren", "M�usemelken", "Pferdem�sten", "G�nsekastrieren"}), 1));
		allQuestions.add(new Question("Suchte die zweifache Eiskunstlauf-Olympiasiegerin Witt das Weite, dann...?", 2, Arrays.asList(new String[] {"t�p Pich", "vohr Leger", "leu Fer", "floh Kati"}), 3));
		allQuestions.add(new Question("Wem es an Kaufkraft mangelt, der ist redensartlich ...?", 2, Arrays.asList(new String[] {"kurz in B�rse", "knapp bei Kasse", "schmal auf Konto", "blank trotz Scheck"}), 2));
		allQuestions.add(new Question("Wie werden einh�ckerige Kamele genannt?", 2, Arrays.asList(new String[] {"Dromedar", "Sansibar", "Kandahar", "Samowar"}), 0));
				
		//200� Fragen
		allQuestions.add(new Question("Wie nennt man eine leicht zusammenklappbare Schlafst�tte?", 3, Arrays.asList(new String[] {"Ackerliege", "Feldbett", "Wiesenkoje", "Weidenpritsche"}), 1));
		allQuestions.add(new Question("Twitter ist ein...?", 3, Arrays.asList(new String[] {"Mikroblogging-Dienst", "Maxijogging-Plan", "Megabugging-Werkzeug", "Mikrobugging-Dienst"}), 1));
		allQuestions.add(new Question("Sieht der Trainer vom Einsatz eines angeschlagenen Spielers zurzeit lieber ab, ist dieser sozusagen nicht in...?", 3, Arrays.asList(new String[] {"Bratpfanne", "Suppenkessel", "Schnellkochtopf", "Auflaufform"}), 3));
		allQuestions.add(new Question("Welche Haut ist kein Bestandeil des menschlichen Auges?", 3, Arrays.asList(new String[] {"Hornhaut", "Netzhaut", "Regenbogenhaut", "G�nsehaut"}), 3));
		allQuestions.add(new Question("Was haben Turnerinnern am Stufenbarren fest im Griff?", 3, Arrays.asList(new String[] {"Carpendale", "Illic", "Holm", "Cordalis"}), 2));
		
		//300� Fragen
		allQuestions.add(new Question("Die Art und Weise, wie Canis lupus sich fortbewegt, ist sozusagen der ...?", 4, Arrays.asList(new String[] {"Rein-Hard", "Wil-Helm", "Man-Fred", "Wolf-Gang"}), 3));
		allQuestions.add(new Question("In Deutschland gibt es 17 ...", 4, Arrays.asList(new String[] {"Anwaltsstuben", "Managerbuden", "�rtzekammern", "Pilotenkabuffs"}), 2));
		allQuestions.add(new Question("Was gibt es in vielen Skigebieten?", 4, Arrays.asList(new String[] {"Trottelberg", "Deppenschanze", "Idiotenh�gel", "Schwachmatenpiste"}), 2));
		allQuestions.add(new Question("Kaum hatte das Milchgesch�ft ge�ffnet, wollte schon der ...?", 4, Arrays.asList(new String[] {"Absolute Spitze", "Voll der Hammer", "Erste Sahne", "Gro�e Klasse"}), 2));
		allQuestions.add(new Question("Snoopys kleiner gefl�gelter Freund hei�t...?", 4, Arrays.asList(new String[] {"Woodstock", "Montreux", "Roskilde", "Loreley"}), 0));
				
		//500� Fragen
		allQuestions.add(new Question("Wer hei�t im amerikanischen Original der \"Sesamstra�e\" \"Count Von Count\"?", 5, Arrays.asList(new String[] {"F�rst Buchstabe", "Herzog Ziffer", "Graf Zahl", "Prinz Zeichen"}), 2));
		allQuestions.add(new Question("Was machte 2006 Klinsi mit W�rns?", 5, Arrays.asList(new String[] {"zur�ckrudern", "einschiffen", "ausbooten", "auftakeln"}), 2));
		allQuestions.add(new Question("In der Vorweihnachtszeit beschenkt man sich anonym beim ...?", 5, Arrays.asList(new String[] {"Zwergeln", "Gnomeln", "M�dchen Rosemarie", "Superweib"}), 2));
		allQuestions.add(new Question("Die Geschichte des Mordfalls Nitribitt wurde 1958 erstmals verfilmt als \"Das ...\"?", 5, Arrays.asList(new String[] {"Schwarzwaldm�del", "Rosen-Resli", "M�dchen Rosemarie", "Superweib"}), 2));
		allQuestions.add(new Question("Welcher 1983 ver�ffentlichte Song ist passenderweise in der RTL-Serie \"Deutschland 83\" zu h�ren?", 5, Arrays.asList(new String[] {"D�senjet nach Steglitz", "Trabbi nach Neuk�lln", "Sonderzug nach Pankow", "Reisebus nach Spandau"}), 2));
				
		//1000� Fragen
		allQuestions.add(new Question("Johann Wolfgang von Goethes Autobiographie kennt man unter dem Titel ...?", 6, Arrays.asList(new String[] {"Abfluss und Tatsache", "Ventil und Realit�t", "Dichtung und Wahrheit", "St�psel und Wirklichkeit"}), 2));
		allQuestions.add(new Question("Das KFZ-Kennzeichenk�rzel welcher Landeshauptstadt findet man nicht als Symbol eines chemischen Elements?", 6, Arrays.asList(new String[] {"Hannover", "D�sseldorf", "Stuttgart", "Potsdam"}), 1));
		allQuestions.add(new Question("Was war bereits seit Mai 1969 ein beliebtes Zahlungsmittel im europ�ischen Raum?", 6, Arrays.asList(new String[] {"Euronoten", "Eurocheques", "Euroscheine", "Eurom�nzen"}), 1));
		allQuestions.add(new Question("Wof�r ist bereits in der Planungsphase die Statik von entscheidender Bedeutung?", 6, Arrays.asList(new String[] {"Blinken", "Schalten", "Kuppeln", "Abw�rgen"}), 2));
		allQuestions.add(new Question("In welcher Sendung kamen unter anderem Jeanette Biedermann, Mark Forster und Lena Meyer-Landrut ins Tauschgesch�ft?", 6, Arrays.asList(new String[] {"Sing meinen Song", "Koch mein Leibgericht", "Verf�hr meine Frau", "Bewohn mein Haus"}), 0));
		allQuestions.add(new Question("Wie bezeichnet man Wandmalerei auf feuchtem Kalkputz?", 6, Arrays.asList(new String[] {"Fiasko", "Fresko", "Fiesta", "Frisco"}), 1));
				
		//2000� Fragen
		allQuestions.add(new Question("Wer wei� wohl am ehesten, was mit \"Jumpsuit\" gemeint ist?", 7, Arrays.asList(new String[] {"Modekenner", "B�rsen-Spekulanten", "Stabhochspringer", "Autoverk�ufer"}), 0));
		allQuestions.add(new Question("Malu Dreyer profitierte Anfang 2013 von ...?", 7, Arrays.asList(new String[] {"Oettingers Sattelstange", "Veltins Fahrradkette", "Diebels Vorderreifen", "Becks R�cktritt"}), 3));
		allQuestions.add(new Question("Was findet man bei Autos meist in den Varianten \"gleichlaufend\" oder \"gegenl�ufig\"?", 7, Arrays.asList(new String[] {"R�ckbank", "Scheibenwischer", "Tankanzeige", "Schneeketten"}), 1));
		allQuestions.add(new Question("Worum geht es �blicherweise, wenn von einem \"Schwanenhalsrahmen\" die Rede ist?", 7, Arrays.asList(new String[] {"Hornbrillen", "�lgem�lde", "Tankanzeige", "Fahrr�der"}), 3));
		allQuestions.add(new Question("Wer gewann 2015 als erster Deutscher seit zw�lf Jahren wieder ein Springen der Vierschanzentournee?", 7, Arrays.asList(new String[] {"Montag", "Dienstag", "Donnerstag", "Freitag"}), 3));
		allQuestions.add(new Question("Was mancher selbst im n�chternen Zustand nicht hinbekommt: Korrekt schreibt sich der beliebte Cocktail ...?", 7, Arrays.asList(new String[] {"Caipirinja", "Cajpirinha", "Caipirinha", "Caijpiri�a"}), 2));
				
		//4000� Fragen
		allQuestions.add(new Question("Von welchem nur 321 Meter hohen Berg wird behauptet, der meistbestiegene Europas zu sein?", 8, Arrays.asList(new String[] {"Brocken", "Drachenfels", "Feldberg", "Zugspitze"}), 1));
		allQuestions.add(new Question("Wessen Anspr�che sollen hierzulande gesetzlich neu geregelt werden?", 8, Arrays.asList(new String[] {"M�nzm�tter", "Scheinv�ter", "Bargeldeltern", "Kerditkartenfamilien"}), 1));
		allQuestions.add(new Question("Woraus besteht in der Regel eine Entourage?", 8, Arrays.asList(new String[] {"Baguette & Rotwein", "Mascara & Lidschatten", "Freunde & Bekannte", "Sofa & Sessel"}), 2));
		allQuestions.add(new Question("Den Andenb�ren, die einzigen s�damerikanische B�renart, kennt man auch unter der Bezeichnung ...?", 8, Arrays.asList(new String[] {"Toupetb�r", "Brillenb�r", "Gebissb�r", "H�rger�tb�r"}), 1));
		allQuestions.add(new Question("Wobei wird vor einem sogenannten Rebound-Effekt gewarnt, der nicht selten zu einer Abh�ngigkeit f�hrt?", 8, Arrays.asList(new String[] {"Haarspray", "Nasenspray", "Deospray", "Pfefferspray"}), 1));
		
		//8000� Fragen
		allQuestions.add(new Question("Welche dieser legend�ren Br�cken kann man nicht mit dem Auto passieren?", 9, Arrays.asList(new String[] {"Rialtobr�cke", "Pont Neuf", "Golden Gate Bridge", "�resundbr�cke"}), 0));
		allQuestions.add(new Question("Wobei besteht die oberste Schicht oft aus dem sogenannten Fondant?", 9, Arrays.asList(new String[] {"Kaltschaummatratze", "Komposthaufen", "Festtagstorte", "Stra�enbelag"}), 2));
		allQuestions.add(new Question("Was haben die Hollywood-Stars Gosling, Reynolds und Phillippe gemeinsam?", 9, Arrays.asList(new String[] {"Vorname Ryan", "Ex-Frau Megan Fox", "Geburtsjahr 1978", "irische Staatsb�rgerschaft"}), 0));
		allQuestions.add(new Question("Wie hei�t der aktuelle Abenteuer-Kinofilm mit Jake Gyllenhaal und Josh Brolin in den Hauptrollen?", 9, Arrays.asList(new String[] {"Mississippi", "Everest", "Sahara", "L�neburger Heide"}), 1));
		allQuestions.add(new Question("Die Darstellung welcher Figur wurde schon zweimal mit einem Schauspiel-Oscar pr�miert?", 9, Arrays.asList(new String[] {"Dr. Hannibal Lecte", "Forrest Gump", "Joker", "Truman Capote"}), 2));
				
		//16000� Fragen
		allQuestions.add(new Question("Was bedeutet der Name der italienischen Nachspeise \"Tiramisu\" w�rtlich?", 10, Arrays.asList(new String[] {"s�� und k�stlich", "zieh mich hoch", "das macht dick", "Leckerm�ulchen"}), 1));
		allQuestions.add(new Question("Welcher Buchstabe kam in der Entstehungsgeschichte unseres heute gebr�uchlichen Alphabets erst im Mittelalter hinzu?", 10, Arrays.asList(new String[] {"C", "D", "W", "V"}), 2));
		allQuestions.add(new Question("Welche beiden Staaten einigten sich Ende 2012 �ber die Festsetzung eines Grenzverlaufs?", 10, Arrays.asList(new String[] {"Deutschland & Australien", "Polen & S�dafrika", "D�nemark & Kanada", "�sterreich & Japan"}), 2));
		allQuestions.add(new Question("Welche Jahreszeit beginnt bei uns, wenn die Mittagssonne am s�dlichen Wendekreis im Zenit steht?", 10, Arrays.asList(new String[] {"Fr�hling", "Sommer", "Herbst", "Winter"}), 3));
		allQuestions.add(new Question("Alfred Gislason ist seit Februar 2020 bereits der zweite Isl�nder im Amt des deutschen M�nner-Nationaltrainers im ...?", 10, Arrays.asList(new String[] {"Basketball", "Volleyball", "Handball", "Tennis"}), 2));
			
		//32000� Fragen
		allQuestions.add(new Question("Wo befinden sich einige der h�chsten Alpengipfel?", 11, Arrays.asList(new String[] {"Monte-Rosa-Massiv", "Monte-Purpur-H�henzug", "Monte-Lila-Gebirge", "Monte-Magenta-Kette"}), 0));
		allQuestions.add(new Question("Wof�r stehen die Buchstaben im Namen der britischen Automarke MG?", 11, Arrays.asList(new String[] {"Moto Guzzi", "Motor Gear", "Morris Garages", "Manchester Gasoline"}), 2));
		allQuestions.add(new Question("Welche dieser religi�sen Beobachtungen dauert w�hrend des Kalenderjahres am k�rzesten?", 11, Arrays.asList(new String[] {"Ramadan", "Diwali", "Lent", "Hanukkah"}), 1));
		allQuestions.add(new Question("Wer macht sich als Gew�rz und Heilpflanze n�tzlich?", 11, Arrays.asList(new String[] {"Angelika", "Dagmar", "B�rbel", "Marion"}), 0));
		allQuestions.add(new Question("Das f�r die Nahrungsmittelindustrie interessante Stevia, benannt nach der gleichnamigen Pflanze, ist bis zu 300-mal...?", 11, Arrays.asList(new String[] {"saurer als Essig", "sch�rfer als Pfeffer", "s��er als Zucker", "salziger als Salz"}), 2));
				
		//64000� Fragen
		allQuestions.add(new Question("Wo wurde der Schriftsteller geboren, der f�r den Roman �Herkunft� 2019 mit dem Deutschen Buchpreis ausgezeichnet wurde?", 12, Arrays.asList(new String[] {"Rhodesien", "Jugoslawien", "Ceylon", "Tibet"}), 1));
		allQuestions.add(new Question("Welcher Begriff spielt im Zusammenhang mit der Rechenleistung von Computern eine Rolle?", 12, Arrays.asList(new String[] {"Busbreiten", "Radh�hen", "Autotiefen", "Zugl�ngen"}), 0));
		allQuestions.add(new Question("Wer erfand die Raufasertapete?", 12, Arrays.asList(new String[] {"Gustav Chemnitz", "Hugo Erfurt", "Alfons Zwickau", "Emil Schwerin"}), 1));
		
		//125000� Fragen
		allQuestions.add(new Question("Was war hierzulande bis in die 1950er noch gang und gebe?", 13, Arrays.asList(new String[] {"Beamtinnenkommunion", "Krankenschwesternkollete", "Lehrerinnenz�libat", "Sekret�rinnenbeichte"}), 2));
		allQuestions.add(new Question("Welche Pflanze gibt es nicht?", 13, Arrays.asList(new String[] {"Pimpernuss", "Zaubernuss", "Wassernuss", "Buchnuss"}), 3));
		allQuestions.add(new Question("Korn darf laut Verordnung �ber bestimmte alkoholfreie Getr�nke destilliert werden aus Weizen, Gerste, Hafer, Roggen oder...?", 13, Arrays.asList(new String[] {"Mais", "Buchweizen", "Dinkel", "Hirse"}), 1));
					
		//500000� Fragen
		allQuestions.add(new Question("Das naturgegebene Schicksal welcher Pflanzen sieht vor, dass die Bl�te bei den meisten Arten unweigerlich zu ihrem Tod f�hrt?", 14, Arrays.asList(new String[] {"Bambus", "Ginkgo", "Rhododendron", "Eukalyptus"}), 0));
		allQuestions.add(new Question("Auf dem Gel�nde, wo Alfred Nobel eine Sprengstofffabrik baute und das Dynamit erfand, steht heute das ...?", 14, Arrays.asList(new String[] {"Kernkraftwerk Kr�mmel", "Wembley-Stadion", "Europaparlament", "Atomium"}), 0));
		
		//1000000� Fragen
		allQuestions.add(new Question("Die klassische genormte Europalette EPAL 1 besteht aus 78 N�geln, neuen Kl�tzen und insgesamt wie vielen Brettern?", 15, Arrays.asList(new String[] {"Neun", "Zehn", "Elf", "Zw�lf"}), 2));
		allQuestions.add(new Question("Welche H�chstgeschwindigkeit erreichte Felix Baumgartner bei seinem Fallschirmsprung aus der Stratosph�re im Oktober 2012?", 15, Arrays.asList(new String[] {"1.011,2 km/h", "1.225,4 km/h", "1.357,6 km/h", "1.483,8 km/h"}), 2));
		allQuestions.add(new Question("Mit welcher Verletzung besch�ftigt sich der Orthop�de?\", \"Welche Frucht nennen die Italiener �Arancio dolce�?", 15, Arrays.asList(new String[] {"Meysel-Pyramide", "Volkmann-Dreieck", "Hancke-Trapez", "Mira-Kegel"}), 1));
		allQuestions.add(new Question("Welche Tiere werden vor allem in Nordamerika vom meist t�dlich verlaufenden White-Nose-Syndrom befallen?", 15, Arrays.asList(new String[] {"Flederm�use", "M�usebussarde", "Waldmeisen", "Ameisenb�ren"}), 3));	
	}
	
	void start() {
		
		String welcomeText = "Herzlich Willkommen bei \"Wer wird Million�r\"!";					
		String tutorialText = "xyz. Bist du bereit? Dann dr�cke bitte die Taste \"j\".";
		
		showMessage(welcomeText);
		
		String name = getName();
		
		String askShouldShowTutorial = "Hallo " + name + ", bist du bereit? Wenn du ein kleines Tutorial brauchst, dr�cke bitte die Taste \"j\". Ansonsten geht es mit \"n\" mit der ersten Frage los!";
		showMessage(askShouldShowTutorial);
		
		boolean showTutorial = getYesNoFromUser();
		
		while(showTutorial) {
			showMessage(tutorialText);
			showTutorial = !getYesNoFromUser();
		}
		
		List<Question> allQuestions = getAllQuestions();
		init(allQuestions);

		for (int currentDifficulty = 1; currentDifficulty < 15; currentDifficulty++){

			Question currentQuestion = getRandomQuestion(getQuestionsByDifficulty(currentDifficulty));
			String currentQuestionText = currentQuestion.getQuestion();
			System.out.println(currentQuestionText);
			System.out.println();
			showAnswers(currentQuestion);
			System.out.println();
			int userAnswer = getUserAnswer();
			if(userAnswer == currentQuestion.getCorrectAnswer()){
				System.out.println("Deine Antwort war richtig!");
			} else {
				System.out.println("Deine Antwort war falsch! Du hast das Spiel verloren!");
				break;
			}
		}
		
		
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
	
	List<Question> getQuestionsByDifficulty(int currentDifficulty) {
		
		List<Question> questionsWithCurrentDifficulty = new ArrayList<>();
		
		for(int i = 0; i < allQuestions.size(); i++) {
			if(allQuestions.get(i).getDifficulty() == currentDifficulty) {
				questionsWithCurrentDifficulty.add(allQuestions.get(i));
			}
		}
		return questionsWithCurrentDifficulty;
	}
	
	
	Question getRandomQuestion(List<Question> questions) {	
		return questions.get(random.nextInt(questions.size()));
	}
	
	
	void showAnswers(Question currentQuestion) {
		
		List<String> currentAnswers =  currentQuestion.getAnswers();
		
		for(int i = 0; i < currentAnswers.size(); i++) {			
			
			switch(i) {
			case 0:
				System.out.println("A: " + currentAnswers.get(i));
				break;
			case 1:
				System.out.println("B: " + currentAnswers.get(i));
				break;
			case 2:
				System.out.println("C: " + currentAnswers.get(i));
				break;
			case 3:
				System.out.println("D: " + currentAnswers.get(i));
				break;
			}

		}
				

	}

	public int getUserAnswer() {
		char userInput;
		int answerIndex = 0;
		boolean inputValid = false;
		while (!inputValid) {
			System.out.println("Bitte gib deine Antwort ein: ");
			userInput = scan.nextLine().charAt(0);
			switch (userInput){
				case 'a':
					answerIndex = 0 ;
					inputValid = true;
					break;
				case 'b':
					answerIndex = 1;
					inputValid = true;
					break;
				case 'c':
					answerIndex = 2;
					inputValid = true;
					break;
				case 'd':
					answerIndex = 3;
					inputValid = true;
					break;
				default:
					answerIndex = -1;
					inputValid = false;
					break;

			}

		}
		return answerIndex;
	}
	
}
