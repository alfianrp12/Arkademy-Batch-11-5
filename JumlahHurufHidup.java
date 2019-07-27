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
public class JumlahHurufHidup {
    public static void main(String args[]) {
        Scanner in = new Scanner (System.in);
        System.out.println("Jumlah Huruf Hidup");
        System.out.println("------------------");
        System.out.print("Kata : ");
        String word = in.nextLine();
        word = word.toLowerCase();
        count_vowels(word);
    }
    static void count_vowels(String w){
        int[] jum = new int[256];
        for (int i=0; i<256; i++) {
            jum[i] = 0;
        }
        int jumlahVokal = 0;
        for (int i=0; i<w.length(); i++) {
            jum[(int)w.charAt(i)]++;
            if (w.charAt(i) == 'a' ||
                    w.charAt(i) == 'i' ||
                    w.charAt(i) == 'u' ||
                    w.charAt(i) == 'e' ||
                    w.charAt(i) == 'o') {
                jumlahVokal++;
            }
        }
        System.out.println();
        System.out.println("Jumlah huruf hidup : " + jumlahVokal);
        System.out.println();
    }
}