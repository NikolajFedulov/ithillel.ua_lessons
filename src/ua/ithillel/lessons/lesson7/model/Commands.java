package ua.ithillel.lessons.lesson7.model;

public enum Commands {

    COMMAND_EXIT ("exit"),
    COMMAND_HELP ("help"),
    COMMAND_MEMORY_SAVE ("m"),
    COMMAND_MEMORY_PLUS ("m+"),
    COMMAND_MEMORY_MINUS ("m-"),
    COMMAND_MEMORY_CLEAR ("mc"),
    LANGUAGE_EN ("en"),
    LANGUAGE_DE ("de"),
    LANGUAGE_FR ("fr"),
    LANGUAGE_ITA ("ita"),
    NOT_COMMAND ("not command");

    public final String values;

    Commands(String command){
        values = command;
    }
}