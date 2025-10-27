import java.util.Scanner;

public class arrayskk {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7,8,9};

        int[] arr = new int[10];
        System.out.println();

        inputarr(arr);
        printarr(arr);
    }
    static void inputarr(int[] arr){
        for(int i= 0; i<arr.length; i++){
            Scanner in = new Scanner(System.in);
            arr[i] = in.nextInt();
        }
    }
    static void printarr(int[] arr){
        for(int i= 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
