import java.util.Scanner;

public class Scope {
    public static void main(String[] args) {
//        int a = 20;
//        int b = 30;
//        {
//            a = 78;
//            int c = 99;
//        }
//        System.out.println(a);
////        System.out.println(c);
//        change(a,b);
//        System.out.println(a+" "+b);
//    }
//    static void change(int a, int b){
//        int temp = a;
//        a = b;
//        b= temp;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Any Number");
//        int c = sc.nextInt();
//        int a = 257;
////        byte b = a;
//        byte b = (byte)(c);
//        System.out.println(b);
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr2 = arr;
        arr2[0]= 99;
        System.out.println(arr2);

    }
}
