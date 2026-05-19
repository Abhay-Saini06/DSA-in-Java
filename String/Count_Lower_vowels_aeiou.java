package String;

import java.util.Scanner;

public class Count_Lower_vowels_aeiou {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = input.nextLine();
        int count = 0;
        if(s.length() == 0){
            System.out.println("The string is empty");
        } else {
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                    count++;
                }
            }
            System.out.println("The number of lowercase vowels in the string is: " + count);
        }

    }
}