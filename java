You are given an integer , you have to convert it into a string.

Please complete the partially completed code in the editor. If your code successfully converts n into a string  the code will print "Good job". Otherwise it will print "Wrong answer".

import java.util.*;
import java.security.*;
public class Solution {
 public static void main(String[] args) {

  DoNotTerminate.forbidExit();

  try {
   Scanner in = new Scanner(System.in);
   int n = in .nextInt();
   in.close();
   //String s=???; Complete this line below

   //Write your code here
    String s=Integer.toString(n);
    if(n==Integer.parseInt(s))
    {
       System.out.println("Good job"); 
    }
    else{
        System.out.println(" Wrong answer"); 
    }
    --------------------
    100
    -----------------
    Good job
    -----------------------------
    
 2)
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			int month = scanner.nextInt();
			int date = scanner.nextInt();
			int year = scanner.nextInt();

			Calendar calendar = Calendar.getInstance();
			calendar.set(Calendar.DATE, date);
			calendar.set(Calendar.MONTH, month - 1);
			calendar.set(Calendar.YEAR, year);

			System.out.println(calendar.getDisplayName(Calendar.DAY_OF_WEEK,
					Calendar.LONG, new Locale("en", "US")).toUpperCase());
		}
    }
}
--------------------------------------------------




3)
/*
Given a double-precision number, , denoting an amount of money, use the NumberFormat class' getCurrencyInstance method to convert  into the US, Indian, Chinese, and French currency formats. Then print the formatted values as follows:

US: formattedPayment
India: formattedPayment
China: formattedPayment
France: formattedPayment
where  is  formatted according to the appropriate Locale's currency.

Note: India does not have a built-in Locale, so you must construct one where the language is en (i.e., English).

Input Format

A single double-precision number denoting .

Constraints

Output Format

On the first line, print US: u where  is  formatted for US currency. 
On the second line, print India: i where  is  formatted for Indian currency. 
On the third line, print China: c where  is  formatted for Chinese currency. 
On the fourth line, print France: f, where  is  formatted for French currency.

Sample Input

12324.134
Sample Output

US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €
Explanation

Each line contains the value of  formatted according to the four countries' respective currencies.
*/

import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
        String us = n.format(payment);
       NumberFormat n1 = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = n1.format(payment);
        NumberFormat n2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = n2.format(payment);
        NumberFormat n3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = n3.format(payment);
        
        // Write your code here.
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
