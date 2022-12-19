
public class AddTwoNumbers {

	// not finished
	
	public static void main(String args[]) {
		
		int x = 1, y = 2, z = 3;
		int array[] = { 2, 4, 3 };
		int array2[] = { 5, 6, 4 };
		
		int sum = 0;
		int pv = 1;
		for (int i : array) {
			sum += (i * pv);
			pv *= 10;
			
		}
		int sum2 = 0;
		pv = 1;
		for (int i : array2) {
			sum2 += (i * pv);
			pv *= 10;
			
		}

		System.out.println(sum);		
		System.out.println(sum2);
		System.out.println(sum + sum2);
		
		int finalSum = sum + sum2; // 807
		int answer[] = new int[3];
		int mod = 10;
		int firstRound = finalSum % 10;
		System.out.println("test: " + firstRound);
		int secondRound = ((finalSum - firstRound) / 10) % 10;
		System.out.println(secondRound);
	}
}
