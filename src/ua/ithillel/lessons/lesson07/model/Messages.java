package ua.ithillel.lessons.lesson07.model;

public enum Messages {

    MSG_HELP_AVAILABLE_OPERATORS (
            String.format("| Available operators: %s %s %s %s",
                    Operators.OPERATOR_PLUS.values,
                    Operators.OPERATOR_MINUS.values,
                    Operators.OPERATOR_MULTIPLY.values,
                    Operators.OPERATOR_DIVIDE.values),
            String.format("| Verfügbare Operatoren: %s %s %s %s",
                    Operators.OPERATOR_PLUS.values,
                    Operators.OPERATOR_MINUS.values,
                    Operators.OPERATOR_MULTIPLY.values,
                    Operators.OPERATOR_DIVIDE.values),
            String.format("| Opérateurs disponibles: %s %s %s %s",
                    Operators.OPERATOR_PLUS.values,
                    Operators.OPERATOR_MINUS.values,
                    Operators.OPERATOR_MULTIPLY.values,
                    Operators.OPERATOR_DIVIDE.values)

    ),
    MSG_HELP_COLUMNS_NAME (
            "| Commands\t| Description",
            "| Befehle\t| Beschreibung",
            "| Commandes\t| La description"
    ),
    MSG_HELP_COMMAND_HELP (
            String.format("| %s\t\t| Call for help", Commands.COMMAND_HELP.values),
            String.format("| %s\t\t| Hilferuf", Commands.COMMAND_HELP.values),
            String.format("| %s\t\t| Appeler à l'aide", Commands.COMMAND_HELP.values)
    ),
    MSG_HELP_COMMAND_EXIT (
            String.format("| %s\t\t| Exit from the program", Commands.COMMAND_EXIT.values),
            String.format("| %s\t\t| Beenden Sie das Programm", Commands.COMMAND_EXIT.values),
            String.format("| %s\t\t| Sortir du programme", Commands.COMMAND_EXIT.values)
    ),
    MSG_HELP_COMMAND_MEMORY_SAVE (
            String.format("| %s\t\t\t| Save result in memory", Commands.COMMAND_MEMORY_SAVE.values),
            String.format("| %s\t\t\t| Ergebnis im Speicher speichern", Commands.COMMAND_MEMORY_SAVE.values),
            String.format("| %s\t\t\t| Enregistrer le résultat en mémoire", Commands.COMMAND_MEMORY_SAVE.values)
    ),
    MSG_HELP_COMMAND_MEMORY_PLUS (
            String.format("| %s\t\t| Add result to memory", Commands.COMMAND_MEMORY_PLUS.values),
            String.format("| %s\t\t| Ergebnis zum Speicher hinzufügen", Commands.COMMAND_MEMORY_PLUS.values),
            String.format("| %s\t\t| Ajouter le résultat à la mémoire", Commands.COMMAND_MEMORY_PLUS.values)
    ),
    MSG_HELP_COMMAND_MEMORY_MINUS (
            String.format("| %s\t\t| Subtract result from memory", Commands.COMMAND_MEMORY_MINUS.values),
            String.format("| %s\t\t| Ergebnis vom Speicher subtrahieren", Commands.COMMAND_MEMORY_MINUS.values),
            String.format("| %s\t\t| Soustraire le résultat de la mémoire", Commands.COMMAND_MEMORY_MINUS.values)
    ),
    MSG_HELP_COMMAND_MEMORY_CLEAR (
            String.format("| %s\t\t| Clear memory", Commands.COMMAND_MEMORY_CLEAR.values),
            String.format("| %s\t\t| Klare Erinnerungen", Commands.COMMAND_MEMORY_CLEAR.values),
            String.format("| %s\t\t| Mémoire claire", Commands.COMMAND_MEMORY_CLEAR.values)
    ),
    MSG_HELP_COMMAND_LANGUAGE_EN (
            String.format("| %s\t\t| Enter english interface language", Commands.LANGUAGE_EN.values),
            String.format("| %s\t\t| Geben Sie die englische Sprache der Benutzeroberfläche ein", Commands.LANGUAGE_EN.values),
            String.format("| %s\t\t| Entrez la langue de l'interface en anglais", Commands.LANGUAGE_EN.values)
    ),
    MSG_HELP_COMMAND_LANGUAGE_DE (
            String.format("| %s\t\t| Enter deutsch interface language", Commands.LANGUAGE_DE.values),
            String.format("| %s\t\t| Geben Sie die deutsche Oberflächensprache ein", Commands.LANGUAGE_DE.values),
            String.format("| %s\t\t| Entrez la langue de l'interface deutsch", Commands.LANGUAGE_DE.values)
    ),
    MSG_HELP_COMMAND_LANGUAGE_FR (
            String.format("| %s\t\t| Enter french interface language", Commands.LANGUAGE_FR.values),
            String.format("| %s\t\t| Geben Sie die französische Sprache der Benutzeroberfläche ein", Commands.LANGUAGE_FR.values),
            String.format("| %s\t\t| Entrez la langue de l'interface en français", Commands.LANGUAGE_FR.values)
    ),
    MSG_HELP_INPUT_FORM (
            "| Enter data of the form:\toperand1 operator operand2",
            "| Daten des Formulars eingeben: operand1 operator operand2",
            "| Entrez les données du formulaire:\topérande1 opérateur opérande2"
    ),
    MSG_HELP_LEFT_MEMORY_FORM (
            String.format("| \t\t\t\t\t\t\t\"%s\" operator operand", Operands.OPERAND_IS_MEMORY.values),
            String.format("| \t\t\t\t\t\t\t\t\"%s\" operator operand", Operands.OPERAND_IS_MEMORY.values),
            String.format("| \t\t\t\t\t\t\t\t\t\"%s\" opérateur opérande", Operands.OPERAND_IS_MEMORY.values)
    ),
    MSG_HELP_RIGHT_MEMORY_FORM (
            String.format("| \t\t\t\t\t\t\toperand operator \"%s\"", Operands.OPERAND_IS_MEMORY.values),
            String.format("| \t\t\t\t\t\t\t\toperand operator \"%s\"", Operands.OPERAND_IS_MEMORY.values),
            String.format("| \t\t\t\t\t\t\t\t\topérande opérateur \"%s\"", Operands.OPERAND_IS_MEMORY.values)
    ),
    MSG_HELP_EXAMPLE_OF_OPERATION (
            String.format("| For example: %s+658.7", Operands.OPERAND_IS_MEMORY.values),
            String.format("| Zum Beispiel: %s+658.7", Operands.OPERAND_IS_MEMORY.values),
            String.format("| Par example: %s+658.7", Operands.OPERAND_IS_MEMORY.values)
    ),
    MSG_HELP_ENTER_COMMAND (
            "| Or enter one of the commands",
            "| Oder geben Sie einen der Befehle ein",
            "| Ou entrez l'une des commandes"
    ),
    MSG_HELP_EXAMPLE_ENTER_COMMAND(
            String.format("| For example: %s", Commands.COMMAND_MEMORY_PLUS.values),
            String.format("| Zum Beispiel: %s", Commands.COMMAND_MEMORY_PLUS.values),
            String.format("| Par example: %s", Commands.COMMAND_MEMORY_PLUS.values)
            ),

    MSG_OUTPUT_RESULT(
            "Result: ",
            "Ergebnis: ",
            "Résultat: "
    ),

    MSG_OUTPUT_MEMORY(
            "Memory: ",
            "Speicher: ",
            "Mémoire: "
    ),

    MSG_ENTER_DATA(
            "> Enter you data: ",
            "> Geben Sie Ihre Daten ein: ",
            "> Entrez vos données: "
    );

    public final String en;
    public final String de;
    public final String fr;

    Messages (String en, String de, String fr) {
       this.en = en;
       this.de = de;
       this.fr = fr;
    }

}
