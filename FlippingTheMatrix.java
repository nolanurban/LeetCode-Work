import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/*
 * [112, 42, 83, 119]
[56, 125, 56, 49]
[15, 78, 101, 43]
[62, 98, 114, 108]

 */

public class FlippingTheMatrix {
	public static int flippingMatrix(List<List<Integer>> matrix) {
		List<Integer> corners = new ArrayList<>();
		List<Integer> sides = new ArrayList<>();
		List<Integer> topbottom = new ArrayList<>();
		List<Integer> insides = new ArrayList<>();

		for (int i = 0; i < matrix.size(); i++) {
			for (int j = 0; j < matrix.size(); j++) {

				if (i == 0 || i == matrix.size() - 1) {
					if (j > 0 && j < matrix.size() - 1)
						topbottom.add(matrix.get(i).get(j));
					else
						corners.add(matrix.get(i).get(j));
				}
				if (i > 0 && i < matrix.size() - 1) {
					if (j > 0 && j < matrix.size() - 1)
						insides.add(matrix.get(i).get(j));
					else
						sides.add(matrix.get(i).get(j));
				}

			}
		}
		System.out.println(corners);
		System.out.println(topbottom);
		System.out.println(sides);
		System.out.println(insides);

		int totalSum = Collections.max(corners) + Collections.max(topbottom) + Collections.max(sides)
				+ Collections.max(insides);

		return totalSum;
	}
	/*
	 * [112, 42, 83, 119] [56, 125, 56, 49] [15, 78, 101, 43] [62, 98, 114, 108]
	 * 
	 */

	public static int celiciaMethod(List<List<Integer>> matrix) {
		// Not necessary to actually flip the rows or columns.
		// For each position in matrix nxn, find the largest integer in the possible
		// mirrored positions and then sum them up.

		// Since the matrix is 2nX2n, the n is found by dividing by 2
		int n = matrix.size() / 2;
		int maxSum = 0;
		// i,j<n because we're only dealing with the sum of the numbers in the nXn
		// matrix
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				// Bottom right mirrored position of the matrix
				int num4 = matrix.get((matrix.size() - 1 - i)).get(matrix.size() - 1 - j);
				// Bottom left mirrored position of the matrix
				int num3 = matrix.get((matrix.size() - 1 - i)).get(j);
				// Top right mirrored position of the matrix
				int num2 = matrix.get((i)).get(matrix.size() - 1 - j);
				// Top left actual position in the nXn matrix
				int num1 = matrix.get((i)).get(j);
				// Add the largest number of the 4 to the Sum for the n positions
				maxSum += Math.max(num1, Math.max(num2, Math.max(num3, num4)));
			}
		}
		return maxSum;
	}

	public static void main(String args[]) {
//		   List<Integer> row1 = Arrays.asList(112, 42, 83, 119);
//		   List<Integer> row2 = Arrays.asList(56, 125, 56, 49);
//		   List<Integer> row3 = Arrays.asList(15, 78, 101, 43);
//		   List<Integer> row4 = Arrays.asList(62, 98, 114, 108);
		List<Integer> row1 = Arrays.asList(6, 5, 6, 2, 7, 3);
		List<Integer> row2 = Arrays.asList(2, 8, 8, 2, 7, 3);
		List<Integer> row3 = Arrays.asList(9, 6, 5, 2, 2, 5);
		List<Integer> row4 = Arrays.asList(3, 6, 2, 2, 5, 8);
		List<Integer> row5 = Arrays.asList(8, 1, 6, 7, 6, 3);
		List<Integer> row6 = Arrays.asList(8, 7, 7, 6, 2, 2);

		List<List<Integer>> matrix = new ArrayList<>();
		matrix.add(row1);
		matrix.add(row2);
		matrix.add(row3);
		matrix.add(row4);
		matrix.add(row5);
		matrix.add(row6);

		System.out.println("Running flip test, should result 414 -- " + flippingMatrix(matrix));
	}

}
