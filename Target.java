import java.util.*;

class Target {
	
	public static int[] twoSum(int[] nums, int target){
		
		for(int i = 0; i<nums.length; i++){
			int numsToFind =  target - nums[i];
			
			for(int j = i+1; j<nums.length; j++){
				if(nums[j] == numsToFind){
					return new int[]{i,j};
				}
			}
		}
		return null;
	}
	
	public static int[] twoSumHashMap(int[] nums, int target){
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i<nums.length; i++){
			if(map.get(nums[i]) != null){
				int currentMapVal = map.get(nums[i]);
				if(currentMapVal >= 0){
		return new int[]{currentMapVal, i};
					
			}
								}
			else{
				int numToFind = target - nums[i];
				map.put(numToFind, i);
			}
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {8,2,1,10};
		System.out.println(Arrays.toString(twoSum(arr,11)));
		System.out.println(Arrays.toString(twoSumHashMap(arr,11)));
		
	}
}