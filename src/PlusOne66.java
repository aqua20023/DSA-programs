import java.sql.Array;

public class PlusOne66 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,9,6,3,7,3,7,2,5,7,9};
        int[] result = plusOne(arr);
        for(int i = 0 ; i < result.length; i++ ){
            System.out.println(result[i]);
        }
//        System.out.println(divide(arr));
//        System.out.println(plusOne(arr));

    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
//    public static int[] plusOne(int[] digits) {
//       long number = divide(digits);
//       number++;
//       String numString = String.valueOf(number);
//       int digitCount = numString.length();
////        System.out.println(digitCount);
//
//       return insert(number, digitCount);
//
//    }
//    public static int divide(int[] digits){
//        if(digits.length == 0){
//            return 1;
//        }
//        int n = 0 ;
//        for(int i = 0; i < digits.length;i++){
//            if(i == digits.length - 1){
//                n = n*10 + digits[i];
//                return n;
//            }
//            int j = digits[i];
//            n = n*10 + j;
//        }
//        return 0;
//    }
//    public static int[] insert(int number, int len){
//        int[] arr = new int[len];
//        for(int i = len-1 ; i> -1; i-- ){
//            arr[i] = number%10;
//            number = number/10;
//        }
//        System.out.println(arr[3]);
//        return arr;
//
//    }
}
