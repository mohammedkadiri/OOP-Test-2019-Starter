package ie.tudublin;

import processing.data.*;

public class Resistor {

    public int value, ones, tens, hundreds;

    public Resistor(int value) 
    {
        this.value = value;
        this.hundreds = (value / 100);
        this.tens = (value - (hundreds * 100)) / 10;
        this.ones  = value - ((hundreds * 100)  + (tens * 10));
    }

    public Resistor(TableRow tr) 
    {
      this(tr.getInt("res"));
    }

    
}