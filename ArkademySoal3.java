/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alfian R P
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Pola Gambar");
        System.out.println("-----------");
        System.out.print("Panjang : ");
        int n = in.nextInt();
        if (n%2 == 1){
            System.out.println("");
            cetak_gambar(n);
            System.out.println("");
        } else {
            System.out.println("Angka harus ganjil. Mohon ulangi.");
        }
    }
    static void cetak_gambar(int p){
        int i, j, k;
        int median = (p+1)/2;
        for (i=1;i<=p;i++){
            if (i == median){
                for (k=1;k<=p;k++){
                    System.out.print("* ");
                }
            } else {
                    for (j=1;j<=p;j++){
                    if (j==1 || j==p){
                        System.out.print("* ");
                    } else {
                        System.out.print("= ");
                    }
                }
            }
            System.out.println("");
        }
    }
}
