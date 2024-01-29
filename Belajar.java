
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package belajar;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Belajar {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
        System.out.println("masukan jumlah deret yang ingin ditampilkan");
    int n = sc.nextInt();
    int i = 0 ;
    int f1 = 0;
    int f2 = 1;
    int algoritma = 0;
    while (i < n ){
    if (i == 0 || i == 1) {
            System.out.println(i);
    i++;
    } else {
        algoritma = f1+f2;
        f1 = f2;
        f2 = algoritma;
        i++;
        System.out.println(algoritma +"");
    }
    }
    }
}
    

