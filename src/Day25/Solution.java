package Day25;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] myArray = new int[n];

        while (n>0){
            myArray[myArray.length-n] = sc.nextInt();
            n--;
        }

        for (int b:
             myArray) {

            if (b==1){
                System.out.println("Not prime");
                continue;
            }

            if (b==2){
                System.out.println("Prime");
                continue;
            }

            if ((b+1)%2!=0) {
                System.out.println("Not prime");
                continue;
            } else {
                boolean prime = true;
                int i = 3;
                while(i*i<=b&&prime){
                    if (b%i==0){
                        prime = false;
                    } else {
                        i = i + 2;
                    }
                }
                if (prime){
                    System.out.println("Prime");
                    continue;
                }else{
                    System.out.println("Not prime");
                    continue;
                }
            }
        }
    }
}
