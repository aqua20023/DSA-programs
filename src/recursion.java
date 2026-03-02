public class recursion {
    public static void main(String[] args) {
//        funDec(5);
//        funInc(3, 16);
//        inc(18);
//        System.out.println(fact(5));
        System.out.println(sumOfDigits(135));
    }
    static void funDec(int n){
        if(n == 0 ){
            return;
        }
        System.out.println(n);
        funDec(n - 1);
    }
    static void funInc(int i, int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        funInc(i + 1, n);
    }
    static void inc(int n){
        if(n == 0){
//            System.out.println(1);
            return;
        }
        inc(n - 1);
        System.out.println(n);
    }
    static int fact(int n){
        if(n == 0){
            return 1;
        }
        return n*fact(n - 1);
    }
    static int sumOfDigits(int n){
        if(n/10==0){
            return n;
        }
        return sumOfDigits(n/10) + (n%10);
    }
}
