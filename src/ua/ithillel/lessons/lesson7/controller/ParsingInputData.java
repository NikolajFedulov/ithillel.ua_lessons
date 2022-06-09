package ua.ithillel.lessons.lesson7.controller;

import ua.ithillel.lessons.lesson7.model.Commands;
import ua.ithillel.lessons.lesson7.model.CommandsAndOperators;
import ua.ithillel.lessons.lesson7.model.Operands;
import ua.ithillel.lessons.lesson7.model.Operators;

import java.util.Locale;

public class ParsingInputData {

    private ParsingInputData(){}

    public static CommandsAndOperators parseCommand(String inputText){
        if (inputText != null && !inputText.equals("")) {

            for (Commands commands: Commands.values()){
                if (inputText.equalsIgnoreCase(commands.values)){
                    for (CommandsAndOperators comAndOp: CommandsAndOperators.values()){
                        if (commands.values.equals(comAndOp.values)) return comAndOp;
                    }
                }
            }

            for(Operators operators: Operators.values()){
                if(inputText.toLowerCase(Locale.ROOT).contains(operators.values)){
                    for (CommandsAndOperators comAndOp: CommandsAndOperators.values()){
                        if (operators.values.equals(comAndOp.values)) return comAndOp;
                    }
                }
            }
        }
        return CommandsAndOperators.NOT_COMMAND;
    }

    public static double parseOperandOne(String inputText, CommandsAndOperators operator, double memory){
        String forReplace = " ";
        if (inputText != null && !inputText.equals("")) {
            String formatInputText = inputText.toLowerCase(Locale.ROOT).replace(operator.values, forReplace);
            String[] operands = formatInputText.split(forReplace);
            try {
                if(operands[0].equalsIgnoreCase(Operands.OPERAND_IS_MEMORY.values)){
                    return memory;
                }
                else{
                    return Double.parseDouble(operands[0]);
                }
            } catch (NumberFormatException e){
                return 0;
            }
        }
        return 0;
    }

    public static double parseOperandTwo(String inputText, CommandsAndOperators operator, double memory){
        String forReplace = " ";
        if (inputText != null && !inputText.equals("")){
            String formatInputText = inputText.toLowerCase(Locale.ROOT).replace(operator.values, forReplace);
            String[] operands = formatInputText.split(forReplace);
            try {
                if(operands[1].equalsIgnoreCase(Operands.OPERAND_IS_MEMORY.values)){
                    return memory;
                }
                else{
                    return Double.parseDouble(operands[1]);
                }
            } catch (NumberFormatException e){
                return 0;
            }
        }
        return 0;
    }
}
