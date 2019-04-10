package ie.tudublin;

import java.util.ArrayList;

import javafx.print.PrintColor;
import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet

{	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	// Create an arraylist to store colour objects
	ArrayList<Colour> colours = new ArrayList<Colour>();

	// Create an arraylist to store resistor objects
	ArrayList<Resistor> resistors = new ArrayList<Resistor>();
	

	// Load the resistor values into the arraylist
	public void loadResistors() 
	{
		Table table = loadTable("resistors.csv");
		for(TableRow row:table.rows())
		{
			resistors.add(new Resistor(row));
		}
	}

	// Load the colours into the arraylist
	public void loadColours()
	{
		Table table = loadTable("colours.csv", "header");
		for(TableRow row:table.rows())
		{
			colours.add(new Colour(row));
		}
	}


	public void printColours()
	{
		for(Colour colour : colours) 
		{
			System.out.println(colour.toString());
		}	
	}

	public Colour findColor(int value) {
		int pos = 0;
		
		for(int i = 0; i < colours.size(); i++)
		{
			if(colours.get(i).value == value) 
			{
				pos = i;
			}
		}

		return colours.get(pos);
	}


	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
		loadColours();
		printColours();
		System.out.println(findColor(9));
	}

	public void setup() 
	{
	}
	
	public void draw()
	{	
		background(0);
		fill(255);
		
		// Loop and draw the resistors 
		for(int i = 0; i < resistors.size(); i++) {
			// Create rectangles and change the x and y position using map function
			// rect()
			// Add line function next to each rect tangle
			// map function can be used
			// resistors.get(i).value for the value etc
		}
	}
}
