/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERTEMUAN_01;

/**
 *
 * @author x260
 */

public class PBO_Master {
    String tentukanGrade (int nilai) {
        if (nilai >= 85) return "A";
        else if (nilai >= 70) return "B";
        else if (nilai >= 55) return "C";
        else if (nilai >= 40) return "D";
        else return "E";
    }

    double hitungRataRata(int[] nilai) {
        int total = 0;
        for (int n : nilai) {
            total += n;
            //System.out.println("FUGNGSI RATA RATA N " + n);
        }
        return (double) total / nilai.length;
    }

    int cariMaks(int[] nilai) {
        int max = nilai[0];
        for (int n : nilai) {
            if (n > max) max = n;
            //System.out.println("FUGNGSI AMBIL TERTINGGI N " + n);
        }
        return max;
    }

    int cariMin(int[] nilai) {
        int min = nilai[0];
        for (int n : nilai) {
            if (n < min) min = n;
        }
        return min;
    }
}
