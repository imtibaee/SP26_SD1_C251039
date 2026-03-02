import java.util.Scanner;
public class Q4{
    public static void main(String[] args) {
        int[] arr = {3, 20, 7, 4, 15};
        double sum=0;
        for(int i = 1; i < arr.length; i++){
           sum=sum+arr[i];
            }
            double average = sum / arr.length;
        System.out.println("Average = " + average);
    }
}