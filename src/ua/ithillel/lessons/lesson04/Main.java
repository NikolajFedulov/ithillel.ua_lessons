package ua.ithillel.lessons.lesson04;

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
            if (calc.getOperatorAndCommand().equalsIgnoreCase(calc.COMMAND_EXIT)) {
                isExit = false;
            }
            if (calc.getOperatorAndCommand().equalsIgnoreCase(calc.COMMAND_HELP)) {
                calc.help();
            }
            if (calc.getOperatorAndCommand().equalsIgnoreCase(calc.COMMAND_M)) {
                calc.toMemory(calc.getResult());
            }
            if (calc.getOperatorAndCommand().equalsIgnoreCase(calc.COMMAND_MPL)) {
                calc.addToMemory(calc.getResult());
            }
            if (calc.getOperatorAndCommand().equalsIgnoreCase(calc.COMMAND_MMIN)) {
                calc.subFromMemory(calc.getResult());
            }
            if (calc.getOperatorAndCommand().equalsIgnoreCase(calc.COMMAND_MC)) {
                calc.memoryClear();
            }
            if (calc.getOperatorAndCommand().equalsIgnoreCase(calc.OPERATOR_PLUS)) {
                result = calc.addition(calc.getOperandOne(), calc.getOperandTwo());
                calc.setResult(result);
            }
            if (calc.getOperatorAndCommand().equalsIgnoreCase(calc.OPERATOR_MINUS)) {
                result = calc.subtraction(calc.getOperandOne(), calc.getOperandTwo());
                calc.setResult(result);
            }
            if (calc.getOperatorAndCommand().equalsIgnoreCase(calc.OPERATOR_MULTIPLY)){
                result = calc.multiplication(calc.getOperandOne(), calc.getOperandTwo());
                calc.setResult(result);
            }
            if (calc.getOperatorAndCommand().equalsIgnoreCase(calc.OPERATOR_DIVIDE)){
                result = calc.division(calc.getOperandOne(), calc.getOperandTwo());
                calc.setResult(result);
            }
            System.out.println("Memory: " + calc.getMemory());
            System.out.println("Result: " + calc.getResult());

        }while (isExit);
    }
}
