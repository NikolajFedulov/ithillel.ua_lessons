package ua.ithillel.lessons.lesson7.view;

import ua.ithillel.lessons.lesson7.model.Language;
import ua.ithillel.lessons.lesson7.model.Messages;

public class UserInterface {

    private static Language language = Language.EN;

    private UserInterface(){}


    public static void helpToConsole(){
        switch (language) {
            case EN: for (String str: Messages.HELP_LIST.en){System.out.println(str);}; break;
            case DE: for (String str: Messages.HELP_LIST.de){System.out.println(str);}; break;
            case FR: for (String str: Messages.HELP_LIST.fr){System.out.println(str);}; break;
            default: for (String str: Messages.HELP_LIST.en){System.out.println(str);}; break;
        }
    }

    public static void promptToEnterData(){
        switch (language) {
            case EN: for (String str: Messages.ENTER_DATA.en){System.out.print(str);}; break;
            case DE: for (String str: Messages.ENTER_DATA.de){System.out.print(str);}; break;
            case FR: for (String str: Messages.ENTER_DATA.fr){System.out.print(str);}; break;
            default: for (String str: Messages.ENTER_DATA.en){System.out.print(str);}; break;
        }
    }

    public static void resultToConsole(double result){
        switch (language) {
            case EN: for (String str: Messages.OUTPUT_RESULT.en){System.out.println(str + result);}; break;
            case DE: for (String str: Messages.OUTPUT_RESULT.de){System.out.println(str + result);}; break;
            case FR: for (String str: Messages.OUTPUT_RESULT.fr){System.out.println(str + result);}; break;
            default: for (String str: Messages.OUTPUT_RESULT.en){System.out.println(str + result);}; break;
        }
    }

    public static void memoryToConsole(double memory){
        switch (language) {
            case EN: for (String str: Messages.OUTPUT_MEMORY.en){System.out.println(str + memory);}; break;
            case DE: for (String str: Messages.OUTPUT_MEMORY.de){System.out.println(str + memory);}; break;
            case FR: for (String str: Messages.OUTPUT_MEMORY.fr){System.out.println(str + memory);}; break;
            default: for (String str: Messages.OUTPUT_MEMORY.en){System.out.println(str + memory);}; break;
        }
    }

    public static void setLanguage(Language language) {
        UserInterface.language = language;
    }
}
