public class recursion {
    public static void main(String[] args) {
//        funDec(5);
//        funInc(3, 16);
//        inc(18);
//        System.out.println(fact(5));
//        System.out.println(productOfDigits(4342));
        System.out.println(reverseNum(123));
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
    static int productOfDigits(int n){
        if(n/10==0){
            return n;
        }
        return productOfDigits(n/10) * (n%10);
    }
    static int reverseNum(int n){
        if(n%10== n){
            return n;
        }
        return (n%10)*10 + reverseNum(n/10);
    }

}
