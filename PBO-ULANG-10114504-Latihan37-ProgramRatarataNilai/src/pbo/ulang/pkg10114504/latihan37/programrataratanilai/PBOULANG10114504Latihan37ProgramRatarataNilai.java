/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10114504.latihan37.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Sandy Akbar
 * KELAS    : PBO-Ulang
 * NIM      : 10114504
 * DESKRIPSI: Program ini berisi program rata rata nilai
 */
public class PBOULANG10114504Latihan37ProgramRatarataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int banyakMahasiswa;
        Scanner scan = new Scanner (System.in);
        rataRata rataRata = new rataRata();
        
        System.out.print("Masukan Banyaknya Mahasiswa : ");
        banyakMahasiswa = scan.nextInt();
        
        rataRata.hitungNilai(banyakMahasiswa);
        double jmlNilai;
        System.out.println("Rata Rata Nilainya adalah : "+rataRata.hitungRataRata(banyakMahasiswa, banyakMahasiswa));
 
        System.out.println("");
        System.out.println("Developed by Sandy Akbar");
}
}
