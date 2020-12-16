import java.util.*;


public class Game {		
	
	Scanner scan = new Scanner(System.in);
	List<Question> allQuestions = new ArrayList<>();
	
	
	List<Question> getAllQuestions(){
		return this.allQuestions;
	}
	
	void init(List<Question> allQuestions) {
		
		//50€ Fragen
		allQuestions.add(new Question("Mit der angeheirateten Verwandschaft ist man ...?", 1, Arrays.asList(new String[] {"verschwägert", "verbrüdert", "vernefft", "vernichtet"}), 0));
		allQuestions.add(new Question("Bei einem gut gelaunten Zombie handelt es sich sozusagen um einen...?", 1, Arrays.asList(new String[] {"kah Freitag", "kristi Himmelfahrt", "fingst Montag", "frohen Leichnam"}), 3));
		allQuestions.add(new Question("Was gehört für manche zu ihrem Tätigkeitsfeld?", 1, Arrays.asList(new String[] {"veranwalten", "verbäckern", "verarzten", "verförstern"}), 2));
		allQuestions.add(new Question("Ein Zeuge hatte genau beobachtet, was der ...?", 1, Arrays.asList(new String[] {"Banküber fall", "Handtaschen raub", "Ladendieb stahl", "Trick betrug"}), 2));
		allQuestions.add(new Question("Ist das alte ranzig geworden, ist es Zeit, dass ich vor dem Anmachen des Salats das ...?", 1, Arrays.asList(new String[] {"Licht test", "Motor wäsche", "Reifen service", "Öl wechsel"}), 3));
		
		//100€ Fragen
		allQuestions.add(new Question("Wer wird in der Polizeikontrolle zur Kasse gebeten?", 2, Arrays.asList(new String[] {"Airbagnörgler", "Lenkerstänkerer", "Kuppelquengler", "Gurtmuffel"}), 3));
		allQuestions.add(new Question("Verzweifelt man an einer Sache, ist das einer Redensart zufolge zum...?", 2, Arrays.asList(new String[] {"Schafescheren", "Mäusemelken", "Pferdemästen", "Gänsekastrieren"}), 1));
		allQuestions.add(new Question("Suchte die zweifache Eiskunstlauf-Olympiasiegerin Witt das Weite, dann...?", 2, Arrays.asList(new String[] {"täp Pich", "vohr Leger", "leu Fer", "floh Kati"}), 3));
		allQuestions.add(new Question("Wem es an Kaufkraft mangelt, der ist redensartlich ...?", 2, Arrays.asList(new String[] {"kurz in Börse", "knapp bei Kasse", "schmal auf Konto", "blank trotz Scheck"}), 2));
		allQuestions.add(new Question("Wie werden einhöckerige Kamele genannt?", 2, Arrays.asList(new String[] {"Dromedar", "Sansibar", "Kandahar", "Samowar"}), 0));
				
		//200€ Fragen
		allQuestions.add(new Question("Wie nennt man eine leicht zusammenklappbare Schlafstätte?", 3, Arrays.asList(new String[] {"Ackerliege", "Feldbett", "Wiesenkoje", "Weidenpritsche"}), 1));
		allQuestions.add(new Question("Twitter ist ein...?", 3, Arrays.asList(new String[] {"Mikroblogging-Dienst", "Maxijogging-Plan", "Megabugging-Werkzeug", "Mikrobugging-Dienst"}), 1));
		allQuestions.add(new Question("Sieht der Trainer vom Einsatz eines angeschlagenen Spielers zurzeit lieber ab, ist dieser sozusagen nicht in...?", 3, Arrays.asList(new String[] {"Bratpfanne", "Suppenkessel", "Schnellkochtopf", "Auflaufform"}), 3));
		allQuestions.add(new Question("Welche Haut ist kein Bestandeil des menschlichen Auges?", 3, Arrays.asList(new String[] {"Hornhaut", "Netzhaut", "Regenbogenhaut", "Gänsehaut"}), 3));
		allQuestions.add(new Question("Was haben Turnerinnern am Stufenbarren fest im Griff?", 3, Arrays.asList(new String[] {"Carpendale", "Illic", "Holm", "Cordalis"}), 2));
		
		//300€ Fragen
		allQuestions.add(new Question("Die Art und Weise, wie Canis lupus sich fortbewegt, ist sozusagen der ...?", 4, Arrays.asList(new String[] {"Rein-Hard", "Wil-Helm", "Man-Fred", "Wolf-Gang"}), 3));
		allQuestions.add(new Question("In Deutschland gibt es 17 ...", 4, Arrays.asList(new String[] {"Anwaltsstuben", "Managerbuden", "Ärtzekammern", "Pilotenkabuffs"}), 2));
		allQuestions.add(new Question("Was gibt es in vielen Skigebieten?", 4, Arrays.asList(new String[] {"Trottelberg", "Deppenschanze", "Idiotenhügel", "Schwachmatenpiste"}), 2));
		allQuestions.add(new Question("Kaum hatte das Milchgeschäft geöffnet, wollte schon der ...?", 4, Arrays.asList(new String[] {"Absolute Spitze", "Voll der Hammer", "Erste Sahne", "Große Klasse"}), 2));
		allQuestions.add(new Question("Snoopys kleiner geflügelter Freund heißt...?", 4, Arrays.asList(new String[] {"Woodstock", "Montreux", "Roskilde", "Loreley"}), 0));
				
		//500€ Fragen
		allQuestions.add(new Question("Wer heißt im amerikanischen Original der \"Sesamstraße\" \"Count Von Count\"?", 5, Arrays.asList(new String[] {"Fürst Buchstabe", "Herzog Ziffer", "Graf Zahl", "Prinz Zeichen"}), 2));
		allQuestions.add(new Question("Was machte 2006 Klinsi mit Wörns?", 5, Arrays.asList(new String[] {"zurückrudern", "einschiffen", "ausbooten", "auftakeln"}), 2));
		allQuestions.add(new Question("In der Vorweihnachtszeit beschenkt man sich anonym beim ...?", 5, Arrays.asList(new String[] {"Zwergeln", "Gnomeln", "Mädchen Rosemarie", "Superweib"}), 2));
		allQuestions.add(new Question("Die Geschichte des Mordfalls Nitribitt wurde 1958 erstmals verfilmt als \"Das ...\"?", 5, Arrays.asList(new String[] {"Schwarzwaldmädel", "Rosen-Resli", "Mädchen Rosemarie", "Superweib"}), 2));
		allQuestions.add(new Question("Welcher 1983 veröffentlichte Song ist passenderweise in der RTL-Serie \"Deutschland 83\" zu hören?", 5, Arrays.asList(new String[] {"Düsenjet nach Steglitz", "Trabbi nach Neukölln", "Sonderzug nach Pankow", "Reisebus nach Spandau"}), 2));
				
		//1000€ Fragen
		allQuestions.add(new Question("Johann Wolfgang von Goethes Autobiographie kennt man unter dem Titel ...?", 6, Arrays.asList(new String[] {"Abfluss und Tatsache", "Ventil und Realität", "Dichtung und Wahrheit", "Stöpsel und Wirklichkeit"}), 2));
		allQuestions.add(new Question("Das KFZ-Kennzeichenkürzel welcher Landeshauptstadt findet man nicht als Symbol eines chemischen Elements?", 6, Arrays.asList(new String[] {"Hannover", "Düsseldorf", "Stuttgart", "Potsdam"}), 1));
		allQuestions.add(new Question("Was war bereits seit Mai 1969 ein beliebtes Zahlungsmittel im europäischen Raum?", 6, Arrays.asList(new String[] {"Euronoten", "Eurocheques", "Euroscheine", "Euromünzen"}), 1));
		allQuestions.add(new Question("Wofür ist bereits in der Planungsphase die Statik von entscheidender Bedeutung?", 6, Arrays.asList(new String[] {"Blinken", "Schalten", "Kuppeln", "Abwürgen"}), 2));
		allQuestions.add(new Question("In welcher Sendung kamen unter anderem Jeanette Biedermann, Mark Forster und Lena Meyer-Landrut ins Tauschgeschäft?", 6, Arrays.asList(new String[] {"Sing meinen Song", "Koch mein Leibgericht", "Verführ meine Frau", "Bewohn mein Haus"}), 0));
		allQuestions.add(new Question("Wie bezeichnet man Wandmalerei auf feuchtem Kalkputz?", 6, Arrays.asList(new String[] {"Fiasko", "Fresko", "Fiesta", "Frisco"}), 1));
				
		//2000€ Fragen
		allQuestions.add(new Question("Wer weiß wohl am ehesten, was mit \"Jumpsuit\" gemeint ist?", 7, Arrays.asList(new String[] {"Modekenner", "Börsen-Spekulanten", "Stabhochspringer", "Autoverkäufer"}), 0));
		allQuestions.add(new Question("Malu Dreyer profitierte Anfang 2013 von ...?", 7, Arrays.asList(new String[] {"Oettingers Sattelstange", "Veltins Fahrradkette", "Diebels Vorderreifen", "Becks Rücktritt"}), 3));
		allQuestions.add(new Question("Was findet man bei Autos meist in den Varianten \"gleichlaufend\" oder \"gegenläufig\"?", 7, Arrays.asList(new String[] {"Rückbank", "Scheibenwischer", "Tankanzeige", "Schneeketten"}), 1));
		allQuestions.add(new Question("Worum geht es üblicherweise, wenn von einem \"Schwanenhalsrahmen\" die Rede ist?", 7, Arrays.asList(new String[] {"Hornbrillen", "Ölgemälde", "Tankanzeige", "Fahrräder"}), 3));
		allQuestions.add(new Question("Wer gewann 2015 als erster Deutscher seit zwölf Jahren wieder ein Springen der Vierschanzentournee?", 7, Arrays.asList(new String[] {"Montag", "Dienstag", "Donnerstag", "Freitag"}), 3));
		allQuestions.add(new Question("Was mancher selbst im nüchternen Zustand nicht hinbekommt: Korrekt schreibt sich der beliebte Cocktail ...?", 7, Arrays.asList(new String[] {"Caipirinja", "Cajpirinha", "Caipirinha", "Caijpiriña"}), 2));
				
		//4000€ Fragen
		allQuestions.add(new Question("Von welchem nur 321 Meter hohen Berg wird behauptet, der meistbestiegene Europas zu sein?", 8, Arrays.asList(new String[] {"Brocken", "Drachenfels", "Feldberg", "Zugspitze"}), 1));
		allQuestions.add(new Question("Wessen Ansprüche sollen hierzulande gesetzlich neu geregelt werden?", 8, Arrays.asList(new String[] {"Münzmütter", "Scheinväter", "Bargeldeltern", "Kerditkartenfamilien"}), 1));
		allQuestions.add(new Question("Woraus besteht in der Regel eine Entourage?", 8, Arrays.asList(new String[] {"Baguette & Rotwein", "Mascara & Lidschatten", "Freunde & Bekannte", "Sofa & Sessel"}), 2));
		allQuestions.add(new Question("Den Andenbären, die einzigen südamerikanische Bärenart, kennt man auch unter der Bezeichnung ...?", 8, Arrays.asList(new String[] {"Toupetbär", "Brillenbär", "Gebissbär", "Hörgerätbär"}), 1));
		allQuestions.add(new Question("Wobei wird vor einem sogenannten Rebound-Effekt gewarnt, der nicht selten zu einer Abhängigkeit führt?", 8, Arrays.asList(new String[] {"Haarspray", "Nasenspray", "Deospray", "Pfefferspray"}), 1));
		
		//8000€ Fragen
		allQuestions.add(new Question("Welche dieser legendären Brücken kann man nicht mit dem Auto passieren?", 9, Arrays.asList(new String[] {"Rialtobrücke", "Pont Neuf", "Golden Gate Bridge", "Öresundbrücke"}), 0));
		allQuestions.add(new Question("Wobei besteht die oberste Schicht oft aus dem sogenannten Fondant?", 9, Arrays.asList(new String[] {"Kaltschaummatratze", "Komposthaufen", "Festtagstorte", "Straßenbelag"}), 2));
		allQuestions.add(new Question("Was haben die Hollywood-Stars Gosling, Reynolds und Phillippe gemeinsam?", 9, Arrays.asList(new String[] {"Vorname Ryan", "Ex-Frau Megan Fox", "Geburtsjahr 1978", "irische Staatsbürgerschaft"}), 0));
		allQuestions.add(new Question("Wie heißt der aktuelle Abenteuer-Kinofilm mit Jake Gyllenhaal und Josh Brolin in den Hauptrollen?", 9, Arrays.asList(new String[] {"Mississippi", "Everest", "Sahara", "Lüneburger Heide"}), 1));
		allQuestions.add(new Question("Die Darstellung welcher Figur wurde schon zweimal mit einem Schauspiel-Oscar prämiert?", 9, Arrays.asList(new String[] {"Dr. Hannibal Lecte", "Forrest Gump", "Joker", "Truman Capote"}), 2));
				
		//16000€ Fragen
		allQuestions.add(new Question("Was bedeutet der Name der italienischen Nachspeise \"Tiramisu\" wörtlich?", 10, Arrays.asList(new String[] {"süß und köstlich", "zieh mich hoch", "das macht dick", "Leckermäulchen"}), 1));
		allQuestions.add(new Question("Welcher Buchstabe kam in der Entstehungsgeschichte unseres heute gebräuchlichen Alphabets erst im Mittelalter hinzu?", 10, Arrays.asList(new String[] {"C", "D", "W", "V"}), 2));
		allQuestions.add(new Question("Welche beiden Staaten einigten sich Ende 2012 über die Festsetzung eines Grenzverlaufs?", 10, Arrays.asList(new String[] {"Deutschland & Australien", "Polen & Südafrika", "Dänemark & Kanada", "Österreich & Japan"}), 2));
		allQuestions.add(new Question("Welche Jahreszeit beginnt bei uns, wenn die Mittagssonne am südlichen Wendekreis im Zenit steht?", 10, Arrays.asList(new String[] {"Frühling", "Sommer", "Herbst", "Winter"}), 3));
		allQuestions.add(new Question("Alfred Gislason ist seit Februar 2020 bereits der zweite Isländer im Amt des deutschen Männer-Nationaltrainers im ...?", 10, Arrays.asList(new String[] {"Basketball", "Volleyball", "Handball", "Tennis"}), 2));
			
		//32000€ Fragen
		allQuestions.add(new Question("Wo befinden sich einige der höchsten Alpengipfel?", 11, Arrays.asList(new String[] {"Monte-Rosa-Massiv", "Monte-Purpur-Höhenzug", "Monte-Lila-Gebirge", "Monte-Magenta-Kette"}), 0));
		allQuestions.add(new Question("Wofür stehen die Buchstaben im Namen der britischen Automarke MG?", 11, Arrays.asList(new String[] {"Moto Guzzi", "Motor Gear", "Morris Garages", "Manchester Gasoline"}), 2));
		allQuestions.add(new Question("Welche dieser religiösen Beobachtungen dauert während des Kalenderjahres am kürzesten?", 11, Arrays.asList(new String[] {"Ramadan", "Diwali", "Lent", "Hanukkah"}), 1));
		allQuestions.add(new Question("Wer macht sich als Gewürz und Heilpflanze nützlich?", 11, Arrays.asList(new String[] {"Angelika", "Dagmar", "Bärbel", "Marion"}), 0));
		allQuestions.add(new Question("Das für die Nahrungsmittelindustrie interessante Stevia, benannt nach der gleichnamigen Pflanze, ist bis zu 300-mal...?", 11, Arrays.asList(new String[] {"saurer als Essig", "schärfer als Pfeffer", "süßer als Zucker", "salziger als Salz"}), 2));
				
		//64000€ Fragen
		allQuestions.add(new Question("Wo wurde der Schriftsteller geboren, der für den Roman „Herkunft“ 2019 mit dem Deutschen Buchpreis ausgezeichnet wurde?", 12, Arrays.asList(new String[] {"Rhodesien", "Jugoslawien", "Ceylon", "Tibet"}), 1));
		allQuestions.add(new Question("Welcher Begriff spielt im Zusammenhang mit der Rechenleistung von Computern eine Rolle?", 12, Arrays.asList(new String[] {"Busbreiten", "Radhöhen", "Autotiefen", "Zuglängen"}), 0));
		allQuestions.add(new Question("Wer erfand die Raufasertapete?", 12, Arrays.asList(new String[] {"Gustav Chemnitz", "Hugo Erfurt", "Alfons Zwickau", "Emil Schwerin"}), 1));
		
		//125000€ Fragen
		allQuestions.add(new Question("Was war hierzulande bis in die 1950er noch gang und gebe?", 13, Arrays.asList(new String[] {"Beamtinnenkommunion", "Krankenschwesternkollete", "Lehrerinnenzölibat", "Sekretärinnenbeichte"}), 2));
		allQuestions.add(new Question("Welche Pflanze gibt es nicht?", 13, Arrays.asList(new String[] {"Pimpernuss", "Zaubernuss", "Wassernuss", "Buchnuss"}), 3));
		allQuestions.add(new Question("Korn darf laut Verordnung über bestimmte alkoholfreie Getränke destilliert werden aus Weizen, Gerste, Hafer, Roggen oder...?", 13, Arrays.asList(new String[] {"Mais", "Buchweizen", "Dinkel", "Hirse"}), 1));
					
		//500000€ Fragen
		allQuestions.add(new Question("Das naturgegebene Schicksal welcher Pflanzen sieht vor, dass die Blüte bei den meisten Arten unweigerlich zu ihrem Tod führt?", 14, Arrays.asList(new String[] {"Bambus", "Ginkgo", "Rhododendron", "Eukalyptus"}), 0));
		allQuestions.add(new Question("Auf dem Gelände, wo Alfred Nobel eine Sprengstofffabrik baute und das Dynamit erfand, steht heute das ...?", 14, Arrays.asList(new String[] {"Kernkraftwerk Krümmel", "Wembley-Stadion", "Europaparlament", "Atomium"}), 0));
		
		//1000000€ Fragen
		allQuestions.add(new Question("Die klassische genormte Europalette EPAL 1 besteht aus 78 Nägeln, neuen Klötzen und insgesamt wie vielen Brettern?", 15, Arrays.asList(new String[] {"Neun", "Zehn", "Elf", "Zwölf"}), 2));
		allQuestions.add(new Question("Welche Höchstgeschwindigkeit erreichte Felix Baumgartner bei seinem Fallschirmsprung aus der Stratosphäre im Oktober 2012?", 15, Arrays.asList(new String[] {"1.011,2 km/h", "1.225,4 km/h", "1.357,6 km/h", "1.483,8 km/h"}), 2));
		allQuestions.add(new Question("Mit welcher Verletzung beschäftigt sich der Orthopäde?\", \"Welche Frucht nennen die Italiener “Arancio dolce”?", 15, Arrays.asList(new String[] {"Meysel-Pyramide", "Volkmann-Dreieck", "Hancke-Trapez", "Mira-Kegel"}), 1));
		allQuestions.add(new Question("Welche Tiere werden vor allem in Nordamerika vom meist tödlich verlaufenden White-Nose-Syndrom befallen?", 15, Arrays.asList(new String[] {"Fledermäuse", "Mäusebussarde", "Waldmeisen", "Ameisenbären"}), 3));	
	}
	
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
		
		List<Question> allQuestions = getAllQuestions();
		init(allQuestions);
	
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
