import java.util.function.*;

class Untitled {
	
	public static boolean validPalindrome(String s) {
		if(s.length() <= 2) return true;
		
		int leftIndex = 0;
		int rightIndex = s.length()-1;
		int move = 0;
		
		while(leftIndex < rightIndex){
			if(s.charAt(leftIndex) != s.charAt(rightIndex)){
				return subPalindrome(s, leftIndex+1, rightIndex) || subPalindrome(s, leftIndex, rightIndex--);
			}
			leftIndex++;
			rightIndex--;
	
		}
return true;
}

public static boolean subPalindrome(String s, int left, int right){
	while(left <right){
		if(s.charAt(left) != s.charAt(right)){
			return false;
		}
		left++;
		right--;
	}
	return true;
}
	public static void main(String[] args) {
		System.out.println(validPalindrome(""));
	}
}