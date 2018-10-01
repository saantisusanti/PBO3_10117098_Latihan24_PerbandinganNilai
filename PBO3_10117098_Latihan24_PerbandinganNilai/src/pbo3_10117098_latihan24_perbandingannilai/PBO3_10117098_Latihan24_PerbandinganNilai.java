/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan24_perbandingannilai;
import java.util.Scanner;

/**
 *
 * @author 
 * Nama     : Santi Susanti
 * KELAS    : PBO3
 * NIM      : 10117098
 * Deskripsi Program : Program ini berisi program untuk menampilkan hasil lebih 
 *                     besar, lebih kecil, atau sama dengan dari dua buah 
 *                     bilangan
 */
public class PBO3_10117098_Latihan24_PerbandinganNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1;
        int n2;
        String ulang; 
        Scanner scn = new Scanner(System.in);
        
        System.out.println("========Program Perbandingan Nilai========");

        do {            
            System.out.print("Masukkan nilai pertama\t : ");
            n1 = scn.nextInt();
            System.out.print("Masukkan nilai kedua\t : ");
            n2 = scn.nextInt();

            if (n1 > n2) {
                System.out.println("Hasil\t\t\t : "+n1+" Lebih besar dari "+n2+"\n");
            }else if(n1 < n2){
                System.out.println("Hasil\t\t\t : "+n1+" Lebih kecil dari "+n2+"\n");
            }else
                System.out.println("Hasil\t\t\t : "+n1+" sama dengan "+n2+"\n");

            System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
            ulang = scn.next();
            
            System.out.println("");
        } while (!ulang.equals("Tidak"));
    }
    
}
