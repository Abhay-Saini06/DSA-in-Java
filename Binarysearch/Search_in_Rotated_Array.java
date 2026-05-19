package Binarysearch;
import java.util.Scanner;
import java.util.Arrays;
public class Search_in_Rotated_Array{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = input.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the ele of the array :");
        for(int i = 0;i<arr.length;i++){
            arr[i] = input.nextInt();
        }
        int result = Findpivot(arr);
    }
    public static int Findpivot(int [] arr){
        int st = 0;
        int end = arr.length-1;
        while(st<end){
            int mid = st+(end-st)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>st && arr[mid] < arr[mid])
        }
    }
}