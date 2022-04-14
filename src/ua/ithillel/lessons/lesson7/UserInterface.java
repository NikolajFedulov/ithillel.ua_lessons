package ua.ithillel.lessons.lesson7;

public class UserInterface {

    private final Language language;

    UserInterface(){
        language = Language.EN;
    }

    UserInterface(Language language){
        this.language = language;
    }

    public void helpToConsole(){
        for (String str: language.getArrayOfHelpList()){
            System.out.println(str);
        }
    }

    public void promptToEnterData(){
        System.out.println(language.getLineEnterData());
    }

    public void resultToConsole(double result){
        System.out.println(language.getLineOutputResult() + result);
    }

    public void memoryToConsole(double memory){
        System.out.println(language.getLineOutputMemory() + memory);
    }
}
