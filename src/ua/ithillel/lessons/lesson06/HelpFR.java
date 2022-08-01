package ua.ithillel.lessons.lesson06;

public class HelpFR extends Help{
    public void toConsole(){
        String[] homeMessage = new String[]{
                String.format("| Opérateurs disponibles: %s %s %s %s", OPERATOR_PLUS, OPERATOR_MINUS, OPERATOR_MULTIPLY, OPERATOR_DIVIDE),
                "| Commandes\t| La description",
                String.format("| %s\t\t| Appeler à l'aide", COMMAND_HELP),
                String.format("| %s\t\t| Sortir du programme", COMMAND_EXIT),
                String.format("| %s\t\t\t| Enregistrer le résultat en mémoire", COMMAND_MEMORY_SAVE),
                String.format("| %s\t\t| Ajouter le résultat à la mémoire", COMMAND_MEMORY_PLUS),
                String.format("| %s\t\t| Soustraire le résultat de la mémoire", COMMAND_MEMORY_MINUS),
                String.format("| %s\t\t| Mémoire claire", COMMAND_MEMORY_CLEAR),
                String.format("| %s\t\t| Entrez la langue de l'interface en anglais", LANGUAGE_EN),
                String.format("| %s\t\t| Entrez la langue de l'interface deutsch", LANGUAGE_DE),
                String.format("| %s\t\t| Entrez la langue de l'interface en français", LANGUAGE_FR),
                String.format("| %s\t\t| Entrez la langue de l'interface italienne", LANGUAGE_ITA),
                "| Entrez les données du formulaire:\topérande1 opérateur opérande2",
                String.format("| \t\t\t\t\t\t\t\t\t\"%s\" opérateur opérande", OPERAND_IS_MEMORY),
                String.format("| \t\t\t\t\t\t\t\t\topérande opérateur \"%s\"", OPERAND_IS_MEMORY),
                String.format("| Par example: %s+658.7", OPERAND_IS_MEMORY),
                "| Ou entrez l'une des commandes",
                String.format("| Par example: %s", COMMAND_MEMORY_PLUS)
        };
        for (String line: homeMessage){
            System.out.println(line);
        }
    }
}
