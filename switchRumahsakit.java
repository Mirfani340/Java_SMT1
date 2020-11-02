package com.tugas.muhammadirfani;

import java.util.Scanner;

public class switchRumahsakit {

  public static void main(String[] args) {
    char inOperasi, inOpMata, inOpjantung;
    Scanner scanner = new Scanner(System.in);
    System.out.println("------------Biaya Operasi Rumah Sakit Sehat Cerdas------------");
    System.out.println("A.Operasi Mata");
    System.out.println("B.Operasi Jantung");
    System.out.print("Masukkan Pilihan : ");
    inOperasi = scanner.next().charAt(0);

    if (inOperasi == 'A' || inOperasi == 'a'){
      System.out.println("-----jenis Operasi Mata-----");
      System.out.println("A.Katarak");
      System.out.println("B.Minus/Plus");
      System.out.println("C.Silinder");
      System.out.print("Masukkan Jenis Penyakit :");
      inOpMata = scanner.next().charAt(0);
      switch (inOpMata){
        case 'A' :
          System.out.println("Biaya untuk Operasi Mata Katarak = Rp.7.500.000");
          break;
        case 'B':
          System.out.println("Biaya Untuk Operasi Mata Minus/Plus = Rp.5.000.000");
          break;
        case 'C':
          System.out.println("Biaya Untuk Operasi Mata Silinder = Rp.4.000.000");
          break;
      }
    } else if (inOperasi == 'B' || inOperasi == 'b'){
      System.out.println("-----Jenis Operasi Jantung-----");
      System.out.println("A.Jantung Koroner");
      System.out.println("B.Katup jantung");
      System.out.println("C.Otot Jantung");
      System.out.println("Masukkan Pilihan :");
      inOpjantung = scanner.next().charAt(0);
      switch (inOpjantung){
        case 'A':
          System.out.println("Biaya Untuk Operasi Jantung Koroner = Rp.500.000.000");
          break;
        case 'B':
          System.out.println("Biaya Untuk Operasi Katup jantung = Rp.350.000.000");
          break;
        case 'C':
          System.out.println("Biaya Untuk Operasi Otot Jantung = Rp.450.000.000");
          break;
      }
    }
  }
}
