public class SearchInMountain {
    public static void main(String[] args) {

    }
    //1095
    //https://leetcode.com/problems/find-in-mountain-array/description/
    //https://leetcode.com/problems/peak-index-in-a-mountain-array/
    int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr,target,0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        //try to seearch in second half
        return orderAgnosticBS(arr,target,peak+1, arr.length- 1);
    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start<= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]){
                // you are decreasing part of the array
                //this may be the ans but look at the left , check lhs
                end = mid;
            } else {
                // you are at the increasing part of the array
                //this may be the ans but look at the right
                start = mid + 1; // because we know that mid+1 > mid
            }
            // in the end , start == end and pointing to the largest number of the array
            // start and end are always trying to find the max element in the above 2 checks
            // hence, when they are pointing to just one element, that is the max one because that is what the check say
            // more elaborative: at every point of time for start and end, the have the best possible answer till that time
            // and if we are saying that only one item is remaining, hence cuz of one  line  that is the best possible answer
        }
        return start;// you can also return the end as both of them are ==
    }
    static int binarySearch(int[] arr, int target, int start, int end){

        while(start<= end){
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    static int orderAgnosticBS(int[] arr, int target, int start , int end){
        boolean isAsc = arr[start] < arr[end];
        while (start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }else if(target > arr[mid]){
                    start = mid + 1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
