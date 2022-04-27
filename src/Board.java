/**
 * This class is responsible for the board of the game.
 */
public class Board {

    enum Direction {
        UP,
        DOWN,
        RIGHT,
        LEFT
    }

    private final int DEFAULT_BOARD_SIZE = 4;
    private final double PROBABILITY_TO_SPAWN_FOUR = 0.2;
    private int score = 0;
    private Tile[][] board;

    /* Default constructor - constructs a 4x4 grid of tiles */
    public Board() {
        setBoard(DEFAULT_BOARD_SIZE);
    }

    public Board(int size) {
        setBoard(size);
    }

    /**
     * Board getter function
     * @return game's board
     */
    public Tile[][] getBoard() {
        return this.board;
    }

    /**
     * Score getter function
     * @return score of the game
     */
    public int getScore() {
        return this.score;
    }

    /**
     * Highest tile getter function
     * @return Highest tile value currently in the board
     */
    public int getHighestTile() {
        int max = 0;
        for (Tile[] tiles : this.board) {
            for (int j = 0; j < this.board.length; j++) {
                if (tiles[j].getValue() > max) {
                    max = tiles[j].getValue();
                }
            }
        }
        return max;
    }

    /**
     * @return True if the board is full, False otherwise
     */
    public boolean isFull() {
        for (Tile[] tiles : this.board) {
            for (int j = 0; j < this.board.length; j++) {
                if (tiles[j].getValue() == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * @return True if the game is over, false otherwise
     */
    public boolean isGameOver() {
        return isFull() && !isMovable();
    }

    public void spawnRandomTile() {
        boolean isEmpty = true;
        double p = Math.random();

        while (isEmpty) {
            int row = (int)(Math.random() * DEFAULT_BOARD_SIZE);
            int col = (int)(Math.random() * DEFAULT_BOARD_SIZE);

            if (p <= PROBABILITY_TO_SPAWN_FOUR) {
                if (board[row][col].getValue() == 0) {
                    board[row][col].setValue(4);
                    isEmpty = false;
                }
            }
            else {
                if (board[row][col].getValue() == 0) {
                    board[row][col].setValue(2);
                    isEmpty = false;
                }
            }
        }
    }

    public void moveUp() {

    }

    public void moveDown() {

    }

    public void moveRight() {

    }

    public void moveLeft() {

    }

    public void moveVertical(int row, int col, Direction direction) {

    }

    public void moveHorizontal(int row, int col, Direction direction) {

    }

    /**
      * Printing board for debugging reason.
      * TODO: DELETE LATER !!
      */
    public void print() {
        for ( int i = 0; i < board.length; i++ )
        {
            for ( int j = 0; j < board[i].length; j++ )
            {
                String s = board[i][j].toString() + " ";
                System.out.print( s );
            }
            System.out.println( "" );
        }
        System.out.println( "Score: " + score );
    }

    /**
     * Returns the board as a String - used in the GUI
     */
    public String toString()
    {
        String s = "";
        for ( int i = 0; i < board.length; i++ )
        {
            for ( int j = 0; j < board[i].length; j++ )
            {
                s += board[i][j].toString() + " ";
            }
            s += "\n";
        }
        return s;
    }
    
    /*
     Initializes the game's board according to a given size
     */
    private void setBoard(int size) {
        this.board = new Tile[size][size];
        for ( int i = 0; i < board.length; i++ )
        {
            for ( int j = 0; j < board[i].length; j++ )
            {
                board[i][j] = new Tile();
            }
        }
    }

    /*
     Returns true if a movement can be made, false otherwise
     */
    private boolean isMovable() {
        return true;
    }
}
