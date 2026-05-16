package Binary_Search;
import java.util.Scanner;
import java.util.Arrays;
public class find_pivot_ele_rotation_happen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = input.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the ele of the array :");
        for(int i = 0;i<arr.length;i++){
            arr[i] = input.nextInt();
        }
        System.out.println("The ele you have entered :" + Arrays.toString(arr));
        int result = findpivot(arr);
        System.out.println(result);
    }
    public static int findpivot(int [] arr){
        int st = 0;
        int end = arr.length-1;
        int n = arr.length;
        if(n == 0) return -1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }else if(mid>st && arr[mid]<arr[mid-1]){
                return mid-1;
            }else{
                st = mid+1;
            }
        }
        return -1;
    }
}
