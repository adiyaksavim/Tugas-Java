
// Pilih jurusan
import java.util.Scanner;

public class pilih_jurusan {
    public static void main(String[] args){
        Boolean false_wkwk = false; 
        do{ 
        Scanner input = new Scanner(System.in);
        String nama, jurusan;
        false_wkwk = false;
        int nilai_siswa = 100;
        System.out.println("\n--------  Aplikasi Pilih Jurusan -------- ");
        System.out.println("Masukan nama anda: ");
        nama  = input.nextLine();
        if(nama.equals("")){
            System.out.println("\nNama anda kosong !");
            false_wkwk = true;
        }
        else{
            false_wkwk = false;
            if(nilai_siswa < 70){
                System.out.println("Maff nilai kamu tidak cukup");
                false_wkwk = true;
            }else{
                false_wkwk = false;
                System.out.println("-------- Sekarang pilih jurusan anda -------- ");
                System.out.println("[a].PPLG   [b].TKl   [c].TPM \n[d].TPL [e].KGSP [f].DPIB\nPilih Jurusan: ");
                jurusan = input.next();
                switch(jurusan){
                    case "a":
                        System.out.println("\n--------------------------------------------");
                        System.out.println("Selamat kamu diterima di smk 1 palangkaraya");
                        System.out.println("Hai " + nama + " kamu memilih jurusan pplg");
                        System.out.println("--------------------------------------------");
                        break;
                    case "b":
                        System.out.println("\n--------------------------------------------");
                        System.out.println("Selamat kamu diterima di smk 1 palangkaraya");
                        System.out.println("Hai " + nama + " kamu memilih jurusan tkl");
                        System.out.println("--------------------------------------------");
                        break;
                    case "c":
                        System.out.println("\n--------------------------------------------");
                        System.out.println("Selamat kamu diterima di smk 1 palangkaraya");
                        System.out.println("Hai " + nama + " kamu memilih jurusan tpm");
                        System.out.println("--------------------------------------------");
                        break;
                    case "d": 
                        System.out.println("\n--------------------------------------------");  
                        System.out.println("Selamat kamu diterima di smk 1 palangkaraya");
                        System.out.println("Hai " + nama + " kamu memilih jurusan tpl");
                        System.out.println("--------------------------------------------");
                        break;
                    case "e":
                        System.out.println("\n--------------------------------------------");
                        System.out.println("Selamat kamu diterima di smk 1 palangkaraya");
                        System.out.println("Hai " + nama + " kamu memilih jurusan kgsp");
                        System.out.println("--------------------------------------------");
                        break;
                    case "f":
                       System.out.println("\n--------------------------------------------");
                        System.out.println("Selamat kamu diterima di smk 1 palangkaraya");
                        System.out.println("Hai " + nama + " kamu memilih jurusan dpib");
                        System.out.println("--------------------------------------------");
                        break;
                    default:
                        System.out.println("Jurusan tidak ketemu !");
                        false_wkwk = true;

                }
            }
        }
        }while(false_wkwk == true);
    }
}
