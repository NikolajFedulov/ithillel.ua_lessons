package ua.ithillel.lessons.lesson7;

import ua.ithillel.lessons.lesson7.controller.ParsingInputData;
import ua.ithillel.lessons.lesson7.model.Commands;
import ua.ithillel.lessons.lesson7.model.Language;
import ua.ithillel.lessons.lesson7.model.Operators;
import ua.ithillel.lessons.lesson7.view.UserInterface;

import java.util.Scanner;

public class MainCalculator4 {
    public static void main(String[] args) {
        double result = 0.0;
        double memory = 0.0;
        double operandOne;
        double operandTwo;

        boolean isNotExit = true;
        Scanner scanner = new Scanner(System.in);

        UserInterface.helpToConsole();
        UserInterface.promptToEnterData();
        do {
            String inputText = scanner.nextLine();
            Commands command = ParsingInputData.parseCommand(inputText);
            switch (command) {
                case COMMAND_MEMORY_SAVE:
                    memory = result;
                    break;
                case COMMAND_MEMORY_PLUS:
                    memory = memory + result;
                    break;
                case COMMAND_MEMORY_MINUS:
                    memory = memory - result;
                    break;
                case COMMAND_MEMORY_CLEAR:
                    memory = 0.0;
                    break;
                case LANGUAGE_EN:
                    UserInterface.setLanguage(Language.EN);
                    break;
                case LANGUAGE_DE:
                    UserInterface.setLanguage(Language.DE);
                    break;
                case LANGUAGE_FR:
                    UserInterface.setLanguage(Language.FR);
                    break;
                case COMMAND_HELP:
                    UserInterface.helpToConsole();
                    break;
                case COMMAND_EXIT:
                    isNotExit = false;
                    break;
            }
            Operators operator = ParsingInputData.parsOperator(inputText);
            switch (operator) {
                case OPERATOR_PLUS:
                    operandOne = ParsingInputData.parseOperandOne(inputText, operator, memory);
                    operandTwo = ParsingInputData.parseOperandTwo(inputText, operator, memory);
                    result = operandOne + operandTwo;
                    break;
                case OPERATOR_MINUS:
                    operandOne = ParsingInputData.parseOperandOne(inputText, operator, memory);
                    operandTwo = ParsingInputData.parseOperandTwo(inputText, operator, memory);
                    result = operandOne - operandTwo;
                    break;
                case OPERATOR_MULTIPLY:
                    operandOne = ParsingInputData.parseOperandOne(inputText, operator, memory);
                    operandTwo = ParsingInputData.parseOperandTwo(inputText, operator, memory);
                    result = operandOne * operandTwo;
                    break;
                case OPERATOR_DIVIDE:
                    operandOne = ParsingInputData.parseOperandOne(inputText, operator, memory);
                    operandTwo = ParsingInputData.parseOperandTwo(inputText, operator, memory);
                    result = operandOne / operandTwo;
                    break;
            }

            if (isNotExit) {
                if (memory == 0) {
                    UserInterface.resultToConsole(result);
                } else {
                    UserInterface.memoryToConsole(memory);
                    UserInterface.resultToConsole(result);
                }
                UserInterface.promptToEnterData();
            }
        } while (isNotExit);
    }
}