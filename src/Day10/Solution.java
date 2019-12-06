package Day10;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int remainder = 0;

        ArrayList<Integer> myArrayList = new ArrayList<>();

        while (n>0){
            remainder = n%2;
            myArrayList.add(remainder);
            n = n/2;
        }

        int maximumNumber = 0;
        int currentNumber = 0;
        int previousValue = 0;

        for (int i = 0; i < myArrayList.size(); i++){

            if (myArrayList.get(myArrayList.size()- 1 - i) == 1) {

                if (previousValue == 1) {

                    currentNumber = currentNumber + 1;

                } else {
                    currentNumber = 1;

                }

            } else {

                currentNumber = 0;

            }

            if (currentNumber > maximumNumber) {

                maximumNumber = currentNumber;

            }

            previousValue = myArrayList.get(myArrayList.size()- 1- i);
        }

        System.out.println(maximumNumber);
        scanner.close();
    }
}
