package ua.ithillel.lessons.lesson5;

import ua.ithillel.lessons.lesson4.Calculator2;

import java.util.Locale;

public class Calculator21 extends Calculator2 {

    public final String LANGUAGE_EN = "en";
    public final String LANGUAGE_DE = "de";
    public final String LANGUAGE_FR = "fr";
    public final String LANGUAGE_ITA = "ita";
    private final String THIS_LANGUAGE = LANGUAGE_EN;
    public boolean isLanguageSelection = false;
    private final String[] LANGUAGES = new String[] {LANGUAGE_EN, LANGUAGE_DE, LANGUAGE_FR, LANGUAGE_ITA};

    public String getTHIS_LANGUAGE(){
        return THIS_LANGUAGE;
    }

    public void toConsole(){
        String[] homeMessage = new String[]{
                "| Available operations: + - * /",
                "| Commands\t| Description",
                "| help\t\t| Call for help",
                "| exit\t\t| Exit from the program",
                "| m\t\t\t| Save result in memory",
                "| m+\t\t| Add result to memory",
                "| m-\t\t| Subtract result from memory",
                "| mc\t\t| Clear memory",
                "| Enter data of the form:\toperand1 operator operand2",
                "| \t\t\t\t\t\t\t\"memory\" operator operand",
                "| \t\t\t\t\t\t\toperand operator \"memory\"",
                "| For example: memory+658.7",
                "| Or enter one of the commands",
                "| For example: m+",
                "| Ore enter interface language (en, de, fr, ita)"
        };
        for (String line: homeMessage){
            System.out.println(line);
        }
    }

    public void toConsole (double result){
        System.out.println("Result: " + result);
    }

    public void toConsole (double memory, double result){
        System.out.println("Memory: " + memory);
        System.out.println("Result: " + result);
    }

    public void toConsoleDataInput (){
        System.out.print("> Enter you data: ");
    }

    public void help(){
        toConsole();
    }

    public void parseInputData(String inputText){
        String inputTextInLC = inputText.toLowerCase(Locale.ROOT);
        for(String findLanguage: LANGUAGES){
            int beginIndexInputText = inputTextInLC.indexOf(findLanguage);
            int endIndexInputText = beginIndexInputText + findLanguage.length();
            if(beginIndexInputText==0){
                operatorAndCommand = inputTextInLC.substring(beginIndexInputText, endIndexInputText);
                isLanguageSelection = true;
            }
        }
        for(String findCommand: COMMANDS){
            int beginIndexInputText = inputTextInLC.indexOf(findCommand);
            int endIndexInputText = beginIndexInputText + findCommand.length();
            if(beginIndexInputText==0){
                operatorAndCommand = inputTextInLC.substring(beginIndexInputText, endIndexInputText);
                isLanguageSelection = false;
            }
        }
        String inputTextReplace = "";
        for(String findOperator: OPERATORS){
            int beginIndexInputText = inputText.toLowerCase(Locale.ROOT).indexOf(findOperator);
            int endIndexInputText = beginIndexInputText + findOperator.length();
            if(beginIndexInputText>=0) {
                operatorAndCommand = inputText.toLowerCase(Locale.ROOT).substring(beginIndexInputText, endIndexInputText);
                isLanguageSelection = false;
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
}
