package String;
import java.util.Scanner;
public class Palindromestring {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = input.nextLine();
        for(int i = 0;i<s.length();i++){
            int st = 0;
            int end = s.length()-1;
            while(st<end){
                if(s.charAt(st) != s.charAt(end)){
                    System.out.println("The string is not a palindrome");
                    return;
                }
                st++;
                end--;
            }
        }
        System.out.println("The string is a palindrome");
    }
}