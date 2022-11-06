import java.util.Scanner;
import java.math.*;
public class reverse_the_sentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        String temp;
        int n = Math.floorDiv(arr.length, 2);
        for (int i=0;i<n;i++){
            temp = arr[i];
            arr[i]= arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }




    }
}