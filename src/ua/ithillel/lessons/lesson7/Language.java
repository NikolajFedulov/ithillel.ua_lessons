package ua.ithillel.lessons.lesson7;

public enum Language {
    EN{
        final String[] ARRAY_OF_HELP_LIST = new String[]{
                String.format("| Available operators: %s %s %s %s",
                        Operators.OPERATOR_PLUS.values,
                        Operators.OPERATOR_MINUS.values,
                        Operators.OPERATOR_MULTIPLY.values,
                        Operators.OPERATOR_DIVIDE.values),
                "| Commands\t| Description",
                String.format("| %s\t\t| Call for help", Commands.COMMAND_HELP.values),
                String.format("| %s\t\t| Exit from the program", Commands.COMMAND_EXIT.values),
                String.format("| %s\t\t\t| Save result in memory", Commands.COMMAND_MEMORY_SAVE.values),
                String.format("| %s\t\t| Add result to memory", Commands.COMMAND_MEMORY_PLUS.values),
                String.format("| %s\t\t| Subtract result from memory", Commands.COMMAND_MEMORY_MINUS.values),
                String.format("| %s\t\t| Clear memory", Commands.COMMAND_MEMORY_CLEAR.values),
                String.format("| %s\t\t| Enter english interface language", Commands.LANGUAGE_EN.values),
                String.format("| %s\t\t| Enter deutsch interface language", Commands.LANGUAGE_DE.values),
                String.format("| %s\t\t| Enter french interface language", Commands.LANGUAGE_FR.values),
                //String.format("| %s\t\t| Enter italian interface language", Commands.LANGUAGE_ITA.values),
                "| Enter data of the form:\toperand1 operator operand2",
                String.format("| \t\t\t\t\t\t\t\"%s\" operator operand", Operands.OPERAND_IS_MEMORY.values),
                String.format("| \t\t\t\t\t\t\toperand operator \"%s\"", Operands.OPERAND_IS_MEMORY.values),
                String.format("| For example: %s+658.7", Operands.OPERAND_IS_MEMORY.values),
                "| Or enter one of the commands",
                String.format("| For example: %s", Commands.COMMAND_MEMORY_PLUS.values)
        };
        final String LINE_OUTPUT_RESULT = "Result: ";
        final String LINE_OUTPUT_MEMORY = "Memory: ";
        final String LINE_ENTER_DATA = "> Enter you data: ";

        String[] getArrayOfHelpList(){
            return ARRAY_OF_HELP_LIST;
        }

        String getLineOutputResult(){
            return LINE_OUTPUT_RESULT;
        }

        String getLineOutputMemory(){
            return LINE_OUTPUT_MEMORY;
        }

        String getLineEnterData(){
            return LINE_ENTER_DATA;
        }
    },
    DE{
        final String[] ARRAY_OF_HELP_LIST = new String[]{
                String.format("| Verfügbare Operatoren: %s %s %s %s",
                        Operators.OPERATOR_PLUS.values,
                        Operators.OPERATOR_MINUS.values,
                        Operators.OPERATOR_MULTIPLY.values,
                        Operators.OPERATOR_DIVIDE.values),
                "| Befehle\t| Beschreibung",
                String.format("| %s\t\t| Hilferuf", Commands.COMMAND_HELP.values),
                String.format("| %s\t\t| Beenden Sie das Programm", Commands.COMMAND_EXIT.values),
                String.format("| %s\t\t\t| Ergebnis im Speicher speichern", Commands.COMMAND_MEMORY_SAVE.values),
                String.format("| %s\t\t| Ergebnis zum Speicher hinzufügen", Commands.COMMAND_MEMORY_PLUS.values),
                String.format("| %s\t\t| Ergebnis vom Speicher subtrahieren", Commands.COMMAND_MEMORY_MINUS.values),
                String.format("| %s\t\t| Klare Erinnerungen", Commands.COMMAND_MEMORY_CLEAR.values),
                String.format("| %s\t\t| Geben Sie die englische Sprache der Benutzeroberfläche ein", Commands.LANGUAGE_EN.values),
                String.format("| %s\t\t| Geben Sie die deutsche Oberflächensprache ein", Commands.LANGUAGE_DE.values),
                String.format("| %s\t\t| Geben Sie die französische Sprache der Benutzeroberfläche ein", Commands.LANGUAGE_FR.values),
                //String.format("| %s\t\t| Geben Sie die italienische Sprache der Benutzeroberfläche ein", Commands.LANGUAGE_ITA.values),
                "| Daten des Formulars eingeben: operand1 operator operand2",
                String.format("| \t\t\t\t\t\t\t\t\"%s\" operator operand", Operands.OPERAND_IS_MEMORY.values),
                String.format("| \t\t\t\t\t\t\t\toperand operator \"%s\"", Operands.OPERAND_IS_MEMORY.values),
                String.format("| Zum Beispiel: %s+658.7", Operands.OPERAND_IS_MEMORY.values),
                "| Oder geben Sie einen der Befehle ein",
                String.format("| Zum Beispiel: %s", Commands.COMMAND_MEMORY_PLUS.values)
        };
        final String LINE_OUTPUT_RESULT = "Ergebnis: ";
        final String LINE_OUTPUT_MEMORY = "Speicher: ";
        final String LINE_ENTER_DATA = "> Geben Sie Ihre Daten ein: ";

        String[] getArrayOfHelpList(){
            return ARRAY_OF_HELP_LIST;
        }

        String getLineOutputResult(){
            return LINE_OUTPUT_RESULT;
        }

        String getLineOutputMemory(){
            return LINE_OUTPUT_MEMORY;
        }

        String getLineEnterData(){
            return LINE_ENTER_DATA;
        }

    },
    FR{
        final String[] ARRAY_OF_HELP_LIST = new String[]{
                String.format("| Opérateurs disponibles: %s %s %s %s",
                        Operators.OPERATOR_PLUS.values,
                        Operators.OPERATOR_MINUS.values,
                        Operators.OPERATOR_MULTIPLY.values,
                        Operators.OPERATOR_DIVIDE.values),
                "| Commandes\t| La description",
                String.format("| %s\t\t| Appeler à l'aide", Commands.COMMAND_HELP.values),
                String.format("| %s\t\t| Sortir du programme", Commands.COMMAND_EXIT.values),
                String.format("| %s\t\t\t| Enregistrer le résultat en mémoire", Commands.COMMAND_MEMORY_SAVE.values),
                String.format("| %s\t\t| Ajouter le résultat à la mémoire", Commands.COMMAND_MEMORY_PLUS.values),
                String.format("| %s\t\t| Soustraire le résultat de la mémoire", Commands.COMMAND_MEMORY_MINUS.values),
                String.format("| %s\t\t| Mémoire claire", Commands.COMMAND_MEMORY_CLEAR.values),
                String.format("| %s\t\t| Entrez la langue de l'interface en anglais", Commands.LANGUAGE_EN.values),
                String.format("| %s\t\t| Entrez la langue de l'interface deutsch", Commands.LANGUAGE_DE.values),
                String.format("| %s\t\t| Entrez la langue de l'interface en français", Commands.LANGUAGE_FR.values),
                //String.format("| %s\t\t| Entrez la langue de l'interface italienne", Commands.LANGUAGE_ITA.values),
                "| Entrez les données du formulaire:\topérande1 opérateur opérande2",
                String.format("| \t\t\t\t\t\t\t\t\t\"%s\" opérateur opérande", Operands.OPERAND_IS_MEMORY.values),
                String.format("| \t\t\t\t\t\t\t\t\topérande opérateur \"%s\"", Operands.OPERAND_IS_MEMORY.values),
                String.format("| Par example: %s+658.7", Operands.OPERAND_IS_MEMORY.values),
                "| Ou entrez l'une des commandes",
                String.format("| Par example: %s", Commands.COMMAND_MEMORY_PLUS.values)
        };
        final String LINE_OUTPUT_RESULT = "Résultat: ";
        final String LINE_OUTPUT_MEMORY = "Mémoire: ";
        final String LINE_ENTER_DATA = "> Entrez vos données: ";

        String[] getArrayOfHelpList(){
            return ARRAY_OF_HELP_LIST;
        }

        String getLineOutputResult(){
            return LINE_OUTPUT_RESULT;
        }

        String getLineOutputMemory(){
            return LINE_OUTPUT_MEMORY;
        }

        String getLineEnterData(){
            return LINE_ENTER_DATA;
        }
    };

    abstract String[] getArrayOfHelpList();
    abstract String getLineOutputResult();
    abstract String getLineOutputMemory();
    abstract String getLineEnterData();
}
