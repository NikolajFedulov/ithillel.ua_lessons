package ua.ithillel.lessons.lesson7;

import java.util.Locale;

public class ParsingInputData {
    public String parseCommand(String inputText){

        for (Commands findCommand: Commands.values()){
            if (inputText.equalsIgnoreCase(findCommand.values)){
                return findCommand.values;
            }
        }

        String inputTextInLC = inputText.toLowerCase(Locale.ROOT);
        for(Operators findOperator: Operators.values()){
            if(inputTextInLC.contains(findOperator.values)){
                return findOperator.values;
            }
        }
        return "";
    }

    public boolean isCommand(String inputText, String command){
        String inputTextInLC = inputText.toLowerCase(Locale.ROOT);
        int indexCommand = inputTextInLC.indexOf(command);
        return indexCommand >= 0;
    }

    public double parseOperandOne(String inputText, String operator, double memory){
        String forReplace = " ";
        String inputTextInLowerCaseAndReplace = inputText.toLowerCase(Locale.ROOT).replace(operator, forReplace);
        String[] operandsInString = inputTextInLowerCaseAndReplace.split(forReplace);
        try {
            if(operandsInString[0].equalsIgnoreCase(Operands.OPERAND_IS_MEMORY.values)){
                return memory;
            }
            else{
                return Double.parseDouble(operandsInString[0]);
            }
        } catch (NumberFormatException e){
            return 0;
        }
    }

    public double parseOperandTwo(String inputText, String operator, double memory){
        String forReplace = " ";
        String inputTextInLowerCaseAndReplace = inputText.toLowerCase(Locale.ROOT).replace(operator, forReplace);
        String[] operandsInString = inputTextInLowerCaseAndReplace.split(forReplace);
        try {
            if(operandsInString[1].equalsIgnoreCase(Operands.OPERAND_IS_MEMORY.values)){
                return memory;
            }
            else{
                return Double.parseDouble(operandsInString[1]);
            }
        } catch (NumberFormatException e){
            return 0;
        }
    }
}
