package StackQueu;
import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class Palindrome {

    public static void main(String[] args) {

        System.out.print("Enter your string:");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        Queue queue = new LinkedList();

        for (int i = inputString.length() - 1; i >= 0; i--) {
            queue.add(inputString.charAt(i));
        }

        String reverseString = "";

        while (!queue.isEmpty()) {
            reverseString = reverseString + queue.remove();
        }
        if (inputString.equals(reverseString))
            System.out.println("The input String is a palindrome.");
        else
            System.out.println("The input String is not a palindrome.");

    }
}