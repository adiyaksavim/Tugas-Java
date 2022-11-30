


// Luas Lingkaran
// Author: Muhammad Adiyaksa
import java.util.Scanner;

class luas_lingkaran{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a;
        double luas, phi=3.14;
        System.out.println("\n----- Penghitung Luas Lingkaran -----");
        System.out.println("Masukan angka jari-jari: ");
        a = in.nextInt();
        luas = phi*a*a;
        System.out.println("Luas lingkaran: " + luas);
    }
} 