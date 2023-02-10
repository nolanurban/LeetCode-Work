
public class LinearIn {
	public static boolean linearIn(int[] outer, int[] inner) {
		  int j = 0;
		  if (inner.length < 1) return true;
		  for (int i = 0 ; i < outer.length ; i++) {
		    if (outer[i] < inner[j]) 
		      continue;
		    if (outer[i] == inner[j]) {
		      if (j+1 == inner.length) 
		        return true;
		    }
		    else if (outer[j] > inner[j]) return false;
		    j++;
		  }
		  return false;
		}
	public static void main(String args[]) {
		int outer[] = { 1, 2, 4, 6 };
		int inner[] = { 2, 4 };
		
		System.out.println("Checking outer and inner, should return true: " + linearIn(outer, inner))
	}
}
