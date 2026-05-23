package Two_D_Array;
import java.util.*;
public class InPut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int rows = input.nextInt();
        System.out.println("Enter the number of columns :");
        int columns = input.nextInt();
        int [][] arr = new int[rows][columns];
        System.out.print("Enter the elements of the array :");
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<columns;j++){
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("The elements of the array are :");
        System.out.println(Arrays.deepToString(arr));
    }
}
