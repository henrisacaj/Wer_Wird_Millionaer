import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {

  Scanner scan = new Scanner(System.in);
  List<Question> allQuestions = new ArrayList<>();
  Random random = new Random();

  List<Question> getAllQuestions() {
    return this.allQuestions;
  }

  void init(List<Question> allQuestions) {

    // 50€ Fragen
    allQuestions.add(new Question("Mit der angeheirateten Verwandschaft ist man ...?", 1,
        Arrays.asList(
            new String[] { "verschwaegert", "verbruedert", "vernefft", "vernichtet" }),
        0));
    allQuestions.add(new Question(
        "Bei einem gut gelaunten Zombie handelt es sich sozusagen um einen...?", 1,
        Arrays.asList(new String[] { "kah Freitag", "kristi Himmelfahrt", "fingst Montag",
            "frohen Leichnam" }),
        3));
    allQuestions.add(new Question("Was gehoert fuer manche zu ihrem Taetigkeitsfeld?", 1,
        Arrays.asList(
            new String[] { "veranwalten", "verbaeckern", "verarzten", "verfoerstern" }),
        2));
    allQuestions.add(new Question(
        "Ein Zeuge hatte genau beobachtet, was der ...?", 1, Arrays.asList(new String[] {
            "Bankueber fall", "Handtaschen raub", "Ladendieb stahl", "Trick betrug" }),
        2));
    allQuestions.add(new Question(
        "Ist das alte ranzig geworden, ist es Zeit, dass ich vor dem Anmachen des Salats das ...?",
        1, Arrays.asList(new String[] { "Licht test", "Motor waesche", "Reifen service",
            "Oel wechsel" }),
        3));

    // 100€ Fragen
    allQuestions.add(new Question("Wer wird in der Polizeikontrolle zur Kasse gebeten?",
        2, Arrays.asList(new String[] { "Airbagnoergler", "Lenkerstaenkerer",
            "Kuppelquengler", "Gurtmuffel" }),
        3));
    allQuestions.add(new Question(
        "Verzweifelt man an einer Sache, ist das einer Redensart zufolge zum...?", 2,
        Arrays.asList(new String[] { "Schafescheren", "Maeusemelken", "Pferdemaesten",
            "Gaensekastrieren" }),
        1));
    allQuestions.add(new Question(
        "Suchte die zweifache Eiskunstlauf-Olympiasiegerin Witt das Weite, dann...?", 2,
        Arrays.asList(new String[] { "taep Pich", "vohr Leger", "leu Fer", "floh Kati" }),
        3));
    allQuestions
        .add(new Question("Wem es an Kaufkraft mangelt, der ist redensartlich ...?", 2,
            Arrays.asList(new String[] { "kurz in Boerse", "knapp bei Kasse",
                "schmal auf Konto", "blank trotz Scheck" }),
            1));
    allQuestions.add(new Question("Wie werden einhoeckerige Kamele genannt?", 2,
        Arrays.asList(new String[] { "Dromedar", "Sansibar", "Kandahar", "Samowar" }),
        0));

    // 200€ Fragen
    allQuestions.add(new Question(
        "Wie nennt man eine leicht zusammenklappbare Schlafstaette?", 3,
        Arrays.asList(
            new String[] { "Ackerliege", "Feldbett", "Wiesenkoje", "Weidenpritsche" }),
        1));
    allQuestions.add(new Question("Twitter ist ein...?", 3,
        Arrays.asList(new String[] { "Mikroblogging-Dienst", "Maxijogging-Plan",
            "Megabugging-Werkzeug", "Mikrobugging-Dienst" }),
        0));
    allQuestions.add(new Question(
        "Sieht der Trainer vom Einsatz eines angeschlagenen Spielers zurzeit lieber ab, ist dieser "
        + "sozusagen nicht in...?",
        3, Arrays.asList(new String[] { "Bratpfanne", "Suppenkessel", "Schnellkochtopf",
            "Auflaufform" }),
        3));
    allQuestions
        .add(new Question("Welche Haut ist kein Bestandeil des menschlichen Auges?", 3,
            Arrays.asList(
                new String[] { "Hornhaut", "Netzhaut", "Regenbogenhaut", "Gaensehaut" }),
            3));
    allQuestions.add(new Question("Was haben Turnerinnern am Stufenbarren fest im Griff?",
        3, Arrays.asList(new String[] { "Carpendale", "Illic", "Holm", "Cordalis" }), 2));

    // 300€ Fragen
    allQuestions.add(new Question(
        "Die Art und Weise, wie Canis lupus sich fortbewegt, ist sozusagen der ...?", 4,
        Arrays.asList(new String[] { "Rein-Hard", "Wil-Helm", "Man-Fred", "Wolf-Gang" }),
        3));
    allQuestions
        .add(new Question(
            "In Deutschland gibt es 17 ...", 4, Arrays.asList(new String[] {
                "Anwaltsstuben", "Managerbuden", "Aertzekammern", "Pilotenkabuffs" }),
            2));
    allQuestions
        .add(new Question(
            "Was gibt es in vielen Skigebieten?", 4, Arrays.asList(new String[] {
                "Trottelberg", "Deppenschanze", "Idiotenhuegel", "Schwachmatenpiste" }),
            2));
    allQuestions.add(
        new Question("Kaum hatte das Milchgeschaeft geoeffnet, wollte schon der ...?", 4,
            Arrays.asList(new String[] { "Absolute Spitze", "Voll der Hammer",
                "Erste Sahne", "Grosse Klasse" }),
            2));
    allQuestions.add(new Question("Snoopys kleiner gefluegelter Freund heisst...?", 4,
        Arrays.asList(new String[] { "Woodstock", "Montreux", "Roskilde", "Loreley" }),
        0));

    // 500€ Fragen
    allQuestions.add(new Question(
        "Wer heisst im amerikanischen Original der \"Sesamstrasse\" \"Count Von Count\"?",
        5, Arrays.asList(new String[] { "Fuerst Buchstabe", "Herzog Ziffer", "Graf Zahl",
            "Prinz Zeichen" }),
        2));
    allQuestions.add(new Question("Was machte 2006 Klinsi mit Woerns?", 5,
        Arrays.asList(
            new String[] { "zurueckrudern", "einschiffen", "ausbooten", "auftakeln" }),
        2));
    allQuestions.add(new Question(
        "In der Vorweihnachtszeit beschenkt man sich anonym beim ...?", 5,
        Arrays.asList(
            new String[] { "Zwergeln", "Gnomeln", "Maedchen Rosemarie", "Superweib" }),
        2));
    allQuestions.add(new Question(
        "Die Geschichte des Mordfalls Nitribitt wurde 1958 erstmals verfilmt als \"Das ...\"?",
        5, Arrays.asList(new String[] { "Schwarzwaldmaedel", "Rosen-Resli",
            "Maedchen Rosemarie", "Superweib" }),
        2));
    allQuestions.add(new Question(
        "Welcher 1983 veroeffentlichte Song ist passenderweise in der RTL-Serie \"Deutschland 83\" "
        + "zu hoeren?",
        5, Arrays.asList(new String[] { "Duesenjet nach Steglitz",
            "Trabbi nach Neukoelln", "Sonderzug nach Pankow", "Reisebus nach Spandau" }),
        2));

    // 1000€ Fragen
    allQuestions.add(new Question(
        "Johann Wolfgang von Goethes Autobiographie kennt man unter dem Titel ...?", 6,
        Arrays.asList(new String[] { "Abfluss und Tatsache", "Ventil und Realitaet",
            "Dichtung und Wahrheit", "Stoepsel und Wirklichkeit" }),
        2));
    allQuestions.add(new Question(
        "Das KFZ-Kennzeichenkuerzel welcher Landeshauptstadt findet man nicht als Symbol eines "
        + "chemischen Elements?",
        6,
        Arrays.asList(new String[] { "Hannover", "Duesseldorf", "Stuttgart", "Potsdam" }),
        1));
    allQuestions.add(new Question(
        "Was war bereits seit Mai 1969 ein beliebtes Zahlungsmittel im europaeischen Raum?",
        6,
        Arrays.asList(
            new String[] { "Euronoten", "Eurocheques", "Euroscheine", "Euromuenzen" }),
        1));
    allQuestions.add(new Question(
        "Wofuer ist bereits in der Planungsphase die Statik von entscheidender Bedeutung?",
        6, Arrays.asList(new String[] { "Blinken", "Schalten", "Kuppeln", "Abwuergen" }),
        2));
    allQuestions.add(new Question(
        "In welcher Sendung kamen unter anderem Jeanette Biedermann, Mark Forster und Lena "
        + "Meyer-Landrut ins Tauschgeschaeft?",
        6, Arrays.asList(new String[] { "Sing meinen Song", "Koch mein Leibgericht",
            "Verfuehr meine Frau", "Bewohn mein Haus" }),
        0));
    allQuestions.add(new Question("Wie bezeichnet man Wandmalerei auf feuchtem Kalkputz?",
        6, Arrays.asList(new String[] { "Fiasko", "Fresko", "Fiesta", "Frisco" }), 1));

    // 2000€ Fragen
    allQuestions
        .add(new Question("Wer weiss wohl am ehesten, was mit \"Jumpsuit\" gemeint ist?",
            7, Arrays.asList(new String[] { "Modekenner", "Boersen-Spekulanten",
                "Stabhochspringer", "Autoverkaeufer" }),
            0));
    allQuestions
        .add(new Question("Malu Dreyer profitierte Anfang 2013 von ...?", 7,
            Arrays.asList(new String[] { "Oettingers Sattelstange",
                "Veltins Fahrradkette", "Diebels Vorderreifen", "Becks Ruecktritt" }),
            3));
    allQuestions.add(new Question(
        "Was findet man bei Autos meist in den Varianten \"gleichlaufend\" oder \"gegenlaeufig\"?",
        7, Arrays.asList(new String[] { "Rueckbank", "Scheibenwischer", "Tankanzeige",
            "Schneeketten" }),
        1));
    allQuestions.add(new Question(
        "Worum geht es ueblicherweise, wenn von einem \"Schwanenhalsrahmen\" die Rede ist?",
        7,
        Arrays.asList(
            new String[] { "Hornbrillen", "Oelgemaelde", "Tankanzeige", "Fahrraeder" }),
        3));
    allQuestions.add(new Question(
        "Wer gewann 2015 als erster Deutscher seit zwoelf Jahren wieder ein Springen der "
        + "Vierschanzentournee?",
        7, Arrays.asList(new String[] { "Montag", "Dienstag", "Donnerstag", "Freitag" }),
        3));
    allQuestions.add(new Question(
        "Was mancher selbst im nuechternen Zustand nicht hinbekommt: Korrekt schreibt sich der "
        + "beliebte Cocktail ...?",
        7, Arrays.asList(
            new String[] { "Caipirinja", "Cajpirinha", "Caipirinha", "Caijpiriña" }),
        2));

    // 4000€ Fragen
    allQuestions.add(new Question(
        "Von welchem nur 321 Meter hohen Berg wird behauptet, der meistbestiegene Europas zu sein?",
        8,
        Arrays.asList(new String[] { "Brocken", "Drachenfels", "Feldberg", "Zugspitze" }),
        1));
    allQuestions.add(new Question(
        "Wessen Ansprueche sollen hierzulande gesetzlich neu geregelt werden?", 8,
        Arrays.asList(new String[] { "Muenzmuetter", "Scheinvaeter", "Bargeldeltern",
            "Kerditkartenfamilien" }),
        1));
    allQuestions
        .add(
            new Question("Woraus besteht in der Regel eine Entourage?", 8,
                Arrays.asList(new String[] { "Baguette & Rotwein",
                    "Mascara & Lidschatten", "Freunde & Bekannte", "Sofa & Sessel" }),
                2));
    allQuestions.add(new Question(
        "Den Andenbaeren, die einzigen suedamerikanische Baerenart, kennt man auch unter der "
        + "Bezeichnung ...?",
        8,
        Arrays.asList(
            new String[] { "Toupetbaer", "Brillenbaer", "Gebissbaer", "Hoergeraetbaer" }),
        1));
    allQuestions.add(new Question(
        "Wobei wird vor einem sogenannten Rebound-Effekt gewarnt, der nicht selten zu einer "
        + "Abhaengigkeit fuehrt?",
        8, Arrays.asList(
            new String[] { "Haarspray", "Nasenspray", "Deospray", "Pfefferspray" }),
        1));

    // 8000€ Fragen
    allQuestions.add(new Question(
        "Welche dieser legendaeren Bruecken kann man nicht mit dem Auto passieren?", 9,
        Arrays.asList(new String[] { "Rialtobruecke", "Pont Neuf", "Golden Gate Bridge",
            "Oeresundbruecke" }),
        0));
    allQuestions.add(
        new Question("Wobei besteht die oberste Schicht oft aus dem sogenannten Fondant?",
            9, Arrays.asList(new String[] { "Kaltschaummatratze", "Komposthaufen",
                "Festtagstorte", "Strassenbelag" }),
            2));
    allQuestions.add(new Question(
        "Was haben die Hollywood-Stars Gosling, Reynolds und Phillippe gemeinsam?", 9,
        Arrays.asList(new String[] { "Vorname Ryan", "Ex-Frau Megan Fox",
            "Geburtsjahr 1978", "irische Staatsbuergerschaft" }),
        0));
    allQuestions.add(new Question(
        "Wie heisst der aktuelle Abenteuer-Kinofilm mit Jake Gyllenhaal und Josh Brolin in den "
        + "Hauptrollen?",
        9,
        Arrays.asList(
            new String[] { "Mississippi", "Everest", "Sahara", "Lueneburger Heide" }),
        1));
    allQuestions.add(new Question(
        "Die Darstellung welcher Figur wurde schon zweimal mit einem Schauspiel-Oscar praemiert?",
        9, Arrays.asList(new String[] { "Dr. Hannibal Lecte", "Forrest Gump", "Joker",
            "Truman Capote" }),
        2));

    // 16000€ Fragen
    allQuestions.add(new Question(
        "Was bedeutet der Name der italienischen Nachspeise \"Tiramisu\" woertlich?", 10,
        Arrays.asList(new String[] { "suess und koestlich", "zieh mich hoch",
            "das macht dick", "Leckermaeulchen" }),
        1));
    allQuestions.add(new Question(
        "Welcher Buchstabe kam in der Entstehungsgeschichte unseres heute gebraeuchlichen "
        + "Alphabets erst im Mittelalter hinzu?",
        10, Arrays.asList(new String[] { "C", "D", "W", "V" }), 2));
    allQuestions.add(new Question(
        "Welche beiden Staaten einigten sich Ende 2012 ueber die Festsetzung eines Grenzverlaufs?",
        10, Arrays.asList(new String[] { "Deutschland & Australien", "Polen & Suedafrika",
            "Daenemark & Kanada", "Oesterreich & Japan" }),
        2));
    allQuestions.add(new Question(
        "Welche Jahreszeit beginnt bei uns, wenn die Mittagssonne am suedlichen Wendekreis im Zenit"
        + " steht?",
        10, Arrays.asList(new String[] { "Fruehling", "Sommer", "Herbst", "Winter" }),
        3));
    allQuestions.add(new Question(
        "Alfred Gislason ist seit Februar 2020 bereits der zweite Islaender im Amt des deutschen "
        + "Maenner-Nationaltrainers im ...?",
        10,
        Arrays.asList(new String[] { "Basketball", "Volleyball", "Handball", "Tennis" }),
        2));

    // 32000€ Fragen
    allQuestions.add(new Question("Wo befinden sich einige der hoechsten Alpengipfel?",
        11, Arrays.asList(new String[] { "Monte-Rosa-Massiv", "Monte-Purpur-Hoehenzug",
            "Monte-Lila-Gebirge", "Monte-Magenta-Kette" }),
        0));
    allQuestions.add(
        new Question("Wofuer stehen die Buchstaben im Namen der britischen Automarke MG?",
            11, Arrays.asList(new String[] { "Moto Guzzi", "Motor Gear", "Morris Garages",
                "Manchester Gasoline" }),
            2));
    allQuestions.add(new Question(
        "Welche dieser religioesen Beobachtungen dauert waehrend des Kalenderjahres am kuerzesten?",
        11, Arrays.asList(new String[] { "Ramadan", "Diwali", "Lent", "Hanukkah" }), 1));
    allQuestions.add(new Question("Wer macht sich als Gewuerz und Heilpflanze nuetzlich?",
        11, Arrays.asList(new String[] { "Angelika", "Dagmar", "Baerbel", "Marion" }),
        0));
    allQuestions.add(new Question(
        "Das fuer die Nahrungsmittelindustrie interessante Stevia, benannt nach der gleichnamigen "
        + "Pflanze, ist bis zu 300-mal...?",
        11, Arrays.asList(new String[] { "saurer als Essig", "schaerfer als Pfeffer",
            "suesser als Zucker", "salziger als Salz" }),
        2));

    // 64000€ Fragen
    allQuestions.add(new Question(
        "Wo wurde der Schriftsteller geboren, der fuer den Roman Herkunft 2019 mit dem Deutschen "
        + "Buchpreis ausgezeichnet wurde?",
        12, Arrays.asList(new String[] { "Rhodesien", "Jugoslawien", "Ceylon", "Tibet" }),
        1));
    allQuestions.add(new Question(
        "Welcher Begriff spielt im Zusammenhang mit der Rechenleistung von Computern eine Rolle?",
        12, Arrays.asList(
            new String[] { "Busbreiten", "Radhoehen", "Autotiefen", "Zuglaengen" }),
        0));
    allQuestions
        .add(new Question(
            "Wer erfand die Raufasertapete?", 12, Arrays.asList(new String[] {
                "Gustav Chemnitz", "Hugo Erfurt", "Alfons Zwickau", "Emil Schwerin" }),
            1));
    allQuestions.add(new Question(
        "Wie lautet der vollstaendige Vorname von Expraesident und Nobeltraeger Jimmy Carter?",
        12, Arrays.asList(
            new String[] { "Jim Bob", "John Ross", "James Earl", "Joseph Conrad" }),
        2));
    allQuestions.add(new Question("Worauf deutet das “V“ bei einem V-Motor hin?", 12,
        Arrays.asList(new String[] { "Bauform", "Heckantrieb", "Kraftstoffart",
            "Zylinder-Anzahl" }),
        0));

    // 125000€ Fragen
    allQuestions
        .add(new Question("Was war hierzulande bis in die 1950er noch gang und gebe?", 13,
            Arrays
                .asList(new String[] { "Beamtinnenkommunion", "Krankenschwesternkollete",
                    "Lehrerinnenzoelibat", "Sekretaerinnenbeichte" }),
            2));
    allQuestions
        .add(new Question("Welche Pflanze gibt es nicht?", 13,
            Arrays.asList(
                new String[] { "Pimpernuss", "Zaubernuss", "Wassernuss", "Buchnuss" }),
            3));
    allQuestions.add(new Question(
        "Korn darf laut Verordnung ueber bestimmte alkoholfreie Getraenke destilliert werden aus "
        + "Weizen, Gerste, Hafer, Roggen oder...?",
        13, Arrays.asList(new String[] { "Mais", "Buchweizen", "Dinkel", "Hirse" }), 1));
    allQuestions
        .add(
            new Question(
                "Wo liegt Franz-Josef-Land?", 13, Arrays.asList(new String[] {
                    "Westanatolien", "Nordpolarmeer", "Suedtasmanien", "Ostantarktis" }),
                1));
    allQuestions.add(new Question(
        "Wie werden die Stoesse aufgestapelter Baumstaemme gennant, die man oft in Waeldern sieht?",
        13, Arrays.asList(new String[] { "Polder", "Poller", "Polster", "Polter" }), 3));

    // 500000€ Fragen
    allQuestions.add(new Question(
        "Das naturgegebene Schicksal welcher Pflanzen sieht vor, dass die Bluete bei den meisten "
        + "Arten unweigerlich zu ihrem Tod fuehrt?",
        14,
        Arrays.asList(new String[] { "Bambus", "Ginkgo", "Rhododendron", "Eukalyptus" }),
        0));
    allQuestions.add(new Question(
        "Auf dem Gelaende, wo Alfred Nobel eine Sprengstofffabrik baute und das Dynamit erfand, "
        + "steht heute das ...?",
        14, Arrays.asList(new String[] { "Kernkraftwerk Kruemmel", "Wembley-Stadion",
            "Europaparlament", "Atomium" }),
        0));
    allQuestions
        .add(new Question("Wie hiess das erste deutsche Frachtschiff mit Atomantrieb?",
            14, Arrays.asList(new String[] { "Albert Einstein", "Otto Hahn",
                "Wilhelm Conrad Roentgen", "Georg Ohm" }),
            1));
    allQuestions
        .add(new Question("Welche deutschen Namen traegt das Insekt Paraponera clavata?",
            14, Arrays.asList(new String[] { "60-Sekunden-Kaefer", "5-Minuten-Wanze",
                "24-Stunden-Ameise", "9 1/2-Wochen-Biene" }),
            2));
    allQuestions.add(new Question(
        "Bei welcher Taetigkeit benutzte man der Wortherkunft nach urspruenglich eine Rakete?",
        14, Arrays.asList(new String[] { "Backen", "Pfluegen", "Spinnen", "Toepfern" }),
        2));

    // 1000000€ Fragen
    allQuestions.add(new Question(
        "Die klassische genormte Europalette EPAL 1 besteht aus 78 Naegeln, neuen Kloetzen und "
        + "insgesamt wie vielen Brettern?",
        15, Arrays.asList(new String[] { "Neun", "Zehn", "Elf", "Zwoelf" }), 2));
    allQuestions.add(new Question(
        "Welche Hoechstgeschwindigkeit erreichte Felix Baumgartner bei seinem Fallschirmsprung aus "
        + "der Stratosphaere im Oktober 2012?",
        15, Arrays.asList(new String[] { "1.011,2 km/h", "1.225,4 km/h", "1.357,6 km/h",
            "1.483,8 km/h" }),
        2));
    allQuestions
        .add(new Question("Mit welcher Verletzung beschaeftigt sich der Orthopaede?", 15,
            Arrays.asList(new String[] { "Meysel-Pyramide", "Volkmann-Dreieck",
                "Hancke-Trapez", "Mira-Kegel" }),
            1));
    allQuestions.add(new Question(
        "Welche Tiere werden vor allem in Nordamerika vom meist toedlich verlaufenden "
        + "White-Nose-Syndrom befallen?",
        15, Arrays.asList(new String[] { "Fledermaeuse", "Maeusebussarde", "Waldmeisen",
            "Ameisenbaeren" }),
        3));
    allQuestions.add(new Question("Welche Frucht nennen die Italianer “Arancio Dolce“ ?",
        15,
        Arrays.asList(new String[] { "Mandarine", "Pampelmuse", "Zitrone", "Apfelsine" }),
        3));
  }

  void start() {

    String welcomeText = "Herzlich Willkommen bei \"Wer wird Millionaer\"!";
    String tutorialText = "Bei diesem Spiel geht es darum einen möglichst hohen Geldbetrag zu "
        + "gewinnen. Dafür musst du Fragen beantworten, die im Schwierigkeitsgrad ansteigen. \n"
        + "Dir wird in jedem Schwierigkeitsgrad eine Frage und die vier dazu gehörigen "
        + "Antwortmöglichkeiten angezeigt. \n"
        + "Um eine Antwortmöglichkeit zu wählen, gebe den Buchstaben, der vor der jeweiligen"
        + "Antwort steht ein. \n"
        + "Waehlst du die richtige Antwort, steigt der gewonnene Geldbetrag, aber auch der "
        + "Schwiergkeitsgrad an. \n"
        + "Waehlst du die falsche Antwort, fällst du auf eine der Sicherheitsstufen zurück und "
        + "gewinnst nur den den Wert der Sicherheitsstufe (500€ oder 16000€) \n"
        + "Um das zu verhindern kannst du das Spiel durch Eingeben von \"q\" verlassen, um den "
        + "Geldbetrag der zuletzt richtig beantworteten Frage zu behalten. \n"
        + "Bist du bereit? Dann druecke bitte die Taste \"j\".";

    showMessage(welcomeText);

    String name = getName();

    String askShouldShowTutorial = "Hallo " + name
        + ", bist du bereit? Wenn du ein kleines Tutorial brauchst, druecke bitte die Taste \"j\". "
        + "Ansonsten geht es mit \"n\" mit der ersten Frage los!";
    showMessage(askShouldShowTutorial);

    boolean showTutorial = getYesNoFromUser();

    while (showTutorial) {
      showMessage(tutorialText);
      showTutorial = !getYesNoFromUser();
    }

    List<Question> allQuestions = getAllQuestions();
    init(allQuestions);

    for (int currentDifficulty = 1; currentDifficulty < 15; currentDifficulty++) {
      int[] cashPrizes = { 50, 100, 200, 300, 500, 1000, 2000, 4000, 8000, 16000, 32000,
          64000, 125000, 500000, 1000000 };
      Question currentQuestion = getRandomQuestion(
          getQuestionsByDifficulty(currentDifficulty));
      String currentQuestionText = currentQuestion.getQuestion();
      System.out.println("Du bist jetzt bei der " + cashPrizes[currentDifficulty - 1]
          + "€ Frage. \n\n" + currentQuestionText);
      System.out.println();
      showAnswers(currentQuestion);
      System.out.println();
      int userAnswer = getUserAnswer();
      int quit = 4;
      if (userAnswer == currentQuestion.getCorrectAnswer()) {
        if (currentDifficulty == 15) {
          System.out.println(
              "Herzlichen Glueckwunsch! Du bist jetzt ein virtueller Millionaer.");
        } else {
          System.out.println("Deine Antwort war richtig! Die gewonnene Summe liegt bei "
              + cashPrizes[currentDifficulty - 1] + "€.");
        }  
      } else if (userAnswer == quit) {
        System.out.println("Du hast aufgegeben! Die gewonnene Summe liegt bei "
            + cashPrizes[currentDifficulty - 2] + "€.");
        break;
      } else {
        if (currentDifficulty <= 5) {
          System.out
              .println("Deine Antwort war falsch! Die gewonnene Summe liegt bei 0 €.");
          break;
        } else if (currentDifficulty <= 10) {
          System.out.println("Deine Antwort war falsch! Die gewonnene Summe liegt bei "
              + cashPrizes[4] + "€!");
          break;
        } else {
          System.out.println("Deine Antwort war falsch! Die gewonnene Summe liegt bei "
              + cashPrizes[9] + "€!");
          break;
        }
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

    while (nameIsValid == false) {
      name = scan.nextLine();
      if (name.equals("")) {
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

    while (!inputValid) {

      if (input.equals("j")) {
        answerIsYes = true;
        inputValid = true;
      } else if (input.equals("n")) {
        answerIsYes = false;
        inputValid = true;
      } else if (!inputValid) {
        showMessage(prompt);
        input = scan.nextLine();
      }
    }
    return answerIsYes;
  }

  List<Question> getQuestionsByDifficulty(int currentDifficulty) {

    List<Question> questionsWithCurrentDifficulty = new ArrayList<>();

    for (int i = 0; i < allQuestions.size(); i++) {
      if (allQuestions.get(i).getDifficulty() == currentDifficulty) {
        questionsWithCurrentDifficulty.add(allQuestions.get(i));
      }
    }
    return questionsWithCurrentDifficulty;
  }

  Question getRandomQuestion(List<Question> questions) {
    return questions.get(random.nextInt(questions.size()));
  }

  void showAnswers(Question currentQuestion) {

    List<String> currentAnswers = currentQuestion.getAnswers();

    for (int i = 0; i < currentAnswers.size(); i++) {

      switch (i) {
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
        //default:
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
      switch (userInput) {
        case 'a':
          answerIndex = 0;
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
        case 'q':
          answerIndex = 4;
          inputValid = true;
          break;
        case 'A':
          answerIndex = 0;
          inputValid = true;
          break;
        case 'B':
          answerIndex = 1;
          inputValid = true;
          break;
        case 'C':
          answerIndex = 2;
          inputValid = true;
          break;
        case 'D':
          answerIndex = 3;
          inputValid = true;
          break;
        case 'Q':
          answerIndex = 4;
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
