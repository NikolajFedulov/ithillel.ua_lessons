package ua.ithillel.lessons.lesson6;

public class HelpITA extends Help{
    public void toConsole(){
        String[] homeMessage = new String[]{
                String.format("| Operatori disponibili: %s %s %s %s", OPERATOR_PLUS, OPERATOR_MINUS, OPERATOR_MULTIPLY, OPERATOR_DIVIDE),
                "| Comandi\t| Descrizione",
                String.format("| %s\t\t| Chiamare per aiuto", COMMAND_HELP),
                String.format("| %s\t\t| Esci dal programma", COMMAND_EXIT),
                String.format("| %s\t\t\t| Salva il risultato in memoria", COMMAND_MEMORY_SAVE),
                String.format("| %s\t\t| Aggiungi il risultato alla memoria", COMMAND_MEMORY_PLUS),
                String.format("| %s\t\t| Sottrai il risultato dalla memoria", COMMAND_MEMORY_MINUS),
                String.format("| %s\t\t| Cancella memoria", COMMAND_MEMORY_CLEAR),
                String.format("| %s\t\t| Inserisci la lingua dell'interfaccia inglese", LANGUAGE_EN),
                String.format("| %s\t\t| Immettere la lingua dell'interfaccia tedesca", LANGUAGE_DE),
                String.format("| %s\t\t| Inserisci la lingua dell'interfaccia francese", LANGUAGE_FR),
                String.format("| %s\t\t| Inserisci la lingua italiana dell'interfaccia", LANGUAGE_ITA),
                "| Inserisci i dati del modulo:\toperando1 operatore operando2",
                String.format("| \t\t\t\t\t\t\t\t\"%s\" operatore operando", OPERAND_IS_MEMORY),
                String.format("| \t\t\t\t\t\t\t\toperando operatore \"%s\"", OPERAND_IS_MEMORY),
                String.format("| Per esempio: %s+658.7", OPERAND_IS_MEMORY),
                "| Oppure inserisci uno dei comandi",
                String.format("| Per esempio: %s", COMMAND_MEMORY_PLUS)
        };
        for (String line: homeMessage){
            System.out.println(line);
        }
    }
}
