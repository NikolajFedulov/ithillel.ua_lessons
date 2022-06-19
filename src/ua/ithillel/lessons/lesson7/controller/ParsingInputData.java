package ua.ithillel.lessons.lesson7.controller;

import ua.ithillel.lessons.lesson7.model.Commands;
import ua.ithillel.lessons.lesson7.model.Operands;
import ua.ithillel.lessons.lesson7.model.Operators;

import java.util.Locale;

public class ParsingInputData {

    private ParsingInputData(){}

    public static Commands parseCommand(String inputText) {
        if (inputText == null || inputText.equals("")) return Commands.NOT_COMMAND;
        for (Commands commands: Commands.values()) {
            if (inputText.equalsIgnoreCase(commands.values))
                return commands;
        }
        return Commands.NOT_COMMAND;
    }

    public static Operators parsOperator(String inputText) {
        if (inputText == null || inputText.equals("")) return Operators.NOT_OPERATOR;
        for (Operators operators: Operators.values()) {
            if (inputText.toLowerCase(Locale.ROOT).contains(operators.values))
                return operators;
        }
        return Operators.NOT_OPERATOR;
    }

    public static double parseOperandOne(String inputText, Operators operator, double memory){
        String anyOperator = " ";
        if (inputText == null || inputText.equals("")) return 0;
        String formatInputText = inputText.toLowerCase(Locale.ROOT).replace(operator.values, anyOperator);
        String[] operands = formatInputText.split(anyOperator);
        if (operands.length != 2) return 0;
        try {
            return operands[0].equals(Operands.OPERAND_IS_MEMORY.values) ? memory : Double.parseDouble(operands[0]);
        } catch (NumberFormatException e){
            return 0;
        }
    }

    public static double parseOperandTwo(String inputText, Operators operator, double memory){
        String forReplace = " ";
        if (inputText == null || inputText.equals("")) return 0;
        String formatInputText = inputText.toLowerCase(Locale.ROOT).replace(operator.values, forReplace);
        String[] operands = formatInputText.split(forReplace);
        if (operands.length != 2) return 0;
        try {
            return operands[1].equals(Operands.OPERAND_IS_MEMORY.values) ? memory : Double.parseDouble(operands[1]);
        } catch (NumberFormatException e){
            return 0;
        }
    }
}