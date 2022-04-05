package ua.ithillel.lessons.lesson4;

import java.util.Locale;

public class Calculator2 {
    public final String OPERATOR_PLUS = "+";
    public final String OPERATOR_MINUS = "-";
    public final String OPERATOR_MULTIPLY = "*";
    public final String OPERATOR_DIVIDE = "/";
    public final String COMMAND_EXIT = "exit";
    public final String COMMAND_HELP = "help";
    public final String COMMAND_M = "m";
    public final String COMMAND_MPL = "m+";
    public final String COMMAND_MMIN = "m-";
    public final String COMMAND_MC = "mc";
    protected final String[] OPERATORS = new String[] {OPERATOR_PLUS, OPERATOR_MINUS, OPERATOR_MULTIPLY, OPERATOR_DIVIDE};
    protected final String[] COMMANDS = new String[] {COMMAND_EXIT, COMMAND_HELP, COMMAND_M, COMMAND_MPL, COMMAND_MMIN, COMMAND_MC};
    protected double operandOne;
    protected double operandTwo;
    protected String operatorAndCommand;
    protected double memory;
    protected double result;

    public Calculator2(double operandOne, double operandTwo, double memory){
        this.operandOne = operandOne;
        this.operandTwo = operandTwo;
        operatorAndCommand = "";
        this.memory = memory;
        result = 0.0;
    }

    public Calculator2(){
        this(0.0, 0.0, 0.0);
    }

    public Calculator2(double operandOne, double operandTwo){
        this(operandOne, operandTwo, 0.0);
    }

    public Calculator2(double memory){
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

    public void parseInputData(String inputText){
        String inputTextInLC = inputText.toLowerCase(Locale.ROOT);
        for(String findCommand: COMMANDS){
            int beginIndexInputText = inputTextInLC.indexOf(findCommand);
            int endIndexInputText = beginIndexInputText + findCommand.length();
            if(beginIndexInputText==0){
                operatorAndCommand = inputTextInLC.substring(beginIndexInputText, endIndexInputText);
            }
        }
        String inputTextReplace = "";
        for(String findOperator: OPERATORS){
            int beginIndexInputText = inputText.toLowerCase(Locale.ROOT).indexOf(findOperator);
            int endIndexInputText = beginIndexInputText + findOperator.length();
            if(beginIndexInputText>=0) {
                operatorAndCommand = inputText.toLowerCase(Locale.ROOT).substring(beginIndexInputText, endIndexInputText);
                inputTextReplace = inputText.toLowerCase(Locale.ROOT).replace(operatorAndCommand, " ");
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
