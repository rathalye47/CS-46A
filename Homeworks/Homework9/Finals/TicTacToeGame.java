
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
     * Helper method that returns true if the three values in the given row are the same.
     * @return true if the three values in the given row are the same.
     * @param rows the row number of gameBoard.
     */
    private boolean horizontalMatch(int rows)
    {
        for (int columns = 1; columns < gameBoard[0].length - 1; columns++)
        {
            if (gameBoard[rows][0] == gameBoard[rows][columns] && gameBoard[rows][0] == gameBoard[rows][columns + 1])
            {
                return true;
            }
        }

        return false;
    }

    /**
     * Helper method that returns true if the three values in the given column are the same.
     * @return true if the three values in the given column are the same.
     * @param columns the column number of gameBoard.
     */
    private boolean verticalMatch(int columns)
    {
        for (int rows = 1; rows < gameBoard.length - 1; rows++)
        {
            if (gameBoard[0][columns] == gameBoard[rows][columns] && gameBoard[0][columns] == gameBoard[rows + 1][columns])
            {
                return true;
            }
        }

        return false;
    }

    /**
     * Helper method that returns true if the three values in the diagonal from the top left to the bottom right are the same.
     * @return true if the three values in the diagonal from the top left to the bottom right are the same.
     */
    private boolean diagonalMatch1()
    {
        for (int i = 0; i < gameBoard.length - 2; i++)
        {
            if (gameBoard[i][i] == gameBoard[i + 1][i + 1] && gameBoard[i][i] == gameBoard[i + 2][i + 2])
            {
                return true;
            }
        }

        return false;
    }

    /**
     * Helper method that returns true if the three values in the diagonal from the bottom left to the top right are the same.
     * @return true if the three values in the diagonal from the bottom left to the top right are the same.
     */
    private boolean diagonalMatch2()
    {
        for (int rows = gameBoard.length - 1; rows > 1; rows--)
        {
            for (int columns = 0; columns < gameBoard[0].length - 2; columns++)
            {
                if (gameBoard[rows][columns] == gameBoard[rows - 1][columns + 1] && gameBoard[rows][columns] == gameBoard[rows - 2][columns + 2])
                {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * Gets the winner of the game.
     * @return the winner of the game.
     */
    public int winner()
    {
        int gameWinner = 100;

        if (horizontalMatch(0))
        {
            if (gameBoard[0][0] == NONE)
            {
                gameWinner = -1;
            }

            else
            {
                gameWinner = gameBoard[0][0];
            }
        }

        else if (horizontalMatch(1))
        {
            if (gameBoard[1][0] == NONE)
            {
                gameWinner = -1;
            }

            else
            {
                gameWinner = gameBoard[1][0];
            }
        }

        else if (horizontalMatch(2))
        {
            if (gameBoard[2][0] == NONE)
            {
                gameWinner = -1;
            }

            else
            {
                gameWinner = gameBoard[2][0];
            }
        }

        else if (verticalMatch(0))
        {
            if (gameBoard[0][0] == NONE)
            {
                gameWinner = -1;
            }

            else
            {
                gameWinner = gameBoard[0][0];
            }
        }

        else if (verticalMatch(1))
        {
            if (gameBoard[0][1] == NONE)
            {
                gameWinner = -1;
            }

            else
            {
                gameWinner = gameBoard[0][1];
            }
        }

        else if (verticalMatch(2))
        {
            if (gameBoard[0][2] == NONE)
            {
                gameWinner = -1;
            }

            else
            {
                gameWinner = gameBoard[0][2];
            }
        }

        else if (diagonalMatch1())
        {
            if (gameBoard[0][0] == NONE)
            {
                gameWinner = -1;
            }

            else
            {
                gameWinner = gameBoard[0][0];
            }
        }

        else if (diagonalMatch2())
        {
            if (gameBoard[2][0] == NONE)
            {
                gameWinner = -1;
            }

            else
            {
                gameWinner = gameBoard[2][0];
            }
        }

        else
        {
            gameWinner = NONE;
        }

        return gameWinner;
    }

    /**
     * Gets a string representation of the game board.
     * @return a string representation of the game board.
     */
    public String getBoard()
    {
        String gameBoardString = "";

        for (int rows = 0; rows < gameBoard.length; rows++)
        {
            for (int columns = 0; columns < gameBoard[0].length; columns++)
            {
                if (columns == 2)
                {
                    gameBoardString = gameBoardString + gameBoard[rows][columns] + "\n";
                }
                else
                {
                    gameBoardString = gameBoardString + gameBoard[rows][columns] + " ";
                }
            }
        }

        return gameBoardString;
    }

    /**
     * Gets an int array containing the number of unused spaces, the number of moves made by player 1, and the number of moves made by player 2.
     * @return an int array containing the number of unused spaces, the number of moves made by player 1, and the number of moves made by player 2.
     */
    public int[] counts()
    {
        int gameBoardResults[] = new int[3];
        int numUnused = 0;
        int numPlayer1 = 0;
        int numPlayer2 = 0;

        for (int rows = 0; rows < gameBoard.length; rows++)
        {
            for (int columns = 0; columns < gameBoard[0].length; columns++)
            {
                if (gameBoard[rows][columns] == NONE)
                {
                    numUnused = numUnused + 1;
                }

                else if (gameBoard[rows][columns] == PLAYER_1)
                {
                    numPlayer1 = numPlayer1 + 1;
                }

                else
                {
                    numPlayer2 = numPlayer2 + 1;
                }
            }
        }

        gameBoardResults[0] = numUnused;
        gameBoardResults[1] = numPlayer1;
        gameBoardResults[2] = numPlayer2;

        return gameBoardResults;
    }

}
