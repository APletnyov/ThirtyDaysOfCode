package Day28;

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

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String [] myArray = new String [N];

        for (int NItr = 0; NItr < N; NItr++) {

            String[] firstNameEmailID = scanner.nextLine().split(" ");
            String firstName    = firstNameEmailID[0];
            String emailID      = firstNameEmailID[1];

            String myRegExString = "^(.+)@gmail.com";
            Pattern p = Pattern.compile(myRegExString);
            Matcher m = p.matcher(emailID);

            if(m.matches()) {
                myArray[NItr] = firstName;
            } else {
                myArray[NItr] = "";
            }
        }

        String temp = "";
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                if (myArray[j].compareTo(myArray[j+1])>0){
                    temp = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = temp;
                }
            }
        }

        for (int NItr = 0; NItr < N; NItr++) {
            if (!(myArray[NItr].equals(""))) {
                System.out.println(myArray[NItr]);
            }
        }

        scanner.close();

    }
}
