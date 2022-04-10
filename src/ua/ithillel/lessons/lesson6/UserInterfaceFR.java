package ua.ithillel.lessons.lesson6;

public class UserInterfaceFR extends UserInterface{
    public void toConsole (double result){
        System.out.println("Résultat: " + result);
    }

    public void toConsole (double memory, double result){
        System.out.println("Mémoire: " + memory);
        System.out.println("Résultat: " + result);
    }

    public void toConsole (){
        System.out.print("> Entrez vos données: ");
    }
}
