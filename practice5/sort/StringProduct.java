package practice5.sort;

import java.util.Scanner;

public class StringProduct {
    public static long product(String s1, String s2){
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        long prod = n1 * n2;
        return prod;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("String 1");
        String s1 = sc.next();
        System.out.println("String 2");
        String s2 = sc.next();
        System.out.println(product(s1, s2));
    }
}
