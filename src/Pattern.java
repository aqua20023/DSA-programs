public class Pattern {
    public static void main(String[] args) {
//        pattern1(5);
//        System.out.println();
//        pattern2(4);
        pattern3(5);
    }
    static void pattern1(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int row = 1; row <= n; row++){
            for(int col = n; col >= row; col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int row = 1; row <= n; row++){
            for(int col = n; col >= row; col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
