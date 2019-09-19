
public class TestMax {
	
	public static void main(String[] args) {
		System.out.println("Greatest number: "+Max(5, 10, 22, 8, 11));
		System.out.println("Greatest number: "+Max(2.3, 5.9, 1.9, 3.4));
		System.out.println("Greatest number: "+Max(5, 3));
	}//end main
	
	public static int Max(int...nums) {
		int max = nums[0];
		for(int i = 0; i < nums.length; i++) {
			if(max < nums[i]) max = nums[i];
		}
		return max;
	}//end Max
	
	public static double Max(double...nums) {
		double max = nums[0];
		for(int i = 0; i < nums.length; i++) {
			if(max < nums[i]) max = nums[i];
		}
		return max;
	}//end Max

}//end class
