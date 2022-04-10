package ua.ithillel.lessons.lesson6;

public interface Commands {
    String OPERATOR_PLUS = "+";
    String OPERATOR_MINUS = "-";
    String OPERATOR_MULTIPLY = "*";
    String OPERATOR_DIVIDE = "/";

    String COMMAND_EXIT = "exit";
    String COMMAND_HELP = "help";

    String COMMAND_MEMORY_SAVE = "m";
    String COMMAND_MEMORY_PLUS = "m+";
    String COMMAND_MEMORY_MINUS = "m-";
    String COMMAND_MEMORY_CLEAR = "mc";

    String OPERAND_IS_MEMORY = "memory";

    String LANGUAGE_EN = "en";
    String LANGUAGE_DE = "de";
    String LANGUAGE_FR = "fr";
    String LANGUAGE_ITA = "ita";
}
