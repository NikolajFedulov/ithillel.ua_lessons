package ua.ithillel.lessons.lesson3;

import java.util.Scanner;

public class Calculator {
    private final  char PLUS = '+';
    private final  char MINUS = '-';
    private final  char MULTIPLY = '*';
    private final  char DIVIDE = '/';
    private final char[] OPERATORS = new char[] {PLUS, MINUS, MULTIPLY, DIVIDE} ;
    private String inputText;
    private double operand_1;
    private double operand_2;
    private char operator;

    public final void programInterface(){
        System.out.println("| Available operations: + - * /");
        System.out.println("| Enter data of the form: operand1 operator operand2");
        System.out.println("| For example: 458+658.7");
        System.out.println("| To close the application enter: exit");
        System.out.print("> Enter you data: ");
        Scanner scanner = new Scanner(System.in);
        inputText = scanner.nextLine();
    }

    public final boolean isExit(){
        final String EXIT = "exit";
        return inputText.equalsIgnoreCase(EXIT);
    }



    public final boolean inputValidation(){
        if (isExit()) return true;

        // is there at least one operator?
        for (int i = 0; i < OPERATORS.length; i++){
            if(inputText.indexOf(OPERATORS[i])>=0) {
                break;
            }
            else{
                if(i == OPERATORS.length-1) {
                    System.out.println("> 1");
                    return false;
                }
            }
        }

        // there must be only one operator
        String[] parts = inputText.split("[\\+\\*\\-\\/]");
        String[] operandInString = new String[2];
        if (parts.length>2) {
            System.out.println("> 2");
            return false;
        }
        else {
            operandInString[0] = parts[0];
            operandInString[1] = parts[1];
        }

       // operand must contain no more than one '.'
        for(String test: operandInString){
            if(test.indexOf('.')>0){
                String[] findDots = test.split("\\.");
                if (findDots.length>2) {
                    System.out.println("> 3");
                    return false;
                }
            }
        }

        // operand must be double
        for(String test: operandInString){
            try {
                double d = Double.parseDouble(test);
            } catch (NumberFormatException e){
                System.out.println("> 4");
                return false;
            }
        }

        return true;
    }

    public final void parseInput(){
        for(char findOperator: OPERATORS){
            if(inputText.indexOf(findOperator)>=0){
                operator = inputText.charAt(inputText.indexOf(findOperator));
            }
        }
        String[] operand = inputText.split("[\\+\\*\\-\\/]");
        try {
            operand_1 = Double.parseDouble(operand[0]);
            operand_2 = Double.parseDouble(operand[1]);
        } catch (NumberFormatException e){
            System.out.println("ERROR");
        }
    }

    public final double processor(){
        if(operator == PLUS) {
            return operand_1+operand_2;
        }
        if(operator == MINUS) {
            return operand_1-operand_2;
        }
        if(operator == MULTIPLY) {
            return  operand_1*operand_2;
        }
        if(operator == DIVIDE) {
            return operand_1/operand_2;
        }
        return 0;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        do{
            calculator.programInterface();
            while (!calculator.inputValidation()) {
                //System.out.println(calculator.inputText);
                System.out.println("!!! Invalid input !!!");
                calculator.programInterface();
            }
            if(!calculator.isExit()){
                calculator.parseInput();
                double result = calculator.processor();
                System.out.printf("= %f\n", result);
            }
        } while (!calculator.isExit());
    }
}
