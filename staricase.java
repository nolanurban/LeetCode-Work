import java.util.ArrayList;
import java.util.List;

public class staricase {
	public static void staircase(int n) {
		
		List<List<Character>> listGrid = new ArrayList<>();
		int d = n - 1;  // 4

		// Build the list by inserting spaces and utilize 'd' as a guide for where to place '#'
		for (int i = 0 ; i < n ; i++) {
			List<Character> line = new ArrayList<>(); // create a new list in memory for the list to populate.  
			for (int j = 0 ; j < n ; j++) {
				if (j < d) {
					line.add(j, ' '); // this wouldn't work before because the list already existed in memory and refused to overwrite.
				}
				else  {
					line.add(j, '#');
				}
			}  // after each time we build a line, we add it to our listGrid
			listGrid.add(line);
			d -= 1;  // we deduct our guide by 1 to move the '#' over a spot upon each list creation.
		}

		// This iteration is just a means to pass the test, nothing more.  Otherwise, it's stored in a List<List<String> 2D list 
		for (int i = 0 ; i < listGrid.size() ; i++) {
			for (int j = 0 ; j < listGrid.get(i).size() ; j++) {
				System.out.print(listGrid.get(i).get(j));  // we call print here to print the the get call without returning
			}
			System.out.println(); // once all items in that list are printed, we get a new line.
		}
	}
	
	public static void main(String args[]) {
		
		int funArray[] = { 5, 6, 7, 8, 9, 10, 11 };
		
		for (int i : funArray)
			staircase(i);
		
	}
}