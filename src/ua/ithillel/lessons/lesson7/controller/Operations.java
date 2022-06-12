package ua.ithillel.lessons.lesson7.controller;

public class Operations {

    private Operations(){}

    public static double addToResult(double operandOne, double operandTwo){
        return operandOne + operandTwo;
    }

    public static double subToResult(double operandOne, double operandTwo){
        return operandOne - operandTwo;
    }

    public static double mulToResult(double operandOne, double operandTwo){
        return operandOne * operandTwo;
    }

    public static double divToResult(double operandOne, double operandTwo){
        return operandOne / operandTwo;
    }

    public static double toMemory(double result){
        return result;
    }

    public static double addToMemory(double result, double memory){
        return memory + result;
    }

    public static double subFromMemory(double result, double memory){
        return memory - result;
    }

    public static double memoryClear(){
        return 0.0;
    }
}
