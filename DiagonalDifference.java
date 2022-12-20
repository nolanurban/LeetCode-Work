import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {
  
	public static int diagonalDifference(List<List<Integer>> arr) {
        int sum1 = 0;
        int sum2 = 0;
        int diff = 0;
        
        
        for (int i = 0 ; i < arr.get(0).size() ; i++) { // L/R code
            sum1 += arr.get(i).get(i);
                System.out.println("inputting... " + arr.get(i).get(i));
        } 
        for (int i = 0, j = arr.get(0).size()-1; j >= 0; i++, j--) {
            sum2 += arr.get(i).get(j);
            System.out.println("inputting... " + arr.get(i).get(j));
        }
        diff = sum2 - sum1;
        
        return Math.abs(diff);

    }

	public static void main(String args[]) {
		
		List<List<Integer>> test2DList = new ArrayList<>();
		List<Integer> firstRow = new ArrayList<>();
		firstRow.add(0, 11);
		firstRow.add(1, 2);
		firstRow.add(2, 4);
		List<Integer> secondRow = new ArrayList<>();
		secondRow.add(0, 4);
		secondRow.add(1, 5);
		secondRow.add(2, 6);
		List<Integer> thirdRow = new ArrayList<>();
		thirdRow.add(0, 10);
		thirdRow.add(1, 8);
		thirdRow.add(2, -12);
		test2DList.add(0,firstRow);
		test2DList.add(1,secondRow);
		test2DList.add(2,thirdRow);

		System.out.println("Testing, resulting answer should be 15.  Result: " + diagonalDifference(test2DList));
		


		

	}
	
}
