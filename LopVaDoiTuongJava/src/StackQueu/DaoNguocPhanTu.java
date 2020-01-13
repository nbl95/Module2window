package StackQueu;

import java.util.Scanner;
import java.util.Stack;

public class DaoNguocPhanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("Enter number of elements");
        int length =scanner.nextInt();
        for (int i=0; i<=length-1;i++){
            System.out.println("Enter element"+(i+1)+ ":");
            stack.push(scanner.nextInt());
        }
        for (int i=0;i<=length-1;i++){
            System.out.println(stack.pop());
        }
    }
}