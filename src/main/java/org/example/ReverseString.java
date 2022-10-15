package org.example;

public class ReverseString {
    String string = "Naomi Lagat";
    String reversedString = "";
    String[] newString;

    public void reverseString(){
        System.out.println(string.length());

        for(int i = string.length()-1; i>=0;i--){
            reversedString=reversedString+string.charAt(i);

        }
        newString = string.split(" ");
        String part1 = newString[0];
        String part2 = newString[1];

        String joined = part1.concat(part2);
        System.out.print(reversedString +"\n"+ joined);
    }

}
