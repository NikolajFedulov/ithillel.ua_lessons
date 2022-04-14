package ua.ithillel.lessons.lesson6;

public class UserInterfaceITA extends UserInterface{
    public void toConsole (double result){
        System.out.println("Risultato: " + result);
    }

    public void toConsole (double memory, double result){
        System.out.println("Memoria: " + memory);
        System.out.println("Risultato: " + result);
    }

    public void toConsole (){
        System.out.print("> Inserisci i tuoi dati: ");
    }

}
