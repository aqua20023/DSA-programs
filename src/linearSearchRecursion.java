import java.util.ArrayList;

public class linearSearchRecursion {
    public static void main(String[] args) {
    int[] arr = {3,2,1,188,9};
    int[] num = {1,1,2,2,4,6,4,7,3,61,7,3,2,7,3,7,0,4,2,9,27,1,1,1,1,1,1,1,11,1};
    int idx = find(arr,9,0);
    findingPos(num,1,0);
        System.out.println(idx);
        System.out.println(list);

    }
    static public int find(int[] arr, int target, int i){
        if(i == arr.length){
            return -1;
        }
        if(target == arr[i]){
            return i;
        }
        return find(arr, target, ++i);
    }
     static ArrayList<Integer> list = new ArrayList<>();
    static public void findingPos(int[] arr,int target,int i ){
        if(i == arr.length){
            return;
        }
        if(arr[i] == target){
            list.add(i);
        }
        findingPos(arr, target, ++i);
    }

}
