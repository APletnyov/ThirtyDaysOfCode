package Day26;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        String actualDate = sc.nextLine();
        String [] actualDateArray = actualDate.split(" ");

        String expectedDate = sc.nextLine();
        String [] expectedDateArray = expectedDate.split(" ");

        int actualYear  = Integer.parseInt(actualDateArray[2]);
        int actualMonth = Integer.parseInt(actualDateArray[1]);
        int actualDay   = Integer.parseInt(actualDateArray[0]);

        int expectedYear  = Integer.parseInt(expectedDateArray[2]);
        int expectedMonth = Integer.parseInt(expectedDateArray[1]);
        int expectedDay   = Integer.parseInt(expectedDateArray[0]);

        if (actualYear > expectedYear){
            System.out.println(10000);
        } else if (actualYear < expectedYear){
            System.out.println(0);
        } else {

            if (actualMonth > expectedMonth){
                System.out.println((actualMonth-expectedMonth)*500);
            } else if (actualMonth < expectedMonth){
                System.out.println(0);
            } else {
                if (actualDay>expectedDay){
                    System.out.println((actualDay-expectedDay)*15);
                } else {
                    System.out.println(0);
                }
            }

        }
    }
}

