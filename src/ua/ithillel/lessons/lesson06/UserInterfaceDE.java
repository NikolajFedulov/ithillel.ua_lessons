package ua.ithillel.lessons.lesson06;

public class UserInterfaceDE extends UserInterface{
    public void toConsole (double result){
        System.out.println("Ergebnis: " + result);
    }

    public void toConsole (double memory, double result){
        System.out.println("Speicher: " + memory);
        System.out.println("Ergebnis: " + result);
    }

    public void toConsole (){
        System.out.print("> Geben Sie Ihre Daten ein: ");
    }
}
