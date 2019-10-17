/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10114504.latihan37.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author Andri
 */
class rataRata {double rata ;
    double jmlhnilai;
    
    public void hitungNilai (int banyakMahasasiswa){
        int i;
        double nilai;
        Scanner scan = new Scanner(System.in);
        
        for (i = 1; i <= banyakMahasasiswa; i++){
            System.out.print("Nilai Mahasiswa ke-"+i+" : ");
            nilai = scan.nextDouble();
            jmlhnilai = jmlhnilai + nilai;
        }
    }
    public double hitungRataRata(double jmlNilai, int banyakMahasiswa){
     rata = jmlhnilai / banyakMahasiswa ;
     return rata;
    
}
}