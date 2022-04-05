package ua.ithillel.lessons.lesson5;

public class Calculator21ITA extends Calculator21{

    public final String THIS_LANGUAGE = LANGUAGE_ITA;

    public String getTHIS_LANGUAGE(){
        return THIS_LANGUAGE;
    }

    public void toConsole(){
        String[] homeMessage = new String[]{
                "| Operazioni disponibili: + - * /",
                "| Comandi\t| Descrizione",
                "| help\t\t| Chiamare per aiuto",
                "| exit\t\t| Esci dal programma",
                "| m\t\t\t| Salva il risultato in memoria",
                "| m+\t\t| Aggiungi il risultato alla memoria",
                "| m-\t\t| Sottrai il risultato dalla memoria",
                "| mc\t\t| Cancella memoria",
                "| Inserisci i dati del modulo:\toperando1 operatore operando2",
                "| \t\t\t\t\t\t\t\t\"memory\" operatore operando2",
                "| \t\t\t\t\t\t\t\toperando1 operatore \"memory\"",
                "| Per esempio: memory+658.7",
                "| Oppure inserisci uno dei comandi",
                "| Per esempio: m+",
                "| Ore inserisci la lingua dell'interfaccia (en, de, fr, ita)"
        };
        for (String line: homeMessage){
            System.out.println(line);
        }
    }

    public void toConsole (double result){
        System.out.println("Risultato: " + result);
    }

    public void toConsole (double memory, double result){
        System.out.println("Memoria: " + memory);
        System.out.println("Risultato: " + result);
    }

    public void toConsoleDataInput (){
        System.out.print("> Inserisci i tuoi dati: ");
    }
}
