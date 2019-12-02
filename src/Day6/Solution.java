package Day6;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<String> myArrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            myArrayList.add(sc.next());

        }

        String sEven = new String();
        String sOdd  = new String();

        for (String s: myArrayList
             ) {

            sEven   = "";
            sOdd    = "";

            for (int i = 0; i < s.length(); i++) {

                if (i%2==0) {

                    sEven = sEven + s.substring(i, i + 1);

                } else {

                    sOdd = sOdd + s.substring(i, i + 1);

                }

            }

            System.out.println(sEven + " " + sOdd);

        }

    }
}
