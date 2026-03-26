public class MoveZeroes283 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        int[] arr = solution(nums);

        for(int i = 0 ; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static int[] solution(int[] nums){
        int j = nums.length-1;
        for(int i = 0; i<nums.length-1; i++){
            if(nums[i] == 0){
               nums[i] = nums[i+1];
//               nums[i+1] = 0;
               j--;

            }
        }
        return nums;
    }
}
