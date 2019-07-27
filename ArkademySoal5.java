/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alfian R P
 */
import java.util.Arrays;
public class Main {
    String[][] data;
    public static void main(String args[]) {
        System.out.println("Urutan Abjad");
        System.out.println("------------");
        System.out.println("Data awal");
        System.out.println("var data = [ [‘a’,’c’,’b’,’e’,’d’], [‘g’,’e’,’f’] ]");
        String[][] data = { {"a","c","b","e","d"} , {"g","e","f"} };
        sort_array(data);
    }
    private static void sort_array(String[][] d) {
        System.out.println("");
        System.out.println("Hasil");
        if (d[0].length < d[1].length){
            Arrays.sort(d[0]);
            for (int i = 0; i<d[0].length; i++){
		System.out.print(d[0][i]+" ");
            }
            System.out.println("");
            Arrays.sort(d[1]);
            for (int i = 0; i<d[1].length; i++){
		System.out.print(d[1][i]+" ");
            }
        } else {
            Arrays.sort(d[1]);
            for (int i = 0; i<d[1].length; i++){
		System.out.print(d[1][i]+" ");
            }
            System.out.println("");
            Arrays.sort(d[0]);
            for (int i = 0; i<d[0].length; i++){
		System.out.print(d[0][i]+" ");
            }
        }
        System.out.println("");
    }
}
