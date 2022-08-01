package ua.ithillel.lessons.lesson07.view;

import ua.ithillel.lessons.lesson07.model.Language;
import ua.ithillel.lessons.lesson07.model.Messages;

public class UserInterface {

    private static Language language = Language.EN;

    private UserInterface(){}


    public static void helpToConsole(){
        switch (language) {
            case EN:
                System.out.println(Messages.MSG_HELP_AVAILABLE_OPERATORS.en);
                System.out.println(Messages.MSG_HELP_COLUMNS_NAME.en);
                System.out.println(Messages.MSG_HELP_COMMAND_HELP.en);
                System.out.println(Messages.MSG_HELP_COMMAND_EXIT.en);
                System.out.println(Messages.MSG_HELP_COMMAND_MEMORY_SAVE.en);
                System.out.println(Messages.MSG_HELP_COMMAND_MEMORY_PLUS.en);
                System.out.println(Messages.MSG_HELP_COMMAND_MEMORY_MINUS.en);
                System.out.println(Messages.MSG_HELP_COMMAND_MEMORY_CLEAR.en);
                System.out.println(Messages.MSG_HELP_COMMAND_LANGUAGE_EN.en);
                System.out.println(Messages.MSG_HELP_COMMAND_LANGUAGE_DE.en);
                System.out.println(Messages.MSG_HELP_COMMAND_LANGUAGE_FR.en);
                System.out.println(Messages.MSG_HELP_INPUT_FORM.en);
                System.out.println(Messages.MSG_HELP_LEFT_MEMORY_FORM.en);
                System.out.println(Messages.MSG_HELP_RIGHT_MEMORY_FORM.en);
                System.out.println(Messages.MSG_HELP_EXAMPLE_OF_OPERATION.en);
                System.out.println(Messages.MSG_HELP_ENTER_COMMAND.en);
                System.out.println(Messages.MSG_HELP_EXAMPLE_ENTER_COMMAND.en);
                break;
            case DE:
                System.out.println(Messages.MSG_HELP_AVAILABLE_OPERATORS.de);
                System.out.println(Messages.MSG_HELP_COLUMNS_NAME.de);
                System.out.println(Messages.MSG_HELP_COMMAND_HELP.de);
                System.out.println(Messages.MSG_HELP_COMMAND_EXIT.de);
                System.out.println(Messages.MSG_HELP_COMMAND_MEMORY_SAVE.de);
                System.out.println(Messages.MSG_HELP_COMMAND_MEMORY_PLUS.de);
                System.out.println(Messages.MSG_HELP_COMMAND_MEMORY_MINUS.de);
                System.out.println(Messages.MSG_HELP_COMMAND_MEMORY_CLEAR.de);
                System.out.println(Messages.MSG_HELP_COMMAND_LANGUAGE_EN.de);
                System.out.println(Messages.MSG_HELP_COMMAND_LANGUAGE_DE.de);
                System.out.println(Messages.MSG_HELP_COMMAND_LANGUAGE_FR.de);
                System.out.println(Messages.MSG_HELP_INPUT_FORM.de);
                System.out.println(Messages.MSG_HELP_LEFT_MEMORY_FORM.de);
                System.out.println(Messages.MSG_HELP_RIGHT_MEMORY_FORM.de);
                System.out.println(Messages.MSG_HELP_EXAMPLE_OF_OPERATION.de);
                System.out.println(Messages.MSG_HELP_ENTER_COMMAND.de);
                System.out.println(Messages.MSG_HELP_EXAMPLE_ENTER_COMMAND.de);
                break;
            case FR:
                System.out.println(Messages.MSG_HELP_AVAILABLE_OPERATORS.fr);
                System.out.println(Messages.MSG_HELP_COLUMNS_NAME.fr);
                System.out.println(Messages.MSG_HELP_COMMAND_HELP.fr);
                System.out.println(Messages.MSG_HELP_COMMAND_EXIT.fr);
                System.out.println(Messages.MSG_HELP_COMMAND_MEMORY_SAVE.fr);
                System.out.println(Messages.MSG_HELP_COMMAND_MEMORY_PLUS.fr);
                System.out.println(Messages.MSG_HELP_COMMAND_MEMORY_MINUS.fr);
                System.out.println(Messages.MSG_HELP_COMMAND_MEMORY_CLEAR.fr);
                System.out.println(Messages.MSG_HELP_COMMAND_LANGUAGE_EN.fr);
                System.out.println(Messages.MSG_HELP_COMMAND_LANGUAGE_DE.fr);
                System.out.println(Messages.MSG_HELP_COMMAND_LANGUAGE_FR.fr);
                System.out.println(Messages.MSG_HELP_INPUT_FORM.fr);
                System.out.println(Messages.MSG_HELP_LEFT_MEMORY_FORM.fr);
                System.out.println(Messages.MSG_HELP_RIGHT_MEMORY_FORM.fr);
                System.out.println(Messages.MSG_HELP_EXAMPLE_OF_OPERATION.fr);
                System.out.println(Messages.MSG_HELP_ENTER_COMMAND.fr);
                System.out.println(Messages.MSG_HELP_EXAMPLE_ENTER_COMMAND.fr);
                break;
        }
    }

    public static void promptToEnterData(){
        switch (language) {
            case EN: System.out.print(Messages.MSG_ENTER_DATA.en); break;
            case DE: System.out.print(Messages.MSG_ENTER_DATA.de); break;
            case FR: System.out.print(Messages.MSG_ENTER_DATA.fr); break;
        }
    }

    public static void resultToConsole(double result){
        switch (language) {
            case EN: System.out.println(Messages.MSG_OUTPUT_RESULT.en + result); break;
            case DE: System.out.println(Messages.MSG_OUTPUT_RESULT.de + result); break;
            case FR: System.out.println(Messages.MSG_OUTPUT_RESULT.fr + result); break;
        }
    }

    public static void memoryToConsole(double memory){
        switch (language) {
            case EN: System.out.println(Messages.MSG_OUTPUT_MEMORY.en + memory); break;
            case DE: System.out.println(Messages.MSG_OUTPUT_MEMORY.de + memory); break;
            case FR: System.out.println(Messages.MSG_OUTPUT_MEMORY.fr + memory); break;
        }
    }

    public static void setLanguage(Language language) {
        UserInterface.language = language;
    }
}
