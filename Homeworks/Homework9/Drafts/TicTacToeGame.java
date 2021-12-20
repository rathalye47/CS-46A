
/**
 * Models a TicTacToe game board.
 * @author Rohan Athalye
 */
public class TicTacToeGame
{
    public static final int NONE = 0;
    public static final int PLAYER_1 = 1;
    public static final int PLAYER_2 = 2;

    private int[][] gameBoard;

    /**
     * Constructs a TicTacToe game board.
     * @param gameBoardArray a game board array containing integers indicating which spaces are marked by which players.
     */
    public TicTacToeGame(int[][] gameBoardArray)
    {
        gameBoard = gameBoardArray;  
    }

    /**
     * Gets the winner of the game.
     * @return the winner of the game.
     */
    public int winner()
    {
        return 0;
    }

    /**
     * Gets a string representation of the game board.
     * @return a string representation of the game board.
     */
    public String getBoard()
    {
        return null;
    }

    /**
     * Gets an int array containing the number of unused spaces, the number of moves made by player 1, and the number of moves made by player 2.
     * @return an int array containing the number of unused spaces, the number of moves made by player 1, and the number of moves made by player 2.
     */
    public int[] counts()
    {
        int gameBoardResults[] = new int[3];

        for (int i = 0; i < gameBoardResults.length; i++)
        {
            gameBoardResults[i] = 0;
        }

        return gameBoardResults;
    }

}
