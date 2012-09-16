/* File: Parallel_Prog_main.java
 * CSC2002S Java Parallel assignment
 * Author: MWBROB001
 * Date : September 2012
 * 
 * Description:
 *  main method contained here 
 * 
 */

package uct.mwbrob001.ppa;


public class Parallel_Prog_main {

	public static final boolean DEBUG = true; // DEBUG define. .
	
	
	private static String params_file = "data/params.txt";  // parameter file path
	private static String queries_file = "data/queries.txt";  // queries file path
	
	// This will hold all the ant data.. 
	private static int[][] antGrid = null; 
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		// Create an instance of the PreProcess class, and process the params file
		PreProcess preProcess = new PreProcess(params_file);
		
		// build the antGrid from the ant files 
		System.out.println("binning data, this could take a while... ");
		antGrid = preProcess.doBinning(antGrid);
		
		// prints the grid out if debugging is enabled ...
		if(DEBUG){   
			print();
		}
		
		
		
		// Version1: Simple and Sequential
		//*********************************************************************
		
		// create an instance of the class
		
		
		
		
		
	}
	
	private static void print(){
		for (int[] a : antGrid){ // array of coloums
			for(int b : a){ // elements in coloumn
				System.out.print(b);
			}
			System.out.println();
		}
	}
	
	
	// getters and setters for antGrid
	// used to pass the grid bettween classes
	/**
	 * antGrid Getter
	 * @return
	 */
	public int[][] getAntGrid(){
		return antGrid;
	}
	/**
	 * antGrid Setter
	 * @param newAntGrid
	 */
	public void setAntGrid(int[][] newAntGrid){
		antGrid = newAntGrid;
	}

}