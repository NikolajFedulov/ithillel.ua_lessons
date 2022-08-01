package ua.ithillel.lessons.lesson06;

public class HelpEN extends Help{
    public void toConsole(){
        String[] homeMessage = new String[]{
                String.format("| Available operators: %s %s %s %s", OPERATOR_PLUS, OPERATOR_MINUS, OPERATOR_MULTIPLY, OPERATOR_DIVIDE),
                "| Commands\t| Description",
                String.format("| %s\t\t| Call for help", COMMAND_HELP),
                String.format("| %s\t\t| Exit from the program", COMMAND_EXIT),
                String.format("| %s\t\t\t| Save result in memory", COMMAND_MEMORY_SAVE),
                String.format("| %s\t\t| Add result to memory", COMMAND_MEMORY_PLUS),
                String.format("| %s\t\t| Subtract result from memory", COMMAND_MEMORY_MINUS),
                String.format("| %s\t\t| Clear memory", COMMAND_MEMORY_CLEAR),
                String.format("| %s\t\t| Enter english interface language", LANGUAGE_EN),
                String.format("| %s\t\t| Enter deutsch interface language", LANGUAGE_DE),
                String.format("| %s\t\t| Enter french interface language", LANGUAGE_FR),
                String.format("| %s\t\t| Enter italian interface language", LANGUAGE_ITA),
                "| Enter data of the form:\toperand1 operator operand2",
                String.format("| \t\t\t\t\t\t\t\"%s\" operator operand", OPERAND_IS_MEMORY),
                String.format("| \t\t\t\t\t\t\toperand operator \"%s\"", OPERAND_IS_MEMORY),
                String.format("| For example: %s+658.7", OPERAND_IS_MEMORY),
                "| Or enter one of the commands",
                String.format("| For example: %s", COMMAND_MEMORY_PLUS)
        };
        for (String line: homeMessage){
            System.out.println(line);
        }
    }
}
