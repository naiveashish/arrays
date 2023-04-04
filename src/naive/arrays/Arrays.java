package naive.arrays;

import java.util.Scanner;

public class Arrays {
    // sum of elements in arrays
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the test cases");
        int t = sc.nextInt();
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int a [] = new int[n];
        while(t!=0){
            for(int i = 0;  i< n ; i++ ) {
                System.out.println("enter element at " + i);
                a[i] = sc.nextInt();
            }
            int sum = 0;
            for(int i = 0;  i< n ; i++ ) {
                sum =  sum + a[i];
            }
            System.out.println("The sum is : "+sum);
            t--;

        }
    }


}
