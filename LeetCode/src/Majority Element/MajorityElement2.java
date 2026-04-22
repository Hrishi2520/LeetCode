import java.util.*;
class MajorityElement2 {
    public static int majorityElement(int[] nums) {
        
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i])+1);
            } else {
                map.put(nums[i], 1);
            }
        }

        int max = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int val = entry.getValue();

            if(val > max) {
                max = val;
                ans = key;
            }
        }
        return ans;
    }
	
	public static void main(String[] args) {
	int[] arr = {2,2,1,1,1,2,2};
		System.out.println("Magority Element: "+majorityElement(arr));
	}
}