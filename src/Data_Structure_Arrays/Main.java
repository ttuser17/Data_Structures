package Data_Structure_Arrays;

/*
    Summary: Main method to run program.
    Store data with user input from terminal
    Store data to Array
    Read date from Array
 */

import java.util.*;

public class Main {
    //for user input
    private static Scanner scanner = new Scanner(System.in);
    //Global array to store games and to use throughout program
    private static String[] games = null;
    List<Integer> list = new ArrayList<Integer>();

    public static void main(String[] args)
    {
        enterFavoriteGames();
    }

    public static int getNumberOfFavoriteGames() {
        System.out.println("How many games would you like to provide? ");
        return scanner.nextInt();
    }

    /*
    Have user enter their favorite games
     */
    public static void enterFavoriteGames()
    {
        //store games user wants to enter
        int favoriteGames = getNumberOfFavoriteGames();
        //array to store games
        games = new String[favoriteGames];
        for (int i = 0; i < favoriteGames; i++) {
            System.out.println("-> ");
            String game = scanner.next();
            games[i] = game;
        }
        printGames();
    }

    //print the games the user has entered
    public static void printGames()
    {
        for (int i = 0; i < games.length; i++)
        {
            System.out.println("Game " + (i + 1) + " " + games[i]);
        }
    }
}
