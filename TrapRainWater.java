class TrapRainWater {
	
	
	public static int trap(int[] height){
		int total = 0;
		
		for(int i = 0; i<height.length; i++){
			int leftI = i;
			int rightI= i;
			int maxLeft = 0;
			int maxRight = 0;
			
			while(leftI >= 0){
				maxLeft = Math.max(maxLeft, height[leftI--]);
			}
			while(rightI < height.length){
				maxRight = Math.max(maxRight, height[rightI++]);
			}
			
			int waterAtIndex = Math.min(maxLeft, maxRight) - height[i];
			if(waterAtIndex >= 0) total += waterAtIndex;
			
		}
		return total;
	}
	
	public static int trapOpt(int[] height){
		int total =  0;
		int leftIndex = 0;
		int rightIndex = height.length-1;
		int leftMax = 0;
		int rightMax = 0;
		int minBetweenMax  = 0;
		
		while(leftIndex < rightIndex){
			if(height[leftIndex] <= height[rightIndex]){
				if(height[leftIndex] >= leftMax){
					leftMax = height[leftIndex];
				}
				else{
					total+= leftMax-height[leftIndex];
				}
				leftIndex++;
			}
			else{
				if(height[rightIndex] >= rightMax){
					rightMax = height[rightIndex];
				}
				else{
					total += rightMax - height[rightIndex];
				}
				rightIndex--;
			}
		
		}
		return total;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(trap(new int[]{4,2,0,3,2,5}));
		System.out.println(trapOpt(new int[]{4,2,0,3,2,5}));
		
	}
}