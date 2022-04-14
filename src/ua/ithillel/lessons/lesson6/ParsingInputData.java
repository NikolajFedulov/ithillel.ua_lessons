package ua.ithillel.lessons.lesson6;

import java.util.Locale;

public class ParsingInputData implements Commands{

    private final String[] COMMANDS = {
            COMMAND_EXIT,
            COMMAND_HELP,
            COMMAND_MEMORY_SAVE,
            COMMAND_MEMORY_PLUS,
            COMMAND_MEMORY_MINUS,
            COMMAND_MEMORY_CLEAR,
            LANGUAGE_EN,
            LANGUAGE_DE,
            LANGUAGE_FR,
            LANGUAGE_ITA
    };
    private final String[] OPERATORS = {
            OPERATOR_PLUS,
            OPERATOR_MINUS,
            OPERATOR_MULTIPLY,
            OPERATOR_DIVIDE
    };

    public String parseCommand(String inputText){

        for (String findCommand: COMMANDS){
            if (inputText.equalsIgnoreCase(findCommand)){
                return findCommand;
            }
        }

        String inputTextInLC = inputText.toLowerCase(Locale.ROOT);
        for(String findOperator: OPERATORS){
            if(inputTextInLC.contains(findOperator)){
                return findOperator;
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
            if(operandsInString[0].equalsIgnoreCase(OPERAND_IS_MEMORY)){
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
            if(operandsInString[1].equalsIgnoreCase(OPERAND_IS_MEMORY)){
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
