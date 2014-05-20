/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revo;

/**
 *
 * @author rai
 */
public class Factorial {

    public static int contohfactorial(int P) {
        if ((P == 1) || (P == 0)) {
            return 1;
        } else {
            return P * contohfactorial(P - 1);

        }
    }

    public static int rekursif1(int a) {
        if (a == 0) {
            return 5;
        } else {
            return rekursif1(a - 1) + 1;
        }
    }

    public static void main(String[] args) {
        System.out.println("1!=" + contohfactorial(4));
        System.out.println(rekursif1(10));
    }
}
