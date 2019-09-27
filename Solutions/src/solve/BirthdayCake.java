import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BirthdayCake {

    // Complete the birthdayCakeCandles function below.
        static int birthdayCakeCandles(int arr[]) {
        int n = arr.length;
        int max = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for(int i = 0; i<n; i++) {
            if(arr[i]==max) {
                count++;
            }
        }
        return count;
    }

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(birthdayCakeCandles(arr));
        scan.close();
    }

}
