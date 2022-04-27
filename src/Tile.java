import java.awt.*;

public class Tile {

    int number;
    Color color;

    public Tile() {
        setValue(0);
    }

    public Tile(int number) {
        this.number = number;
    }

    /**
     * Value getter function.
     * @return value of the tile.
     */
    public int getValue() {
        return this.number;
    }

    /**
     * Sets the value of the tile to the given number.
     * @param number an integer
     */
    public void setValue(int number) {
        this.number = number;
    }

    /**
     * Color getter function
     * @return color of the tile
     */
    public Color getColor() {
        return this.color;
    }

    /**
     * Sets the color of the tile
     * @param color color of the tile
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Represents the tile as a String - used in the GUI
     */
    public String toString()
    {
        return "" + number;
    }
}
