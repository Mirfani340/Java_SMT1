package com.tugas.muhammadirfani;

import java.util.Scanner;

public class validasiNilai {

  public static void main(String[] args) {
    int n1, n2;
    Scanner scanner = new Scanner(System.in);
    //Input
    System.out.println("Masukkan Angka :");
    n1 = scanner.nextInt();
    System.out.println("Masukkan Angka Pembagi :");
    n2 = scanner.nextInt();
    //Delaration
    if (n2 == 0) {
      System.out.println(" Tidak bisa membagi dengan" + n2);
    } else {
      System.out.println("Hasilnya adalah :" + (n1/n2));
    }
  }
}
