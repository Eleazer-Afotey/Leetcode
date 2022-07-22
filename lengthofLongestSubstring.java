import java.util.*;

class LengthOfLongestSubstring {
	
	
	public static int lengthOfLongestSubstring(String s) {
		if(s.length() <=1 ) return s.length();
		Set<Character> set = new HashSet<>();
		int longest = 0;
		int count = 0;
		for(int i = 0; i<s.length(); i++){
			set.clear();
			count = 0;
				for(int j = i; j<s.length(); j++){
				if(set.contains(s.charAt(j))){
					break;
				}
				else{
					set.add(s.charAt(j));
					count++;
					longest = (count >= longest)? count: longest;
				}
			}
		
	}
	return longest;
	}
	
	public static int lengthOfLongestSubstringOpt(String s){
		if(s.length() <=1 ) return s.length();
		HashMap<Character,Integer> map = new HashMap<>();
		int leftIndex = 0;
		int longestSubstring = 0;
		
		for(int rightIndex = 0; rightIndex<s.length(); rightIndex++){
			char cur = s.charAt(rightIndex);
			if(map.get(cur) != null){
				int prevSeenChar = map.get(cur);
				if(prevSeenChar >= leftIndex){
			leftIndex = prevSeenChar+1;
		      }				
			}
			map.put(cur,rightIndex);
			longestSubstring = Math.max(longestSubstring, rightIndex-leftIndex+1);
		}
		return longestSubstring;
	}
	
	
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstringOpt("abcafdc"));
	}
}