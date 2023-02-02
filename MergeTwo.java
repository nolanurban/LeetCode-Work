
public class MergeTwo {
	public static String[] mergeTwo(String[] a, String[] b, int n) {
		  // so this problem has to use compareTo (a string feature that returns -1 if lesser string, 0 if same, 1 or above for greater)
		  // additionally, it requires two indexes with one caveat
		  // if the compareTo is the same, one index must be advanced so the same letter isn't used again.
		  // it's done in one pass and has basically three conditions
		  // a[aIndex] > bIndex thus set letter to a
		  // reverse
		  // the same and skip
		  
		  int aPosition = 0, bPosition = 0;
		  String[] result = new String[n]; 
		  
		  for (int i = 0 ; i < n ; i++) {
		    
		    if (a[aPosition].compareTo(b[bPosition]) < 0)
		      result[i] = a[aPosition++];
		    else if (a[aPosition].compareTo(b[bPosition]) == 0) {
		      result[i] = a[aPosition++];
		      bPosition++;
		    }
		    else
		      result[i] = b[bPosition++];
		  }
		  return result;
		}

	public static void main(String args[]) {
		
		String test1[] = { "a", "c", "z" };
		String test2[] = { "c", "f", "z" };
		
		String result[] = mergeTwo(test1, test2, 3);
		
		System.out.print("Merging two strings: ");
		for (String s : result) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		
	}
}
