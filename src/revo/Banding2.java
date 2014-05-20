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
public class Banding2 {
    public int angka1;
    public int angka2;

    public int getAngka1() {
        return angka1;
    }

    public void setAngka1(int angka1) {
        this.angka1 = angka1;
    }

    public int getAngka2() {
        return angka2;
    }

    public void setAngka2(int angka2) {
        this.angka2 = angka2;
    }
    
    public void banding2(int n1, int n2){
        if (n1>n2) {
            System.out.println(n1+" lebih besar daripada "+n2);
        }
        else{
            System.out.println(n2+" lebih besar daripada "+n1);
        }
    }
    public static void main(String[] args) {
        Banding2 b=new Banding2();
        
        int number1=2;
        int number2=3;
        
        b.setAngka1(number1);
        b.setAngka2(number2);
        
        System.out.println("maka hasilnya ");
        b.banding2(b.getAngka1(), b.getAngka2());
    }
}
