package ua.ithillel.lessons.lesson6;

public class HelpDE extends Help{
    public void toConsole(){
        String[] homeMessage = new String[]{
                String.format("| Verfügbare Operatoren: %s %s %s %s", OPERATOR_PLUS, OPERATOR_MINUS, OPERATOR_MULTIPLY, OPERATOR_DIVIDE),
                "| Befehle\t| Beschreibung",
                String.format("| %s\t\t| Hilferuf", COMMAND_HELP),
                String.format("| %s\t\t| Beenden Sie das Programm", COMMAND_EXIT),
                String.format("| %s\t\t\t| Ergebnis im Speicher speichern", COMMAND_MEMORY_SAVE),
                String.format("| %s\t\t| Ergebnis zum Speicher hinzufügen", COMMAND_MEMORY_PLUS),
                String.format("| %s\t\t| Ergebnis vom Speicher subtrahieren", COMMAND_MEMORY_MINUS),
                String.format("| %s\t\t| Klare Erinnerungen", COMMAND_MEMORY_CLEAR),
                String.format("| %s\t\t| Geben Sie die englische Sprache der Benutzeroberfläche ein", LANGUAGE_EN),
                String.format("| %s\t\t| Geben Sie die deutsche Oberflächensprache ein", LANGUAGE_DE),
                String.format("| %s\t\t| Geben Sie die französische Sprache der Benutzeroberfläche ein", LANGUAGE_FR),
                String.format("| %s\t\t| Geben Sie die italienische Sprache der Benutzeroberfläche ein", LANGUAGE_ITA),
                "| Daten des Formulars eingeben: operand1 operator operand2",
                String.format("| \t\t\t\t\t\t\t\t\"%s\" operator operand", OPERAND_IS_MEMORY),
                String.format("| \t\t\t\t\t\t\t\toperand operator \"%s\"", OPERAND_IS_MEMORY),
                String.format("| Zum Beispiel: %s+658.7", OPERAND_IS_MEMORY),
                "| Oder geben Sie einen der Befehle ein",
                String.format("| Zum Beispiel: %s", COMMAND_MEMORY_PLUS)
        };
        for (String line: homeMessage){
            System.out.println(line);
        }
    }
}
