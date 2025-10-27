public class removeDublicates {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int k = removeDuplicates(arr);
        System.out.println(k);
    }
    static int removeDuplicates(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int c = 0;
        int i = 0;
        while(i<end){
            if(nums[i]!= nums[i + 1]){
                c++;
                i++;
            }else{
                i++;
            }
        }
        return c+1;
    }
}
