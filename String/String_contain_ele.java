package String;

import java.util.Scanner;

public class String_contain_ele {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = input.nextLine();
        System.out.println("Enter the element to be searched");
        String a = input.nextLine();
        if(s.contains(a)){
            System.out.println("Element is present in the string");
        }
        else{
            System.out.println("Element is not present in the string");
        }
    }
}
