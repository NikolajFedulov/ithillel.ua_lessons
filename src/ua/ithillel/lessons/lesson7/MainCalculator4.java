package ua.ithillel.lessons.lesson7;

import ua.ithillel.lessons.lesson6.Operations;
import java.util.Scanner;

public class MainCalculator4 {
    public static void main(String[] args) {
        double result = 0.0;
        double memory = 0.0;
        double operandOne;
        double operandTwo;

        boolean isNotExit = true;
        UserInterface userInterface = new UserInterface();
        ParsingInputData parsingInputData = new ParsingInputData();
        Operations operations = new Operations();
        Scanner scanner = new Scanner(System.in);

        userInterface.helpToConsole();
        userInterface.promptToEnterData();
        do {
            String inputText = scanner.nextLine();
            String command = parsingInputData.parseCommand(inputText);

            if (command.equalsIgnoreCase(Operators.OPERATOR_PLUS.values)) {
                operandOne = parsingInputData.parseOperandOne(inputText, command, memory);
                operandTwo = parsingInputData.parseOperandTwo(inputText, command, memory);
                result = operations.addToResult(operandOne, operandTwo);
            }
            if (command.equalsIgnoreCase(Operators.OPERATOR_MINUS.values)){
                operandOne = parsingInputData.parseOperandOne(inputText, command, memory);
                operandTwo = parsingInputData.parseOperandTwo(inputText, command, memory);
                result = operations.subToResult(operandOne, operandTwo);
            }
            if (command.equalsIgnoreCase(Operators.OPERATOR_MULTIPLY.values)){
                operandOne = parsingInputData.parseOperandOne(inputText, command, memory);
                operandTwo = parsingInputData.parseOperandTwo(inputText, command, memory);
                result = operations.mulToResult(operandOne, operandTwo);
            }
            if (command.equalsIgnoreCase(Operators.OPERATOR_DIVIDE.values)){
                operandOne = parsingInputData.parseOperandOne(inputText, command, memory);
                operandTwo = parsingInputData.parseOperandTwo(inputText, command, memory);
                result = operations.divToResult(operandOne, operandTwo);
            }
            if (command.equalsIgnoreCase(Commands.COMMAND_MEMORY_SAVE.values)){
                memory = operations.toMemory(result);
            }
            if (command.equalsIgnoreCase(Commands.COMMAND_MEMORY_PLUS.values)){
                memory = operations.addToMemory(result, memory);
            }
            if (command.equalsIgnoreCase(Commands.COMMAND_MEMORY_MINUS.values)){
                memory = operations.subFromMemory(result, memory);
            }
            if (command.equalsIgnoreCase(Commands.COMMAND_MEMORY_CLEAR.values)){
                memory = operations.memoryClear();
            }
            if (command.equalsIgnoreCase(Commands.LANGUAGE_EN.values)){
                userInterface = new UserInterface(Language.EN);
            }
            if (command.equalsIgnoreCase(Commands.LANGUAGE_DE.values)){
                userInterface = new UserInterface(Language.DE);
            }
            if (command.equalsIgnoreCase(Commands.LANGUAGE_FR.values)){
                userInterface = new UserInterface(Language.FR);
            }
            if (command.equalsIgnoreCase(Commands.COMMAND_HELP.values)){
                userInterface.helpToConsole();
            }
            if (command.equalsIgnoreCase(Commands.COMMAND_EXIT.values)){
                isNotExit = false;
            }

            if (isNotExit) {
                if (memory == 0) {
                    userInterface.resultToConsole(result);
                } else {
                    userInterface.memoryToConsole(memory);
                    userInterface.resultToConsole(result);
                }
                userInterface.promptToEnterData();
            }
        } while (isNotExit);
    }
}
