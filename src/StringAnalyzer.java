import java.util.Scanner;

public class StringAnalyzer {

    public void reverseString(){

        System.out.println("String -----");
    Scanner sc = new Scanner(System.in);
        System.out.println("Original: ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        System.out.println("Reversed: "+sb.reverse());


        /*  String is immutable
            StringBuilder is mutable
            StringBuffer is mutable
         */

        String sample = "HDFC Life";
        String sample1 = "hdfc life";
        System.out.println("Sample String: "+sample);
        System.out.println("String character at 3: "+ sample.charAt(3));
        System.out.println("Substring from 2 to 7: "+ sample.substring(2,7));
        System.out.println("Index of 'i':  "+ sample.indexOf("i"));

        System.out.println("String Comparison: HDFC Life equals to hdfc life: " + sample.equals(sample1));
        System.out.println("String Comparison: HDFC Life compares to hdfc life: " + sample.compareTo(sample1));
}}
