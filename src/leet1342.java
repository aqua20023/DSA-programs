public class leet1342 {
    public static void main(String[] args) {
    int c = numberOfSteps(14);
        System.out.println(c);
    }
    static int numberOfSteps(int num) {
       return helper(num, 0);

    }
     static  int helper(int num,int stp){
        if(num == 0){
            return stp;
        }
        int rem = num%2;
        if(rem == 0){
            return helper(num/2, stp+1);
        }
        return helper(num-1,stp+1);
    }
}
