/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.delete_me;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author User
 */
import java.util.Arrays;
import java.util.Scanner;

public class Delete_me {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scan.nextLine();
        String upp = name.toUpperCase();

        int[] num = new int[5]; 
        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter " + (i + 1) + ": ");
            num[i] = scan.nextInt();
        }

        System.out.println("\nName in uppercase: " + upp);

        // Display the original numbers
        System.out.print("Numbers entered: ");
        for (int n : num) {
            System.out.print(n + " ");
        }

        // Sort the numbers
        Arrays.sort(num);
        System.out.print("\nSorted numbers: ");
        for (int n : num) {
            System.out.print(n + " ");
        }

        // Sum of numbers
        int sum = 0;
        for (int n : num) {
            sum += n;
        }
        System.out.println("\nSum: " + sum);

        // Min and Max
        System.out.println("Minimum: " + num[0]);
        System.out.println("Maximum: " + num[num.length - 1]);

        scan.close();
    }
}