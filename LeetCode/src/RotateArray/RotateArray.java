class RotateArray {
    public int[] rotate(int[] nums, int k) {
            int end = nums.length;
            k = k%end;
            reverse(nums,0,end-1);
            reverse(nums, 0, k-1);
            reverse(nums, k, end-1);
			return nums;
    }

    public void reverse(int[] nums, int i, int j) {
        while(i < j) {
            int temp = nums[i];
            nums[i++] = nums[j];
            nums[j--] = temp;
        }
    }
	
	public static void main(String[] args){
		int[] nums = [1,2,3,4,5,6,7];
		int k = 3;
		System.out.println(Arrays.toString(nums, k));
	}
}