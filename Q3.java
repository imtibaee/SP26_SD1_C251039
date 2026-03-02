import java.util.Scanner;
public class Q3{
    public static void main(String[] args) {
        int[] arr = {3, 20, 7, 4, 15};
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Minimum number is " + min);
    }
}