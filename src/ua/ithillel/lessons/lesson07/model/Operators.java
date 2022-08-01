package ua.ithillel.lessons.lesson07.model;

public enum Operators {

    OPERATOR_PLUS ("+"),
    OPERATOR_MINUS ("-"),
    OPERATOR_MULTIPLY ("*"),
    OPERATOR_DIVIDE ("/"),
    NOT_OPERATOR ("not operator");

    public final String values;

    Operators(String operator){
        values = operator;
    }
}