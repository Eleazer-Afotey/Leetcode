import java.util.*;

class BackSpaceCompare {
	
	public static boolean backSpaceCompare(String s, String t)
	{
		Stack<Character> s_built = buildString(s);
		Stack<Character> t_built = buildString(t);
		
		if(s_built.size() != t_built.size()) return false;
		
		while(!s_built.isEmpty()){
			if(s_built.peek() == t_built.peek()){
				s_built.pop();
				t_built.pop();
			}
			else{
				return false;
			}
		}
			
		return true;
	}
	
	private static Stack<Character> buildString(String str){
		Stack<Character> arr = new Stack<>();
		
		
		
		for(int i = 0; i<str.length(); i++){
			if(str.charAt(i) != '#'){
				arr.push(str.charAt(i));
			}
			else{
				if(!arr.isEmpty()){
					arr.pop();
					
				}
			}
		}
		
		return arr;
	}
	
	public static boolean backspaceCompareOpt(String s, String p){
		
		int s_pointer = s.length()-1;
		int p_pointer = p.length()-1;
		boolean passed = false;
		boolean passed2 = false;
		
		while(s_pointer >= 0 || p_pointer >= 0){
			if(s.charAt(s_pointer) == '#' || p.charAt(p_pointer) == '#'){
				if(s.charAt(s_pointer) == '#'){
					int count = 2;
					while(count > 0){
						s_pointer--;
						if(s_pointer < 0) { 
							s_pointer = 0;
							passed = true;}
						count--;
						if(s.charAt(s_pointer) == '#'){
							count+=2;
												}
					}
			}
				if(p.charAt(p_pointer) == '#'){
					int count = 2;
					while(count > 0){
						p_pointer--;
						if(p_pointer < 0) {
							p_pointer = 0;
							passed2 = true;}
						count--;
						if(p.charAt(p_pointer) == '#'){
							count += 2;
					}
					}
		}
				
			}
		
			else{
				if(passed && passed2) return true; 
				if(s.charAt(s_pointer) != p.charAt(p_pointer)) {
												return false;
				}
				p_pointer--;
				s_pointer--;
				
			}
			
				
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(backspaceCompareOpt("a#bc##", "ac#d#"));
		
	}
}