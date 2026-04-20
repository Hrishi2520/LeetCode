class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int k = 2;    

        for(int i = 2; i < nums.length; i++) {
            if(nums[i] != nums[k-2]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
	
	public static void main(String[] args) {
    	int[] arr= {1,1,1,2,2,2,2};
    	System.out.println(removeDuplicates(arr));
    }
}