public class RunningSum1dArray {
    public static int[] runningSum(int[] nums) {

        int returnArray[] = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length;i++) {
            sum += nums[i];
            returnArray[i] = sum;
        }
        return returnArray;
    }
    
    public static void main(String args[]) {
    	int[] numArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    	
    	for (int i : runningSum(numArray)) {
    		System.out.println(i);
    	}
    	
    }
}