package com.tugas.muhammadirfani;

import java.util.Scanner;

public class konsonandanvokal {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char huruf;
    //Input
    System.out.print("Masukkan huruf :");
    huruf = scanner.next().charAt(0);

    //Declaration if
    if (huruf == 'a' || huruf == 'e' || huruf == 'u' || huruf == 'i' || huruf == 'o') {
      System.out.println(huruf + " Ini termasuk huruf vokal");
    }
    }
  }