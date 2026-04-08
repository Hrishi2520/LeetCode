class RemoveElementSolution3 {
    public static int removeElement(int[] nums, int val) {
        int x = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val) {
                nums[x++] = nums[i];
            }
        }
        return x;
    }

    public static void main(String[] args) {
    	int[] arr= {1,2,3,2,1,2,2};
    	System.out.println(removeElement(arr, 2));
    }
}