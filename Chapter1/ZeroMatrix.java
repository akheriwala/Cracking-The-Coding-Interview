/**
 * 1.7 Write an algorithm such that if an element in an MxN matrix is 0,
 * its entire row and column is set to 0.
 */

package chapter1;

public class ZeroMatrix {
	
	void setZeros(int[][] matrix) {
		boolean rowHasZero = false;
		boolean columnHasZero = false;
		
		//Check if first row has zero
		for (int j = 0; j < matrix[0].length; j++) {
			if (matrix[0][j] == 0) {
				rowHasZero = true;
				break;
			}
		}
		
		//Check if first column has zero
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {
				columnHasZero = true;
				break;
			}
		}
		
		//Check for zeros in the rest of the array
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}
		
		//Nullify rows based on values in first column
		for (int i = 1; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {
				nullifyRow(matrix, i);
			}
		}
		
		//Nullify columns based on values in first row
		for (int j = 1; j < matrix[0].length; j++) {
			if (matrix[0][j] == 0) {
				nullifyColumn(matrix, j);
			}
		}
		
		//Nullify first row & column as appropriate
		if (rowHasZero) {
			nullifyRow(matrix, 0);
		}
		
		if (columnHasZero) {
			nullifyColumn(matrix, 0);
		}
	}	
	
	void nullifyRow(int[][] matrix, int row) {
		for (int j = 0; j < matrix[0].length; j++) {
			matrix[row][j] = 0;
				
			}
		}
	
	void nullifyColumn(int[][] matrix, int column) {
		for (int i = 0; i < matrix.length; i++) {
			matrix[i][column] = 0;
		}
	}
}
