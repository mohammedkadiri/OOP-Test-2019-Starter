package ie.tudublin;

import processing.data.*;

public class Colour {

    public int r, g, b, value;

    private String colour;


    public Colour(String colour, int r, int g, int b, int value)
    {
        this.colour = colour;
        this.r = r;
        this.g = g;
        this.b = b;
        this.value = value;
    }

    /**
     * 
     * @return the name of the colour
     */
    public String getName()
    {
        return colour;
    }

    /**
     * 
     * @param colour set the colour 
     */
    public void setName(String colour)
    {
        this.colour = colour;
    }

    public String toString()
    {

        return colour + ", " + r + ", "+ g + ", " + b + ", "+ value;
    }

    public Colour(TableRow tr)
    {
        // Constructor chaining
        this(tr.getString("colour"), tr.getInt("r"), tr.getInt("g"), tr.getInt("b"), tr.getInt("value"));
    }


}