import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTrianglePtI {
    public static List<List<Integer>> generate(int numRows) {
    	
    	
    	List<List<Integer>> returnList = new ArrayList<>();
    	
    	if (numRows <= 0) return returnList;
    	
    	List<Integer> start = new ArrayList<>();
    	start.add(1);
    	returnList.add(start); // top element
    	
    	
    	for (int i = 1 ; i < numRows ; i++) {
    		List<Integer> current = new ArrayList<>();
    		current.add(1); // create the first element (edge) of the triangle
    		
    			for (int j = 0 ; j < start.size() - 1 ; j++) {
    				current.add(start.get(j) + start.get(j+1));
    			}
    		
    		current.add(1); // close the triangle edge with a 1
    		returnList.add(current); // make it 2D
    		start = current; // set the row we just created as the last row.
    		    		
    	}
    	return returnList;
    }
    
    public static void main(String args[]) {
    	
    	
    System.out.println(generate(10));
    	
    	
    }
}
