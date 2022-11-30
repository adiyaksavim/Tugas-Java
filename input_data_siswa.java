
// Input Data Siswa
import java.util.Scanner;

public class input_data_siswa {
  public static void main(String[] args){
     Boolean o = false;
      Scanner input = new Scanner(System.in);
      do{
      String nama, kelas, sekolah;
      System.out.println("\n___ Input Data Siswa Smk 1 Palangkaraya ___");
      System.out.println("Masukan nama anda: ");
      nama = input.nextLine();
      System.out.println("Masukan kelas anda: ");
      kelas = input.nextLine();
      System.out.println("Masukan sekolah anda: ");
      sekolah = input.nextLine();
      if(nama.equals("") || kelas.equals("") || sekolah.equals("")){
        System.out.println("Sebagian Kosong !");
        o = true;
      }else{
          o = false;
          System.out.println("\n_______ Hasil Data Siswa _______");
          System.out.println("Nama: " + nama + "\nKelas: " + kelas + "\nSekolah: " + sekolah);
      }
    }while(o == true);
 }  
}
