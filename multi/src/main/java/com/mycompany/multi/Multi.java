package com.mycompany.multi;

import java.util.Scanner;

public class Multi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, r;
        System.out.println("Ingrese el primer numero");

        n1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        n2 = sc.nextInt();
        r = n1 * n2;
        System.out.println("El resultado es: " + r);
    }
}
