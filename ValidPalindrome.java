class Untitled {
	
	
	public static boolean isPalindrome(String s) {
		
		if(s.length() <= 1) return true;
		String str = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		System.out.println(str);
		
		
		 int startIndex = 0;
		int endIndex = str.length()-1;
		
		while(startIndex <= endIndex){
			if(str.charAt(startIndex) != str.charAt(endIndex)){
				return false;
			}
			startIndex++;
			endIndex--;
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
	}
}