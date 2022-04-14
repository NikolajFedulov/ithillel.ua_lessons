package ua.ithillel.lessons.lesson6;

import java.util.Scanner;

public class MainCalculator3 {
    private static double operandOne = 0;
    private static double operandTwo = 0;
    private static double memory = 0;
    private static double result = 0;

    public static void main(String[] args) {
        Help[] help = {
                new HelpEN(),
                new HelpDE(),
                new HelpFR(),
                new HelpITA()
        };
        UserInterface[] userInterfaces = {
                new UserInterfaceEN(),
                new UserInterfaceDE(),
                new UserInterfaceFR(),
                new UserInterfaceITA()
        };
        int language = 0;
        ConsoleBase[] start  =  {help[language], userInterfaces[language]};
        for (ConsoleBase obj: start){
            obj.toConsole();
        }

        boolean isNotExit = true;
        Scanner scanner = new Scanner(System.in);
        ParsingInputData parsingInputData = new ParsingInputData();
        Operations operations = new Operations();
        do {
            String inputText = scanner.nextLine();
            String command = parsingInputData.parseCommand(inputText);
            switch (command){
                case Commands.OPERATOR_PLUS: {
                    operandOne = parsingInputData.parseOperandOne(inputText, command, memory);
                    operandTwo = parsingInputData.parseOperandTwo(inputText, command, memory);
                    result = operations.addToResult(operandOne, operandTwo);
                    break;
                }
                case Commands.OPERATOR_MINUS: {
                    operandOne = parsingInputData.parseOperandOne(inputText, command, memory);
                    operandTwo = parsingInputData.parseOperandTwo(inputText, command, memory);
                    result = operations.subToResult(operandOne, operandTwo);
                    break;
                }
                case Commands.OPERATOR_MULTIPLY: {
                    operandOne = parsingInputData.parseOperandOne(inputText, command, memory);
                    operandTwo = parsingInputData.parseOperandTwo(inputText, command, memory);
                    result = operations.mulToResult(operandOne, operandTwo);
                    break;
                }
                case Commands.OPERATOR_DIVIDE: {
                    operandOne = parsingInputData.parseOperandOne(inputText, command, memory);
                    operandTwo = parsingInputData.parseOperandTwo(inputText, command, memory);
                    result = operations.divToResult(operandOne, operandTwo);
                    break;
                }
                case Commands.COMMAND_MEMORY_SAVE: {
                    memory = operations.toMemory(result);
                    break;
                }
                case Commands.COMMAND_MEMORY_PLUS:{
                    memory = operations.addToMemory(result, memory);
                    break;
                }
                case Commands.COMMAND_MEMORY_MINUS: {
                    memory = operations.subFromMemory(result, memory);
                    break;
                }
                case Commands.COMMAND_MEMORY_CLEAR: {
                    memory = operations.memoryClear();
                    break;
                }
                case Commands.LANGUAGE_EN: {
                    language = 0;
                    break;
                }
                case Commands.LANGUAGE_DE: {
                    language = 1;
                    break;
                }
                case Commands.LANGUAGE_FR: {
                    language = 2;
                    break;
                }
                case Commands.LANGUAGE_ITA:{
                    language = 3;
                    break;
                }
                case Commands.COMMAND_HELP: {
                    help[language].toConsole();
                    break;
                }
                case Commands.COMMAND_EXIT: {
                    isNotExit = false;
                    break;
                }
            }
            if (isNotExit) {
                if (memory == 0) {
                    userInterfaces[language].toConsole(result);
                } else {
                    userInterfaces[language].toConsole(memory, result);
                }
                userInterfaces[language].toConsole();
            }
        } while (isNotExit);
    }
}
