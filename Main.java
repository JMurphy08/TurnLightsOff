/***
Turn the Lights Off #10309
Jonathan Murray - 3439348 
Jeremy Murphy - XXXXXXX
***/

import java.util.*;
import java.io.*;

class Main {

	public static void main(String[] args) throws IOException
	{
		File file = new File("test.txt");
		Scanner sc = new Scanner(file);
		String name;
		
		while ( !(name = sc.next()).equals("end") )
		{
			String[][] grid = new String[10][10];

			//populate light grid
			for (int r=0; r<10; r++)
			{
				//reads in line of lights
				String line = sc.next();
				for (int c=0; c<10; c++)
				{
					grid[r][c] = String.valueOf(line.charAt(c));
				}
			}
			System.out.println(name + " " + turnLightsOff(grid));
		}
	}

	//takes in populated light grid. 
	//determine shortest amount of switches pressed to turn all lights off.
	//return number of switches pressed, if we haven't found an answer after 100, return -1. 
	static int turnLightsOff(String[][] grid)
	{
		int result = 0;

		//TODO


		return result;
	}

}

//test