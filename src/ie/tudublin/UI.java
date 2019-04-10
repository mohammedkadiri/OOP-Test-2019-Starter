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

	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
		loadColours();
		printColours();
	}

	public void setup() 
	{
	}
	
	public void draw()
	{	
	
	}
}
