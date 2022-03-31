package ua.ithillel.lessons.lesson4;

import java.util.Locale;

public class Calculator2 {
    private final  char PLUS = '+';
    private final  char MINUS = '-';
    private final  char MULTIPLY = '*';
    private final  char DIVIDE = '/';
    private final char[] OPERATORS = new char[] {PLUS, MINUS, MULTIPLY, DIVIDE} ;
    public final String OPERATORPLUS = String.valueOf(PLUS);
    public final String OPERATORMINUS = String.valueOf(MINUS);
    public final String OPERATORMULTIPLY = String.valueOf(MULTIPLY);
    public final String OPERATORDIVIDE = String.valueOf(DIVIDE);
    public final String COMMANDEXIT = "exit";
    public final String COMMANDHELP = "help";
    public final String COMMANDM = "m";
    public final String COMMANDMPL = "m+";
    public final String COMMANDMMIN = "m-";
    public final String COMMANDMC = "mc";
    private double operandOne;
    private double operandTwo;
    private String operatorAndCommand;
    private double memory;
//    private String[] history = new String[5];
    private double result;

    Calculator2(double operandOne, double operandTwo, double memory){
        this.operandOne = operandOne;
        this.operandTwo = operandTwo;
        operatorAndCommand = "";
        this.memory = memory;
        result = 0.0;
    }

    Calculator2(){
        this(0.0, 0.0, 0.0);
    }

    Calculator2(double operandOne, double operandTwo){
        this(operandOne, operandTwo, 0.0);
    }

    Calculator2(double memory){
        this(0.0, 0.0, memory);
    }

    public double getOperandOne(){
        return operandOne;
    }

    public double getOperandTwo(){
        return operandTwo;
    }

    public String getOperatorAndCommand(){
        return operatorAndCommand;
    }

    public double getResult(){
        return result;
    }

    public double getMemory(){
        return memory;
    }

    public void setResult(double result){
        this.result = result;
    }

    public final boolean isExit(){
        final String EXIT = "exit";
        return operatorAndCommand.equalsIgnoreCase(EXIT);
    }

    public void parseInputData(String inputText){
        switch (inputText.toLowerCase(Locale.ROOT)){
            case COMMANDHELP:
            case COMMANDEXIT:
            case COMMANDM:
            case COMMANDMPL:
            case COMMANDMMIN:
            case COMMANDMC: operatorAndCommand = inputText.toLowerCase(Locale.ROOT); break;
            default:{
                String inputTextReplace = "";
                for(char findOperator: OPERATORS){
                    if(inputText.indexOf(findOperator)>=0) {
                        operatorAndCommand = String.valueOf(inputText.charAt(inputText.indexOf(findOperator)));
                        inputTextReplace = inputText.replace(inputText.charAt(inputText.indexOf(findOperator)), ' ');
                    }
                }


                String[] operand = inputTextReplace.split(" ");
                try {
                    if(operand[0].equalsIgnoreCase("memory")){
                        operandOne = memory;
                    }
                    else{
                        operandOne = Double.parseDouble(operand[0]);
                    }
                    if (operand[1].equalsIgnoreCase("memory")){
                        operandTwo = memory;
                    }
                    else {
                        operandTwo = Double.parseDouble(operand[1]);
                    }

                } catch (NumberFormatException e){}
            }
        }


    }

    public double addition(double operandOne, double operandTwo){
        return operandOne + operandTwo;
    }

    public double subtraction(double operandOne, double operandTwo){
        return operandOne - operandTwo;
    }

    public double multiplication(double operandOne, double operandTwo){
        return operandOne * operandTwo;
    }

    public  double division(double operandOne, double operandTwo){
        return operandOne / operandTwo;
    }

    public void toMemory(double result){
        this.memory = result;
    }

    public void addToMemory(double result){
        this.memory += result;
    }

    public void subFromMemory(double result){
        this.memory -= result;
    }

    public void memoryClear(){
        this.memory = 0.0;
    }

    public void help(){
        System.out.println("| Available operations: + - * /");
        System.out.println("| Commands\t| Description");
        System.out.println("| help\t\t| Call for help");
        System.out.println("| exit\t\t| Exit from the program");
        System.out.println("| m\t\t\t| Save result in memory");
        System.out.println("| m+\t\t| Add result to memory");
        System.out.println("| m-\t\t| Subtract result from memory");
        System.out.println("| mc\t\t| Clear memory");
        System.out.println("| Enter data of the form:\toperand1 operator operand2");
        System.out.println("| \t\t\t\t\t\t\t\"memory\" operator operand");
        System.out.println("| \t\t\t\t\t\t\toperand operator \"memory\"");
        System.out.println("| For example: memory+658.7");
        System.out.println("| Or enter one of the commands ");
        System.out.println("| For example: m+");
    }

}
