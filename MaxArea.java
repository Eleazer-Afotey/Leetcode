
class MaxArea {
	
	public static int maxArea(int[] height) {
		int max = 0;
		
		for(int i = 0; i<height.length; i++){
			for(int j = i+1; j<height.length; j++){
				int area = Math.min(height[i], height[j]) * (j -i);
				max = Math.max(max, area);
			}
		}
		return max;
		}
		
		public static int maxAreaOpt(int[] height){
			int max = 0;
			int a = 0;
			int b = height.length-1;
			while(a < b){
					int area = Math.min(height[a],height[b]) * (b -a);
					max = Math.max(max, area);
					if(height[a] <= height[b]){
						a++;
					}
					else{
						b--;
					}
			}
			
			return max;
		}
	
	
	public static void main(String[] args) {
		System.out.println(maxArea(new int[]{}));
		System.out.println(maxAreaOpt(new int[]{4,8,1,2,3,9}));
	}
}