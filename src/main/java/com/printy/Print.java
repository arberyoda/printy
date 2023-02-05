package com.printy;

/**
 * This class offers you an easy syntax to print unified messages
 */
public class Print
{
    private static final String START = "Start...";
    private static final String END = "End.....";

    /**
     * Prints "Start..."
     */
    public static void start()
    {
        output(ConsoleColors.GREEN_BOLD, START);
    }

    /**
     * Prints "End....."
     */
    public static void end()
    {
        output(ConsoleColors.GREEN_BOLD, END);
    }

    /**
     * Prints "Start..." including the given name
     *
     * @param name The name
     */
    public static void startName(String name)
    {
        output(ConsoleColors.CYAN_BOLD, START + " " + name);
    }

    /**
     * Prints "End....." including the given name
     *
     * @param name The name
     */
    public static void endName(String name)
    {
        output(ConsoleColors.CYAN_BOLD, END + " " + name);
    }

    /**
     * Prints the given text
     *
     * @param text The text
     */
    public static void text(String text)
    {
        output(ConsoleColors.YELLOW, text);
    }

    private static void output(String consoleColors, String output)
    {
        System.out.println(consoleColors + output + ConsoleColors.RESET);
    }
}