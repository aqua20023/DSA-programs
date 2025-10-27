public class PeakIndex {
    public static void main(String[] args) {
        //https://leetcode.com/problems/peak-index-in-a-mountain-array/
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
}
