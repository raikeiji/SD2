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
public class revo {
//contoh function
    public int tambah(int nilai1, int nilai2) {
        return nilai1 + nilai2;
        //kalau function itu mengembalikan proses atau langusng memamanggil variable
    }

//contoh procedure
    public void kurang(int nilai1, int nilai2){
        System.out.println("Hasil pengurangan ialah "+(nilai1-nilai2));
        //kalau procedure itu ciri-cirinya menampilkan statement kedalam 
        //sebuah program lalu menyelipkan sebuah variable
    }
//contoh function
    public int kali(int nilai1, int nilai2) {
        return nilai1 * nilai2;
        //kalau function itu mengembalikan proses atau langusng memamanggil variable
    }
    
    public static void main(String[] args) {
        revo r = new revo();
        System.out.println("ini adalah function tambah hasilnya--> "+r.tambah(2, 3));
        System.out.println("ini adalah function kali hasilnya --> "+r.kali(2, 3));
        r.kurang(3, 1);
    }
}
