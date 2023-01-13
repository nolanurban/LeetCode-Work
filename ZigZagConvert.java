

public class ZigZagConvert {
    public static void convert(String s, int numRows) {
        /* going to need to fill in a two dimensional array
        *. things I notice:
        *  row count 0-length increments so array[row][column]
        *  column stays fixed until diagonal
        *  while loop controlled by position in s
        *  for loop for down, fior loop for diagonal, rinse repeat until s.charAt(length) met
        */
    	
    	char sArray[][] = new char[numRows][numRows*3]; // added extra columns to be on the safe side.
    	int pos = 0; // positional holder 
    	int row = 0; // row goes 0-length then length-0
    	int col = 0; // col goes to col += numRows -1
        for (int i = 0 ; i < numRows ;i++) {
    		for (int j = 0 ; j < numRows*3;j++) {
    			sArray[i][j] = ' ';
    		}
    		
    	}
    

        System.out.println("s.length : " + s.length());
        while (pos < s.length()-1) {

        	int columnCount = numRows - 2;
        	row = 0; // reset the row, top down
        	while (row < numRows) {
            	if (pos == s.length()) break;

        		sArray[row][col] = s.charAt(pos);
        		System.out.println("r -- row: " + row + " column: " + col + " position: " + pos + " letter " + s.charAt(pos));
        		row++;
        		pos++;  // keep moving along the letters.
        	} 
        	if (pos == s.length()) break;
        	col++; // move it to diagonal
        	System.out.println(row);
        	row--;
        	System.out.println(row);
        	while (columnCount != 0) {
        		row--;
        		System.out.println("d -- row: " + row + " column: " + col + " position: " + pos + " letter " + s.charAt(pos));
        		sArray[row][col] = s.charAt(pos);
        		pos++;
        		columnCount--;
        		col++;
        	}

        	System.out.println();
        	
        	
        }
        if (sArray[2][5] == ' ') System.out.println("blank");
        for (int i = 0 ; i < numRows ;i++) {
    		for (int j = 0 ; j < numRows;j++) {
    			System.out.print(sArray[i][j]);
    		}
    		System.out.println();
    	}
    }
    public static void main (String args[]) {
    	
    	String testString = "PAYPALISHIRING";
    	
    	convert(testString, 6);
    	
    	
    	
    }
}
