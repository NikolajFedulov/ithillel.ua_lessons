package ua.ithillel.lessons.lesson6;

public class UserInterfaceEN extends UserInterface{
    public void toConsole (double result){
        System.out.println("Result: " + result);
    }

    public void toConsole (double memory, double result){
        System.out.println("Memory: " + memory);
        System.out.println("Result: " + result);
    }

    public void toConsole (){
        System.out.print("> Enter you data: ");
    }
}
