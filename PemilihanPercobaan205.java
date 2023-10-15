import java.util.Scanner;

public class PemilihanPercobaan205 {
    public static void main(String[] args) {
        //Deklarasi Scanner
        Scanner input05 = new Scanner(System.in);
        //Masukkan inputan
        System.out.print("Nilai uas       : ");
        float uas = input05.nextFloat();
        System.out.print("Nilai uts     : ");
        float uts = input05.nextFloat(); 
        System.out.print(" Nilai kuis   : ");
        float kuis = input05.nextFloat();
        System.out.print("Nilai tugas   : ");
        float tugas = input05.nextFloat();

        //nilai akhir
         float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

         String grade = "";
         if (total > 100 || total < 0 ) {
            grade = "Nilai Tidak Valid";
         } else if ( total > 80 ){
            grade = "A";
         } else if ( total > 73){
            grade = "B+";
         } else if ( total > 65){
            grade = "C+";
         } else if ( total > 50){
            grade = "C";
         } else if ( total > 39){
            grade = "D";
         } else if ( total < 39 ){
            grade = "E";
         }

         System.out.println("Nilai akhir = " + total);
         System.out.println("Nilai huruf = " + grade);

         // String message = total < 65 ? "Remidi" : "Tidak remidi";

        // System.out.println("Nilai akhir = " + total + " sehingga " + message);
    }
    
}
