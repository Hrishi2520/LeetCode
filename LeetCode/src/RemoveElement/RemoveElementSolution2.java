class RemoveElementSolution2 {
    public static int removeElement(int[] nums, int val) {
        int x = 0; int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val) {
                continue;
            } else {
                nums[x] = nums[i];
                x++;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
    	int[] arr= {1,2,3,2,1,2,2};
    	System.out.println(removeElement(arr, 2));
    }
}