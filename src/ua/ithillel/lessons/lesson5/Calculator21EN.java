package ua.ithillel.lessons.lesson5;

public class Calculator21EN extends Calculator21{

    public final String THIS_LANGUAGE = LANGUAGE_EN;

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
}
