package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //scanner initialization and array size
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 1d array size (more than 3):");
        int N = scanner.nextInt();
        int[] tab = new int[N];
        //array generation - values and size specified by user
        for (int i = 0; i<tab.length; i++) {
            System.out.println("please Enter value for element no. " + i);
            tab[i] = scanner.nextInt();
        }
        //print array
        System.out.println("Your Array:");
        for (int i = 0; i<tab.length; i++) {
            System.out.print(tab[i] + "\t");
        }
        System.out.println("");
        //Array of sums of any k-size sub-array
        int k = 3;
        int sum = 0;
        int[] tab_sum = new int[N - k + 1];
        for(int i = 0; i<(N-k+1); i++) {
            sum = 0;
            for(int j = i; j<i+k; j++) {
                sum += tab[j];
            }
            tab_sum[i] = sum;
            //sum = 0;
        }
        //print tab_sum
        System.out.println("Array of sums:");
        for (int i = 0; i<tab_sum.length; i++) {
            System.out.print(tab_sum[i] + "\t");
        }
        System.out.println("");
        //max sum -> max element from array tab_sum[]
        int max = tab_sum[0];
        for(int i = 0; i<tab_sum.length; i++) {
            if(tab_sum[i]>max) {
                max = tab_sum[i];
            }
        }
        System.out.println("Max sum of any sub array of size " + k + " is " + max);
    }
}
