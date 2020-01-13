package StackQueu;

import java.util.Scanner;
import java.util.Stack;

public class DecimaToBinary {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        Stack<Integer> binaryArray = new Stack<Integer>();
        int count = 0;
        while (num != 0) {
            binaryArray.push(num % 2);
            num = num / 2;
            count++;

        }
        for (int x : binaryArray) {
            System.out.println(x);
        }
        int[] binary = new int[count];
        System.out.println("Decima to Binary:");
        for (int i = 0; i < binary.length; i++) {
            binary[i] = binaryArray.pop();

        }
        for (int i = 0; i < binary.length; i++) {
            System.out.println(binary[i]);

        }
    }
}
