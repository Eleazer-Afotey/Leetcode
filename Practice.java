import java.util.Scanner;
import java.util.Arrays;

class Untitled {
	public static int[] getIntegers(int arrLength){
				Scanner sc = new Scanner(System.in);
				int[] arr = new int[arrLength];
		
				for(int i = 0; i<arr.length; i++){
						arr[i] = sc.nextInt();
				}
				return arr; 
		}
		
		
		
		public static void main(String[] args) {
		int[] ans = getIntegers(5);
		System.out.println(Arrays.toString(ans));
	}
}