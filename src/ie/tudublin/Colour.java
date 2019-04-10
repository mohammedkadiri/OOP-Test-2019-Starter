package ie.tudublin;

import processing.data.*;

public class Colour {

    public int r, g, b, value;

    private String colour;


    public Colour(String colour, int r, int g, int b, int value) {
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
    public String getName() {
        return colour;
    }

    /**
     * 
     * @param colour set the colour 
     */
    public void setName(String colour) {
        this.colour = colour;
    }


    


}