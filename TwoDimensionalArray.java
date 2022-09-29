package com.nissan.bean;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		
		//Array declaration
		int[][] intArrgrids = new int[4][5];
		int numRows = intArrgrids.length;
		int numCols = intArrgrids[0].length;
		
		// fill in grids
		for(int row=0;row<numRows;numRows++) {
			for(int col=0;col<numCols;numCols++) {
				System.out.printf("%.3d",(intArrgrids[row][col]= row*numCols +col*numRows));
			}
		}
	}
}
