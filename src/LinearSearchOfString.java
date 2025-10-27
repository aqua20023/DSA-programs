import java.util.*;
import java.lang.*;
import java.io.*;

class LinearSearchOfString
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        char k = sc.next().charAt(0);

        char[] ch = n.toCharArray();

        int c = LinearSearch(ch, k);
        System.out.println(c);

    }
    static int LinearSearch(char[] ch , char k ){
        if(ch.length == 0 ){
            return -1;
        }

        for (int i = 0; i < ch.length; i++) {
            char e = ch[i];
            if(e == k){
                return i;
            }
        }
        return -1;
    }

}

