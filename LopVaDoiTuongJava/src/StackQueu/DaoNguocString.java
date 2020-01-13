package StackQueu;

import java.util.Scanner;
import java.util.Stack;

public class DaoNguocString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Array String:");
        String string=sc.nextLine();

        String[] world=string.split("\\s");
        for(String w :world){
            System.out.println(w);
        }
        Stack<String>arr=new Stack<String>();
        for(int i=0;i<world.length;i++){
            arr.push(world[i]);
        }
        System.out.println("Array String Reversed:");
        for (int i=0;i<world.length;i++){
            world[i]=arr.pop();
        }
        for(String w :world){
            System.out.println(w);
        }
    }
}
