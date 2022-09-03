package com.company;

public class Practise_Set3 {
    public static void main(String[] args) {
        String str = "SRAJAN";
        System.out.println(str.toLowerCase());

        String str1 = "Sra ja n";
        System.out.println(str1.replace(" ", "_"));

        String letter = "Dear <|name|>, Thanks a lot!";
        System.out.println(letter.replace("<|name|>", "Srajan"));

        String myString = "This is contain double and  triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        String letter1 = "Dear Harry,\n\tThis Java course is nice.\n\tThanks!";
        System.out.println(letter1);
    }
}
