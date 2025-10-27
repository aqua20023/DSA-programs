public class removeTarget {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
       int k = removeElement(arr,2);
        System.out.println(k);
        System.out.println(arr);
    }
    static  int removeElement(int[] nums, int val) {
        if(nums.length==0){return 0;}
        int end = nums.length-1;
        for(int i = 0; i< end;i++){
            if(nums[i]==val){
                while(end == val){
                    end--;
                }
                nums[i]=nums[end];
                end--;
            }
        }
        return end;
    }
}
