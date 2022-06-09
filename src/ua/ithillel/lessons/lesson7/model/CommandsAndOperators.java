package ua.ithillel.lessons.lesson7.model;

public enum CommandsAndOperators {

    COMMAND_EXIT (Commands.COMMAND_EXIT.values),
    COMMAND_HELP (Commands.COMMAND_HELP.values),
    COMMAND_MEMORY_SAVE (Commands.COMMAND_MEMORY_SAVE.values),
    COMMAND_MEMORY_PLUS (Commands.COMMAND_MEMORY_PLUS.values),
    COMMAND_MEMORY_MINUS (Commands.COMMAND_MEMORY_MINUS.values),
    COMMAND_MEMORY_CLEAR (Commands.COMMAND_MEMORY_CLEAR.values),
    LANGUAGE_EN (Commands.LANGUAGE_EN.values),
    LANGUAGE_DE (Commands.LANGUAGE_DE.values),
    LANGUAGE_FR (Commands.LANGUAGE_FR.values),
    LANGUAGE_ITA (Commands.LANGUAGE_ITA.values),
    OPERATOR_PLUS (Operators.OPERATOR_PLUS.values),
    OPERATOR_MINUS (Operators.OPERATOR_MINUS.values),
    OPERATOR_MULTIPLY (Operators.OPERATOR_MULTIPLY.values),
    OPERATOR_DIVIDE (Operators.OPERATOR_DIVIDE.values),
    NOT_COMMAND("notCommand");

    public final String values;

    CommandsAndOperators(String command){
        values = command;
    }
}
