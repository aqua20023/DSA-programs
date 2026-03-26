public class linearSearchRecursion {
    public static void main(String[] args) {
    int[] arr = {3,2,1,188,9};
    int idx = find(arr,188,0);
        System.out.println(idx);
    }
    static public int find(int[] arr, int target, int i){
        if(target == arr[i]){
            return i;
        }
        return find(arr, target, ++i);
    }

}
