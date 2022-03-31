package ua.ithillel.lessons.lesson4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator2 calc = new Calculator2();
        calc.help();
        Scanner scanner = new Scanner(System.in);
        String inputData;
        double result;
        boolean isExit = true;
        do{
            System.out.print("> Enter you data: ");
            inputData = scanner.nextLine();
            calc.parseInputData(inputData);
            if (calc.getOperatorAndCommand().equalsIgnoreCase(calc.COMMANDEXIT)) {
                isExit = false;
            }
            if (calc.getOperatorAndCommand().equalsIgnoreCase(calc.COMMANDHELP)) {
                calc.help();
            }
            if (calc.getOperatorAndCommand().equalsIgnoreCase(calc.COMMANDM)) {
                calc.toMemory(calc.getResult());
            }
            if (calc.getOperatorAndCommand().equalsIgnoreCase(calc.COMMANDMPL)) {
                calc.addToMemory(calc.getResult());
            }
            if (calc.getOperatorAndCommand().equalsIgnoreCase(calc.COMMANDMMIN)) {
                calc.subFromMemory(calc.getResult());
            }
            if (calc.getOperatorAndCommand().equalsIgnoreCase(calc.COMMANDMC)) {
                calc.memoryClear();
            }
            if (calc.getOperatorAndCommand().equalsIgnoreCase(calc.OPERATORPLUS)) {
                result = calc.addition(calc.getOperandOne(), calc.getOperandTwo());
                calc.setResult(result);
            }
            if (calc.getOperatorAndCommand().equalsIgnoreCase(calc.OPERATORMINUS)) {
                result = calc.subtraction(calc.getOperandOne(), calc.getOperandTwo());
                calc.setResult(result);
            }
            if (calc.getOperatorAndCommand().equalsIgnoreCase(calc.OPERATORMULTIPLY)){
                result = calc.multiplication(calc.getOperandOne(), calc.getOperandTwo());
                calc.setResult(result);
            }
            if (calc.getOperatorAndCommand().equalsIgnoreCase(calc.OPERATORDIVIDE)){
                result = calc.division(calc.getOperandOne(), calc.getOperandTwo());
                calc.setResult(result);
            }
            System.out.println("Memory: " + calc.getMemory());
            System.out.println("Result: " + calc.getResult());

        }while (isExit);
    }
}
