import java.util.Scanner;

public class cielingofarr {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        Scanner in = new Scanner(System.in);
        System.out.print("enter the target you want to find : ");
        int target = in.nextInt();
        int c = cieling(arr,target);
        if(c == -1){
        System.out.println("the target is not found ");
        }else {
            System.out.println("the target is at index :"+ c);
        }
    }

     static int cieling(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else{
                return mid;
            }
        }
        return -1;
    }
}
