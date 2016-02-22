/***
Turn the Lights Off #10309
Jonathan Murray - 3439348 
Jeremy Murphy - 3443327
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

			String[][] newGrid = flipSwitch(grid, 5,5);
			for(int i=0;i<10;i++){
				for(int j=0; j<10; j++){
					System.out.print(newGrid[i][j] + " ");
				}
				System.out.println("");
			}
			System.out.println("");
			//System.out.println(name + " " + turnLightsOff(grid));
		}
	}

	//takes in populated light grid. 
	//determine shortest amount of switches pressed to turn all lights off.
	//return number of switches pressed, if we haven't found an answer after 100, return -1. 
	static int turnLightsOff(String[][] grid)
	{
		int result = 0;

		

		return result;
	}

	static String[][] flipSwitch(String[][] grid, int r, int c){

		//checkMiddle
		if(grid[r][c].equals("O")){
				grid[r][c] = "#";
		}
		else{
			grid[r][c] = "O";
		}


		//check down
		if(r+1 < 10){
			if(grid[r+1][c].equals("O")){
				grid[r+1][c] = "#";
			}
			else{
				grid[r+1][c] = "O";
			}
		} 
		//check up
		if(r-1 >= 0){
			if(grid[r-1][c].equals("O")){
				grid[r-1][c] = "#";
			}
			else{
				grid[r-1][c] = "O";
			}
		} 
		//check right
		if(c+1 < 10){
			if(grid[r][c+1].equals("O")){
				grid[r][c+1] = "#";
			}
			else{
				grid[r][c+1] = "O";
			}
		} 
		//check left
		if(c-1 >=0){
			if(grid[r][c-1].equals("O")){
				grid[r][c-1] = "#";
			}
			else{
				grid[r][c-1] = "O";
			}
		} 

		return grid;
	}

}

//test