package ua.ithillel.lessons.lesson06;

public abstract class UserInterface implements ConsoleBase, Console, Commands{
    abstract public void toConsole();
    abstract public void toConsole(double result);
    abstract public void toConsole(double memory, double result);
}
