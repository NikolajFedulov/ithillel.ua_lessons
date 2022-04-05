package ua.ithillel.lessons.lesson5;

public class Calculator21DE extends Calculator21{

    private final String THIS_LANGUAGE = LANGUAGE_DE;

    public String getTHIS_LANGUAGE(){
        return THIS_LANGUAGE;
    }

    public void toConsole(){
        String[] homeMessage = new String[]{
                "| Verfügbare Operationen: + - * /",
                "| Befehle\t| Beschreibung",
                "| help\t\t| Rufen Sie um Hilfe",
                "| exit\t\t| Beenden Sie das Programm",
                "| m\t\t\t| Ergebnis im Speicher speichern",
                "| m+\t\t| Ergebnis zum Speicher hinzufügen",
                "| m-\t\t| Ergebnis vom Speicher subtrahieren",
                "| mc\t\t| Klare Erinnerungen",
                "| Geben Sie die Daten des Formulars ein:\toperand1 operator operand2",
                "| \t\t\t\t\t\t\t\t\t\t\t\"memory\" operator operand",
                "| \t\t\t\t\t\t\t\t\t\t\toperand operator \"memory\"",
                "| Zum Beispiel: memory+658.7",
                "| Oder geben Sie einen der Befehle ein",
                "| Zum Beispiel: m+",
                "| Oder geben Sie die Sprache der Benutzeroberfläche ein (en, de, fr, ita)"
        };
        for (String line: homeMessage){
            System.out.println(line);
        }
    }

    public void toConsole (double result){
        System.out.println("Ergebnis: " + result);
    }

    public void toConsole (double memory, double result){
        System.out.println("Erinnerung: " + memory);
        System.out.println("Ergebnis: " + result);
    }

    public void toConsoleDataInput (){
        System.out.print("> Geben Sie Ihre Daten ein: ");
    }
}
