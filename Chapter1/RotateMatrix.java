/**
 * 1.7 Rotate Matrix
 * Given an image represented by an NxN matrix, where each pixel in the image
 * is 4 bytes, write a method to rotate the image by 90 degrees. Can you do this in place?
 */

package aKheriwala;

public class RotateMatrix {
	
	static boolean rotate(int[][] matrix) {
		int n = matrix.length;
		if (matrix.length == 0) { 
			return false;
		} else {
			
			for(int layer = 0; layer < n/2; layer++) {
				int first = layer;
				int last = n - layer - 1;
				for(int i = first; i < last; i++) {
					int offset = i - first;
					int top = matrix[first][i]; //save top
					
					//left --> top
					matrix[first][i] = matrix[last-offset][first];
					
					//bottom --> left
					matrix[last-offset][first] = matrix[last][last-offset];
					
					//right --> bottom
					matrix[last][last-offset] = matrix[i][last];
					
					//top --> right
					matrix[i][last] = top;
				}
			}
			return true;
		}
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{1, 2, 3, 4, 5},
                {11,22,33,44,55},
                {5, 4, 6, 2, 1},
                {55,44,33,22,11},
                {6, 7, 8, 9, 0}};
		System.out.println(rotate(a));
	}

}
