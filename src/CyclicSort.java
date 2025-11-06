import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void cyclicSort(int[] arr){
        // This is also correct but 2 loops are running making it inefficient
        for (int i = 0; i<arr.length;i++){
            while(arr[i]!=i+1){
                int temp = arr[arr[i] - 1];
                arr[arr[i]-1] = arr[i];
                arr[i] = temp;

            }
        }
    }
    static void sort(int[] arr){
        // this is done by kunal kushwaha more efficirnt
        int i = 0;
        while(i<arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr,int first, int second){
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }
}
