package ua.ithillel.lessons.lesson5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Calculator21[] calc = new Calculator21[]{
                new Calculator21EN(),
                new Calculator21DE(),
                new Calculator21FR(),
                new Calculator21ITA()
        };
        int language = 0;
        calc[language].toConsole();
        Scanner scanner = new Scanner(System.in);
        String inputData;
        double result;
        boolean isExit = true;
        do{
            calc[language].toConsoleDataInput();
            inputData = scanner.nextLine();
            calc[language].parseInputData(inputData);
            if (calc[language].getOperatorAndCommand().equalsIgnoreCase(calc[language].COMMAND_EXIT)) {
                isExit = false;
            }
            if (calc[language].getOperatorAndCommand().equalsIgnoreCase(calc[language].COMMAND_HELP)) {
                calc[language].help();
            }
            if (calc[language].getOperatorAndCommand().equalsIgnoreCase(calc[language].COMMAND_M)) {
                calc[language].toMemory(calc[language].getResult());
            }
            if (calc[language].getOperatorAndCommand().equalsIgnoreCase(calc[language].COMMAND_MPL)) {
                calc[language].addToMemory(calc[language].getResult());
            }
            if (calc[language].getOperatorAndCommand().equalsIgnoreCase(calc[language].COMMAND_MMIN)) {
                calc[language].subFromMemory(calc[language].getResult());
            }
            if (calc[language].getOperatorAndCommand().equalsIgnoreCase(calc[language].COMMAND_MC)) {
                calc[language].memoryClear();
            }
            if (calc[language].getOperatorAndCommand().equalsIgnoreCase(calc[language].OPERATOR_PLUS)) {
                result = calc[language].addition(calc[language].getOperandOne(), calc[language].getOperandTwo());
                calc[language].setResult(result);
            }
            if (calc[language].getOperatorAndCommand().equalsIgnoreCase(calc[language].OPERATOR_MINUS)) {
                result = calc[language].subtraction(calc[language].getOperandOne(), calc[language].getOperandTwo());
                calc[language].setResult(result);
            }
            if (calc[language].getOperatorAndCommand().equalsIgnoreCase(calc[language].OPERATOR_MULTIPLY)){
                result = calc[language].multiplication(calc[language].getOperandOne(), calc[language].getOperandTwo());
                calc[language].setResult(result);
            }
            if (calc[language].getOperatorAndCommand().equalsIgnoreCase(calc[language].OPERATOR_DIVIDE)){
                result = calc[language].division(calc[language].getOperandOne(), calc[language].getOperandTwo());
                calc[language].setResult(result);
            }

            if (calc[language].isLanguageSelection){
                for (int i=0; i<calc.length; i++){
                    boolean isThisLanguage = calc[i].getTHIS_LANGUAGE().equalsIgnoreCase(calc[language].getOperatorAndCommand());
                    if (isThisLanguage){
                        language = i;
                        break;
                    }
                    if (isThisLanguage){
                        language = i;
                        break;
                    }
                    if (isThisLanguage){
                        language = i;
                        break;
                    }
                    if (isThisLanguage){
                        language = i;
                        break;
                    }
                }
            }

            if (isExit){
                if(calc[language].getMemory()==0){
                    calc[language].toConsole(calc[language].getResult());
                }
                else{
                    calc[language].toConsole(calc[language].getMemory(), calc[language].getResult());
                }
            }
        }while (isExit);
    }
}
