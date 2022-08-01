package ua.ithillel.lessons.lesson06;

public class Operations {

    public double addToResult(double operandOne, double operandTwo){
        return operandOne + operandTwo;
    }

    public double subToResult(double operandOne, double operandTwo){
        return operandOne - operandTwo;
    }

    public double mulToResult(double operandOne, double operandTwo){
        return operandOne * operandTwo;
    }

    public  double divToResult(double operandOne, double operandTwo){
        return operandOne / operandTwo;
    }

    public double toMemory(double result){
        return result;
    }

    public double addToMemory(double result, double memory){
        return memory + result;
    }

    public double subFromMemory(double result, double memory){
        return memory - result;
    }

    public double memoryClear(){
        return 0.0;
    }
}
